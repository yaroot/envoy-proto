// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public final class DataScansProto {
  private DataScansProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScansRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScansResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_RunDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_RunDataScanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataScan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanJob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dataplex/v1/datascans.pro" +
      "to\022\030google.cloud.dataplex.v1\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032+google/cloud/da" +
      "taplex/v1/data_profile.proto\032+google/clo" +
      "ud/dataplex/v1/data_quality.proto\032)googl" +
      "e/cloud/dataplex/v1/processing.proto\032(go" +
      "ogle/cloud/dataplex/v1/resources.proto\032#" +
      "google/longrunning/operations.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\037google/pr" +
      "otobuf/timestamp.proto\"\251\001\n\025CreateDataSca" +
      "nRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locati" +
      "ons.googleapis.com/Location\022:\n\tdata_scan" +
      "\030\002 \001(\0132\".google.cloud.dataplex.v1.DataSc" +
      "anB\003\340A\002\022\031\n\014data_scan_id\030\003 \001(\tB\003\340A\002\"\211\001\n\025U" +
      "pdateDataScanRequest\022:\n\tdata_scan\030\001 \001(\0132" +
      "\".google.cloud.dataplex.v1.DataScanB\003\340A\002" +
      "\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf." +
      "FieldMaskB\003\340A\002\"O\n\025DeleteDataScanRequest\022" +
      "6\n\004name\030\001 \001(\tB(\340A\002\372A\"\n dataplex.googleap" +
      "is.com/DataScan\"\337\001\n\022GetDataScanRequest\0226" +
      "\n\004name\030\001 \001(\tB(\340A\002\372A\"\n dataplex.googleapi" +
      "s.com/DataScan\022L\n\004view\030\002 \001(\01629.google.cl" +
      "oud.dataplex.v1.GetDataScanRequest.DataS" +
      "canViewB\003\340A\001\"C\n\014DataScanView\022\036\n\032DATA_SCA" +
      "N_VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020" +
      "\n\"\256\001\n\024ListDataScansRequest\0229\n\006parent\030\001 \001" +
      "(\tB)\340A\002\372A#\n!locations.googleapis.com/Loc" +
      "ation\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_to" +
      "ken\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010o" +
      "rder_by\030\005 \001(\tB\003\340A\001\"}\n\025ListDataScansRespo" +
      "nse\0226\n\ndata_scans\030\001 \003(\0132\".google.cloud.d" +
      "ataplex.v1.DataScan\022\027\n\017next_page_token\030\002" +
      " \001(\t\022\023\n\013unreachable\030\003 \003(\t\"L\n\022RunDataScan" +
      "Request\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n dataplex." +
      "googleapis.com/DataScan\"I\n\023RunDataScanRe" +
      "sponse\0222\n\003job\030\001 \001(\0132%.google.cloud.datap" +
      "lex.v1.DataScanJob\"\362\001\n\025GetDataScanJobReq" +
      "uest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#dataplex.goo" +
      "gleapis.com/DataScanJob\022R\n\004view\030\002 \001(\0162?." +
      "google.cloud.dataplex.v1.GetDataScanJobR" +
      "equest.DataScanJobViewB\003\340A\001\"J\n\017DataScanJ" +
      "obView\022\"\n\036DATA_SCAN_JOB_VIEW_UNSPECIFIED" +
      "\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\n\"\204\001\n\027ListDataScan" +
      "JobsRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n dat" +
      "aplex.googleapis.com/DataScan\022\026\n\tpage_si" +
      "ze\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"r" +
      "\n\030ListDataScanJobsResponse\022=\n\016data_scan_" +
      "jobs\030\001 \003(\0132%.google.cloud.dataplex.v1.Da" +
      "taScanJob\022\027\n\017next_page_token\030\002 \001(\t\"\261\n\n\010D" +
      "ataScan\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 \001(\tB" +
      "\003\340A\003\022\030\n\013description\030\003 \001(\tB\003\340A\001\022\031\n\014displa" +
      "y_name\030\004 \001(\tB\003\340A\001\022C\n\006labels\030\005 \003(\0132..goog" +
      "le.cloud.dataplex.v1.DataScan.LabelsEntr" +
      "yB\003\340A\001\0223\n\005state\030\006 \001(\0162\037.google.cloud.dat" +
      "aplex.v1.StateB\003\340A\003\0224\n\013create_time\030\007 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd" +
      "ate_time\030\010 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\003\340A\003\0227\n\004data\030\t \001(\0132$.google.cloud.dat" +
      "aplex.v1.DataSourceB\003\340A\002\022M\n\016execution_sp" +
      "ec\030\n \001(\01320.google.cloud.dataplex.v1.Data" +
      "Scan.ExecutionSpecB\003\340A\001\022Q\n\020execution_sta" +
      "tus\030\013 \001(\01322.google.cloud.dataplex.v1.Dat" +
      "aScan.ExecutionStatusB\003\340A\003\0229\n\004type\030\014 \001(\016" +
      "2&.google.cloud.dataplex.v1.DataScanType" +
      "B\003\340A\003\022F\n\021data_quality_spec\030d \001(\0132).googl" +
      "e.cloud.dataplex.v1.DataQualitySpecH\000\022F\n" +
      "\021data_profile_spec\030e \001(\0132).google.cloud." +
      "dataplex.v1.DataProfileSpecH\000\022P\n\023data_qu" +
      "ality_result\030\310\001 \001(\0132+.google.cloud.datap" +
      "lex.v1.DataQualityResultB\003\340A\003H\001\022P\n\023data_" +
      "profile_result\030\311\001 \001(\0132+.google.cloud.dat" +
      "aplex.v1.DataProfileResultB\003\340A\003H\001\032m\n\rExe" +
      "cutionSpec\0227\n\007trigger\030\001 \001(\0132!.google.clo" +
      "ud.dataplex.v1.TriggerB\003\340A\001\022\024\n\005field\030d \001" +
      "(\tB\003\340A\005H\000B\r\n\013incremental\032\205\001\n\017ExecutionSt" +
      "atus\0229\n\025latest_job_start_time\030\004 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\0227\n\023latest_job_en" +
      "d_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\t:\0028\001:c\352A`\n dataplex.googleapis.com/Da" +
      "taScan\022<projects/{project}/locations/{lo" +
      "cation}/dataScans/{dataScan}B\006\n\004specB\010\n\006" +
      "result\"\342\006\n\013DataScanJob\022\021\n\004name\030\001 \001(\tB\003\340A" +
      "\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0223\n\nstart_time\030\003 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end_" +
      "time\030\004 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\022?\n\005state\030\005 \001(\0162+.google.cloud.datapl" +
      "ex.v1.DataScanJob.StateB\003\340A\003\022\024\n\007message\030" +
      "\006 \001(\tB\003\340A\003\0229\n\004type\030\007 \001(\0162&.google.cloud." +
      "dataplex.v1.DataScanTypeB\003\340A\003\022K\n\021data_qu" +
      "ality_spec\030d \001(\0132).google.cloud.dataplex" +
      ".v1.DataQualitySpecB\003\340A\003H\000\022K\n\021data_profi" +
      "le_spec\030e \001(\0132).google.cloud.dataplex.v1" +
      ".DataProfileSpecB\003\340A\003H\000\022P\n\023data_quality_" +
      "result\030\310\001 \001(\0132+.google.cloud.dataplex.v1" +
      ".DataQualityResultB\003\340A\003H\001\022P\n\023data_profil" +
      "e_result\030\311\001 \001(\0132+.google.cloud.dataplex." +
      "v1.DataProfileResultB\003\340A\003H\001\"q\n\005State\022\025\n\021" +
      "STATE_UNSPECIFIED\020\000\022\013\n\007RUNNING\020\001\022\r\n\tCANC" +
      "ELING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n" +
      "\006FAILED\020\005\022\013\n\007PENDING\020\007:q\352An\n#dataplex.go" +
      "ogleapis.com/DataScanJob\022Gprojects/{proj" +
      "ect}/locations/{location}/dataScans/{dat" +
      "aScan}/jobs/{job}B\006\n\004specB\010\n\006result*R\n\014D" +
      "ataScanType\022\036\n\032DATA_SCAN_TYPE_UNSPECIFIE" +
      "D\020\000\022\020\n\014DATA_QUALITY\020\001\022\020\n\014DATA_PROFILE\020\0022" +
      "\362\014\n\017DataScanService\022\343\001\n\016CreateDataScan\022/" +
      ".google.cloud.dataplex.v1.CreateDataScan" +
      "Request\032\035.google.longrunning.Operation\"\200" +
      "\001\202\323\344\223\002:\"-/v1/{parent=projects/*/location" +
      "s/*}/dataScans:\tdata_scan\332A\035parent,data_" +
      "scan,data_scan_id\312A\035\n\010DataScan\022\021Operatio" +
      "nMetadata\022\345\001\n\016UpdateDataScan\022/.google.cl" +
      "oud.dataplex.v1.UpdateDataScanRequest\032\035." +
      "google.longrunning.Operation\"\202\001\202\323\344\223\002D27/" +
      "v1/{data_scan.name=projects/*/locations/" +
      "*/dataScans/*}:\tdata_scan\332A\025data_scan,up" +
      "date_mask\312A\035\n\010DataScan\022\021OperationMetadat" +
      "a\022\313\001\n\016DeleteDataScan\022/.google.cloud.data" +
      "plex.v1.DeleteDataScanRequest\032\035.google.l" +
      "ongrunning.Operation\"i\202\323\344\223\002/*-/v1/{name=" +
      "projects/*/locations/*/dataScans/*}\332A\004na" +
      "me\312A*\n\025google.protobuf.Empty\022\021OperationM" +
      "etadata\022\235\001\n\013GetDataScan\022,.google.cloud.d" +
      "ataplex.v1.GetDataScanRequest\032\".google.c" +
      "loud.dataplex.v1.DataScan\"<\202\323\344\223\002/\022-/v1/{" +
      "name=projects/*/locations/*/dataScans/*}" +
      "\332A\004name\022\260\001\n\rListDataScans\022..google.cloud" +
      ".dataplex.v1.ListDataScansRequest\032/.goog" +
      "le.cloud.dataplex.v1.ListDataScansRespon" +
      "se\">\202\323\344\223\002/\022-/v1/{parent=projects/*/locat" +
      "ions/*}/dataScans\332A\006parent\022\257\001\n\013RunDataSc" +
      "an\022,.google.cloud.dataplex.v1.RunDataSca" +
      "nRequest\032-.google.cloud.dataplex.v1.RunD" +
      "ataScanResponse\"C\202\323\344\223\0026\"1/v1/{name=proje" +
      "cts/*/locations/*/dataScans/*}:run:\001*\332A\004" +
      "name\022\255\001\n\016GetDataScanJob\022/.google.cloud.d" +
      "ataplex.v1.GetDataScanJobRequest\032%.googl" +
      "e.cloud.dataplex.v1.DataScanJob\"C\202\323\344\223\0026\022" +
      "4/v1/{name=projects/*/locations/*/dataSc" +
      "ans/*/jobs/*}\332A\004name\022\300\001\n\020ListDataScanJob" +
      "s\0221.google.cloud.dataplex.v1.ListDataSca" +
      "nJobsRequest\0322.google.cloud.dataplex.v1." +
      "ListDataScanJobsResponse\"E\202\323\344\223\0026\0224/v1/{p" +
      "arent=projects/*/locations/*/dataScans/*" +
      "}/jobs\332A\006parent\032K\312A\027dataplex.googleapis." +
      "com\322A.https://www.googleapis.com/auth/cl" +
      "oud-platformBr\n\034com.google.cloud.dataple" +
      "x.v1B\016DataScansProtoP\001Z@google.golang.or" +
      "g/genproto/googleapis/cloud/dataplex/v1;" +
      "dataplexb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dataplex.v1.DataProfileProto.getDescriptor(),
          com.google.cloud.dataplex.v1.DataQualityProto.getDescriptor(),
          com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
          com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor,
        new java.lang.String[] { "Parent", "DataScan", "DataScanId", });
    internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor,
        new java.lang.String[] { "DataScan", "UpdateMask", });
    internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_GetDataScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor,
        new java.lang.String[] { "Name", "View", });
    internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_ListDataScansRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_ListDataScansResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor,
        new java.lang.String[] { "DataScans", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataplex_v1_RunDataScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataplex_v1_RunDataScanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor,
        new java.lang.String[] { "Name", "View", });
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor,
        new java.lang.String[] { "DataScanJobs", "NextPageToken", });
    internal_static_google_cloud_dataplex_v1_DataScan_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dataplex_v1_DataScan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataScan_descriptor,
        new java.lang.String[] { "Name", "Uid", "Description", "DisplayName", "Labels", "State", "CreateTime", "UpdateTime", "Data", "ExecutionSpec", "ExecutionStatus", "Type", "DataQualitySpec", "DataProfileSpec", "DataQualityResult", "DataProfileResult", "Spec", "Result", });
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor =
      internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor,
        new java.lang.String[] { "Trigger", "Field", "Incremental", });
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor =
      internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor,
        new java.lang.String[] { "LatestJobStartTime", "LatestJobEndTime", });
    internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor =
      internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dataplex_v1_DataScanJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor,
        new java.lang.String[] { "Name", "Uid", "StartTime", "EndTime", "State", "Message", "Type", "DataQualitySpec", "DataProfileSpec", "DataQualityResult", "DataProfileResult", "Spec", "Result", });
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
    com.google.cloud.dataplex.v1.DataProfileProto.getDescriptor();
    com.google.cloud.dataplex.v1.DataQualityProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
    com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}