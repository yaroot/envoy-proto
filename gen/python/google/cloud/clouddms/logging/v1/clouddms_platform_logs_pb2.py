# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto\x12 google.cloud.clouddms.logging.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x96\x01\n\x0c\x44\x61tabaseType\x12\x44\n\x08provider\x18\x01 \x01(\x0e\x32\x32.google.cloud.clouddms.logging.v1.DatabaseProvider\x12@\n\x06\x65ngine\x18\x02 \x01(\x0e\x32\x30.google.cloud.clouddms.logging.v1.DatabaseEngine\"\xbb\x0b\n\x12LoggedMigrationJob\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12U\n\x06labels\x18\x02 \x03(\x0b\x32@.google.cloud.clouddms.logging.v1.LoggedMigrationJob.LabelsEntryB\x03\xe0\x41\x02\x12\x19\n\x0c\x64isplay_name\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12N\n\x05state\x18\x04 \x01(\x0e\x32:.google.cloud.clouddms.logging.v1.LoggedMigrationJob.StateB\x03\xe0\x41\x02\x12N\n\x05phase\x18\x05 \x01(\x0e\x32:.google.cloud.clouddms.logging.v1.LoggedMigrationJob.PhaseB\x03\xe0\x41\x02\x12L\n\x04type\x18\x06 \x01(\x0e\x32\x39.google.cloud.clouddms.logging.v1.LoggedMigrationJob.TypeB\x03\xe0\x41\x02\x12\x16\n\tdump_path\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06source\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65stination\x18\t \x01(\tB\x03\xe0\x41\x02\x12\x30\n\x08\x64uration\x18\n \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x02\x12\x65\n\x11\x63onnectivity_type\x18\x0b \x01(\x0e\x32\x45.google.cloud.clouddms.logging.v1.LoggedMigrationJob.ConnectivityTypeB\x03\xe0\x41\x02\x12&\n\x05\x65rror\x18\x0c \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x02\x12\x31\n\x08\x65nd_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\x12L\n\x0fsource_database\x18\x0e \x01(\x0b\x32..google.cloud.clouddms.logging.v1.DatabaseTypeB\x03\xe0\x41\x02\x12Q\n\x14\x64\x65stination_database\x18\x0f \x01(\x0b\x32..google.cloud.clouddms.logging.v1.DatabaseTypeB\x03\xe0\x41\x02\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xf1\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bMAINTENANCE\x10\x01\x12\t\n\x05\x44RAFT\x10\x02\x12\x0c\n\x08\x43REATING\x10\x03\x12\x0f\n\x0bNOT_STARTED\x10\x04\x12\x0b\n\x07RUNNING\x10\x05\x12\n\n\x06\x46\x41ILED\x10\x06\x12\r\n\tCOMPLETED\x10\x07\x12\x0c\n\x08\x44\x45LETING\x10\x08\x12\x0c\n\x08STOPPING\x10\t\x12\x0b\n\x07STOPPED\x10\n\x12\x0b\n\x07\x44\x45LETED\x10\x0b\x12\x0c\n\x08UPDATING\x10\x0c\x12\x0c\n\x08STARTING\x10\r\x12\x0e\n\nRESTARTING\x10\x0e\x12\x0c\n\x08RESUMING\x10\x0f\"\x8e\x01\n\x05Phase\x12\x15\n\x11PHASE_UNSPECIFIED\x10\x00\x12\r\n\tFULL_DUMP\x10\x01\x12\x07\n\x03\x43\x44\x43\x10\x02\x12\x17\n\x13PROMOTE_IN_PROGRESS\x10\x03\x12%\n!WAITING_FOR_SOURCE_WRITES_TO_STOP\x10\x04\x12\x16\n\x12PREPARING_THE_DUMP\x10\x05\":\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08ONE_TIME\x10\x01\x12\x0e\n\nCONTINUOUS\x10\x02\"f\n\x10\x43onnectivityType\x12!\n\x1d\x43ONNECTIVITY_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tSTATIC_IP\x10\x01\x12\x0f\n\x0bREVERSE_SSH\x10\x02\x12\x0f\n\x0bVPC_PEERING\x10\x03\"\xcd\x01\n\x16MySqlConnectionProfile\x12Q\n\x07version\x18\x01 \x01(\x0e\x32@.google.cloud.clouddms.logging.v1.MySqlConnectionProfile.Version\x12\x14\n\x0c\x63loud_sql_id\x18\x02 \x01(\t\"J\n\x07Version\x12\x17\n\x13VERSION_UNSPECIFIED\x10\x00\x12\x08\n\x04V5_5\x10\x01\x12\x08\n\x04V5_6\x10\x02\x12\x08\n\x04V5_7\x10\x03\x12\x08\n\x04V8_0\x10\x04\"\xdd\x01\n\x1bPostgreSqlConnectionProfile\x12V\n\x07version\x18\x01 \x01(\x0e\x32\x45.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile.Version\x12\x14\n\x0c\x63loud_sql_id\x18\x02 \x01(\t\"P\n\x07Version\x12\x17\n\x13VERSION_UNSPECIFIED\x10\x00\x12\x08\n\x04V9_6\x10\x01\x12\x07\n\x03V11\x10\x02\x12\x07\n\x03V10\x10\x03\x12\x07\n\x03V12\x10\x04\x12\x07\n\x03V13\x10\x05\"1\n\x19\x43loudSqlConnectionProfile\x12\x14\n\x0c\x63loud_sql_id\x18\x01 \x01(\t\"\x85\x02\n\x17OracleConnectionProfile\x12j\n\x11\x63onnectivity_type\x18\x01 \x01(\x0e\x32J.google.cloud.clouddms.logging.v1.OracleConnectionProfile.ConnectivityTypeB\x03\xe0\x41\x02\"~\n\x10\x43onnectivityType\x12!\n\x1d\x43ONNECTIVITY_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11STATIC_SERVICE_IP\x10\x01\x12\x16\n\x12\x46ORWARD_SSH_TUNNEL\x10\x02\x12\x18\n\x14PRIVATE_CONNECTIVITY\x10\x03\"\xc9\x06\n\x17LoggedConnectionProfile\x12\x0c\n\x04name\x18\x01 \x01(\t\x12U\n\x06labels\x18\x02 \x03(\x0b\x32\x45.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.LabelsEntry\x12N\n\x05state\x18\x03 \x01(\x0e\x32?.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.State\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\x12I\n\x05mysql\x18\x64 \x01(\x0b\x32\x38.google.cloud.clouddms.logging.v1.MySqlConnectionProfileH\x00\x12S\n\npostgresql\x18\x65 \x01(\x0b\x32=.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfileH\x00\x12O\n\x08\x63loudsql\x18\x66 \x01(\x0b\x32;.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfileH\x00\x12K\n\x06oracle\x18g \x01(\x0b\x32\x39.google.cloud.clouddms.logging.v1.OracleConnectionProfileH\x00\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status\x12\x44\n\x08provider\x18\x06 \x01(\x0e\x32\x32.google.cloud.clouddms.logging.v1.DatabaseProvider\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"w\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\t\n\x05\x44RAFT\x10\x01\x12\x0c\n\x08\x43REATING\x10\x02\x12\t\n\x05READY\x10\x03\x12\x0c\n\x08UPDATING\x10\x04\x12\x0c\n\x08\x44\x45LETING\x10\x05\x12\x0b\n\x07\x44\x45LETED\x10\x06\x12\n\n\x06\x46\x41ILED\x10\x07\x42\x14\n\x12\x63onnection_profile\"\x8a\x02\n\x14MigrationJobEventLog\x12K\n\rmigration_job\x18\x01 \x01(\x0b\x32\x34.google.cloud.clouddms.logging.v1.LoggedMigrationJob\x12\x38\n\x14occurrence_timestamp\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x63ode\x18\x03 \x01(\x05\x12\x14\n\x0ctext_message\x18\x04 \x01(\t\x12\x18\n\roriginal_code\x18\xc8\x01 \x01(\x05H\x00\x12\x1b\n\x10original_message\x18\xc9\x01 \x01(\tH\x00\x42\x10\n\x0eoriginal_cause\"\x99\x02\n\x19\x43onnectionProfileEventLog\x12U\n\x12\x63onnection_profile\x18\x01 \x01(\x0b\x32\x39.google.cloud.clouddms.logging.v1.LoggedConnectionProfile\x12\x38\n\x14occurrence_timestamp\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x63ode\x18\x03 \x01(\x05\x12\x14\n\x0ctext_message\x18\x04 \x01(\t\x12\x18\n\roriginal_code\x18\xc8\x01 \x01(\x05H\x00\x12\x1b\n\x10original_message\x18\xc9\x01 \x01(\tH\x00\x42\x10\n\x0eoriginal_cause\"\xfe\x03\n\x17LoggedPrivateConnection\x12\x0c\n\x04name\x18\x01 \x01(\t\x12U\n\x06labels\x18\x02 \x03(\x0b\x32\x45.google.cloud.clouddms.logging.v1.LoggedPrivateConnection.LabelsEntry\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12N\n\x05state\x18\x04 \x01(\x0e\x32?.google.cloud.clouddms.logging.v1.LoggedPrivateConnection.State\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status\x12N\n\x12vpc_peering_config\x18\x64 \x01(\x0b\x32\x32.google.cloud.clouddms.logging.v1.VpcPeeringConfig\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"v\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0b\n\x07\x43REATED\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03\x12\x0c\n\x08\x44\x45LETING\x10\x04\x12\x14\n\x10\x46\x41ILED_TO_DELETE\x10\x05\x12\x0b\n\x07\x44\x45LETED\x10\x06\"4\n\x10VpcPeeringConfig\x12\x10\n\x08vpc_name\x18\x01 \x01(\t\x12\x0e\n\x06subnet\x18\x02 \x01(\t\"\x99\x02\n\x19PrivateConnectionEventLog\x12U\n\x12private_connection\x18\x01 \x01(\x0b\x32\x39.google.cloud.clouddms.logging.v1.LoggedPrivateConnection\x12\x38\n\x14occurrence_timestamp\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x63ode\x18\x03 \x01(\x05\x12\x14\n\x0ctext_message\x18\x04 \x01(\t\x12\x18\n\roriginal_code\x18\xc8\x01 \x01(\x05H\x00\x12\x1b\n\x10original_message\x18\xc9\x01 \x01(\tH\x00\x42\x10\n\x0eoriginal_cause*t\n\x0e\x44\x61tabaseEngine\x12\x1f\n\x1b\x44\x41TABASE_ENGINE_UNSPECIFIED\x10\x00\x12\t\n\x05MYSQL\x10\x01\x12\x0e\n\nPOSTGRESQL\x10\x02\x12\r\n\tSQLSERVER\x10\x03\x12\n\n\x06ORACLE\x10\x04\x12\x0b\n\x07SPANNER\x10\x05*e\n\x10\x44\x61tabaseProvider\x12!\n\x1d\x44\x41TABASE_PROVIDER_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43LOUDSQL\x10\x01\x12\x07\n\x03RDS\x10\x02\x12\n\n\x06\x41URORA\x10\x03\x12\x0b\n\x07\x41LLOYDB\x10\x04\x42\xf9\x01\n$com.google.cloud.clouddms.logging.v1B\x19\x43louddmsPlatformLogsProtoP\x01ZGgoogle.golang.org/genproto/googleapis/cloud/clouddms/logging/v1;logging\xaa\x02 Google.Cloud.CloudDms.Logging.V1\xca\x02 Google\\Cloud\\CloudDms\\Logging\\V1\xea\x02$Google::Cloud::CloudDMS::Logging::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.clouddms.logging.v1.clouddms_platform_logs_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.clouddms.logging.v1B\031ClouddmsPlatformLogsProtoP\001ZGgoogle.golang.org/genproto/googleapis/cloud/clouddms/logging/v1;logging\252\002 Google.Cloud.CloudDms.Logging.V1\312\002 Google\\Cloud\\CloudDms\\Logging\\V1\352\002$Google::Cloud::CloudDMS::Logging::V1'
  _LOGGEDMIGRATIONJOB_LABELSENTRY._options = None
  _LOGGEDMIGRATIONJOB_LABELSENTRY._serialized_options = b'8\001'
  _LOGGEDMIGRATIONJOB.fields_by_name['name']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['name']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['labels']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['labels']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['display_name']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['state']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['state']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['phase']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['phase']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['type']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['type']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['dump_path']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['dump_path']._serialized_options = b'\340A\001'
  _LOGGEDMIGRATIONJOB.fields_by_name['source']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['source']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['destination']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['destination']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['duration']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['duration']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['connectivity_type']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['connectivity_type']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['error']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['error']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['end_time']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['end_time']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['source_database']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['source_database']._serialized_options = b'\340A\002'
  _LOGGEDMIGRATIONJOB.fields_by_name['destination_database']._options = None
  _LOGGEDMIGRATIONJOB.fields_by_name['destination_database']._serialized_options = b'\340A\002'
  _ORACLECONNECTIONPROFILE.fields_by_name['connectivity_type']._options = None
  _ORACLECONNECTIONPROFILE.fields_by_name['connectivity_type']._serialized_options = b'\340A\002'
  _LOGGEDCONNECTIONPROFILE_LABELSENTRY._options = None
  _LOGGEDCONNECTIONPROFILE_LABELSENTRY._serialized_options = b'8\001'
  _LOGGEDPRIVATECONNECTION_LABELSENTRY._options = None
  _LOGGEDPRIVATECONNECTION_LABELSENTRY._serialized_options = b'8\001'
  _DATABASEENGINE._serialized_start=4840
  _DATABASEENGINE._serialized_end=4956
  _DATABASEPROVIDER._serialized_start=4958
  _DATABASEPROVIDER._serialized_end=5059
  _DATABASETYPE._serialized_start=223
  _DATABASETYPE._serialized_end=373
  _LOGGEDMIGRATIONJOB._serialized_start=376
  _LOGGEDMIGRATIONJOB._serialized_end=1843
  _LOGGEDMIGRATIONJOB_LABELSENTRY._serialized_start=1245
  _LOGGEDMIGRATIONJOB_LABELSENTRY._serialized_end=1290
  _LOGGEDMIGRATIONJOB_STATE._serialized_start=1293
  _LOGGEDMIGRATIONJOB_STATE._serialized_end=1534
  _LOGGEDMIGRATIONJOB_PHASE._serialized_start=1537
  _LOGGEDMIGRATIONJOB_PHASE._serialized_end=1679
  _LOGGEDMIGRATIONJOB_TYPE._serialized_start=1681
  _LOGGEDMIGRATIONJOB_TYPE._serialized_end=1739
  _LOGGEDMIGRATIONJOB_CONNECTIVITYTYPE._serialized_start=1741
  _LOGGEDMIGRATIONJOB_CONNECTIVITYTYPE._serialized_end=1843
  _MYSQLCONNECTIONPROFILE._serialized_start=1846
  _MYSQLCONNECTIONPROFILE._serialized_end=2051
  _MYSQLCONNECTIONPROFILE_VERSION._serialized_start=1977
  _MYSQLCONNECTIONPROFILE_VERSION._serialized_end=2051
  _POSTGRESQLCONNECTIONPROFILE._serialized_start=2054
  _POSTGRESQLCONNECTIONPROFILE._serialized_end=2275
  _POSTGRESQLCONNECTIONPROFILE_VERSION._serialized_start=2195
  _POSTGRESQLCONNECTIONPROFILE_VERSION._serialized_end=2275
  _CLOUDSQLCONNECTIONPROFILE._serialized_start=2277
  _CLOUDSQLCONNECTIONPROFILE._serialized_end=2326
  _ORACLECONNECTIONPROFILE._serialized_start=2329
  _ORACLECONNECTIONPROFILE._serialized_end=2590
  _ORACLECONNECTIONPROFILE_CONNECTIVITYTYPE._serialized_start=2464
  _ORACLECONNECTIONPROFILE_CONNECTIVITYTYPE._serialized_end=2590
  _LOGGEDCONNECTIONPROFILE._serialized_start=2593
  _LOGGEDCONNECTIONPROFILE._serialized_end=3434
  _LOGGEDCONNECTIONPROFILE_LABELSENTRY._serialized_start=1245
  _LOGGEDCONNECTIONPROFILE_LABELSENTRY._serialized_end=1290
  _LOGGEDCONNECTIONPROFILE_STATE._serialized_start=3293
  _LOGGEDCONNECTIONPROFILE_STATE._serialized_end=3412
  _MIGRATIONJOBEVENTLOG._serialized_start=3437
  _MIGRATIONJOBEVENTLOG._serialized_end=3703
  _CONNECTIONPROFILEEVENTLOG._serialized_start=3706
  _CONNECTIONPROFILEEVENTLOG._serialized_end=3987
  _LOGGEDPRIVATECONNECTION._serialized_start=3990
  _LOGGEDPRIVATECONNECTION._serialized_end=4500
  _LOGGEDPRIVATECONNECTION_LABELSENTRY._serialized_start=1245
  _LOGGEDPRIVATECONNECTION_LABELSENTRY._serialized_end=1290
  _LOGGEDPRIVATECONNECTION_STATE._serialized_start=4382
  _LOGGEDPRIVATECONNECTION_STATE._serialized_end=4500
  _VPCPEERINGCONFIG._serialized_start=4502
  _VPCPEERINGCONFIG._serialized_end=4554
  _PRIVATECONNECTIONEVENTLOG._serialized_start=4557
  _PRIVATECONNECTIONEVENTLOG._serialized_end=4838
# @@protoc_insertion_point(module_scope)
