// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/config_dump.proto

package io.envoyproxy.envoy.admin.v3;

public final class ConfigDumpProto {
  private ConfigDumpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_ConfigDump_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_ConfigDump_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_BootstrapConfigDump_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_BootstrapConfigDump_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_SecretsConfigDump_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_SecretsConfigDump_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_SecretsConfigDump_DynamicSecret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_SecretsConfigDump_DynamicSecret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_SecretsConfigDump_StaticSecret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_SecretsConfigDump_StaticSecret_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n envoy/admin/v3/config_dump.proto\022\016envo" +
      "y.admin.v3\032\'envoy/admin/v3/config_dump_s" +
      "hared.proto\032)envoy/config/bootstrap/v3/b" +
      "ootstrap.proto\032\031google/protobuf/any.prot" +
      "o\032\037google/protobuf/timestamp.proto\032\035udpa" +
      "/annotations/status.proto\032!udpa/annotati" +
      "ons/versioning.proto\"Z\n\nConfigDump\022%\n\007co" +
      "nfigs\030\001 \003(\0132\024.google.protobuf.Any:%\232\305\210\036 " +
      "\n\036envoy.admin.v2alpha.ConfigDump\"\260\001\n\023Boo" +
      "tstrapConfigDump\0227\n\tbootstrap\030\001 \001(\0132$.en" +
      "voy.config.bootstrap.v3.Bootstrap\0220\n\014las" +
      "t_updated\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp:.\232\305\210\036)\n\'envoy.admin.v2alpha.Bootstra" +
      "pConfigDump\"\236\006\n\021SecretsConfigDump\022F\n\016sta" +
      "tic_secrets\030\001 \003(\0132..envoy.admin.v3.Secre" +
      "tsConfigDump.StaticSecret\022O\n\026dynamic_act" +
      "ive_secrets\030\002 \003(\0132/.envoy.admin.v3.Secre" +
      "tsConfigDump.DynamicSecret\022P\n\027dynamic_wa" +
      "rming_secrets\030\003 \003(\0132/.envoy.admin.v3.Sec" +
      "retsConfigDump.DynamicSecret\032\275\002\n\rDynamic" +
      "Secret\022\014\n\004name\030\001 \001(\t\022\024\n\014version_info\030\002 \001" +
      "(\t\0220\n\014last_updated\030\003 \001(\0132\032.google.protob" +
      "uf.Timestamp\022$\n\006secret\030\004 \001(\0132\024.google.pr" +
      "otobuf.Any\0227\n\013error_state\030\005 \001(\0132\".envoy." +
      "admin.v3.UpdateFailureState\022;\n\rclient_st" +
      "atus\030\006 \001(\0162$.envoy.admin.v3.ClientResour" +
      "ceStatus::\232\305\210\0365\n3envoy.admin.v2alpha.Sec" +
      "retsConfigDump.DynamicSecret\032\257\001\n\014StaticS" +
      "ecret\022\014\n\004name\030\001 \001(\t\0220\n\014last_updated\030\002 \001(" +
      "\0132\032.google.protobuf.Timestamp\022$\n\006secret\030" +
      "\003 \001(\0132\024.google.protobuf.Any:9\232\305\210\0364\n2envo" +
      "y.admin.v2alpha.SecretsConfigDump.Static" +
      "Secret:,\232\305\210\036\'\n%envoy.admin.v2alpha.Secre" +
      "tsConfigDumpBx\n\034io.envoyproxy.envoy.admi" +
      "n.v3B\017ConfigDumpProtoP\001Z=github.com/envo" +
      "yproxy/go-control-plane/envoy/admin/v3;a" +
      "dminv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.admin.v3.ConfigDumpSharedProto.getDescriptor(),
          io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_admin_v3_ConfigDump_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_admin_v3_ConfigDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_ConfigDump_descriptor,
        new java.lang.String[] { "Configs", });
    internal_static_envoy_admin_v3_BootstrapConfigDump_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_admin_v3_BootstrapConfigDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_BootstrapConfigDump_descriptor,
        new java.lang.String[] { "Bootstrap", "LastUpdated", });
    internal_static_envoy_admin_v3_SecretsConfigDump_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_admin_v3_SecretsConfigDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_SecretsConfigDump_descriptor,
        new java.lang.String[] { "StaticSecrets", "DynamicActiveSecrets", "DynamicWarmingSecrets", });
    internal_static_envoy_admin_v3_SecretsConfigDump_DynamicSecret_descriptor =
      internal_static_envoy_admin_v3_SecretsConfigDump_descriptor.getNestedTypes().get(0);
    internal_static_envoy_admin_v3_SecretsConfigDump_DynamicSecret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_SecretsConfigDump_DynamicSecret_descriptor,
        new java.lang.String[] { "Name", "VersionInfo", "LastUpdated", "Secret", "ErrorState", "ClientStatus", });
    internal_static_envoy_admin_v3_SecretsConfigDump_StaticSecret_descriptor =
      internal_static_envoy_admin_v3_SecretsConfigDump_descriptor.getNestedTypes().get(1);
    internal_static_envoy_admin_v3_SecretsConfigDump_StaticSecret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_SecretsConfigDump_StaticSecret_descriptor,
        new java.lang.String[] { "Name", "LastUpdated", "Secret", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.admin.v3.ConfigDumpSharedProto.getDescriptor();
    io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}