# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkebackup/v1/backup.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/cloud/gkebackup/v1/backup.proto\x12\x19google.cloud.gkebackup.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a&google/cloud/gkebackup/v1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xbb\r\n\x06\x42\x61\x63kup\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06manual\x18\x05 \x01(\x08\x42\x03\xe0\x41\x03\x12=\n\x06labels\x18\x06 \x03(\x0b\x32-.google.cloud.gkebackup.v1.Backup.LabelsEntry\x12\x18\n\x10\x64\x65lete_lock_days\x18\x07 \x01(\x05\x12@\n\x17\x64\x65lete_lock_expire_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x0bretain_days\x18\t \x01(\x05\x12;\n\x12retain_expire_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x45\n\x0e\x65ncryption_key\x18\x0b \x01(\x0b\x32(.google.cloud.gkebackup.v1.EncryptionKeyB\x03\xe0\x41\x03\x12\x1d\n\x0e\x61ll_namespaces\x18\x0c \x01(\x08\x42\x03\xe0\x41\x03H\x00\x12I\n\x13selected_namespaces\x18\r \x01(\x0b\x32%.google.cloud.gkebackup.v1.NamespacesB\x03\xe0\x41\x03H\x00\x12P\n\x15selected_applications\x18\x0e \x01(\x0b\x32*.google.cloud.gkebackup.v1.NamespacedNamesB\x03\xe0\x41\x03H\x00\x12!\n\x14\x63ontains_volume_data\x18\x0f \x01(\x08\x42\x03\xe0\x41\x03\x12\x1d\n\x10\x63ontains_secrets\x18\x10 \x01(\x08\x42\x03\xe0\x41\x03\x12P\n\x10\x63luster_metadata\x18\x11 \x01(\x0b\x32\x31.google.cloud.gkebackup.v1.Backup.ClusterMetadataB\x03\xe0\x41\x03\x12;\n\x05state\x18\x12 \x01(\x0e\x32\'.google.cloud.gkebackup.v1.Backup.StateB\x03\xe0\x41\x03\x12\x19\n\x0cstate_reason\x18\x13 \x01(\tB\x03\xe0\x41\x03\x12\x36\n\rcomplete_time\x18\x14 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x1b\n\x0eresource_count\x18\x15 \x01(\x05\x42\x03\xe0\x41\x03\x12\x19\n\x0cvolume_count\x18\x16 \x01(\x05\x42\x03\xe0\x41\x03\x12\x17\n\nsize_bytes\x18\x17 \x01(\x03\x42\x03\xe0\x41\x03\x12\x11\n\x04\x65tag\x18\x18 \x01(\tB\x03\xe0\x41\x03\x12\x13\n\x0b\x64\x65scription\x18\x19 \x01(\t\x12\x16\n\tpod_count\x18\x1a \x01(\x05\x42\x03\xe0\x41\x03\x12%\n\x18\x63onfig_backup_size_bytes\x18\x1b \x01(\x03\x42\x03\xe0\x41\x03\x1a\x9d\x02\n\x0f\x43lusterMetadata\x12\x0f\n\x07\x63luster\x18\x01 \x01(\t\x12\x13\n\x0bk8s_version\x18\x02 \x01(\t\x12\x65\n\x13\x62\x61\x63kup_crd_versions\x18\x03 \x03(\x0b\x32H.google.cloud.gkebackup.v1.Backup.ClusterMetadata.BackupCrdVersionsEntry\x12\x15\n\x0bgke_version\x18\x04 \x01(\tH\x00\x12\x18\n\x0e\x61nthos_version\x18\x05 \x01(\tH\x00\x1a\x38\n\x16\x42\x61\x63kupCrdVersionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x12\n\x10platform_version\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"f\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0f\n\x0bIN_PROGRESS\x10\x02\x12\r\n\tSUCCEEDED\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\x12\x0c\n\x08\x44\x45LETING\x10\x05:x\xea\x41u\n\x1fgkebackup.googleapis.com/Backup\x12Rprojects/{project}/locations/{location}/backupPlans/{backup_plan}/backups/{backup}B\x0e\n\x0c\x62\x61\x63kup_scopeB\xc9\x01\n\x1d\x63om.google.cloud.gkebackup.v1B\x0b\x42\x61\x63kupProtoP\x01ZBgoogle.golang.org/genproto/googleapis/cloud/gkebackup/v1;gkebackup\xaa\x02\x19Google.Cloud.GkeBackup.V1\xca\x02\x19Google\\Cloud\\GkeBackup\\V1\xea\x02\x1cGoogle::Cloud::GkeBackup::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gkebackup.v1.backup_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.cloud.gkebackup.v1B\013BackupProtoP\001ZBgoogle.golang.org/genproto/googleapis/cloud/gkebackup/v1;gkebackup\252\002\031Google.Cloud.GkeBackup.V1\312\002\031Google\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud::GkeBackup::V1'
  _BACKUP_CLUSTERMETADATA_BACKUPCRDVERSIONSENTRY._options = None
  _BACKUP_CLUSTERMETADATA_BACKUPCRDVERSIONSENTRY._serialized_options = b'8\001'
  _BACKUP_LABELSENTRY._options = None
  _BACKUP_LABELSENTRY._serialized_options = b'8\001'
  _BACKUP.fields_by_name['name']._options = None
  _BACKUP.fields_by_name['name']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['uid']._options = None
  _BACKUP.fields_by_name['uid']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['create_time']._options = None
  _BACKUP.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['update_time']._options = None
  _BACKUP.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['manual']._options = None
  _BACKUP.fields_by_name['manual']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['delete_lock_expire_time']._options = None
  _BACKUP.fields_by_name['delete_lock_expire_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['retain_expire_time']._options = None
  _BACKUP.fields_by_name['retain_expire_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['encryption_key']._options = None
  _BACKUP.fields_by_name['encryption_key']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['all_namespaces']._options = None
  _BACKUP.fields_by_name['all_namespaces']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['selected_namespaces']._options = None
  _BACKUP.fields_by_name['selected_namespaces']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['selected_applications']._options = None
  _BACKUP.fields_by_name['selected_applications']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['contains_volume_data']._options = None
  _BACKUP.fields_by_name['contains_volume_data']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['contains_secrets']._options = None
  _BACKUP.fields_by_name['contains_secrets']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['cluster_metadata']._options = None
  _BACKUP.fields_by_name['cluster_metadata']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['state']._options = None
  _BACKUP.fields_by_name['state']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['state_reason']._options = None
  _BACKUP.fields_by_name['state_reason']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['complete_time']._options = None
  _BACKUP.fields_by_name['complete_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['resource_count']._options = None
  _BACKUP.fields_by_name['resource_count']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['volume_count']._options = None
  _BACKUP.fields_by_name['volume_count']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['size_bytes']._options = None
  _BACKUP.fields_by_name['size_bytes']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['etag']._options = None
  _BACKUP.fields_by_name['etag']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['pod_count']._options = None
  _BACKUP.fields_by_name['pod_count']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['config_backup_size_bytes']._options = None
  _BACKUP.fields_by_name['config_backup_size_bytes']._serialized_options = b'\340A\003'
  _BACKUP._options = None
  _BACKUP._serialized_options = b'\352Au\n\037gkebackup.googleapis.com/Backup\022Rprojects/{project}/locations/{location}/backupPlans/{backup_plan}/backups/{backup}'
  _BACKUP._serialized_start=203
  _BACKUP._serialized_end=1926
  _BACKUP_CLUSTERMETADATA._serialized_start=1352
  _BACKUP_CLUSTERMETADATA._serialized_end=1637
  _BACKUP_CLUSTERMETADATA_BACKUPCRDVERSIONSENTRY._serialized_start=1561
  _BACKUP_CLUSTERMETADATA_BACKUPCRDVERSIONSENTRY._serialized_end=1617
  _BACKUP_LABELSENTRY._serialized_start=1639
  _BACKUP_LABELSENTRY._serialized_end=1684
  _BACKUP_STATE._serialized_start=1686
  _BACKUP_STATE._serialized_end=1788
# @@protoc_insertion_point(module_scope)