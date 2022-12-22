// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

public final class ManagedNotebooksProto {
  private ManagedNotebooksProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/notebooks/v1/managed_serv" +
      "ice.proto\022\031google.cloud.notebooks.v1\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\0321google/" +
      "cloud/notebooks/v1/diagnostic_config.pro" +
      "to\032%google/cloud/notebooks/v1/event.prot" +
      "o\032\'google/cloud/notebooks/v1/runtime.pro" +
      "to\032#google/longrunning/operations.proto\032" +
      " google/protobuf/field_mask.proto\032\037googl" +
      "e/protobuf/timestamp.proto\"v\n\023ListRuntim" +
      "esRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\022 noteb" +
      "ooks.googleapis.com/Runtime\022\021\n\tpage_size" +
      "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"z\n\024ListRuntim" +
      "esResponse\0224\n\010runtimes\030\001 \003(\0132\".google.cl" +
      "oud.notebooks.v1.Runtime\022\027\n\017next_page_to" +
      "ken\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"K\n\021GetRun" +
      "timeRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n noteb" +
      "ooks.googleapis.com/Runtime\"\267\001\n\024CreateRu" +
      "ntimeRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n no" +
      "tebooks.googleapis.com/Runtime\022\027\n\nruntim" +
      "e_id\030\002 \001(\tB\003\340A\002\0228\n\007runtime\030\003 \001(\0132\".googl" +
      "e.cloud.notebooks.v1.RuntimeB\003\340A\002\022\022\n\nreq" +
      "uest_id\030\004 \001(\t\"b\n\024DeleteRuntimeRequest\0226\n" +
      "\004name\030\001 \001(\tB(\340A\002\372A\"\n notebooks.googleapi" +
      "s.com/Runtime\022\022\n\nrequest_id\030\002 \001(\t\"<\n\023Sta" +
      "rtRuntimeRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\022\n\nr" +
      "equest_id\030\002 \001(\t\";\n\022StopRuntimeRequest\022\021\n" +
      "\004name\030\001 \001(\tB\003\340A\002\022\022\n\nrequest_id\030\002 \001(\t\"\244\001\n" +
      "\024SwitchRuntimeRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002" +
      "\022\024\n\014machine_type\030\002 \001(\t\022O\n\022accelerator_co" +
      "nfig\030\003 \001(\01323.google.cloud.notebooks.v1.R" +
      "untimeAcceleratorConfig\022\022\n\nrequest_id\030\004 " +
      "\001(\t\"<\n\023ResetRuntimeRequest\022\021\n\004name\030\001 \001(\t" +
      "B\003\340A\002\022\022\n\nrequest_id\030\002 \001(\t\">\n\025UpgradeRunt" +
      "imeRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\022\n\nrequest" +
      "_id\030\002 \001(\t\"\235\001\n\031ReportRuntimeEventRequest\022" +
      "6\n\004name\030\001 \001(\tB(\340A\002\372A\"\n notebooks.googlea" +
      "pis.com/Runtime\022\022\n\005vm_id\030\002 \001(\tB\003\340A\002\0224\n\005e" +
      "vent\030\003 \001(\0132 .google.cloud.notebooks.v1.E" +
      "ventB\003\340A\002\"\232\001\n\024UpdateRuntimeRequest\0228\n\007ru" +
      "ntime\030\001 \001(\0132\".google.cloud.notebooks.v1." +
      "RuntimeB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goog" +
      "le.protobuf.FieldMaskB\003\340A\002\022\022\n\nrequest_id" +
      "\030\003 \001(\t\"p\n\"RefreshRuntimeTokenInternalReq" +
      "uest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n notebooks.go" +
      "ogleapis.com/Runtime\022\022\n\005vm_id\030\002 \001(\tB\003\340A\002" +
      "\"q\n#RefreshRuntimeTokenInternalResponse\022" +
      "\024\n\014access_token\030\001 \001(\t\0224\n\013expire_time\030\002 \001" +
      "(\0132\032.google.protobuf.TimestampB\003\340A\003\"\235\001\n\026" +
      "DiagnoseRuntimeRequest\0226\n\004name\030\001 \001(\tB(\340A" +
      "\002\372A\"\n notebooks.googleapis.com/Runtime\022K" +
      "\n\021diagnostic_config\030\002 \001(\0132+.google.cloud" +
      ".notebooks.v1.DiagnosticConfigB\003\340A\0022\322\025\n\026" +
      "ManagedNotebookService\022\256\001\n\014ListRuntimes\022" +
      "..google.cloud.notebooks.v1.ListRuntimes" +
      "Request\032/.google.cloud.notebooks.v1.List" +
      "RuntimesResponse\"=\202\323\344\223\002.\022,/v1/{parent=pr" +
      "ojects/*/locations/*}/runtimes\332A\006parent\022" +
      "\233\001\n\nGetRuntime\022,.google.cloud.notebooks." +
      "v1.GetRuntimeRequest\032\".google.cloud.note" +
      "books.v1.Runtime\";\202\323\344\223\002.\022,/v1/{name=proj" +
      "ects/*/locations/*/runtimes/*}\332A\004name\022\331\001" +
      "\n\rCreateRuntime\022/.google.cloud.notebooks" +
      ".v1.CreateRuntimeRequest\032\035.google.longru" +
      "nning.Operation\"x\202\323\344\223\0027\",/v1/{parent=pro" +
      "jects/*/locations/*}/runtimes:\007runtime\332A" +
      "\031parent,runtime_id,runtime\312A\034\n\007Runtime\022\021" +
      "OperationMetadata\022\333\001\n\rUpdateRuntime\022/.go" +
      "ogle.cloud.notebooks.v1.UpdateRuntimeReq" +
      "uest\032\035.google.longrunning.Operation\"z\202\323\344" +
      "\223\002?24/v1/{runtime.name=projects/*/locati" +
      "ons/*/runtimes/*}:\007runtime\332A\023runtime,upd" +
      "ate_mask\312A\034\n\007Runtime\022\021OperationMetadata\022" +
      "\311\001\n\rDeleteRuntime\022/.google.cloud.noteboo" +
      "ks.v1.DeleteRuntimeRequest\032\035.google.long" +
      "running.Operation\"h\202\323\344\223\002.*,/v1/{name=pro" +
      "jects/*/locations/*/runtimes/*}\332A\004name\312A" +
      "*\n\025google.protobuf.Empty\022\021OperationMetad" +
      "ata\022\302\001\n\014StartRuntime\022..google.cloud.note" +
      "books.v1.StartRuntimeRequest\032\035.google.lo" +
      "ngrunning.Operation\"c\202\323\344\223\0027\"2/v1/{name=p" +
      "rojects/*/locations/*/runtimes/*}:start:" +
      "\001*\332A\004name\312A\034\n\007Runtime\022\021OperationMetadata" +
      "\022\277\001\n\013StopRuntime\022-.google.cloud.notebook" +
      "s.v1.StopRuntimeRequest\032\035.google.longrun" +
      "ning.Operation\"b\202\323\344\223\0026\"1/v1/{name=projec" +
      "ts/*/locations/*/runtimes/*}:stop:\001*\332A\004n" +
      "ame\312A\034\n\007Runtime\022\021OperationMetadata\022\305\001\n\rS" +
      "witchRuntime\022/.google.cloud.notebooks.v1" +
      ".SwitchRuntimeRequest\032\035.google.longrunni" +
      "ng.Operation\"d\202\323\344\223\0028\"3/v1/{name=projects" +
      "/*/locations/*/runtimes/*}:switch:\001*\332A\004n" +
      "ame\312A\034\n\007Runtime\022\021OperationMetadata\022\302\001\n\014R" +
      "esetRuntime\022..google.cloud.notebooks.v1." +
      "ResetRuntimeRequest\032\035.google.longrunning" +
      ".Operation\"c\202\323\344\223\0027\"2/v1/{name=projects/*" +
      "/locations/*/runtimes/*}:reset:\001*\332A\004name" +
      "\312A\034\n\007Runtime\022\021OperationMetadata\022\310\001\n\016Upgr" +
      "adeRuntime\0220.google.cloud.notebooks.v1.U" +
      "pgradeRuntimeRequest\032\035.google.longrunnin" +
      "g.Operation\"e\202\323\344\223\0029\"4/v1/{name=projects/" +
      "*/locations/*/runtimes/*}:upgrade:\001*\332A\004n" +
      "ame\312A\034\n\007Runtime\022\021OperationMetadata\022\324\001\n\022R" +
      "eportRuntimeEvent\0224.google.cloud.noteboo" +
      "ks.v1.ReportRuntimeEventRequest\032\035.google" +
      ".longrunning.Operation\"i\202\323\344\223\002=\"8/v1/{nam" +
      "e=projects/*/locations/*/runtimes/*}:rep" +
      "ortEvent:\001*\332A\004name\312A\034\n\007Runtime\022\021Operatio" +
      "nMetadata\022\376\001\n\033RefreshRuntimeTokenInterna" +
      "l\022=.google.cloud.notebooks.v1.RefreshRun" +
      "timeTokenInternalRequest\032>.google.cloud." +
      "notebooks.v1.RefreshRuntimeTokenInternal" +
      "Response\"`\202\323\344\223\002M\"H/v1/{name=projects/*/l" +
      "ocations/*/runtimes/*}:refreshRuntimeTok" +
      "enInternal:\001*\332A\nname,vm_id\022\335\001\n\017DiagnoseR" +
      "untime\0221.google.cloud.notebooks.v1.Diagn" +
      "oseRuntimeRequest\032\035.google.longrunning.O" +
      "peration\"x\202\323\344\223\002:\"5/v1/{name=projects/*/l" +
      "ocations/*/runtimes/*}:diagnose:\001*\332A\026nam" +
      "e,diagnostic_config\312A\034\n\007Runtime\022\021Operati" +
      "onMetadata\032L\312A\030notebooks.googleapis.com\322" +
      "A.https://www.googleapis.com/auth/cloud-" +
      "platformB\323\001\n\035com.google.cloud.notebooks." +
      "v1B\025ManagedNotebooksProtoP\001ZBgoogle.gola" +
      "ng.org/genproto/googleapis/cloud/noteboo" +
      "ks/v1;notebooks\252\002\031Google.Cloud.Notebooks" +
      ".V1\312\002\031Google\\Cloud\\Notebooks\\V1\352\002\034Google" +
      "::Cloud::Notebooks::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.notebooks.v1.DiagnosticConfigProto.getDescriptor(),
          com.google.cloud.notebooks.v1.EventProto.getDescriptor(),
          com.google.cloud.notebooks.v1.RuntimeProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor,
        new java.lang.String[] { "Runtimes", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor,
        new java.lang.String[] { "Parent", "RuntimeId", "Runtime", "RequestId", });
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "MachineType", "AcceleratorConfig", "RequestId", });
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor,
        new java.lang.String[] { "Name", "VmId", "Event", });
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor,
        new java.lang.String[] { "Runtime", "UpdateMask", "RequestId", });
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor,
        new java.lang.String[] { "Name", "VmId", });
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor,
        new java.lang.String[] { "AccessToken", "ExpireTime", });
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "DiagnosticConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.notebooks.v1.DiagnosticConfigProto.getDescriptor();
    com.google.cloud.notebooks.v1.EventProto.getDescriptor();
    com.google.cloud.notebooks.v1.RuntimeProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
