# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/admin/v1/migration.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/datastore/admin/v1/migration.proto\x12\x19google.datastore.admin.v1\"O\n\x13MigrationStateEvent\x12\x38\n\x05state\x18\x01 \x01(\x0e\x32).google.datastore.admin.v1.MigrationState\"\xa1\x05\n\x16MigrationProgressEvent\x12\x36\n\x04step\x18\x01 \x01(\x0e\x32(.google.datastore.admin.v1.MigrationStep\x12\x64\n\x14prepare_step_details\x18\x02 \x01(\x0b\x32\x44.google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetailsH\x00\x12s\n\x1credirect_writes_step_details\x18\x03 \x01(\x0b\x32K.google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetailsH\x00\x1aq\n\x12PrepareStepDetails\x12[\n\x10\x63oncurrency_mode\x18\x01 \x01(\x0e\x32\x41.google.datastore.admin.v1.MigrationProgressEvent.ConcurrencyMode\x1ax\n\x19RedirectWritesStepDetails\x12[\n\x10\x63oncurrency_mode\x18\x01 \x01(\x0e\x32\x41.google.datastore.admin.v1.MigrationProgressEvent.ConcurrencyMode\"w\n\x0f\x43oncurrencyMode\x12 \n\x1c\x43ONCURRENCY_MODE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bPESSIMISTIC\x10\x01\x12\x0e\n\nOPTIMISTIC\x10\x02\x12!\n\x1dOPTIMISTIC_WITH_ENTITY_GROUPS\x10\x03\x42\x0e\n\x0cstep_details*X\n\x0eMigrationState\x12\x1f\n\x1bMIGRATION_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07RUNNING\x10\x01\x12\n\n\x06PAUSED\x10\x02\x12\x0c\n\x08\x43OMPLETE\x10\x03*\xe3\x01\n\rMigrationStep\x12\x1e\n\x1aMIGRATION_STEP_UNSPECIFIED\x10\x00\x12\x0b\n\x07PREPARE\x10\x06\x12\t\n\x05START\x10\x01\x12\x1e\n\x1a\x41PPLY_WRITES_SYNCHRONOUSLY\x10\x07\x12\x13\n\x0f\x43OPY_AND_VERIFY\x10\x02\x12(\n$REDIRECT_EVENTUALLY_CONSISTENT_READS\x10\x03\x12&\n\"REDIRECT_STRONGLY_CONSISTENT_READS\x10\x04\x12\x13\n\x0fREDIRECT_WRITES\x10\x05\x42\xdb\x01\n\x1d\x63om.google.datastore.admin.v1B\x0eMigrationProtoP\x01Z>google.golang.org/genproto/googleapis/datastore/admin/v1;admin\xaa\x02\x1fGoogle.Cloud.Datastore.Admin.V1\xca\x02\x1fGoogle\\Cloud\\Datastore\\Admin\\V1\xea\x02#Google::Cloud::Datastore::Admin::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.admin.v1.migration_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.datastore.admin.v1B\016MigrationProtoP\001Z>google.golang.org/genproto/googleapis/datastore/admin/v1;admin\252\002\037Google.Cloud.Datastore.Admin.V1\312\002\037Google\\Cloud\\Datastore\\Admin\\V1\352\002#Google::Cloud::Datastore::Admin::V1'
  _MIGRATIONSTATE._serialized_start=829
  _MIGRATIONSTATE._serialized_end=917
  _MIGRATIONSTEP._serialized_start=920
  _MIGRATIONSTEP._serialized_end=1147
  _MIGRATIONSTATEEVENT._serialized_start=72
  _MIGRATIONSTATEEVENT._serialized_end=151
  _MIGRATIONPROGRESSEVENT._serialized_start=154
  _MIGRATIONPROGRESSEVENT._serialized_end=827
  _MIGRATIONPROGRESSEVENT_PREPARESTEPDETAILS._serialized_start=455
  _MIGRATIONPROGRESSEVENT_PREPARESTEPDETAILS._serialized_end=568
  _MIGRATIONPROGRESSEVENT_REDIRECTWRITESSTEPDETAILS._serialized_start=570
  _MIGRATIONPROGRESSEVENT_REDIRECTWRITESSTEPDETAILS._serialized_end=690
  _MIGRATIONPROGRESSEVENT_CONCURRENCYMODE._serialized_start=692
  _MIGRATIONPROGRESSEVENT_CONCURRENCYMODE._serialized_end=811
# @@protoc_insertion_point(module_scope)