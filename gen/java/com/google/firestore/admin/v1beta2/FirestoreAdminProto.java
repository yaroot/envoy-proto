// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1beta2/firestore_admin.proto

package com.google.firestore.admin.v1beta2;

public final class FirestoreAdminProto {
  private FirestoreAdminProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_CreateIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ListIndexesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ListIndexesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_GetIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_DeleteIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_UpdateFieldRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_UpdateFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_GetFieldRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_GetFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ListFieldsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ListFieldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ListFieldsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ListFieldsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ExportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta2_ImportDocumentsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/firestore/admin/v1beta2/firesto" +
      "re_admin.proto\022\036google.firestore.admin.v" +
      "1beta2\032\034google/api/annotations.proto\032*go" +
      "ogle/firestore/admin/v1beta2/field.proto" +
      "\032*google/firestore/admin/v1beta2/index.p" +
      "roto\032#google/longrunning/operations.prot" +
      "o\032\033google/protobuf/empty.proto\032 google/p" +
      "rotobuf/field_mask.proto\032\027google/api/cli" +
      "ent.proto\"Z\n\022CreateIndexRequest\022\016\n\006paren" +
      "t\030\001 \001(\t\0224\n\005index\030\002 \001(\0132%.google.firestor" +
      "e.admin.v1beta2.Index\"[\n\022ListIndexesRequ" +
      "est\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tp" +
      "age_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"f\n\023Li" +
      "stIndexesResponse\0226\n\007indexes\030\001 \003(\0132%.goo" +
      "gle.firestore.admin.v1beta2.Index\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\"\037\n\017GetIndexRequest\022\014\n" +
      "\004name\030\001 \001(\t\"\"\n\022DeleteIndexRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\"{\n\022UpdateFieldRequest\0224\n\005field\030\001" +
      " \001(\0132%.google.firestore.admin.v1beta2.Fi" +
      "eld\022/\n\013update_mask\030\002 \001(\0132\032.google.protob" +
      "uf.FieldMask\"\037\n\017GetFieldRequest\022\014\n\004name\030" +
      "\001 \001(\t\"Z\n\021ListFieldsRequest\022\016\n\006parent\030\001 \001" +
      "(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n" +
      "\npage_token\030\004 \001(\t\"d\n\022ListFieldsResponse\022" +
      "5\n\006fields\030\001 \003(\0132%.google.firestore.admin" +
      ".v1beta2.Field\022\027\n\017next_page_token\030\002 \001(\t\"" +
      "Y\n\026ExportDocumentsRequest\022\014\n\004name\030\001 \001(\t\022" +
      "\026\n\016collection_ids\030\002 \003(\t\022\031\n\021output_uri_pr" +
      "efix\030\003 \001(\t\"X\n\026ImportDocumentsRequest\022\014\n\004" +
      "name\030\001 \001(\t\022\026\n\016collection_ids\030\002 \003(\t\022\030\n\020in" +
      "put_uri_prefix\030\003 \001(\t2\353\r\n\016FirestoreAdmin\022" +
      "\264\001\n\013CreateIndex\0222.google.firestore.admin" +
      ".v1beta2.CreateIndexRequest\032\035.google.lon" +
      "grunning.Operation\"R\202\323\344\223\002L\"C/v1beta2/{pa" +
      "rent=projects/*/databases/*/collectionGr" +
      "oups/*}/indexes:\005index\022\303\001\n\013ListIndexes\0222" +
      ".google.firestore.admin.v1beta2.ListInde" +
      "xesRequest\0323.google.firestore.admin.v1be" +
      "ta2.ListIndexesResponse\"K\202\323\344\223\002E\022C/v1beta" +
      "2/{parent=projects/*/databases/*/collect" +
      "ionGroups/*}/indexes\022\257\001\n\010GetIndex\022/.goog" +
      "le.firestore.admin.v1beta2.GetIndexReque" +
      "st\032%.google.firestore.admin.v1beta2.Inde" +
      "x\"K\202\323\344\223\002E\022C/v1beta2/{name=projects/*/dat" +
      "abases/*/collectionGroups/*/indexes/*}\022\246" +
      "\001\n\013DeleteIndex\0222.google.firestore.admin." +
      "v1beta2.DeleteIndexRequest\032\026.google.prot" +
      "obuf.Empty\"K\202\323\344\223\002E*C/v1beta2/{name=proje" +
      "cts/*/databases/*/collectionGroups/*/ind" +
      "exes/*}\022\256\001\n\010GetField\022/.google.firestore." +
      "admin.v1beta2.GetFieldRequest\032%.google.f" +
      "irestore.admin.v1beta2.Field\"J\202\323\344\223\002D\022B/v" +
      "1beta2/{name=projects/*/databases/*/coll" +
      "ectionGroups/*/fields/*}\022\271\001\n\013UpdateField" +
      "\0222.google.firestore.admin.v1beta2.Update" +
      "FieldRequest\032\035.google.longrunning.Operat" +
      "ion\"W\202\323\344\223\002Q2H/v1beta2/{field.name=projec" +
      "ts/*/databases/*/collectionGroups/*/fiel" +
      "ds/*}:\005field\022\277\001\n\nListFields\0221.google.fir" +
      "estore.admin.v1beta2.ListFieldsRequest\0322" +
      ".google.firestore.admin.v1beta2.ListFiel" +
      "dsResponse\"J\202\323\344\223\002D\022B/v1beta2/{parent=pro" +
      "jects/*/databases/*/collectionGroups/*}/" +
      "fields\022\253\001\n\017ExportDocuments\0226.google.fire" +
      "store.admin.v1beta2.ExportDocumentsReque" +
      "st\032\035.google.longrunning.Operation\"A\202\323\344\223\002" +
      ";\"6/v1beta2/{name=projects/*/databases/*" +
      "}:exportDocuments:\001*\022\253\001\n\017ImportDocuments" +
      "\0226.google.firestore.admin.v1beta2.Import" +
      "DocumentsRequest\032\035.google.longrunning.Op" +
      "eration\"A\202\323\344\223\002;\"6/v1beta2/{name=projects" +
      "/*/databases/*}:importDocuments:\001*\032v\312A\030f" +
      "irestore.googleapis.com\322AXhttps://www.go" +
      "ogleapis.com/auth/cloud-platform,https:/" +
      "/www.googleapis.com/auth/datastoreB\256\001\n\"c" +
      "om.google.firestore.admin.v1beta2B\023Fires" +
      "toreAdminProtoP\001ZCgoogle.golang.org/genp" +
      "roto/googleapis/firestore/admin/v1beta2;" +
      "admin\242\002\004GCFS\252\002$Google.Cloud.Firestore.Ad" +
      "min.V1Beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.firestore.admin.v1beta2.FieldProto.getDescriptor(),
          com.google.firestore.admin.v1beta2.IndexProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_firestore_admin_v1beta2_CreateIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1beta2_CreateIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_CreateIndexRequest_descriptor,
        new java.lang.String[] { "Parent", "Index", });
    internal_static_google_firestore_admin_v1beta2_ListIndexesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_admin_v1beta2_ListIndexesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ListIndexesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", });
    internal_static_google_firestore_admin_v1beta2_ListIndexesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_admin_v1beta2_ListIndexesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ListIndexesResponse_descriptor,
        new java.lang.String[] { "Indexes", "NextPageToken", });
    internal_static_google_firestore_admin_v1beta2_GetIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_admin_v1beta2_GetIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_GetIndexRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_firestore_admin_v1beta2_DeleteIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_admin_v1beta2_DeleteIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_DeleteIndexRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_firestore_admin_v1beta2_UpdateFieldRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_admin_v1beta2_UpdateFieldRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_UpdateFieldRequest_descriptor,
        new java.lang.String[] { "Field", "UpdateMask", });
    internal_static_google_firestore_admin_v1beta2_GetFieldRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_firestore_admin_v1beta2_GetFieldRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_GetFieldRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_firestore_admin_v1beta2_ListFieldsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_firestore_admin_v1beta2_ListFieldsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ListFieldsRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", });
    internal_static_google_firestore_admin_v1beta2_ListFieldsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_firestore_admin_v1beta2_ListFieldsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ListFieldsResponse_descriptor,
        new java.lang.String[] { "Fields", "NextPageToken", });
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_firestore_admin_v1beta2_ExportDocumentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ExportDocumentsRequest_descriptor,
        new java.lang.String[] { "Name", "CollectionIds", "OutputUriPrefix", });
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_firestore_admin_v1beta2_ImportDocumentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta2_ImportDocumentsRequest_descriptor,
        new java.lang.String[] { "Name", "CollectionIds", "InputUriPrefix", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.firestore.admin.v1beta2.FieldProto.getDescriptor();
    com.google.firestore.admin.v1beta2.IndexProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}