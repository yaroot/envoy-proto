# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/table.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$google/bigtable/admin/v2/table.proto\x12\x18google.bigtable.admin.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x9b\x01\n\x0bRestoreInfo\x12@\n\x0bsource_type\x18\x01 \x01(\x0e\x32+.google.bigtable.admin.v2.RestoreSourceType\x12;\n\x0b\x62\x61\x63kup_info\x18\x02 \x01(\x0b\x32$.google.bigtable.admin.v2.BackupInfoH\x00\x42\r\n\x0bsource_info\"\x8e\t\n\x05Table\x12\x0c\n\x04name\x18\x01 \x01(\t\x12O\n\x0e\x63luster_states\x18\x02 \x03(\x0b\x32\x32.google.bigtable.admin.v2.Table.ClusterStatesEntryB\x03\xe0\x41\x03\x12L\n\x0f\x63olumn_families\x18\x03 \x03(\x0b\x32\x33.google.bigtable.admin.v2.Table.ColumnFamiliesEntry\x12N\n\x0bgranularity\x18\x04 \x01(\x0e\x32\x34.google.bigtable.admin.v2.Table.TimestampGranularityB\x03\xe0\x41\x05\x12@\n\x0crestore_info\x18\x06 \x01(\x0b\x32%.google.bigtable.admin.v2.RestoreInfoB\x03\xe0\x41\x03\x12\x1b\n\x13\x64\x65letion_protection\x18\t \x01(\x08\x1a\xc6\x02\n\x0c\x43lusterState\x12]\n\x11replication_state\x18\x01 \x01(\x0e\x32=.google.bigtable.admin.v2.Table.ClusterState.ReplicationStateB\x03\xe0\x41\x03\x12\x46\n\x0f\x65ncryption_info\x18\x02 \x03(\x0b\x32(.google.bigtable.admin.v2.EncryptionInfoB\x03\xe0\x41\x03\"\x8e\x01\n\x10ReplicationState\x12\x13\n\x0fSTATE_NOT_KNOWN\x10\x00\x12\x10\n\x0cINITIALIZING\x10\x01\x12\x17\n\x13PLANNED_MAINTENANCE\x10\x02\x12\x19\n\x15UNPLANNED_MAINTENANCE\x10\x03\x12\t\n\x05READY\x10\x04\x12\x14\n\x10READY_OPTIMIZING\x10\x05\x1a\x62\n\x12\x43lusterStatesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12;\n\x05value\x18\x02 \x01(\x0b\x32,.google.bigtable.admin.v2.Table.ClusterState:\x02\x38\x01\x1a]\n\x13\x43olumnFamiliesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x35\n\x05value\x18\x02 \x01(\x0b\x32&.google.bigtable.admin.v2.ColumnFamily:\x02\x38\x01\"I\n\x14TimestampGranularity\x12%\n!TIMESTAMP_GRANULARITY_UNSPECIFIED\x10\x00\x12\n\n\x06MILLIS\x10\x01\"q\n\x04View\x12\x14\n\x10VIEW_UNSPECIFIED\x10\x00\x12\r\n\tNAME_ONLY\x10\x01\x12\x0f\n\x0bSCHEMA_VIEW\x10\x02\x12\x14\n\x10REPLICATION_VIEW\x10\x03\x12\x13\n\x0f\x45NCRYPTION_VIEW\x10\x05\x12\x08\n\x04\x46ULL\x10\x04:_\xea\x41\\\n\"bigtableadmin.googleapis.com/Table\x12\x36projects/{project}/instances/{instance}/tables/{table}\"A\n\x0c\x43olumnFamily\x12\x31\n\x07gc_rule\x18\x01 \x01(\x0b\x32 .google.bigtable.admin.v2.GcRule\"\xd5\x02\n\x06GcRule\x12\x1a\n\x10max_num_versions\x18\x01 \x01(\x05H\x00\x12,\n\x07max_age\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12\x45\n\x0cintersection\x18\x03 \x01(\x0b\x32-.google.bigtable.admin.v2.GcRule.IntersectionH\x00\x12\x37\n\x05union\x18\x04 \x01(\x0b\x32&.google.bigtable.admin.v2.GcRule.UnionH\x00\x1a?\n\x0cIntersection\x12/\n\x05rules\x18\x01 \x03(\x0b\x32 .google.bigtable.admin.v2.GcRule\x1a\x38\n\x05Union\x12/\n\x05rules\x18\x01 \x03(\x0b\x32 .google.bigtable.admin.v2.GcRuleB\x06\n\x04rule\"\xd9\x02\n\x0e\x45ncryptionInfo\x12U\n\x0f\x65ncryption_type\x18\x03 \x01(\x0e\x32\x37.google.bigtable.admin.v2.EncryptionInfo.EncryptionTypeB\x03\xe0\x41\x03\x12\x32\n\x11\x65ncryption_status\x18\x04 \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12I\n\x0fkms_key_version\x18\x02 \x01(\tB0\xe0\x41\x03\xfa\x41*\n(cloudkms.googleapis.com/CryptoKeyVersion\"q\n\x0e\x45ncryptionType\x12\x1f\n\x1b\x45NCRYPTION_TYPE_UNSPECIFIED\x10\x00\x12\x1d\n\x19GOOGLE_DEFAULT_ENCRYPTION\x10\x01\x12\x1f\n\x1b\x43USTOMER_MANAGED_ENCRYPTION\x10\x02\"\xcc\x03\n\x08Snapshot\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x35\n\x0csource_table\x18\x02 \x01(\x0b\x32\x1f.google.bigtable.admin.v2.Table\x12\x17\n\x0f\x64\x61ta_size_bytes\x18\x03 \x01(\x03\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x64\x65lete_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x37\n\x05state\x18\x06 \x01(\x0e\x32(.google.bigtable.admin.v2.Snapshot.State\x12\x13\n\x0b\x64\x65scription\x18\x07 \x01(\t\"5\n\x05State\x12\x13\n\x0fSTATE_NOT_KNOWN\x10\x00\x12\t\n\x05READY\x10\x01\x12\x0c\n\x08\x43REATING\x10\x02:{\xea\x41x\n%bigtableadmin.googleapis.com/Snapshot\x12Oprojects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}\"\x9f\x04\n\x06\x42\x61\x63kup\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x1c\n\x0csource_table\x18\x02 \x01(\tB\x06\xe0\x41\x05\xe0\x41\x02\x12\x34\n\x0b\x65xpire_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\x12\x33\n\nstart_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x17\n\nsize_bytes\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03\x12:\n\x05state\x18\x07 \x01(\x0e\x32&.google.bigtable.admin.v2.Backup.StateB\x03\xe0\x41\x03\x12\x46\n\x0f\x65ncryption_info\x18\t \x01(\x0b\x32(.google.bigtable.admin.v2.EncryptionInfoB\x03\xe0\x41\x03\"7\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02:u\xea\x41r\n#bigtableadmin.googleapis.com/Backup\x12Kprojects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}\"\xa4\x01\n\nBackupInfo\x12\x13\n\x06\x62\x61\x63kup\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x19\n\x0csource_table\x18\x04 \x01(\tB\x03\xe0\x41\x03*D\n\x11RestoreSourceType\x12#\n\x1fRESTORE_SOURCE_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06\x42\x41\x43KUP\x10\x01\x42\xfc\x02\n\x1c\x63om.google.bigtable.admin.v2B\nTableProtoP\x01Z=google.golang.org/genproto/googleapis/bigtable/admin/v2;admin\xaa\x02\x1eGoogle.Cloud.Bigtable.Admin.V2\xca\x02\x1eGoogle\\Cloud\\Bigtable\\Admin\\V2\xea\x02\"Google::Cloud::Bigtable::Admin::V2\xea\x41\xa6\x01\n(cloudkms.googleapis.com/CryptoKeyVersion\x12zprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.bigtable.admin.v2.table_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.bigtable.admin.v2B\nTableProtoP\001Z=google.golang.org/genproto/googleapis/bigtable/admin/v2;admin\252\002\036Google.Cloud.Bigtable.Admin.V2\312\002\036Google\\Cloud\\Bigtable\\Admin\\V2\352\002\"Google::Cloud::Bigtable::Admin::V2\352A\246\001\n(cloudkms.googleapis.com/CryptoKeyVersion\022zprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}'
  _TABLE_CLUSTERSTATE.fields_by_name['replication_state']._options = None
  _TABLE_CLUSTERSTATE.fields_by_name['replication_state']._serialized_options = b'\340A\003'
  _TABLE_CLUSTERSTATE.fields_by_name['encryption_info']._options = None
  _TABLE_CLUSTERSTATE.fields_by_name['encryption_info']._serialized_options = b'\340A\003'
  _TABLE_CLUSTERSTATESENTRY._options = None
  _TABLE_CLUSTERSTATESENTRY._serialized_options = b'8\001'
  _TABLE_COLUMNFAMILIESENTRY._options = None
  _TABLE_COLUMNFAMILIESENTRY._serialized_options = b'8\001'
  _TABLE.fields_by_name['cluster_states']._options = None
  _TABLE.fields_by_name['cluster_states']._serialized_options = b'\340A\003'
  _TABLE.fields_by_name['granularity']._options = None
  _TABLE.fields_by_name['granularity']._serialized_options = b'\340A\005'
  _TABLE.fields_by_name['restore_info']._options = None
  _TABLE.fields_by_name['restore_info']._serialized_options = b'\340A\003'
  _TABLE._options = None
  _TABLE._serialized_options = b'\352A\\\n\"bigtableadmin.googleapis.com/Table\0226projects/{project}/instances/{instance}/tables/{table}'
  _ENCRYPTIONINFO.fields_by_name['encryption_type']._options = None
  _ENCRYPTIONINFO.fields_by_name['encryption_type']._serialized_options = b'\340A\003'
  _ENCRYPTIONINFO.fields_by_name['encryption_status']._options = None
  _ENCRYPTIONINFO.fields_by_name['encryption_status']._serialized_options = b'\340A\003'
  _ENCRYPTIONINFO.fields_by_name['kms_key_version']._options = None
  _ENCRYPTIONINFO.fields_by_name['kms_key_version']._serialized_options = b'\340A\003\372A*\n(cloudkms.googleapis.com/CryptoKeyVersion'
  _SNAPSHOT._options = None
  _SNAPSHOT._serialized_options = b'\352Ax\n%bigtableadmin.googleapis.com/Snapshot\022Oprojects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}'
  _BACKUP.fields_by_name['source_table']._options = None
  _BACKUP.fields_by_name['source_table']._serialized_options = b'\340A\005\340A\002'
  _BACKUP.fields_by_name['expire_time']._options = None
  _BACKUP.fields_by_name['expire_time']._serialized_options = b'\340A\002'
  _BACKUP.fields_by_name['start_time']._options = None
  _BACKUP.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['end_time']._options = None
  _BACKUP.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['size_bytes']._options = None
  _BACKUP.fields_by_name['size_bytes']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['state']._options = None
  _BACKUP.fields_by_name['state']._serialized_options = b'\340A\003'
  _BACKUP.fields_by_name['encryption_info']._options = None
  _BACKUP.fields_by_name['encryption_info']._serialized_options = b'\340A\003'
  _BACKUP._options = None
  _BACKUP._serialized_options = b'\352Ar\n#bigtableadmin.googleapis.com/Backup\022Kprojects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}'
  _BACKUPINFO.fields_by_name['backup']._options = None
  _BACKUPINFO.fields_by_name['backup']._serialized_options = b'\340A\003'
  _BACKUPINFO.fields_by_name['start_time']._options = None
  _BACKUPINFO.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _BACKUPINFO.fields_by_name['end_time']._options = None
  _BACKUPINFO.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _BACKUPINFO.fields_by_name['source_table']._options = None
  _BACKUPINFO.fields_by_name['source_table']._serialized_options = b'\340A\003'
  _RESTORESOURCETYPE._serialized_start=3478
  _RESTORESOURCETYPE._serialized_end=3546
  _RESTOREINFO._serialized_start=217
  _RESTOREINFO._serialized_end=372
  _TABLE._serialized_start=375
  _TABLE._serialized_end=1541
  _TABLE_CLUSTERSTATE._serialized_start=733
  _TABLE_CLUSTERSTATE._serialized_end=1059
  _TABLE_CLUSTERSTATE_REPLICATIONSTATE._serialized_start=917
  _TABLE_CLUSTERSTATE_REPLICATIONSTATE._serialized_end=1059
  _TABLE_CLUSTERSTATESENTRY._serialized_start=1061
  _TABLE_CLUSTERSTATESENTRY._serialized_end=1159
  _TABLE_COLUMNFAMILIESENTRY._serialized_start=1161
  _TABLE_COLUMNFAMILIESENTRY._serialized_end=1254
  _TABLE_TIMESTAMPGRANULARITY._serialized_start=1256
  _TABLE_TIMESTAMPGRANULARITY._serialized_end=1329
  _TABLE_VIEW._serialized_start=1331
  _TABLE_VIEW._serialized_end=1444
  _COLUMNFAMILY._serialized_start=1543
  _COLUMNFAMILY._serialized_end=1608
  _GCRULE._serialized_start=1611
  _GCRULE._serialized_end=1952
  _GCRULE_INTERSECTION._serialized_start=1823
  _GCRULE_INTERSECTION._serialized_end=1886
  _GCRULE_UNION._serialized_start=1888
  _GCRULE_UNION._serialized_end=1944
  _ENCRYPTIONINFO._serialized_start=1955
  _ENCRYPTIONINFO._serialized_end=2300
  _ENCRYPTIONINFO_ENCRYPTIONTYPE._serialized_start=2187
  _ENCRYPTIONINFO_ENCRYPTIONTYPE._serialized_end=2300
  _SNAPSHOT._serialized_start=2303
  _SNAPSHOT._serialized_end=2763
  _SNAPSHOT_STATE._serialized_start=2585
  _SNAPSHOT_STATE._serialized_end=2638
  _BACKUP._serialized_start=2766
  _BACKUP._serialized_end=3309
  _BACKUP_STATE._serialized_start=3135
  _BACKUP_STATE._serialized_end=3190
  _BACKUPINFO._serialized_start=3312
  _BACKUPINFO._serialized_end=3476
# @@protoc_insertion_point(module_scope)