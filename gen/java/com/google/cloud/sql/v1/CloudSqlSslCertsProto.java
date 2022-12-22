// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_ssl_certs.proto

package com.google.cloud.sql.v1;

public final class CloudSqlSslCertsProto {
  private CloudSqlSslCertsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SqlSslCertsDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SqlSslCertsDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SqlSslCertsGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SqlSslCertsGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SqlSslCertsInsertRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SqlSslCertsInsertRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SqlSslCertsListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SqlSslCertsListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SslCertsInsertRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SslCertsInsertRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SslCertsInsertResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SslCertsInsertResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_sql_v1_SslCertsListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_sql_v1_SslCertsListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/sql/v1/cloud_sql_ssl_cert" +
      "s.proto\022\023google.cloud.sql.v1\032\034google/api" +
      "/annotations.proto\032-google/cloud/sql/v1/" +
      "cloud_sql_resources.proto\032\027google/api/cl" +
      "ient.proto\"W\n\030SqlSslCertsDeleteRequest\022\020" +
      "\n\010instance\030\001 \001(\t\022\017\n\007project\030\002 \001(\t\022\030\n\020sha" +
      "1_fingerprint\030\003 \001(\t\"T\n\025SqlSslCertsGetReq" +
      "uest\022\020\n\010instance\030\001 \001(\t\022\017\n\007project\030\002 \001(\t\022" +
      "\030\n\020sha1_fingerprint\030\003 \001(\t\"w\n\030SqlSslCerts" +
      "InsertRequest\022\020\n\010instance\030\001 \001(\t\022\017\n\007proje" +
      "ct\030\002 \001(\t\0228\n\004body\030d \001(\0132*.google.cloud.sq" +
      "l.v1.SslCertsInsertRequest\";\n\026SqlSslCert" +
      "sListRequest\022\020\n\010instance\030\001 \001(\t\022\017\n\007projec" +
      "t\030\002 \001(\t\",\n\025SslCertsInsertRequest\022\023\n\013comm" +
      "on_name\030\001 \001(\t\"\310\001\n\026SslCertsInsertResponse" +
      "\022\014\n\004kind\030\001 \001(\t\0221\n\toperation\030\002 \001(\0132\036.goog" +
      "le.cloud.sql.v1.Operation\0224\n\016server_ca_c" +
      "ert\030\003 \001(\0132\034.google.cloud.sql.v1.SslCert\022" +
      "7\n\013client_cert\030\004 \001(\0132\".google.cloud.sql." +
      "v1.SslCertDetail\"Q\n\024SslCertsListResponse" +
      "\022\014\n\004kind\030\001 \001(\t\022+\n\005items\030\002 \003(\0132\034.google.c" +
      "loud.sql.v1.SslCert2\252\006\n\022SqlSslCertsServi" +
      "ce\022\250\001\n\006Delete\022-.google.cloud.sql.v1.SqlS" +
      "slCertsDeleteRequest\032\036.google.cloud.sql." +
      "v1.Operation\"O\202\323\344\223\002I*G/v1/projects/{proj" +
      "ect}/instances/{instance}/sslCerts/{sha1" +
      "_fingerprint}\022\240\001\n\003Get\022*.google.cloud.sql" +
      ".v1.SqlSslCertsGetRequest\032\034.google.cloud" +
      ".sql.v1.SslCert\"O\202\323\344\223\002I\022G/v1/projects/{p" +
      "roject}/instances/{instance}/sslCerts/{s" +
      "ha1_fingerprint}\022\250\001\n\006Insert\022-.google.clo" +
      "ud.sql.v1.SqlSslCertsInsertRequest\032+.goo" +
      "gle.cloud.sql.v1.SslCertsInsertResponse\"" +
      "B\202\323\344\223\002<\"4/v1/projects/{project}/instance" +
      "s/{instance}/sslCerts:\004body\022\234\001\n\004List\022+.g" +
      "oogle.cloud.sql.v1.SqlSslCertsListReques" +
      "t\032).google.cloud.sql.v1.SslCertsListResp" +
      "onse\"<\202\323\344\223\0026\0224/v1/projects/{project}/ins" +
      "tances/{instance}/sslCerts\032|\312A\027sqladmin." +
      "googleapis.com\322A_https://www.googleapis." +
      "com/auth/cloud-platform,https://www.goog" +
      "leapis.com/auth/sqlservice.adminBj\n\027com." +
      "google.cloud.sql.v1B\025CloudSqlSslCertsPro" +
      "toP\001Z6google.golang.org/genproto/googlea" +
      "pis/cloud/sql/v1;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.sql.v1.CloudSqlResourcesProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_sql_v1_SqlSslCertsDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_sql_v1_SqlSslCertsDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SqlSslCertsDeleteRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", "Sha1Fingerprint", });
    internal_static_google_cloud_sql_v1_SqlSslCertsGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_sql_v1_SqlSslCertsGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SqlSslCertsGetRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", "Sha1Fingerprint", });
    internal_static_google_cloud_sql_v1_SqlSslCertsInsertRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_sql_v1_SqlSslCertsInsertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SqlSslCertsInsertRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", "Body", });
    internal_static_google_cloud_sql_v1_SqlSslCertsListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_sql_v1_SqlSslCertsListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SqlSslCertsListRequest_descriptor,
        new java.lang.String[] { "Instance", "Project", });
    internal_static_google_cloud_sql_v1_SslCertsInsertRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_sql_v1_SslCertsInsertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SslCertsInsertRequest_descriptor,
        new java.lang.String[] { "CommonName", });
    internal_static_google_cloud_sql_v1_SslCertsInsertResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_sql_v1_SslCertsInsertResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SslCertsInsertResponse_descriptor,
        new java.lang.String[] { "Kind", "Operation", "ServerCaCert", "ClientCert", });
    internal_static_google_cloud_sql_v1_SslCertsListResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_sql_v1_SslCertsListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_sql_v1_SslCertsListResponse_descriptor,
        new java.lang.String[] { "Kind", "Items", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.sql.v1.CloudSqlResourcesProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}