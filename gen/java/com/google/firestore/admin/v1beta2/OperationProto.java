// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1beta2/operation.proto

package com.google.firestore.admin.v1beta2;

public final class OperationProto {
  private OperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_IndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_IndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_IndexConfigDelta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_IndexConfigDelta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ExportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ExportDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_Progress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_Progress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/firestore/admin/v1beta2/operati" +
      "on.proto\022\036google.firestore.admin.v1beta2" +
      "\032*google/firestore/admin/v1beta2/index.p" +
      "roto\032\037google/protobuf/timestamp.proto\032\034g" +
      "oogle/api/annotations.proto\"\314\002\n\026IndexOpe" +
      "rationMetadata\022.\n\nstart_time\030\001 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\022,\n\010end_time\030\002 \001(\013" +
      "2\032.google.protobuf.Timestamp\022\r\n\005index\030\003 " +
      "\001(\t\022=\n\005state\030\004 \001(\0162..google.firestore.ad" +
      "min.v1beta2.OperationState\022D\n\022progress_d" +
      "ocuments\030\005 \001(\0132(.google.firestore.admin." +
      "v1beta2.Progress\022@\n\016progress_bytes\030\006 \001(\013" +
      "2(.google.firestore.admin.v1beta2.Progre" +
      "ss\"\245\005\n\026FieldOperationMetadata\022.\n\nstart_t" +
      "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n" +
      "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp\022\r\n\005field\030\003 \001(\t\022d\n\023index_config_delta" +
      "s\030\004 \003(\0132G.google.firestore.admin.v1beta2" +
      ".FieldOperationMetadata.IndexConfigDelta" +
      "\022=\n\005state\030\005 \001(\0162..google.firestore.admin" +
      ".v1beta2.OperationState\022C\n\021document_prog" +
      "ress\030\006 \001(\0132(.google.firestore.admin.v1be" +
      "ta2.Progress\022@\n\016bytes_progress\030\007 \001(\0132(.g" +
      "oogle.firestore.admin.v1beta2.Progress\032\361" +
      "\001\n\020IndexConfigDelta\022g\n\013change_type\030\001 \001(\016" +
      "2R.google.firestore.admin.v1beta2.FieldO" +
      "perationMetadata.IndexConfigDelta.Change" +
      "Type\0224\n\005index\030\002 \001(\0132%.google.firestore.a" +
      "dmin.v1beta2.Index\">\n\nChangeType\022\033\n\027CHAN" +
      "GE_TYPE_UNSPECIFIED\020\000\022\007\n\003ADD\020\001\022\n\n\006REMOVE" +
      "\020\002\"\373\002\n\027ExportDocumentsMetadata\022.\n\nstart_" +
      "time\030\001 \001(\0132\032.google.protobuf.Timestamp\022," +
      "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times" +
      "tamp\022G\n\017operation_state\030\003 \001(\0162..google.f" +
      "irestore.admin.v1beta2.OperationState\022D\n" +
      "\022progress_documents\030\004 \001(\0132(.google.fires" +
      "tore.admin.v1beta2.Progress\022@\n\016progress_" +
      "bytes\030\005 \001(\0132(.google.firestore.admin.v1b" +
      "eta2.Progress\022\026\n\016collection_ids\030\006 \003(\t\022\031\n" +
      "\021output_uri_prefix\030\007 \001(\t\"\372\002\n\027ImportDocum" +
      "entsMetadata\022.\n\nstart_time\030\001 \001(\0132\032.googl" +
      "e.protobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032" +
      ".google.protobuf.Timestamp\022G\n\017operation_" +
      "state\030\003 \001(\0162..google.firestore.admin.v1b" +
      "eta2.OperationState\022D\n\022progress_document" +
      "s\030\004 \001(\0132(.google.firestore.admin.v1beta2" +
      ".Progress\022@\n\016progress_bytes\030\005 \001(\0132(.goog" +
      "le.firestore.admin.v1beta2.Progress\022\026\n\016c" +
      "ollection_ids\030\006 \003(\t\022\030\n\020input_uri_prefix\030" +
      "\007 \001(\t\"4\n\027ExportDocumentsResponse\022\031\n\021outp" +
      "ut_uri_prefix\030\001 \001(\t\":\n\010Progress\022\026\n\016estim" +
      "ated_work\030\001 \001(\003\022\026\n\016completed_work\030\002 \001(\003*" +
      "\236\001\n\016OperationState\022\037\n\033OPERATION_STATE_UN" +
      "SPECIFIED\020\000\022\020\n\014INITIALIZING\020\001\022\016\n\nPROCESS" +
      "ING\020\002\022\016\n\nCANCELLING\020\003\022\016\n\nFINALIZING\020\004\022\016\n" +
      "\nSUCCESSFUL\020\005\022\n\n\006FAILED\020\006\022\r\n\tCANCELLED\020\007" +
      "B\251\001\n\"com.google.firestore.admin.v1beta2B" +
      "\016OperationProtoP\001ZCgoogle.golang.org/gen" +
      "proto/googleapis/firestore/admin/v1beta2" +
      ";admin\242\002\004GCFS\252\002$Google.Cloud.Firestore.A" +
      "dmin.V1Beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.firestore.admin.v1beta2.IndexProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_firestore_admin_v1beta2_IndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1beta2_IndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_IndexOperationMetadata_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Index", "State", "ProgressDocuments", "ProgressBytes", });
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Field", "IndexConfigDeltas", "State", "DocumentProgress", "BytesProgress", });
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_IndexConfigDelta_descriptor =
      internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_IndexConfigDelta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_FieldOperationMetadata_IndexConfigDelta_descriptor,
        new java.lang.String[] { "ChangeType", "Index", });
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ExportDocumentsMetadata_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "OperationState", "ProgressDocuments", "ProgressBytes", "CollectionIds", "OutputUriPrefix", });
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ImportDocumentsMetadata_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "OperationState", "ProgressDocuments", "ProgressBytes", "CollectionIds", "InputUriPrefix", });
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ExportDocumentsResponse_descriptor,
        new java.lang.String[] { "OutputUriPrefix", });
    internal_static_google_firestore_admin_v1beta2_Progress_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_admin_v1beta2_Progress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_Progress_descriptor,
        new java.lang.String[] { "EstimatedWork", "CompletedWork", });
    com.google.firestore.admin.v1beta2.IndexProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}