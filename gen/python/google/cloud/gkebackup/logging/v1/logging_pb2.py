# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkebackup/logging/v1/logging.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.gkebackup.logging.v1 import logged_backup_pb2 as google_dot_cloud_dot_gkebackup_dot_logging_dot_v1_dot_logged__backup__pb2
from google.cloud.gkebackup.logging.v1 import logged_backup_plan_pb2 as google_dot_cloud_dot_gkebackup_dot_logging_dot_v1_dot_logged__backup__plan__pb2
from google.cloud.gkebackup.logging.v1 import logged_restore_pb2 as google_dot_cloud_dot_gkebackup_dot_logging_dot_v1_dot_logged__restore__pb2
from google.cloud.gkebackup.logging.v1 import logged_restore_plan_pb2 as google_dot_cloud_dot_gkebackup_dot_logging_dot_v1_dot_logged__restore__plan__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/gkebackup/logging/v1/logging.proto\x12!google.cloud.gkebackup.logging.v1\x1a\x35google/cloud/gkebackup/logging/v1/logged_backup.proto\x1a:google/cloud/gkebackup/logging/v1/logged_backup_plan.proto\x1a\x36google/cloud/gkebackup/logging/v1/logged_restore.proto\x1a;google/cloud/gkebackup/logging/v1/logged_restore_plan.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\x8f\x02\n\x10\x42\x61\x63kupPlanChange\x12\x13\n\x0b\x62\x61\x63kup_plan\x18\x01 \x01(\t\x12\x42\n\x0b\x63hange_type\x18\x02 \x01(\x0e\x32-.google.cloud.gkebackup.logging.v1.ChangeType\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12N\n\x11input_backup_plan\x18\x04 \x01(\x0b\x32\x33.google.cloud.gkebackup.logging.v1.LoggedBackupPlan\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status\"\x90\x02\n\x0c\x42\x61\x63kupChange\x12\x0e\n\x06\x62\x61\x63kup\x18\x01 \x01(\t\x12\x42\n\x0b\x63hange_type\x18\x02 \x01(\x0e\x32-.google.cloud.gkebackup.logging.v1.ChangeType\x12\x11\n\tscheduled\x18\x03 \x01(\x08\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x45\n\x0cinput_backup\x18\x05 \x01(\x0b\x32/.google.cloud.gkebackup.logging.v1.LoggedBackup\x12!\n\x05\x65rror\x18\x06 \x01(\x0b\x32\x12.google.rpc.Status\"\x93\x02\n\x11RestorePlanChange\x12\x14\n\x0crestore_plan\x18\x01 \x01(\t\x12\x42\n\x0b\x63hange_type\x18\x02 \x01(\x0e\x32-.google.cloud.gkebackup.logging.v1.ChangeType\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12P\n\x12input_restore_plan\x18\x04 \x01(\x0b\x32\x34.google.cloud.gkebackup.logging.v1.LoggedRestorePlan\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status\"\x81\x02\n\rRestoreChange\x12\x0f\n\x07restore\x18\x01 \x01(\t\x12\x42\n\x0b\x63hange_type\x18\x02 \x01(\x0e\x32-.google.cloud.gkebackup.logging.v1.ChangeType\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12G\n\rinput_restore\x18\x04 \x01(\x0b\x32\x30.google.cloud.gkebackup.logging.v1.LoggedRestore\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status*Q\n\nChangeType\x12\x1b\n\x17\x43HANGE_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATION\x10\x01\x12\n\n\x06UPDATE\x10\x02\x12\x0c\n\x08\x44\x45LETION\x10\x03\x42\xed\x01\n!google.cloud.gkebackup.logging.v1B\x0cLoggingProtoP\x01ZHgoogle.golang.org/genproto/googleapis/cloud/gkebackup/logging/v1;logging\xaa\x02!Google.Cloud.GkeBackup.Logging.V1\xca\x02!Google\\Cloud\\GkeBackup\\Logging\\V1\xea\x02%Google::Cloud::GkeBackup::Logging::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gkebackup.logging.v1.logging_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!google.cloud.gkebackup.logging.v1B\014LoggingProtoP\001ZHgoogle.golang.org/genproto/googleapis/cloud/gkebackup/logging/v1;logging\252\002!Google.Cloud.GkeBackup.Logging.V1\312\002!Google\\Cloud\\GkeBackup\\Logging\\V1\352\002%Google::Cloud::GkeBackup::Logging::V1'
  _CHANGETYPE._serialized_start=1464
  _CHANGETYPE._serialized_end=1545
  _BACKUPPLANCHANGE._serialized_start=378
  _BACKUPPLANCHANGE._serialized_end=649
  _BACKUPCHANGE._serialized_start=652
  _BACKUPCHANGE._serialized_end=924
  _RESTOREPLANCHANGE._serialized_start=927
  _RESTOREPLANCHANGE._serialized_end=1202
  _RESTORECHANGE._serialized_start=1205
  _RESTORECHANGE._serialized_end=1462
# @@protoc_insertion_point(module_scope)
