// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v2/file.proto

package io.envoyproxy.envoy.config.accesslog.v2;

public final class FileProto {
  private FileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v2_FileAccessLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v2_FileAccessLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/config/accesslog/v2/file.proto\022\031" +
      "envoy.config.accesslog.v2\032\034google/protob" +
      "uf/struct.proto\032\036udpa/annotations/migrat" +
      "e.proto\032\035udpa/annotations/status.proto\032\027" +
      "validate/validate.proto\"\263\001\n\rFileAccessLo" +
      "g\022\025\n\004path\030\001 \001(\tB\007\372B\004r\002 \001\022\020\n\006format\030\002 \001(\t" +
      "H\000\022.\n\013json_format\030\003 \001(\0132\027.google.protobu" +
      "f.StructH\000\0224\n\021typed_json_format\030\004 \001(\0132\027." +
      "google.protobuf.StructH\000B\023\n\021access_log_f" +
      "ormatB\273\001\n\'io.envoyproxy.envoy.config.acc" +
      "esslog.v2B\tFileProtoP\001ZLgithub.com/envoy" +
      "proxy/go-control-plane/envoy/config/acce" +
      "sslog/v2;accesslogv2\362\230\376\217\005)\022\'envoy.extens" +
      "ions.access_loggers.file.v3\272\200\310\321\006\002\020\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_accesslog_v2_FileAccessLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_accesslog_v2_FileAccessLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v2_FileAccessLog_descriptor,
        new java.lang.String[] { "Path", "Format", "JsonFormat", "TypedJsonFormat", "AccessLogFormat", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
