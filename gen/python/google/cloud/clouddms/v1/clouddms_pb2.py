# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/clouddms/v1/clouddms.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.clouddms.v1 import clouddms_resources_pb2 as google_dot_cloud_dot_clouddms_dot_v1_dot_clouddms__resources__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/clouddms/v1/clouddms.proto\x12\x18google.cloud.clouddms.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x31google/cloud/clouddms/v1/clouddms_resources.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa6\x01\n\x18ListMigrationJobsRequest\x12\x41\n\x06parent\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\x12)datamigration.googleapis.com/MigrationJob\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x89\x01\n\x19ListMigrationJobsResponse\x12>\n\x0emigration_jobs\x18\x01 \x03(\x0b\x32&.google.cloud.clouddms.v1.MigrationJob\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"Y\n\x16GetMigrationJobRequest\x12?\n\x04name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"\xd5\x01\n\x19\x43reateMigrationJobRequest\x12\x41\n\x06parent\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\x12)datamigration.googleapis.com/MigrationJob\x12\x1d\n\x10migration_job_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x42\n\rmigration_job\x18\x03 \x01(\x0b\x32&.google.cloud.clouddms.v1.MigrationJobB\x03\xe0\x41\x02\x12\x12\n\nrequest_id\x18\x04 \x01(\t\"\xa9\x01\n\x19UpdateMigrationJobRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x42\n\rmigration_job\x18\x02 \x01(\x0b\x32&.google.cloud.clouddms.v1.MigrationJobB\x03\xe0\x41\x02\x12\x12\n\nrequest_id\x18\x03 \x01(\t\"\x7f\n\x19\x44\x65leteMigrationJobRequest\x12?\n\x04name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\x12\x12\n\nrequest_id\x18\x02 \x01(\t\x12\r\n\x05\x66orce\x18\x03 \x01(\x08\"X\n\x18StartMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"W\n\x17StopMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"Y\n\x19ResumeMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"Z\n\x1aPromoteMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"Y\n\x19VerifyMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"Z\n\x1aRestartMigrationJobRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\"\xa6\x02\n\x18GenerateSshScriptRequest\x12\x45\n\rmigration_job\x18\x01 \x01(\tB.\xfa\x41+\n)datamigration.googleapis.com/MigrationJob\x12\x0f\n\x02vm\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12H\n\x12vm_creation_config\x18\x64 \x01(\x0b\x32*.google.cloud.clouddms.v1.VmCreationConfigH\x00\x12J\n\x13vm_selection_config\x18\x65 \x01(\x0b\x32+.google.cloud.clouddms.v1.VmSelectionConfigH\x00\x12\x0f\n\x07vm_port\x18\x03 \x01(\x05\x42\x0b\n\tvm_config\"Q\n\x10VmCreationConfig\x12\x1c\n\x0fvm_machine_type\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x07vm_zone\x18\x02 \x01(\t\x12\x0e\n\x06subnet\x18\x03 \x01(\t\")\n\x11VmSelectionConfig\x12\x14\n\x07vm_zone\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\x1b\n\tSshScript\x12\x0e\n\x06script\x18\x01 \x01(\t\"\xb0\x01\n\x1dListConnectionProfilesRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\x12.datamigration.googleapis.com/ConnectionProfile\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x98\x01\n\x1eListConnectionProfilesResponse\x12H\n\x13\x63onnection_profiles\x18\x01 \x03(\x0b\x32+.google.cloud.clouddms.v1.ConnectionProfile\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"c\n\x1bGetConnectionProfileRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.datamigration.googleapis.com/ConnectionProfile\"\xee\x01\n\x1e\x43reateConnectionProfileRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.datamigration.googleapis.com/ConnectionProfile\x12\"\n\x15\x63onnection_profile_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12L\n\x12\x63onnection_profile\x18\x03 \x01(\x0b\x32+.google.cloud.clouddms.v1.ConnectionProfileB\x03\xe0\x41\x02\x12\x12\n\nrequest_id\x18\x04 \x01(\t\"\xb8\x01\n\x1eUpdateConnectionProfileRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12L\n\x12\x63onnection_profile\x18\x02 \x01(\x0b\x32+.google.cloud.clouddms.v1.ConnectionProfileB\x03\xe0\x41\x02\x12\x12\n\nrequest_id\x18\x03 \x01(\t\"\x89\x01\n\x1e\x44\x65leteConnectionProfileRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.datamigration.googleapis.com/ConnectionProfile\x12\x12\n\nrequest_id\x18\x02 \x01(\t\x12\r\n\x05\x66orce\x18\x03 \x01(\x08\"\x80\x02\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\x32\xc8\x1e\n\x14\x44\x61taMigrationService\x12\xc0\x01\n\x11ListMigrationJobs\x12\x32.google.cloud.clouddms.v1.ListMigrationJobsRequest\x1a\x33.google.cloud.clouddms.v1.ListMigrationJobsResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{parent=projects/*/locations/*}/migrationJobs\xda\x41\x06parent\x12\xad\x01\n\x0fGetMigrationJob\x12\x30.google.cloud.clouddms.v1.GetMigrationJobRequest\x1a&.google.cloud.clouddms.v1.MigrationJob\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{name=projects/*/locations/*/migrationJobs/*}\xda\x41\x04name\x12\xff\x01\n\x12\x43reateMigrationJob\x12\x33.google.cloud.clouddms.v1.CreateMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"\x94\x01\x82\xd3\xe4\x93\x02\x42\"1/v1/{parent=projects/*/locations/*}/migrationJobs:\rmigration_job\xda\x41%parent,migration_job,migration_job_id\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\x81\x02\n\x12UpdateMigrationJob\x12\x33.google.cloud.clouddms.v1.UpdateMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"\x96\x01\x82\xd3\xe4\x93\x02P2?/v1/{migration_job.name=projects/*/locations/*/migrationJobs/*}:\rmigration_job\xda\x41\x19migration_job,update_mask\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xd7\x01\n\x12\x44\x65leteMigrationJob\x12\x33.google.cloud.clouddms.v1.DeleteMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"m\x82\xd3\xe4\x93\x02\x33*1/v1/{name=projects/*/locations/*/migrationJobs/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xce\x01\n\x11StartMigrationJob\x12\x32.google.cloud.clouddms.v1.StartMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"f\x82\xd3\xe4\x93\x02<\"7/v1/{name=projects/*/locations/*/migrationJobs/*}:start:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xcb\x01\n\x10StopMigrationJob\x12\x31.google.cloud.clouddms.v1.StopMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"e\x82\xd3\xe4\x93\x02;\"6/v1/{name=projects/*/locations/*/migrationJobs/*}:stop:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xd1\x01\n\x12ResumeMigrationJob\x12\x33.google.cloud.clouddms.v1.ResumeMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"g\x82\xd3\xe4\x93\x02=\"8/v1/{name=projects/*/locations/*/migrationJobs/*}:resume:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xd4\x01\n\x13PromoteMigrationJob\x12\x34.google.cloud.clouddms.v1.PromoteMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"h\x82\xd3\xe4\x93\x02>\"9/v1/{name=projects/*/locations/*/migrationJobs/*}:promote:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xd1\x01\n\x12VerifyMigrationJob\x12\x33.google.cloud.clouddms.v1.VerifyMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"g\x82\xd3\xe4\x93\x02=\"8/v1/{name=projects/*/locations/*/migrationJobs/*}:verify:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xd4\x01\n\x13RestartMigrationJob\x12\x34.google.cloud.clouddms.v1.RestartMigrationJobRequest\x1a\x1d.google.longrunning.Operation\"h\x82\xd3\xe4\x93\x02>\"9/v1/{name=projects/*/locations/*/migrationJobs/*}:restart:\x01*\xca\x41!\n\x0cMigrationJob\x12\x11OperationMetadata\x12\xc5\x01\n\x11GenerateSshScript\x12\x32.google.cloud.clouddms.v1.GenerateSshScriptRequest\x1a#.google.cloud.clouddms.v1.SshScript\"W\x82\xd3\xe4\x93\x02Q\"L/v1/{migration_job=projects/*/locations/*/migrationJobs/*}:generateSshScript:\x01*\x12\xd4\x01\n\x16ListConnectionProfiles\x12\x37.google.cloud.clouddms.v1.ListConnectionProfilesRequest\x1a\x38.google.cloud.clouddms.v1.ListConnectionProfilesResponse\"G\x82\xd3\xe4\x93\x02\x38\x12\x36/v1/{parent=projects/*/locations/*}/connectionProfiles\xda\x41\x06parent\x12\xc1\x01\n\x14GetConnectionProfile\x12\x35.google.cloud.clouddms.v1.GetConnectionProfileRequest\x1a+.google.cloud.clouddms.v1.ConnectionProfile\"E\x82\xd3\xe4\x93\x02\x38\x12\x36/v1/{name=projects/*/locations/*/connectionProfiles/*}\xda\x41\x04name\x12\xa2\x02\n\x17\x43reateConnectionProfile\x12\x38.google.cloud.clouddms.v1.CreateConnectionProfileRequest\x1a\x1d.google.longrunning.Operation\"\xad\x01\x82\xd3\xe4\x93\x02L\"6/v1/{parent=projects/*/locations/*}/connectionProfiles:\x12\x63onnection_profile\xda\x41/parent,connection_profile,connection_profile_id\xca\x41&\n\x11\x43onnectionProfile\x12\x11OperationMetadata\x12\xa4\x02\n\x17UpdateConnectionProfile\x12\x38.google.cloud.clouddms.v1.UpdateConnectionProfileRequest\x1a\x1d.google.longrunning.Operation\"\xaf\x01\x82\xd3\xe4\x93\x02_2I/v1/{connection_profile.name=projects/*/locations/*/connectionProfiles/*}:\x12\x63onnection_profile\xda\x41\x1e\x63onnection_profile,update_mask\xca\x41&\n\x11\x43onnectionProfile\x12\x11OperationMetadata\x12\xe6\x01\n\x17\x44\x65leteConnectionProfile\x12\x38.google.cloud.clouddms.v1.DeleteConnectionProfileRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02\x38*6/v1/{name=projects/*/locations/*/connectionProfiles/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x1aP\xca\x41\x1c\x64\x61tamigration.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xc5\x01\n\x1c\x63om.google.cloud.clouddms.v1B\rClouddmsProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/clouddms/v1;clouddms\xaa\x02\x18Google.Cloud.CloudDms.V1\xca\x02\x18Google\\Cloud\\CloudDms\\V1\xea\x02\x1bGoogle::Cloud::CloudDMS::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.clouddms.v1.clouddms_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.clouddms.v1B\rClouddmsProtoP\001Z@google.golang.org/genproto/googleapis/cloud/clouddms/v1;clouddms\252\002\030Google.Cloud.CloudDms.V1\312\002\030Google\\Cloud\\CloudDms\\V1\352\002\033Google::Cloud::CloudDMS::V1'
  _LISTMIGRATIONJOBSREQUEST.fields_by_name['parent']._options = None
  _LISTMIGRATIONJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A+\022)datamigration.googleapis.com/MigrationJob'
  _GETMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _GETMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A+\n)datamigration.googleapis.com/MigrationJob'
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['parent']._options = None
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A+\022)datamigration.googleapis.com/MigrationJob'
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['migration_job_id']._options = None
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['migration_job_id']._serialized_options = b'\340A\002'
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['migration_job']._options = None
  _CREATEMIGRATIONJOBREQUEST.fields_by_name['migration_job']._serialized_options = b'\340A\002'
  _UPDATEMIGRATIONJOBREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEMIGRATIONJOBREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATEMIGRATIONJOBREQUEST.fields_by_name['migration_job']._options = None
  _UPDATEMIGRATIONJOBREQUEST.fields_by_name['migration_job']._serialized_options = b'\340A\002'
  _DELETEMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _DELETEMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A+\n)datamigration.googleapis.com/MigrationJob'
  _STARTMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _STARTMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _STOPMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _STOPMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _RESUMEMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _RESUMEMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _PROMOTEMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _PROMOTEMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _VERIFYMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _VERIFYMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _RESTARTMIGRATIONJOBREQUEST.fields_by_name['name']._options = None
  _RESTARTMIGRATIONJOBREQUEST.fields_by_name['name']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _GENERATESSHSCRIPTREQUEST.fields_by_name['migration_job']._options = None
  _GENERATESSHSCRIPTREQUEST.fields_by_name['migration_job']._serialized_options = b'\372A+\n)datamigration.googleapis.com/MigrationJob'
  _GENERATESSHSCRIPTREQUEST.fields_by_name['vm']._options = None
  _GENERATESSHSCRIPTREQUEST.fields_by_name['vm']._serialized_options = b'\340A\002'
  _VMCREATIONCONFIG.fields_by_name['vm_machine_type']._options = None
  _VMCREATIONCONFIG.fields_by_name['vm_machine_type']._serialized_options = b'\340A\002'
  _VMSELECTIONCONFIG.fields_by_name['vm_zone']._options = None
  _VMSELECTIONCONFIG.fields_by_name['vm_zone']._serialized_options = b'\340A\002'
  _LISTCONNECTIONPROFILESREQUEST.fields_by_name['parent']._options = None
  _LISTCONNECTIONPROFILESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\022.datamigration.googleapis.com/ConnectionProfile'
  _GETCONNECTIONPROFILEREQUEST.fields_by_name['name']._options = None
  _GETCONNECTIONPROFILEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.datamigration.googleapis.com/ConnectionProfile'
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['parent']._options = None
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\n.datamigration.googleapis.com/ConnectionProfile'
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile_id']._options = None
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile_id']._serialized_options = b'\340A\002'
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile']._options = None
  _CREATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile']._serialized_options = b'\340A\002'
  _UPDATECONNECTIONPROFILEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATECONNECTIONPROFILEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile']._options = None
  _UPDATECONNECTIONPROFILEREQUEST.fields_by_name['connection_profile']._serialized_options = b'\340A\002'
  _DELETECONNECTIONPROFILEREQUEST.fields_by_name['name']._options = None
  _DELETECONNECTIONPROFILEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.datamigration.googleapis.com/ConnectionProfile'
  _OPERATIONMETADATA.fields_by_name['create_time']._options = None
  _OPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['end_time']._options = None
  _OPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['target']._options = None
  _OPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['verb']._options = None
  _OPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['status_message']._options = None
  _OPERATIONMETADATA.fields_by_name['status_message']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._options = None
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['api_version']._options = None
  _OPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _DATAMIGRATIONSERVICE._options = None
  _DATAMIGRATIONSERVICE._serialized_options = b'\312A\034datamigration.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _DATAMIGRATIONSERVICE.methods_by_name['ListMigrationJobs']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['ListMigrationJobs']._serialized_options = b'\202\323\344\223\0023\0221/v1/{parent=projects/*/locations/*}/migrationJobs\332A\006parent'
  _DATAMIGRATIONSERVICE.methods_by_name['GetMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['GetMigrationJob']._serialized_options = b'\202\323\344\223\0023\0221/v1/{name=projects/*/locations/*/migrationJobs/*}\332A\004name'
  _DATAMIGRATIONSERVICE.methods_by_name['CreateMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['CreateMigrationJob']._serialized_options = b'\202\323\344\223\002B\"1/v1/{parent=projects/*/locations/*}/migrationJobs:\rmigration_job\332A%parent,migration_job,migration_job_id\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['UpdateMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['UpdateMigrationJob']._serialized_options = b'\202\323\344\223\002P2?/v1/{migration_job.name=projects/*/locations/*/migrationJobs/*}:\rmigration_job\332A\031migration_job,update_mask\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['DeleteMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['DeleteMigrationJob']._serialized_options = b'\202\323\344\223\0023*1/v1/{name=projects/*/locations/*/migrationJobs/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['StartMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['StartMigrationJob']._serialized_options = b'\202\323\344\223\002<\"7/v1/{name=projects/*/locations/*/migrationJobs/*}:start:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['StopMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['StopMigrationJob']._serialized_options = b'\202\323\344\223\002;\"6/v1/{name=projects/*/locations/*/migrationJobs/*}:stop:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['ResumeMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['ResumeMigrationJob']._serialized_options = b'\202\323\344\223\002=\"8/v1/{name=projects/*/locations/*/migrationJobs/*}:resume:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['PromoteMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['PromoteMigrationJob']._serialized_options = b'\202\323\344\223\002>\"9/v1/{name=projects/*/locations/*/migrationJobs/*}:promote:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['VerifyMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['VerifyMigrationJob']._serialized_options = b'\202\323\344\223\002=\"8/v1/{name=projects/*/locations/*/migrationJobs/*}:verify:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['RestartMigrationJob']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['RestartMigrationJob']._serialized_options = b'\202\323\344\223\002>\"9/v1/{name=projects/*/locations/*/migrationJobs/*}:restart:\001*\312A!\n\014MigrationJob\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['GenerateSshScript']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['GenerateSshScript']._serialized_options = b'\202\323\344\223\002Q\"L/v1/{migration_job=projects/*/locations/*/migrationJobs/*}:generateSshScript:\001*'
  _DATAMIGRATIONSERVICE.methods_by_name['ListConnectionProfiles']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['ListConnectionProfiles']._serialized_options = b'\202\323\344\223\0028\0226/v1/{parent=projects/*/locations/*}/connectionProfiles\332A\006parent'
  _DATAMIGRATIONSERVICE.methods_by_name['GetConnectionProfile']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['GetConnectionProfile']._serialized_options = b'\202\323\344\223\0028\0226/v1/{name=projects/*/locations/*/connectionProfiles/*}\332A\004name'
  _DATAMIGRATIONSERVICE.methods_by_name['CreateConnectionProfile']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['CreateConnectionProfile']._serialized_options = b'\202\323\344\223\002L\"6/v1/{parent=projects/*/locations/*}/connectionProfiles:\022connection_profile\332A/parent,connection_profile,connection_profile_id\312A&\n\021ConnectionProfile\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['UpdateConnectionProfile']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['UpdateConnectionProfile']._serialized_options = b'\202\323\344\223\002_2I/v1/{connection_profile.name=projects/*/locations/*/connectionProfiles/*}:\022connection_profile\332A\036connection_profile,update_mask\312A&\n\021ConnectionProfile\022\021OperationMetadata'
  _DATAMIGRATIONSERVICE.methods_by_name['DeleteConnectionProfile']._options = None
  _DATAMIGRATIONSERVICE.methods_by_name['DeleteConnectionProfile']._serialized_options = b'\202\323\344\223\0028*6/v1/{name=projects/*/locations/*/connectionProfiles/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _LISTMIGRATIONJOBSREQUEST._serialized_start=340
  _LISTMIGRATIONJOBSREQUEST._serialized_end=506
  _LISTMIGRATIONJOBSRESPONSE._serialized_start=509
  _LISTMIGRATIONJOBSRESPONSE._serialized_end=646
  _GETMIGRATIONJOBREQUEST._serialized_start=648
  _GETMIGRATIONJOBREQUEST._serialized_end=737
  _CREATEMIGRATIONJOBREQUEST._serialized_start=740
  _CREATEMIGRATIONJOBREQUEST._serialized_end=953
  _UPDATEMIGRATIONJOBREQUEST._serialized_start=956
  _UPDATEMIGRATIONJOBREQUEST._serialized_end=1125
  _DELETEMIGRATIONJOBREQUEST._serialized_start=1127
  _DELETEMIGRATIONJOBREQUEST._serialized_end=1254
  _STARTMIGRATIONJOBREQUEST._serialized_start=1256
  _STARTMIGRATIONJOBREQUEST._serialized_end=1344
  _STOPMIGRATIONJOBREQUEST._serialized_start=1346
  _STOPMIGRATIONJOBREQUEST._serialized_end=1433
  _RESUMEMIGRATIONJOBREQUEST._serialized_start=1435
  _RESUMEMIGRATIONJOBREQUEST._serialized_end=1524
  _PROMOTEMIGRATIONJOBREQUEST._serialized_start=1526
  _PROMOTEMIGRATIONJOBREQUEST._serialized_end=1616
  _VERIFYMIGRATIONJOBREQUEST._serialized_start=1618
  _VERIFYMIGRATIONJOBREQUEST._serialized_end=1707
  _RESTARTMIGRATIONJOBREQUEST._serialized_start=1709
  _RESTARTMIGRATIONJOBREQUEST._serialized_end=1799
  _GENERATESSHSCRIPTREQUEST._serialized_start=1802
  _GENERATESSHSCRIPTREQUEST._serialized_end=2096
  _VMCREATIONCONFIG._serialized_start=2098
  _VMCREATIONCONFIG._serialized_end=2179
  _VMSELECTIONCONFIG._serialized_start=2181
  _VMSELECTIONCONFIG._serialized_end=2222
  _SSHSCRIPT._serialized_start=2224
  _SSHSCRIPT._serialized_end=2251
  _LISTCONNECTIONPROFILESREQUEST._serialized_start=2254
  _LISTCONNECTIONPROFILESREQUEST._serialized_end=2430
  _LISTCONNECTIONPROFILESRESPONSE._serialized_start=2433
  _LISTCONNECTIONPROFILESRESPONSE._serialized_end=2585
  _GETCONNECTIONPROFILEREQUEST._serialized_start=2587
  _GETCONNECTIONPROFILEREQUEST._serialized_end=2686
  _CREATECONNECTIONPROFILEREQUEST._serialized_start=2689
  _CREATECONNECTIONPROFILEREQUEST._serialized_end=2927
  _UPDATECONNECTIONPROFILEREQUEST._serialized_start=2930
  _UPDATECONNECTIONPROFILEREQUEST._serialized_end=3114
  _DELETECONNECTIONPROFILEREQUEST._serialized_start=3117
  _DELETECONNECTIONPROFILEREQUEST._serialized_end=3254
  _OPERATIONMETADATA._serialized_start=3257
  _OPERATIONMETADATA._serialized_end=3513
  _DATAMIGRATIONSERVICE._serialized_start=3516
  _DATAMIGRATIONSERVICE._serialized_end=7428
# @@protoc_insertion_point(module_scope)
