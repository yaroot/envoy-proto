// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

public final class DatasetsProto {
  private DatasetsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_Dataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ListDatasetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ListDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ListDatasetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ListDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_CreateDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_CreateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_UpdateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_DeleteDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_DeleteDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_UndeleteDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_UndeleteDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_GetDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_GetDatasetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!google/genomics/v1/datasets.proto\022\022goo" +
      "gle.genomics.v1\032\034google/api/annotations." +
      "proto\032\036google/iam/v1/iam_policy.proto\032\032g" +
      "oogle/iam/v1/policy.proto\032\033google/protob" +
      "uf/empty.proto\032 google/protobuf/field_ma" +
      "sk.proto\032\037google/protobuf/timestamp.prot" +
      "o\"h\n\007Dataset\022\n\n\002id\030\001 \001(\t\022\022\n\nproject_id\030\002" +
      " \001(\t\022\014\n\004name\030\003 \001(\t\022/\n\013create_time\030\004 \001(\0132" +
      "\032.google.protobuf.Timestamp\"P\n\023ListDatas" +
      "etsRequest\022\022\n\nproject_id\030\001 \001(\t\022\021\n\tpage_s" +
      "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"^\n\024ListDat" +
      "asetsResponse\022-\n\010datasets\030\001 \003(\0132\033.google" +
      ".genomics.v1.Dataset\022\027\n\017next_page_token\030" +
      "\002 \001(\t\"D\n\024CreateDatasetRequest\022,\n\007dataset" +
      "\030\001 \001(\0132\033.google.genomics.v1.Dataset\"\211\001\n\024" +
      "UpdateDatasetRequest\022\022\n\ndataset_id\030\001 \001(\t" +
      "\022,\n\007dataset\030\002 \001(\0132\033.google.genomics.v1.D" +
      "ataset\022/\n\013update_mask\030\003 \001(\0132\032.google.pro" +
      "tobuf.FieldMask\"*\n\024DeleteDatasetRequest\022" +
      "\022\n\ndataset_id\030\001 \001(\t\",\n\026UndeleteDatasetRe" +
      "quest\022\022\n\ndataset_id\030\001 \001(\t\"\'\n\021GetDatasetR" +
      "equest\022\022\n\ndataset_id\030\001 \001(\t2\237\t\n\020DatasetSe" +
      "rviceV1\022w\n\014ListDatasets\022\'.google.genomic" +
      "s.v1.ListDatasetsRequest\032(.google.genomi" +
      "cs.v1.ListDatasetsResponse\"\024\202\323\344\223\002\016\022\014/v1/" +
      "datasets\022u\n\rCreateDataset\022(.google.genom" +
      "ics.v1.CreateDatasetRequest\032\033.google.gen" +
      "omics.v1.Dataset\"\035\202\323\344\223\002\027\"\014/v1/datasets:\007" +
      "dataset\022s\n\nGetDataset\022%.google.genomics." +
      "v1.GetDatasetRequest\032\033.google.genomics.v" +
      "1.Dataset\"!\202\323\344\223\002\033\022\031/v1/datasets/{dataset" +
      "_id}\022\202\001\n\rUpdateDataset\022(.google.genomics" +
      ".v1.UpdateDatasetRequest\032\033.google.genomi" +
      "cs.v1.Dataset\"*\202\323\344\223\002$2\031/v1/datasets/{dat" +
      "aset_id}:\007dataset\022t\n\rDeleteDataset\022(.goo" +
      "gle.genomics.v1.DeleteDatasetRequest\032\026.g" +
      "oogle.protobuf.Empty\"!\202\323\344\223\002\033*\031/v1/datase" +
      "ts/{dataset_id}\022\211\001\n\017UndeleteDataset\022*.go" +
      "ogle.genomics.v1.UndeleteDatasetRequest\032" +
      "\033.google.genomics.v1.Dataset\"-\202\323\344\223\002\'\"\"/v" +
      "1/datasets/{dataset_id}:undelete:\001*\022|\n\014S" +
      "etIamPolicy\022\".google.iam.v1.SetIamPolicy" +
      "Request\032\025.google.iam.v1.Policy\"1\202\323\344\223\002+\"&" +
      "/v1/{resource=datasets/*}:setIamPolicy:\001" +
      "*\022|\n\014GetIamPolicy\022\".google.iam.v1.GetIam" +
      "PolicyRequest\032\025.google.iam.v1.Policy\"1\202\323" +
      "\344\223\002+\"&/v1/{resource=datasets/*}:getIamPo" +
      "licy:\001*\022\242\001\n\022TestIamPermissions\022(.google." +
      "iam.v1.TestIamPermissionsRequest\032).googl" +
      "e.iam.v1.TestIamPermissionsResponse\"7\202\323\344" +
      "\223\0021\",/v1/{resource=datasets/*}:testIamPe" +
      "rmissions:\001*Bh\n\026com.google.genomics.v1B\r" +
      "DatasetsProtoP\001Z:google.golang.org/genpr" +
      "oto/googleapis/genomics/v1;genomics\370\001\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_genomics_v1_Dataset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_Dataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_Dataset_descriptor,
        new java.lang.String[] { "Id", "ProjectId", "Name", "CreateTime", });
    internal_static_google_genomics_v1_ListDatasetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_genomics_v1_ListDatasetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ListDatasetsRequest_descriptor,
        new java.lang.String[] { "ProjectId", "PageSize", "PageToken", });
    internal_static_google_genomics_v1_ListDatasetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_genomics_v1_ListDatasetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ListDatasetsResponse_descriptor,
        new java.lang.String[] { "Datasets", "NextPageToken", });
    internal_static_google_genomics_v1_CreateDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_genomics_v1_CreateDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_CreateDatasetRequest_descriptor,
        new java.lang.String[] { "Dataset", });
    internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_genomics_v1_UpdateDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetId", "Dataset", "UpdateMask", });
    internal_static_google_genomics_v1_DeleteDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_genomics_v1_DeleteDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_DeleteDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetId", });
    internal_static_google_genomics_v1_UndeleteDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_genomics_v1_UndeleteDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_UndeleteDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetId", });
    internal_static_google_genomics_v1_GetDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_genomics_v1_GetDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_GetDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}