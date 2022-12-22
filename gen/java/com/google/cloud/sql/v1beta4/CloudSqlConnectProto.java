// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_connect.proto

package com.google.cloud.sql.v1beta4;

public final class CloudSqlConnectProto {
  private CloudSqlConnectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1beta4_GetConnectSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1beta4_GetConnectSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1beta4_ConnectSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1beta4_ConnectSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/sql/v1beta4/cloud_sql_con" +
      "nect.proto\022\030google.cloud.sql.v1beta4\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\0322google/cloud/sql/v1beta4/cloud_sql" +
      "_resources.proto\032\036google/protobuf/durati" +
      "on.proto\032\037google/protobuf/timestamp.prot" +
      "o\"r\n\031GetConnectSettingsRequest\022\020\n\010instan" +
      "ce\030\001 \001(\t\022\017\n\007project\030\002 \001(\t\0222\n\tread_time\030\007" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\001\"\255\002" +
      "\n\017ConnectSettings\022\014\n\004kind\030\001 \001(\t\0229\n\016serve" +
      "r_ca_cert\030\002 \001(\0132!.google.cloud.sql.v1bet" +
      "a4.SslCert\0229\n\014ip_addresses\030\003 \003(\0132#.googl" +
      "e.cloud.sql.v1beta4.IpMapping\022\016\n\006region\030" +
      "\004 \001(\t\022F\n\020database_version\030\037 \001(\0162,.google" +
      ".cloud.sql.v1beta4.SqlDatabaseVersion\022>\n" +
      "\014backend_type\030  \001(\0162(.google.cloud.sql.v" +
      "1beta4.SqlBackendType\"\334\001\n\034GenerateEpheme" +
      "ralCertRequest\022\020\n\010instance\030\001 \001(\t\022\017\n\007proj" +
      "ect\030\002 \001(\t\022\022\n\npublic_key\030\003 \001(\t\022\031\n\014access_" +
      "token\030\004 \001(\tB\003\340A\001\0222\n\tread_time\030\007 \001(\0132\032.go" +
      "ogle.protobuf.TimestampB\003\340A\001\0226\n\016valid_du" +
      "ration\030\014 \001(\0132\031.google.protobuf.DurationB" +
      "\003\340A\001\"Z\n\035GenerateEphemeralCertResponse\0229\n" +
      "\016ephemeral_cert\030\001 \001(\0132!.google.cloud.sql" +
      ".v1beta4.SslCert2\270\004\n\021SqlConnectService\022\302" +
      "\001\n\022GetConnectSettings\0223.google.cloud.sql" +
      ".v1beta4.GetConnectSettingsRequest\032).goo" +
      "gle.cloud.sql.v1beta4.ConnectSettings\"L\202" +
      "\323\344\223\002F\022D/sql/v1beta4/projects/{project}/i" +
      "nstances/{instance}/connectSettings\022\337\001\n\025" +
      "GenerateEphemeralCert\0226.google.cloud.sql" +
      ".v1beta4.GenerateEphemeralCertRequest\0327." +
      "google.cloud.sql.v1beta4.GenerateEphemer" +
      "alCertResponse\"U\202\323\344\223\002O\"J/sql/v1beta4/pro" +
      "jects/{project}/instances/{instance}:gen" +
      "erateEphemeralCert:\001*\032|\312A\027sqladmin.googl" +
      "eapis.com\322A_https://www.googleapis.com/a" +
      "uth/cloud-platform,https://www.googleapi" +
      "s.com/auth/sqlservice.adminBs\n\034com.googl" +
      "e.cloud.sql.v1beta4B\024CloudSqlConnectProt" +
      "oP\001Z;google.golang.org/genproto/googleap" +
      "is/cloud/sql/v1beta4;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_sql_v1beta4_GetConnectSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_sql_v1beta4_GetConnectSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1beta4_GetConnectSettingsRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", "ReadTime", });
    internal_static_google_cloud_sql_v1beta4_ConnectSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_sql_v1beta4_ConnectSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1beta4_ConnectSettings_descriptor,
        new java.lang.String[] { "Kind", "ServerCaCert", "IpAddresses", "Region", "DatabaseVersion", "BackendType", });
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", "PublicKey", "AccessToken", "ReadTime", "ValidDuration", });
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1beta4_GenerateEphemeralCertResponse_descriptor,
        new java.lang.String[] { "EphemeralCert", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}