// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/job.proto

package com.google.cloud.run.v2;

public final class JobProto {
  private JobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_CreateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_GetJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_UpdateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ListJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ListJobsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_DeleteJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_RunJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RunJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Job_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Job_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_Job_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Job_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_ExecutionReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ExecutionReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035google/cloud/run/v2/job.proto\022\023google." +
      "cloud.run.v2\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\035google/api/launch_" +
      "stage.proto\032\031google/api/resource.proto\032#" +
      "google/cloud/run/v2/condition.proto\032,goo" +
      "gle/cloud/run/v2/execution_template.prot" +
      "o\032)google/cloud/run/v2/vendor_settings.p" +
      "roto\032\036google/iam/v1/iam_policy.proto\032\032go" +
      "ogle/iam/v1/policy.proto\032#google/longrun" +
      "ning/operations.proto\032\037google/protobuf/t" +
      "imestamp.proto\"\232\001\n\020CreateJobRequest\022.\n\006p" +
      "arent\030\001 \001(\tB\036\340A\002\372A\030\022\026run.googleapis.com/" +
      "Job\022*\n\003job\030\002 \001(\0132\030.google.cloud.run.v2.J" +
      "obB\003\340A\002\022\023\n\006job_id\030\003 \001(\tB\003\340A\002\022\025\n\rvalidate" +
      "_only\030\004 \001(\010\"=\n\rGetJobRequest\022,\n\004name\030\001 \001" +
      "(\tB\036\340A\002\372A\030\n\026run.googleapis.com/Job\"l\n\020Up" +
      "dateJobRequest\022*\n\003job\030\001 \001(\0132\030.google.clo" +
      "ud.run.v2.JobB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(" +
      "\010\022\025\n\rallow_missing\030\004 \001(\010\"~\n\017ListJobsRequ" +
      "est\022.\n\006parent\030\001 \001(\tB\036\340A\002\372A\030\022\026run.googlea" +
      "pis.com/Job\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t" +
      "oken\030\003 \001(\t\022\024\n\014show_deleted\030\004 \001(\010\"S\n\020List" +
      "JobsResponse\022&\n\004jobs\030\001 \003(\0132\030.google.clou" +
      "d.run.v2.Job\022\027\n\017next_page_token\030\002 \001(\t\"e\n" +
      "\020DeleteJobRequest\022,\n\004name\030\001 \001(\tB\036\340A\002\372A\030\n" +
      "\026run.googleapis.com/Job\022\025\n\rvalidate_only" +
      "\030\003 \001(\010\022\014\n\004etag\030\004 \001(\t\"b\n\rRunJobRequest\022,\n" +
      "\004name\030\001 \001(\tB\036\340A\002\372A\030\n\026run.googleapis.com/" +
      "Job\022\025\n\rvalidate_only\030\002 \001(\010\022\014\n\004etag\030\003 \001(\t" +
      "\"\212\t\n\003Job\022\014\n\004name\030\001 \001(\t\022\020\n\003uid\030\002 \001(\tB\003\340A\003" +
      "\022\027\n\ngeneration\030\003 \001(\003B\003\340A\003\0224\n\006labels\030\004 \003(" +
      "\0132$.google.cloud.run.v2.Job.LabelsEntry\022" +
      ">\n\013annotations\030\005 \003(\0132).google.cloud.run." +
      "v2.Job.AnnotationsEntry\0224\n\013create_time\030\006" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n" +
      "\013update_time\030\007 \001(\0132\032.google.protobuf.Tim" +
      "estampB\003\340A\003\0224\n\013delete_time\030\010 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\0224\n\013expire_time" +
      "\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "\024\n\007creator\030\n \001(\tB\003\340A\003\022\032\n\rlast_modifier\030\013" +
      " \001(\tB\003\340A\003\022\016\n\006client\030\014 \001(\t\022\026\n\016client_vers" +
      "ion\030\r \001(\t\022-\n\014launch_stage\030\016 \001(\0162\027.google" +
      ".api.LaunchStage\022F\n\024binary_authorization" +
      "\030\017 \001(\0132(.google.cloud.run.v2.BinaryAutho" +
      "rization\022=\n\010template\030\020 \001(\0132&.google.clou" +
      "d.run.v2.ExecutionTemplateB\003\340A\002\022 \n\023obser" +
      "ved_generation\030\021 \001(\003B\003\340A\003\022?\n\022terminal_co" +
      "ndition\030\022 \001(\0132\036.google.cloud.run.v2.Cond" +
      "itionB\003\340A\003\0227\n\nconditions\030\023 \003(\0132\036.google." +
      "cloud.run.v2.ConditionB\003\340A\003\022\034\n\017execution" +
      "_count\030\024 \001(\005B\003\340A\003\022N\n\030latest_created_exec" +
      "ution\030\026 \001(\0132\'.google.cloud.run.v2.Execut" +
      "ionReferenceB\003\340A\003\022\030\n\013reconciling\030\027 \001(\010B\003" +
      "\340A\003\022\021\n\004etag\030c \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0322\n\020Annotat" +
      "ionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001:R\352AO\n\026run.googleapis.com/Job\0222projects" +
      "/{project}/locations/{location}/jobs/{jo" +
      "b}R\001\001\"\253\001\n\022ExecutionReference\022/\n\004name\030\001 \001" +
      "(\tB!\372A\036\n\034run.googleapis.com/Execution\022/\n" +
      "\013create_time\030\002 \001(\0132\032.google.protobuf.Tim" +
      "estamp\0223\n\017completion_time\030\003 \001(\0132\032.google" +
      ".protobuf.Timestamp2\314\013\n\004Jobs\022\251\001\n\tCreateJ" +
      "ob\022%.google.cloud.run.v2.CreateJobReques" +
      "t\032\035.google.longrunning.Operation\"V\202\323\344\223\002/" +
      "\"(/v2/{parent=projects/*/locations/*}/jo" +
      "bs:\003job\332A\021parent,job,job_id\312A\n\n\003Job\022\003Job" +
      "\022\177\n\006GetJob\022\".google.cloud.run.v2.GetJobR" +
      "equest\032\030.google.cloud.run.v2.Job\"7\202\323\344\223\002*" +
      "\022(/v2/{name=projects/*/locations/*/jobs/" +
      "*}\332A\004name\022\222\001\n\010ListJobs\022$.google.cloud.ru" +
      "n.v2.ListJobsRequest\032%.google.cloud.run." +
      "v2.ListJobsResponse\"9\202\323\344\223\002*\022(/v2/{parent" +
      "=projects/*/locations/*}/jobs\332A\006parent\022\237" +
      "\001\n\tUpdateJob\022%.google.cloud.run.v2.Updat" +
      "eJobRequest\032\035.google.longrunning.Operati" +
      "on\"L\202\323\344\223\00232,/v2/{job.name=projects/*/loc" +
      "ations/*/jobs/*}:\003job\332A\003job\312A\n\n\003Job\022\003Job" +
      "\022\227\001\n\tDeleteJob\022%.google.cloud.run.v2.Del" +
      "eteJobRequest\032\035.google.longrunning.Opera" +
      "tion\"D\202\323\344\223\002**(/v2/{name=projects/*/locat" +
      "ions/*/jobs/*}\332A\004name\312A\n\n\003Job\022\003Job\022\244\001\n\006R" +
      "unJob\022\".google.cloud.run.v2.RunJobReques" +
      "t\032\035.google.longrunning.Operation\"W\202\323\344\223\0021" +
      "\",/v2/{name=projects/*/locations/*/jobs/" +
      "*}:run:\001*\332A\004name\312A\026\n\tExecution\022\tExecutio" +
      "n\022\214\001\n\014GetIamPolicy\022\".google.iam.v1.GetIa" +
      "mPolicyRequest\032\025.google.iam.v1.Policy\"A\202" +
      "\323\344\223\002;\0229/v2/{resource=projects/*/location" +
      "s/*/jobs/*}:getIamPolicy\022\217\001\n\014SetIamPolic" +
      "y\022\".google.iam.v1.SetIamPolicyRequest\032\025." +
      "google.iam.v1.Policy\"D\202\323\344\223\002>\"9/v2/{resou" +
      "rce=projects/*/locations/*/jobs/*}:setIa" +
      "mPolicy:\001*\022\265\001\n\022TestIamPermissions\022(.goog" +
      "le.iam.v1.TestIamPermissionsRequest\032).go" +
      "ogle.iam.v1.TestIamPermissionsResponse\"J" +
      "\202\323\344\223\002D\"?/v2/{resource=projects/*/locatio" +
      "ns/*/jobs/*}:testIamPermissions:\001*\032F\312A\022r" +
      "un.googleapis.com\322A.https://www.googleap" +
      "is.com/auth/cloud-platformB]\n\027com.google" +
      ".cloud.run.v2B\010JobProtoP\001Z6google.golang" +
      ".org/genproto/googleapis/cloud/run/v2;ru" +
      "nb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.run.v2.ConditionProto.getDescriptor(),
          com.google.cloud.run.v2.ExecutionTemplateProto.getDescriptor(),
          com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_CreateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_CreateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_CreateJobRequest_descriptor,
        new java.lang.String[] { "Parent", "Job", "JobId", "ValidateOnly", });
    internal_static_google_cloud_run_v2_GetJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_GetJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_GetJobRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_run_v2_UpdateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_UpdateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_UpdateJobRequest_descriptor,
        new java.lang.String[] { "Job", "ValidateOnly", "AllowMissing", });
    internal_static_google_cloud_run_v2_ListJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_run_v2_ListJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ListJobsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "ShowDeleted", });
    internal_static_google_cloud_run_v2_ListJobsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_run_v2_ListJobsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ListJobsResponse_descriptor,
        new java.lang.String[] { "Jobs", "NextPageToken", });
    internal_static_google_cloud_run_v2_DeleteJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_run_v2_DeleteJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_DeleteJobRequest_descriptor,
        new java.lang.String[] { "Name", "ValidateOnly", "Etag", });
    internal_static_google_cloud_run_v2_RunJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_run_v2_RunJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_RunJobRequest_descriptor,
        new java.lang.String[] { "Name", "ValidateOnly", "Etag", });
    internal_static_google_cloud_run_v2_Job_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_run_v2_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Job_descriptor,
        new java.lang.String[] { "Name", "Uid", "Generation", "Labels", "Annotations", "CreateTime", "UpdateTime", "DeleteTime", "ExpireTime", "Creator", "LastModifier", "Client", "ClientVersion", "LaunchStage", "BinaryAuthorization", "Template", "ObservedGeneration", "TerminalCondition", "Conditions", "ExecutionCount", "LatestCreatedExecution", "Reconciling", "Etag", });
    internal_static_google_cloud_run_v2_Job_LabelsEntry_descriptor =
      internal_static_google_cloud_run_v2_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_Job_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Job_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_Job_AnnotationsEntry_descriptor =
      internal_static_google_cloud_run_v2_Job_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_Job_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_Job_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_ExecutionReference_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_run_v2_ExecutionReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_ExecutionReference_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "CompletionTime", });
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
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.ConditionProto.getDescriptor();
    com.google.cloud.run.v2.ExecutionTemplateProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
