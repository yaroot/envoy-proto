// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

public final class ConversationDatasetProto {
  private ConversationDatasetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ConversationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_InputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ConversationDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_GetConversationDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetConversationDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/v2/conversatio" +
      "n_dataset.proto\022\032google.cloud.dialogflow" +
      ".v2\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032$" +
      "google/cloud/dialogflow/v2/gcs.proto\032#go" +
      "ogle/longrunning/operations.proto\032\037googl" +
      "e/protobuf/timestamp.proto\032\027google/rpc/s" +
      "tatus.proto\".\n\020ConversationInfo\022\032\n\rlangu" +
      "age_code\030\001 \001(\tB\003\340A\001\"U\n\013InputConfig\022<\n\ngc" +
      "s_source\030\001 \001(\0132&.google.cloud.dialogflow" +
      ".v2.GcsSourcesH\000B\010\n\006source\"\321\003\n\023Conversat" +
      "ionDataset\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display" +
      "_name\030\002 \001(\tB\003\340A\002\022\030\n\013description\030\003 \001(\tB\003\340" +
      "A\001\0224\n\013create_time\030\004 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\022B\n\014input_config\030\005 \001(\0132\'" +
      ".google.cloud.dialogflow.v2.InputConfigB" +
      "\003\340A\003\022L\n\021conversation_info\030\006 \001(\0132,.google" +
      ".cloud.dialogflow.v2.ConversationInfoB\003\340" +
      "A\003\022\037\n\022conversation_count\030\007 \001(\003B\003\340A\003:\210\001\352A" +
      "\204\001\n-dialogflow.googleapis.com/Conversati" +
      "onDataset\022Sprojects/{project}/locations/" +
      "{location}/conversationDatasets/{convers" +
      "ation_dataset}\"\213\001\n CreateConversationDat" +
      "asetRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022R\n\024conv" +
      "ersation_dataset\030\002 \001(\0132/.google.cloud.di" +
      "alogflow.v2.ConversationDatasetB\003\340A\002\"d\n\035" +
      "GetConversationDatasetRequest\022C\n\004name\030\001 " +
      "\001(\tB5\340A\002\372A/\n-dialogflow.googleapis.com/C" +
      "onversationDataset\"\231\001\n\037ListConversationD" +
      "atasetsRequest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-" +
      "dialogflow.googleapis.com/ConversationDa" +
      "taset\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_to" +
      "ken\030\003 \001(\tB\003\340A\001\"\213\001\n ListConversationDatas" +
      "etsResponse\022N\n\025conversation_datasets\030\001 \003" +
      "(\0132/.google.cloud.dialogflow.v2.Conversa" +
      "tionDataset\022\027\n\017next_page_token\030\002 \001(\t\"g\n " +
      "DeleteConversationDatasetRequest\022C\n\004name" +
      "\030\001 \001(\tB5\340A\002\372A/\n-dialogflow.googleapis.co" +
      "m/ConversationDataset\"\250\001\n\035ImportConversa" +
      "tionDataRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-d" +
      "ialogflow.googleapis.com/ConversationDat" +
      "aset\022B\n\014input_config\030\002 \001(\0132\'.google.clou" +
      "d.dialogflow.v2.InputConfigB\003\340A\002\"\332\001\n\'Imp" +
      "ortConversationDataOperationMetadata\022P\n\024" +
      "conversation_dataset\030\001 \001(\tB2\372A/\n-dialogf" +
      "low.googleapis.com/ConversationDataset\022," +
      "\n\020partial_failures\030\002 \003(\0132\022.google.rpc.St" +
      "atus\022/\n\013create_time\030\003 \001(\0132\032.google.proto" +
      "buf.Timestamp\"\221\001\n\'ImportConversationData" +
      "OperationResponse\022P\n\024conversation_datase" +
      "t\030\001 \001(\tB2\372A/\n-dialogflow.googleapis.com/" +
      "ConversationDataset\022\024\n\014import_count\030\003 \001(" +
      "\005\"~\n*CreateConversationDatasetOperationM" +
      "etadata\022P\n\024conversation_dataset\030\001 \001(\tB2\372" +
      "A/\n-dialogflow.googleapis.com/Conversati" +
      "onDataset\",\n*DeleteConversationDatasetOp" +
      "erationMetadata2\326\014\n\024ConversationDatasets" +
      "\022\263\002\n\031CreateConversationDataset\022<.google." +
      "cloud.dialogflow.v2.CreateConversationDa" +
      "tasetRequest\032\035.google.longrunning.Operat" +
      "ion\"\270\001\202\323\344\223\002P\"8/v2/{parent=projects/*/loc" +
      "ations/*}/conversationDatasets:\024conversa" +
      "tion_dataset\332A\033parent,conversation_datas" +
      "et\312AA\n\023ConversationDataset\022*CreateConver" +
      "sationDatasetOperationMetadata\022\375\001\n\026GetCo" +
      "nversationDataset\0229.google.cloud.dialogf" +
      "low.v2.GetConversationDatasetRequest\032/.g" +
      "oogle.cloud.dialogflow.v2.ConversationDa" +
      "taset\"w\202\323\344\223\002j\022,/v2/{name=projects/*/conv" +
      "ersationDatasets/*}Z:\0228/v2/{name=project" +
      "s/*/locations/*/conversationDatasets/*}\332" +
      "A\004name\022\220\002\n\030ListConversationDatasets\022;.go" +
      "ogle.cloud.dialogflow.v2.ListConversatio" +
      "nDatasetsRequest\032<.google.cloud.dialogfl" +
      "ow.v2.ListConversationDatasetsResponse\"y" +
      "\202\323\344\223\002j\022,/v2/{parent=projects/*}/conversa" +
      "tionDatasetsZ:\0228/v2/{parent=projects/*/l" +
      "ocations/*}/conversationDatasets\332A\006paren" +
      "t\022\210\002\n\031DeleteConversationDataset\022<.google" +
      ".cloud.dialogflow.v2.DeleteConversationD" +
      "atasetRequest\032\035.google.longrunning.Opera" +
      "tion\"\215\001\202\323\344\223\002:*8/v2/{name=projects/*/loca" +
      "tions/*/conversationDatasets/*}\332A\004name\312A" +
      "C\n\025google.protobuf.Empty\022*DeleteConversa" +
      "tionDatasetOperationMetadata\022\357\002\n\026ImportC" +
      "onversationData\0229.google.cloud.dialogflo" +
      "w.v2.ImportConversationDataRequest\032\035.goo" +
      "gle.longrunning.Operation\"\372\001\202\323\344\223\002\236\001\"C/v2" +
      "/{name=projects/*/conversationDatasets/*" +
      "}:importConversationData:\001*ZT\"O/v2/{name" +
      "=projects/*/locations/*/conversationData" +
      "sets/*}:importConversationData:\001*\312AR\n\'Im" +
      "portConversationDataOperationResponse\022\'I" +
      "mportConversationDataOperationMetadata\032x" +
      "\312A\031dialogflow.googleapis.com\322AYhttps://w" +
      "ww.googleapis.com/auth/cloud-platform,ht" +
      "tps://www.googleapis.com/auth/dialogflow" +
      "B\247\001\n\036com.google.cloud.dialogflow.v2B\030Con" +
      "versationDatasetProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/dialogflow/" +
      "v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dia" +
      "logflow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.GcsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_ConversationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_ConversationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ConversationInfo_descriptor,
        new java.lang.String[] { "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2_InputConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_InputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_InputConfig_descriptor,
        new java.lang.String[] { "GcsSource", "Source", });
    internal_static_google_cloud_dialogflow_v2_ConversationDataset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ConversationDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ConversationDataset_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "CreateTime", "InputConfig", "ConversationInfo", "ConversationCount", });
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor,
        new java.lang.String[] { "Parent", "ConversationDataset", });
    internal_static_google_cloud_dialogflow_v2_GetConversationDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_GetConversationDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_GetConversationDatasetRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListConversationDatasetsResponse_descriptor,
        new java.lang.String[] { "ConversationDatasets", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor,
        new java.lang.String[] { "Name", "InputConfig", });
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationMetadata_descriptor,
        new java.lang.String[] { "ConversationDataset", "PartialFailures", "CreateTime", });
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor,
        new java.lang.String[] { "ConversationDataset", "ImportCount", });
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor,
        new java.lang.String[] { "ConversationDataset", });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DeleteConversationDatasetOperationMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
