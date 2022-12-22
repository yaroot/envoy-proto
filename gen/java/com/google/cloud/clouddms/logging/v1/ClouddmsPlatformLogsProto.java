// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto

package com.google.cloud.clouddms.logging.v1;

public final class ClouddmsPlatformLogsProto {
  private ClouddmsPlatformLogsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_DatabaseType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_DatabaseType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_MySqlConnectionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_MySqlConnectionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_CloudSqlConnectionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_CloudSqlConnectionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_MigrationJobEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_MigrationJobEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_ConnectionProfileEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_ConnectionProfileEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_VpcPeeringConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_VpcPeeringConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_clouddms_logging_v1_PrivateConnectionEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_clouddms_logging_v1_PrivateConnectionEventLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/clouddms/logging/v1/cloud" +
      "dms_platform_logs.proto\022 google.cloud.cl" +
      "ouddms.logging.v1\032\037google/api/field_beha" +
      "vior.proto\032\036google/protobuf/duration.pro" +
      "to\032\037google/protobuf/timestamp.proto\032\027goo" +
      "gle/rpc/status.proto\"\226\001\n\014DatabaseType\022D\n" +
      "\010provider\030\001 \001(\01622.google.cloud.clouddms." +
      "logging.v1.DatabaseProvider\022@\n\006engine\030\002 " +
      "\001(\01620.google.cloud.clouddms.logging.v1.D" +
      "atabaseEngine\"\273\013\n\022LoggedMigrationJob\022\021\n\004" +
      "name\030\001 \001(\tB\003\340A\002\022U\n\006labels\030\002 \003(\0132@.google" +
      ".cloud.clouddms.logging.v1.LoggedMigrati" +
      "onJob.LabelsEntryB\003\340A\002\022\031\n\014display_name\030\003" +
      " \001(\tB\003\340A\002\022N\n\005state\030\004 \001(\0162:.google.cloud." +
      "clouddms.logging.v1.LoggedMigrationJob.S" +
      "tateB\003\340A\002\022N\n\005phase\030\005 \001(\0162:.google.cloud." +
      "clouddms.logging.v1.LoggedMigrationJob.P" +
      "haseB\003\340A\002\022L\n\004type\030\006 \001(\01629.google.cloud.c" +
      "louddms.logging.v1.LoggedMigrationJob.Ty" +
      "peB\003\340A\002\022\026\n\tdump_path\030\007 \001(\tB\003\340A\001\022\023\n\006sourc" +
      "e\030\010 \001(\tB\003\340A\002\022\030\n\013destination\030\t \001(\tB\003\340A\002\0220" +
      "\n\010duration\030\n \001(\0132\031.google.protobuf.Durat" +
      "ionB\003\340A\002\022e\n\021connectivity_type\030\013 \001(\0162E.go" +
      "ogle.cloud.clouddms.logging.v1.LoggedMig" +
      "rationJob.ConnectivityTypeB\003\340A\002\022&\n\005error" +
      "\030\014 \001(\0132\022.google.rpc.StatusB\003\340A\002\0221\n\010end_t" +
      "ime\030\r \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\002\022L\n\017source_database\030\016 \001(\0132..google.clo" +
      "ud.clouddms.logging.v1.DatabaseTypeB\003\340A\002" +
      "\022Q\n\024destination_database\030\017 \001(\0132..google." +
      "cloud.clouddms.logging.v1.DatabaseTypeB\003" +
      "\340A\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\"\361\001\n\005State\022\025\n\021STATE_UNSPECIFIE" +
      "D\020\000\022\017\n\013MAINTENANCE\020\001\022\t\n\005DRAFT\020\002\022\014\n\010CREAT" +
      "ING\020\003\022\017\n\013NOT_STARTED\020\004\022\013\n\007RUNNING\020\005\022\n\n\006F" +
      "AILED\020\006\022\r\n\tCOMPLETED\020\007\022\014\n\010DELETING\020\010\022\014\n\010" +
      "STOPPING\020\t\022\013\n\007STOPPED\020\n\022\013\n\007DELETED\020\013\022\014\n\010" +
      "UPDATING\020\014\022\014\n\010STARTING\020\r\022\016\n\nRESTARTING\020\016" +
      "\022\014\n\010RESUMING\020\017\"\216\001\n\005Phase\022\025\n\021PHASE_UNSPEC" +
      "IFIED\020\000\022\r\n\tFULL_DUMP\020\001\022\007\n\003CDC\020\002\022\027\n\023PROMO" +
      "TE_IN_PROGRESS\020\003\022%\n!WAITING_FOR_SOURCE_W" +
      "RITES_TO_STOP\020\004\022\026\n\022PREPARING_THE_DUMP\020\005\"" +
      ":\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\014\n\010ONE_TIM" +
      "E\020\001\022\016\n\nCONTINUOUS\020\002\"f\n\020ConnectivityType\022" +
      "!\n\035CONNECTIVITY_TYPE_UNSPECIFIED\020\000\022\r\n\tST" +
      "ATIC_IP\020\001\022\017\n\013REVERSE_SSH\020\002\022\017\n\013VPC_PEERIN" +
      "G\020\003\"\315\001\n\026MySqlConnectionProfile\022Q\n\007versio" +
      "n\030\001 \001(\0162@.google.cloud.clouddms.logging." +
      "v1.MySqlConnectionProfile.Version\022\024\n\014clo" +
      "ud_sql_id\030\002 \001(\t\"J\n\007Version\022\027\n\023VERSION_UN" +
      "SPECIFIED\020\000\022\010\n\004V5_5\020\001\022\010\n\004V5_6\020\002\022\010\n\004V5_7\020" +
      "\003\022\010\n\004V8_0\020\004\"\335\001\n\033PostgreSqlConnectionProf" +
      "ile\022V\n\007version\030\001 \001(\0162E.google.cloud.clou" +
      "ddms.logging.v1.PostgreSqlConnectionProf" +
      "ile.Version\022\024\n\014cloud_sql_id\030\002 \001(\t\"P\n\007Ver" +
      "sion\022\027\n\023VERSION_UNSPECIFIED\020\000\022\010\n\004V9_6\020\001\022" +
      "\007\n\003V11\020\002\022\007\n\003V10\020\003\022\007\n\003V12\020\004\022\007\n\003V13\020\005\"1\n\031C" +
      "loudSqlConnectionProfile\022\024\n\014cloud_sql_id" +
      "\030\001 \001(\t\"\205\002\n\027OracleConnectionProfile\022j\n\021co" +
      "nnectivity_type\030\001 \001(\0162J.google.cloud.clo" +
      "uddms.logging.v1.OracleConnectionProfile" +
      ".ConnectivityTypeB\003\340A\002\"~\n\020ConnectivityTy" +
      "pe\022!\n\035CONNECTIVITY_TYPE_UNSPECIFIED\020\000\022\025\n" +
      "\021STATIC_SERVICE_IP\020\001\022\026\n\022FORWARD_SSH_TUNN" +
      "EL\020\002\022\030\n\024PRIVATE_CONNECTIVITY\020\003\"\311\006\n\027Logge" +
      "dConnectionProfile\022\014\n\004name\030\001 \001(\t\022U\n\006labe" +
      "ls\030\002 \003(\0132E.google.cloud.clouddms.logging" +
      ".v1.LoggedConnectionProfile.LabelsEntry\022" +
      "N\n\005state\030\003 \001(\0162?.google.cloud.clouddms.l" +
      "ogging.v1.LoggedConnectionProfile.State\022" +
      "\024\n\014display_name\030\004 \001(\t\022I\n\005mysql\030d \001(\01328.g" +
      "oogle.cloud.clouddms.logging.v1.MySqlCon" +
      "nectionProfileH\000\022S\n\npostgresql\030e \001(\0132=.g" +
      "oogle.cloud.clouddms.logging.v1.PostgreS" +
      "qlConnectionProfileH\000\022O\n\010cloudsql\030f \001(\0132" +
      ";.google.cloud.clouddms.logging.v1.Cloud" +
      "SqlConnectionProfileH\000\022K\n\006oracle\030g \001(\01329" +
      ".google.cloud.clouddms.logging.v1.Oracle" +
      "ConnectionProfileH\000\022!\n\005error\030\005 \001(\0132\022.goo" +
      "gle.rpc.Status\022D\n\010provider\030\006 \001(\01622.googl" +
      "e.cloud.clouddms.logging.v1.DatabaseProv" +
      "ider\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"w\n\005State\022\025\n\021STATE_UNSPECIFIE" +
      "D\020\000\022\t\n\005DRAFT\020\001\022\014\n\010CREATING\020\002\022\t\n\005READY\020\003\022" +
      "\014\n\010UPDATING\020\004\022\014\n\010DELETING\020\005\022\013\n\007DELETED\020\006" +
      "\022\n\n\006FAILED\020\007B\024\n\022connection_profile\"\212\002\n\024M" +
      "igrationJobEventLog\022K\n\rmigration_job\030\001 \001" +
      "(\01324.google.cloud.clouddms.logging.v1.Lo" +
      "ggedMigrationJob\0228\n\024occurrence_timestamp" +
      "\030\002 \001(\0132\032.google.protobuf.Timestamp\022\014\n\004co" +
      "de\030\003 \001(\005\022\024\n\014text_message\030\004 \001(\t\022\030\n\rorigin" +
      "al_code\030\310\001 \001(\005H\000\022\033\n\020original_message\030\311\001 " +
      "\001(\tH\000B\020\n\016original_cause\"\231\002\n\031ConnectionPr" +
      "ofileEventLog\022U\n\022connection_profile\030\001 \001(" +
      "\01329.google.cloud.clouddms.logging.v1.Log" +
      "gedConnectionProfile\0228\n\024occurrence_times" +
      "tamp\030\002 \001(\0132\032.google.protobuf.Timestamp\022\014" +
      "\n\004code\030\003 \001(\005\022\024\n\014text_message\030\004 \001(\t\022\030\n\ror" +
      "iginal_code\030\310\001 \001(\005H\000\022\033\n\020original_message" +
      "\030\311\001 \001(\tH\000B\020\n\016original_cause\"\376\003\n\027LoggedPr" +
      "ivateConnection\022\014\n\004name\030\001 \001(\t\022U\n\006labels\030" +
      "\002 \003(\0132E.google.cloud.clouddms.logging.v1" +
      ".LoggedPrivateConnection.LabelsEntry\022\024\n\014" +
      "display_name\030\003 \001(\t\022N\n\005state\030\004 \001(\0162?.goog" +
      "le.cloud.clouddms.logging.v1.LoggedPriva" +
      "teConnection.State\022!\n\005error\030\005 \001(\0132\022.goog" +
      "le.rpc.Status\022N\n\022vpc_peering_config\030d \001(" +
      "\01322.google.cloud.clouddms.logging.v1.Vpc" +
      "PeeringConfig\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"v\n\005State\022\025\n\021STATE_U" +
      "NSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\013\n\007CREATED\020\002\022" +
      "\n\n\006FAILED\020\003\022\014\n\010DELETING\020\004\022\024\n\020FAILED_TO_D" +
      "ELETE\020\005\022\013\n\007DELETED\020\006\"4\n\020VpcPeeringConfig" +
      "\022\020\n\010vpc_name\030\001 \001(\t\022\016\n\006subnet\030\002 \001(\t\"\231\002\n\031P" +
      "rivateConnectionEventLog\022U\n\022private_conn" +
      "ection\030\001 \001(\01329.google.cloud.clouddms.log" +
      "ging.v1.LoggedPrivateConnection\0228\n\024occur" +
      "rence_timestamp\030\002 \001(\0132\032.google.protobuf." +
      "Timestamp\022\014\n\004code\030\003 \001(\005\022\024\n\014text_message\030" +
      "\004 \001(\t\022\030\n\roriginal_code\030\310\001 \001(\005H\000\022\033\n\020origi" +
      "nal_message\030\311\001 \001(\tH\000B\020\n\016original_cause*t" +
      "\n\016DatabaseEngine\022\037\n\033DATABASE_ENGINE_UNSP" +
      "ECIFIED\020\000\022\t\n\005MYSQL\020\001\022\016\n\nPOSTGRESQL\020\002\022\r\n\t" +
      "SQLSERVER\020\003\022\n\n\006ORACLE\020\004\022\013\n\007SPANNER\020\005*e\n\020" +
      "DatabaseProvider\022!\n\035DATABASE_PROVIDER_UN" +
      "SPECIFIED\020\000\022\014\n\010CLOUDSQL\020\001\022\007\n\003RDS\020\002\022\n\n\006AU" +
      "RORA\020\003\022\013\n\007ALLOYDB\020\004B\371\001\n$com.google.cloud" +
      ".clouddms.logging.v1B\031ClouddmsPlatformLo" +
      "gsProtoP\001ZGgoogle.golang.org/genproto/go" +
      "ogleapis/cloud/clouddms/logging/v1;loggi" +
      "ng\252\002 Google.Cloud.CloudDms.Logging.V1\312\002 " +
      "Google\\Cloud\\CloudDms\\Logging\\V1\352\002$Googl" +
      "e::Cloud::CloudDMS::Logging::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_clouddms_logging_v1_DatabaseType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_clouddms_logging_v1_DatabaseType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_DatabaseType_descriptor,
        new java.lang.String[] { "Provider", "Engine", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_descriptor,
        new java.lang.String[] { "Name", "Labels", "DisplayName", "State", "Phase", "Type", "DumpPath", "Source", "Destination", "Duration", "ConnectivityType", "Error", "EndTime", "SourceDatabase", "DestinationDatabase", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_LabelsEntry_descriptor =
      internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedMigrationJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_clouddms_logging_v1_MySqlConnectionProfile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_clouddms_logging_v1_MySqlConnectionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_MySqlConnectionProfile_descriptor,
        new java.lang.String[] { "Version", "CloudSqlId", });
    internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_PostgreSqlConnectionProfile_descriptor,
        new java.lang.String[] { "Version", "CloudSqlId", });
    internal_static_google_cloud_clouddms_logging_v1_CloudSqlConnectionProfile_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_clouddms_logging_v1_CloudSqlConnectionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_CloudSqlConnectionProfile_descriptor,
        new java.lang.String[] { "CloudSqlId", });
    internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_OracleConnectionProfile_descriptor,
        new java.lang.String[] { "ConnectivityType", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_descriptor,
        new java.lang.String[] { "Name", "Labels", "State", "DisplayName", "Mysql", "Postgresql", "Cloudsql", "Oracle", "Error", "Provider", "ConnectionProfile", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_LabelsEntry_descriptor =
      internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedConnectionProfile_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_clouddms_logging_v1_MigrationJobEventLog_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_clouddms_logging_v1_MigrationJobEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_MigrationJobEventLog_descriptor,
        new java.lang.String[] { "MigrationJob", "OccurrenceTimestamp", "Code", "TextMessage", "OriginalCode", "OriginalMessage", "OriginalCause", });
    internal_static_google_cloud_clouddms_logging_v1_ConnectionProfileEventLog_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_clouddms_logging_v1_ConnectionProfileEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_ConnectionProfileEventLog_descriptor,
        new java.lang.String[] { "ConnectionProfile", "OccurrenceTimestamp", "Code", "TextMessage", "OriginalCode", "OriginalMessage", "OriginalCause", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_descriptor,
        new java.lang.String[] { "Name", "Labels", "DisplayName", "State", "Error", "VpcPeeringConfig", });
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_LabelsEntry_descriptor =
      internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_LoggedPrivateConnection_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_clouddms_logging_v1_VpcPeeringConfig_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_clouddms_logging_v1_VpcPeeringConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_VpcPeeringConfig_descriptor,
        new java.lang.String[] { "VpcName", "Subnet", });
    internal_static_google_cloud_clouddms_logging_v1_PrivateConnectionEventLog_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_clouddms_logging_v1_PrivateConnectionEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_clouddms_logging_v1_PrivateConnectionEventLog_descriptor,
        new java.lang.String[] { "PrivateConnection", "OccurrenceTimestamp", "Code", "TextMessage", "OriginalCode", "OriginalMessage", "OriginalCause", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}