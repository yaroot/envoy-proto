# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkebackup/v1/volume.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.gkebackup.v1 import common_pb2 as google_dot_cloud_dot_gkebackup_dot_v1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/cloud/gkebackup/v1/volume.proto\x12\x19google.cloud.gkebackup.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a&google/cloud/gkebackup/v1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa8\x07\n\x0cVolumeBackup\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x42\n\nsource_pvc\x18\x05 \x01(\x0b\x32).google.cloud.gkebackup.v1.NamespacedNameB\x03\xe0\x41\x03\x12!\n\x14volume_backup_handle\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12O\n\x06\x66ormat\x18\x07 \x01(\x0e\x32:.google.cloud.gkebackup.v1.VolumeBackup.VolumeBackupFormatB\x03\xe0\x41\x03\x12\x1a\n\rstorage_bytes\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03\x12\x1c\n\x0f\x64isk_size_bytes\x18\t \x01(\x03\x42\x03\xe0\x41\x03\x12\x36\n\rcomplete_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x41\n\x05state\x18\x0b \x01(\x0e\x32-.google.cloud.gkebackup.v1.VolumeBackup.StateB\x03\xe0\x41\x03\x12\x1a\n\rstate_message\x18\x0c \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04\x65tag\x18\r \x01(\tB\x03\xe0\x41\x03\"S\n\x12VolumeBackupFormat\x12$\n VOLUME_BACKUP_FORMAT_UNSPECIFIED\x10\x00\x12\x17\n\x13GCE_PERSISTENT_DISK\x10\x01\"v\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x10\n\x0cSNAPSHOTTING\x10\x02\x12\r\n\tUPLOADING\x10\x03\x12\r\n\tSUCCEEDED\x10\x04\x12\n\n\x06\x46\x41ILED\x10\x05\x12\x0c\n\x08\x44\x45LETING\x10\x06:\x9d\x01\xea\x41\x99\x01\n%gkebackup.googleapis.com/VolumeBackup\x12pprojects/{project}/locations/{location}/backupPlans/{backup_plan}/backups/{backup}/volumeBackups/{volume_backup}\"\xe7\x06\n\rVolumeRestore\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x1a\n\rvolume_backup\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x42\n\ntarget_pvc\x18\x06 \x01(\x0b\x32).google.cloud.gkebackup.v1.NamespacedNameB\x03\xe0\x41\x03\x12\x1a\n\rvolume_handle\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12M\n\x0bvolume_type\x18\x08 \x01(\x0e\x32\x33.google.cloud.gkebackup.v1.VolumeRestore.VolumeTypeB\x03\xe0\x41\x03\x12\x36\n\rcomplete_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x42\n\x05state\x18\n \x01(\x0e\x32..google.cloud.gkebackup.v1.VolumeRestore.StateB\x03\xe0\x41\x03\x12\x1a\n\rstate_message\x18\x0b \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04\x65tag\x18\x0c \x01(\tB\x03\xe0\x41\x03\"B\n\nVolumeType\x12\x1b\n\x17VOLUME_TYPE_UNSPECIFIED\x10\x00\x12\x17\n\x13GCE_PERSISTENT_DISK\x10\x01\"d\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\r\n\tRESTORING\x10\x02\x12\r\n\tSUCCEEDED\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\x12\x0c\n\x08\x44\x45LETING\x10\x05:\xa4\x01\xea\x41\xa0\x01\n&gkebackup.googleapis.com/VolumeRestore\x12vprojects/{project}/locations/{location}/restorePlans/{restore_plan}/restores/{restore}/volumeRestores/{volume_restore}B\xc9\x01\n\x1d\x63om.google.cloud.gkebackup.v1B\x0bVolumeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/cloud/gkebackup/v1;gkebackup\xaa\x02\x19Google.Cloud.GkeBackup.V1\xca\x02\x19Google\\Cloud\\GkeBackup\\V1\xea\x02\x1cGoogle::Cloud::GkeBackup::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gkebackup.v1.volume_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.cloud.gkebackup.v1B\013VolumeProtoP\001ZBgoogle.golang.org/genproto/googleapis/cloud/gkebackup/v1;gkebackup\252\002\031Google.Cloud.GkeBackup.V1\312\002\031Google\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud::GkeBackup::V1'
  _VOLUMEBACKUP.fields_by_name['name']._options = None
  _VOLUMEBACKUP.fields_by_name['name']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['uid']._options = None
  _VOLUMEBACKUP.fields_by_name['uid']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['create_time']._options = None
  _VOLUMEBACKUP.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['update_time']._options = None
  _VOLUMEBACKUP.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['source_pvc']._options = None
  _VOLUMEBACKUP.fields_by_name['source_pvc']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['volume_backup_handle']._options = None
  _VOLUMEBACKUP.fields_by_name['volume_backup_handle']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['format']._options = None
  _VOLUMEBACKUP.fields_by_name['format']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['storage_bytes']._options = None
  _VOLUMEBACKUP.fields_by_name['storage_bytes']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['disk_size_bytes']._options = None
  _VOLUMEBACKUP.fields_by_name['disk_size_bytes']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['complete_time']._options = None
  _VOLUMEBACKUP.fields_by_name['complete_time']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['state']._options = None
  _VOLUMEBACKUP.fields_by_name['state']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['state_message']._options = None
  _VOLUMEBACKUP.fields_by_name['state_message']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP.fields_by_name['etag']._options = None
  _VOLUMEBACKUP.fields_by_name['etag']._serialized_options = b'\340A\003'
  _VOLUMEBACKUP._options = None
  _VOLUMEBACKUP._serialized_options = b'\352A\231\001\n%gkebackup.googleapis.com/VolumeBackup\022pprojects/{project}/locations/{location}/backupPlans/{backup_plan}/backups/{backup}/volumeBackups/{volume_backup}'
  _VOLUMERESTORE.fields_by_name['name']._options = None
  _VOLUMERESTORE.fields_by_name['name']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['uid']._options = None
  _VOLUMERESTORE.fields_by_name['uid']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['create_time']._options = None
  _VOLUMERESTORE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['update_time']._options = None
  _VOLUMERESTORE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['volume_backup']._options = None
  _VOLUMERESTORE.fields_by_name['volume_backup']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['target_pvc']._options = None
  _VOLUMERESTORE.fields_by_name['target_pvc']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['volume_handle']._options = None
  _VOLUMERESTORE.fields_by_name['volume_handle']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['volume_type']._options = None
  _VOLUMERESTORE.fields_by_name['volume_type']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['complete_time']._options = None
  _VOLUMERESTORE.fields_by_name['complete_time']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['state']._options = None
  _VOLUMERESTORE.fields_by_name['state']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['state_message']._options = None
  _VOLUMERESTORE.fields_by_name['state_message']._serialized_options = b'\340A\003'
  _VOLUMERESTORE.fields_by_name['etag']._options = None
  _VOLUMERESTORE.fields_by_name['etag']._serialized_options = b'\340A\003'
  _VOLUMERESTORE._options = None
  _VOLUMERESTORE._serialized_options = b'\352A\240\001\n&gkebackup.googleapis.com/VolumeRestore\022vprojects/{project}/locations/{location}/restorePlans/{restore_plan}/restores/{restore}/volumeRestores/{volume_restore}'
  _VOLUMEBACKUP._serialized_start=203
  _VOLUMEBACKUP._serialized_end=1139
  _VOLUMEBACKUP_VOLUMEBACKUPFORMAT._serialized_start=776
  _VOLUMEBACKUP_VOLUMEBACKUPFORMAT._serialized_end=859
  _VOLUMEBACKUP_STATE._serialized_start=861
  _VOLUMEBACKUP_STATE._serialized_end=979
  _VOLUMERESTORE._serialized_start=1142
  _VOLUMERESTORE._serialized_end=2013
  _VOLUMERESTORE_VOLUMETYPE._serialized_start=1678
  _VOLUMERESTORE_VOLUMETYPE._serialized_end=1744
  _VOLUMERESTORE_STATE._serialized_start=1746
  _VOLUMERESTORE_STATE._serialized_end=1846
# @@protoc_insertion_point(module_scope)
