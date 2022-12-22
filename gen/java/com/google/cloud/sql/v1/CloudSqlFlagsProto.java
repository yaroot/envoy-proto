// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_flags.proto

package com.google.cloud.sql.v1;

public final class CloudSqlFlagsProto {
  private CloudSqlFlagsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SqlFlagsListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SqlFlagsListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_FlagsListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_FlagsListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_Flag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_Flag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/sql/v1/cloud_sql_flags.pr" +
      "oto\022\023google.cloud.sql.v1\032\034google/api/ann" +
      "otations.proto\032-google/cloud/sql/v1/clou" +
      "d_sql_resources.proto\032\036google/protobuf/w" +
      "rappers.proto\032\027google/api/client.proto\"/" +
      "\n\023SqlFlagsListRequest\022\030\n\020database_versio" +
      "n\030\001 \001(\t\"K\n\021FlagsListResponse\022\014\n\004kind\030\001 \001" +
      "(\t\022(\n\005items\030\002 \003(\0132\031.google.cloud.sql.v1." +
      "Flag\"\215\003\n\004Flag\022\014\n\004name\030\001 \001(\t\022.\n\004type\030\002 \001(" +
      "\0162 .google.cloud.sql.v1.SqlFlagType\022;\n\na" +
      "pplies_to\030\003 \003(\0162\'.google.cloud.sql.v1.Sq" +
      "lDatabaseVersion\022\035\n\025allowed_string_value" +
      "s\030\004 \003(\t\022.\n\tmin_value\030\005 \001(\0132\033.google.prot" +
      "obuf.Int64Value\022.\n\tmax_value\030\006 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\0224\n\020requires_rest" +
      "art\030\007 \001(\0132\032.google.protobuf.BoolValue\022\014\n" +
      "\004kind\030\010 \001(\t\022+\n\007in_beta\030\t \001(\0132\032.google.pr" +
      "otobuf.BoolValue\022\032\n\022allowed_int_values\030\n" +
      " \003(\003*\227\001\n\013SqlFlagType\022\035\n\031SQL_FLAG_TYPE_UN" +
      "SPECIFIED\020\000\022\013\n\007BOOLEAN\020\001\022\n\n\006STRING\020\002\022\013\n\007" +
      "INTEGER\020\003\022\010\n\004NONE\020\004\022\031\n\025MYSQL_TIMEZONE_OF" +
      "FSET\020\005\022\t\n\005FLOAT\020\006\022\023\n\017REPEATED_STRING\020\0072\374" +
      "\001\n\017SqlFlagsService\022k\n\004List\022(.google.clou" +
      "d.sql.v1.SqlFlagsListRequest\032&.google.cl" +
      "oud.sql.v1.FlagsListResponse\"\021\202\323\344\223\002\013\022\t/v" +
      "1/flags\032|\312A\027sqladmin.googleapis.com\322A_ht" +
      "tps://www.googleapis.com/auth/cloud-plat" +
      "form,https://www.googleapis.com/auth/sql" +
      "service.adminBg\n\027com.google.cloud.sql.v1" +
      "B\022CloudSqlFlagsProtoP\001Z6google.golang.or" +
      "g/genproto/googleapis/cloud/sql/v1;sqlb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.sql.v1.CloudSqlResourcesProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_sql_v1_SqlFlagsListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_sql_v1_SqlFlagsListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SqlFlagsListRequest_descriptor,
        new java.lang.String[] { "DatabaseVersion", });
    internal_static_google_cloud_sql_v1_FlagsListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_sql_v1_FlagsListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_FlagsListResponse_descriptor,
        new java.lang.String[] { "Kind", "Items", });
    internal_static_google_cloud_sql_v1_Flag_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_sql_v1_Flag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_Flag_descriptor,
        new java.lang.String[] { "Name", "Type", "AppliesTo", "AllowedStringValues", "MinValue", "MaxValue", "RequiresRestart", "Kind", "InBeta", "AllowedIntValues", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.sql.v1.CloudSqlResourcesProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}