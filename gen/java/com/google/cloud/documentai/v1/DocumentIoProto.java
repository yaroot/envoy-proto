// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_io.proto

package com.google.cloud.documentai.v1;

public final class DocumentIoProto {
  private DocumentIoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_RawDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_RawDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_GcsDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsDocuments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/documentai/v1/document_io" +
      ".proto\022\032google.cloud.documentai.v1\032 goog" +
      "le/protobuf/field_mask.proto\"1\n\013RawDocum" +
      "ent\022\017\n\007content\030\001 \001(\014\022\021\n\tmime_type\030\002 \001(\t\"" +
      "1\n\013GcsDocument\022\017\n\007gcs_uri\030\001 \001(\t\022\021\n\tmime_" +
      "type\030\002 \001(\t\"J\n\014GcsDocuments\022:\n\tdocuments\030" +
      "\001 \003(\0132\'.google.cloud.documentai.v1.GcsDo" +
      "cument\"#\n\tGcsPrefix\022\026\n\016gcs_uri_prefix\030\001 " +
      "\001(\t\"\245\001\n\031BatchDocumentsInputConfig\022;\n\ngcs" +
      "_prefix\030\001 \001(\0132%.google.cloud.documentai." +
      "v1.GcsPrefixH\000\022A\n\rgcs_documents\030\002 \001(\0132(." +
      "google.cloud.documentai.v1.GcsDocumentsH" +
      "\000B\010\n\006source\"\205\003\n\024DocumentOutputConfig\022]\n\021" +
      "gcs_output_config\030\001 \001(\0132@.google.cloud.d" +
      "ocumentai.v1.DocumentOutputConfig.GcsOut" +
      "putConfigH\000\032\376\001\n\017GcsOutputConfig\022\017\n\007gcs_u" +
      "ri\030\001 \001(\t\022.\n\nfield_mask\030\002 \001(\0132\032.google.pr" +
      "otobuf.FieldMask\022h\n\017sharding_config\030\003 \001(" +
      "\0132O.google.cloud.documentai.v1.DocumentO" +
      "utputConfig.GcsOutputConfig.ShardingConf" +
      "ig\032@\n\016ShardingConfig\022\027\n\017pages_per_shard\030" +
      "\001 \001(\005\022\025\n\rpages_overlap\030\002 \001(\005B\r\n\013destinat" +
      "ionB\323\001\n\036com.google.cloud.documentai.v1B\017" +
      "DocumentIoProtoP\001ZDgoogle.golang.org/gen" +
      "proto/googleapis/cloud/documentai/v1;doc" +
      "umentai\252\002\032Google.Cloud.DocumentAI.V1\312\002\032G" +
      "oogle\\Cloud\\DocumentAI\\V1\352\002\035Google::Clou" +
      "d::DocumentAI::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_documentai_v1_RawDocument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_RawDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_RawDocument_descriptor,
        new java.lang.String[] { "Content", "MimeType", });
    internal_static_google_cloud_documentai_v1_GcsDocument_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1_GcsDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_GcsDocument_descriptor,
        new java.lang.String[] { "GcsUri", "MimeType", });
    internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1_GcsDocuments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor,
        new java.lang.String[] { "Documents", });
    internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor,
        new java.lang.String[] { "GcsUriPrefix", });
    internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor,
        new java.lang.String[] { "GcsPrefix", "GcsDocuments", "Source", });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor,
        new java.lang.String[] { "GcsOutputConfig", "Destination", });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor =
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor,
        new java.lang.String[] { "GcsUri", "FieldMask", "ShardingConfig", });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor =
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor,
        new java.lang.String[] { "PagesPerShard", "PagesOverlap", });
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}