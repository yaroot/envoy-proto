# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/bigtable_table_admin.proto
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
from google.bigtable.admin.v2 import common_pb2 as google_dot_bigtable_dot_admin_dot_v2_dot_common__pb2
from google.bigtable.admin.v2 import table_pb2 as google_dot_bigtable_dot_admin_dot_v2_dot_table__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/bigtable/admin/v2/bigtable_table_admin.proto\x12\x18google.bigtable.admin.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a%google/bigtable/admin/v2/common.proto\x1a$google/bigtable/admin/v2/table.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a#google/longrunning/operations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb1\x01\n\x13RestoreTableRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Instance\x12\x15\n\x08table_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12:\n\x06\x62\x61\x63kup\x18\x03 \x01(\tB(\xfa\x41%\n#bigtableadmin.googleapis.com/BackupH\x00\x42\x08\n\x06source\"\x98\x02\n\x14RestoreTableMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12@\n\x0bsource_type\x18\x02 \x01(\x0e\x32+.google.bigtable.admin.v2.RestoreSourceType\x12;\n\x0b\x62\x61\x63kup_info\x18\x03 \x01(\x0b\x32$.google.bigtable.admin.v2.BackupInfoH\x00\x12%\n\x1doptimize_table_operation_name\x18\x04 \x01(\t\x12=\n\x08progress\x18\x05 \x01(\x0b\x32+.google.bigtable.admin.v2.OperationProgressB\r\n\x0bsource_info\"l\n\x1dOptimizeRestoredTableMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12=\n\x08progress\x18\x02 \x01(\x0b\x32+.google.bigtable.admin.v2.OperationProgress\"\x81\x02\n\x12\x43reateTableRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Instance\x12\x15\n\x08table_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x33\n\x05table\x18\x03 \x01(\x0b\x32\x1f.google.bigtable.admin.v2.TableB\x03\xe0\x41\x02\x12J\n\x0einitial_splits\x18\x04 \x03(\x0b\x32\x32.google.bigtable.admin.v2.CreateTableRequest.Split\x1a\x14\n\x05Split\x12\x0b\n\x03key\x18\x01 \x01(\x0c\"\xbe\x01\n\x1e\x43reateTableFromSnapshotRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Instance\x12\x15\n\x08table_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x46\n\x0fsource_snapshot\x18\x03 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Snapshot\"\x99\x01\n\x13\x44ropRowRangeRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\x12\x18\n\x0erow_key_prefix\x18\x02 \x01(\x0cH\x00\x12$\n\x1a\x64\x65lete_all_data_from_table\x18\x03 \x01(\x08H\x00\x42\x08\n\x06target\"\xad\x01\n\x11ListTablesRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Instance\x12\x32\n\x04view\x18\x02 \x01(\x0e\x32$.google.bigtable.admin.v2.Table.View\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"^\n\x12ListTablesResponse\x12/\n\x06tables\x18\x01 \x03(\x0b\x32\x1f.google.bigtable.admin.v2.Table\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x7f\n\x0fGetTableRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\x12\x32\n\x04view\x18\x02 \x01(\x0e\x32$.google.bigtable.admin.v2.Table.View\"\x7f\n\x12UpdateTableRequest\x12\x33\n\x05table\x18\x01 \x01(\x0b\x32\x1f.google.bigtable.admin.v2.TableB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\x81\x01\n\x13UpdateTableMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"N\n\x12\x44\x65leteTableRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\"P\n\x14UndeleteTableRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\"\x83\x01\n\x15UndeleteTableMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xdf\x02\n\x1bModifyColumnFamiliesRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\x12^\n\rmodifications\x18\x02 \x03(\x0b\x32\x42.google.bigtable.admin.v2.ModifyColumnFamiliesRequest.ModificationB\x03\xe0\x41\x02\x1a\xa5\x01\n\x0cModification\x12\n\n\x02id\x18\x01 \x01(\t\x12\x38\n\x06\x63reate\x18\x02 \x01(\x0b\x32&.google.bigtable.admin.v2.ColumnFamilyH\x00\x12\x38\n\x06update\x18\x03 \x01(\x0b\x32&.google.bigtable.admin.v2.ColumnFamilyH\x00\x12\x0e\n\x04\x64rop\x18\x04 \x01(\x08H\x00\x42\x05\n\x03mod\"[\n\x1fGenerateConsistencyTokenRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\"=\n GenerateConsistencyTokenResponse\x12\x19\n\x11\x63onsistency_token\x18\x01 \x01(\t\"s\n\x17\x43heckConsistencyRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\x12\x1e\n\x11\x63onsistency_token\x18\x02 \x01(\tB\x03\xe0\x41\x02\".\n\x18\x43heckConsistencyResponse\x12\x12\n\nconsistent\x18\x01 \x01(\x08\"\xe6\x01\n\x14SnapshotTableRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"bigtableadmin.googleapis.com/Table\x12=\n\x07\x63luster\x18\x02 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$bigtableadmin.googleapis.com/Cluster\x12\x18\n\x0bsnapshot_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12&\n\x03ttl\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\"Q\n\x12GetSnapshotRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Snapshot\"{\n\x14ListSnapshotsRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$bigtableadmin.googleapis.com/Cluster\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"g\n\x15ListSnapshotsResponse\x12\x35\n\tsnapshots\x18\x01 \x03(\x0b\x32\".google.bigtable.admin.v2.Snapshot\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"T\n\x15\x44\x65leteSnapshotRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%bigtableadmin.googleapis.com/Snapshot\"\xc4\x01\n\x15SnapshotTableMetadata\x12H\n\x10original_request\x18\x01 \x01(\x0b\x32..google.bigtable.admin.v2.SnapshotTableRequest\x12\x30\n\x0crequest_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x66inish_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xd8\x01\n\x1f\x43reateTableFromSnapshotMetadata\x12R\n\x10original_request\x18\x01 \x01(\x0b\x32\x38.google.bigtable.admin.v2.CreateTableFromSnapshotRequest\x12\x30\n\x0crequest_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x66inish_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xa2\x01\n\x13\x43reateBackupRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$bigtableadmin.googleapis.com/Cluster\x12\x16\n\tbackup_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x35\n\x06\x62\x61\x63kup\x18\x03 \x01(\x0b\x32 .google.bigtable.admin.v2.BackupB\x03\xe0\x41\x02\"\x98\x01\n\x14\x43reateBackupMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0csource_table\x18\x02 \x01(\t\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x82\x01\n\x13UpdateBackupRequest\x12\x35\n\x06\x62\x61\x63kup\x18\x01 \x01(\x0b\x32 .google.bigtable.admin.v2.BackupB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"M\n\x10GetBackupRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#bigtableadmin.googleapis.com/Backup\"P\n\x13\x44\x65leteBackupRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#bigtableadmin.googleapis.com/Backup\"\x9b\x01\n\x12ListBackupsRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$bigtableadmin.googleapis.com/Cluster\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x10\n\x08order_by\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x05 \x01(\t\"a\n\x13ListBackupsResponse\x12\x31\n\x07\x62\x61\x63kups\x18\x01 \x03(\x0b\x32 .google.bigtable.admin.v2.Backup\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xb2(\n\x12\x42igtableTableAdmin\x12\xab\x01\n\x0b\x43reateTable\x12,.google.bigtable.admin.v2.CreateTableRequest\x1a\x1f.google.bigtable.admin.v2.Table\"M\x82\xd3\xe4\x93\x02/\"*/v2/{parent=projects/*/instances/*}/tables:\x01*\xda\x41\x15parent,table_id,table\x12\x8a\x02\n\x17\x43reateTableFromSnapshot\x12\x38.google.bigtable.admin.v2.CreateTableFromSnapshotRequest\x1a\x1d.google.longrunning.Operation\"\x95\x01\x82\xd3\xe4\x93\x02\x42\"=/v2/{parent=projects/*/instances/*}/tables:createFromSnapshot:\x01*\xda\x41\x1fparent,table_id,source_snapshot\xca\x41(\n\x05Table\x12\x1f\x43reateTableFromSnapshotMetadata\x12\xa4\x01\n\nListTables\x12+.google.bigtable.admin.v2.ListTablesRequest\x1a,.google.bigtable.admin.v2.ListTablesResponse\";\x82\xd3\xe4\x93\x02,\x12*/v2/{parent=projects/*/instances/*}/tables\xda\x41\x06parent\x12\x91\x01\n\x08GetTable\x12).google.bigtable.admin.v2.GetTableRequest\x1a\x1f.google.bigtable.admin.v2.Table\"9\x82\xd3\xe4\x93\x02,\x12*/v2/{name=projects/*/instances/*/tables/*}\xda\x41\x04name\x12\xce\x01\n\x0bUpdateTable\x12,.google.bigtable.admin.v2.UpdateTableRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02\x39\x32\x30/v2/{table.name=projects/*/instances/*/tables/*}:\x05table\xda\x41\x11table,update_mask\xca\x41\x1c\n\x05Table\x12\x13UpdateTableMetadata\x12\x8e\x01\n\x0b\x44\x65leteTable\x12,.google.bigtable.admin.v2.DeleteTableRequest\x1a\x16.google.protobuf.Empty\"9\x82\xd3\xe4\x93\x02,**/v2/{name=projects/*/instances/*/tables/*}\xda\x41\x04name\x12\xc6\x01\n\rUndeleteTable\x12..google.bigtable.admin.v2.UndeleteTableRequest\x1a\x1d.google.longrunning.Operation\"f\x82\xd3\xe4\x93\x02\x38\"3/v2/{name=projects/*/instances/*/tables/*}:undelete:\x01*\xda\x41\x04name\xca\x41\x1e\n\x05Table\x12\x15UndeleteTableMetadata\x12\xcf\x01\n\x14ModifyColumnFamilies\x12\x35.google.bigtable.admin.v2.ModifyColumnFamiliesRequest\x1a\x1f.google.bigtable.admin.v2.Table\"_\x82\xd3\xe4\x93\x02\x44\"?/v2/{name=projects/*/instances/*/tables/*}:modifyColumnFamilies:\x01*\xda\x41\x12name,modifications\x12\x99\x01\n\x0c\x44ropRowRange\x12-.google.bigtable.admin.v2.DropRowRangeRequest\x1a\x16.google.protobuf.Empty\"B\x82\xd3\xe4\x93\x02<\"7/v2/{name=projects/*/instances/*/tables/*}:dropRowRange:\x01*\x12\xe8\x01\n\x18GenerateConsistencyToken\x12\x39.google.bigtable.admin.v2.GenerateConsistencyTokenRequest\x1a:.google.bigtable.admin.v2.GenerateConsistencyTokenResponse\"U\x82\xd3\xe4\x93\x02H\"C/v2/{name=projects/*/instances/*/tables/*}:generateConsistencyToken:\x01*\xda\x41\x04name\x12\xda\x01\n\x10\x43heckConsistency\x12\x31.google.bigtable.admin.v2.CheckConsistencyRequest\x1a\x32.google.bigtable.admin.v2.CheckConsistencyResponse\"_\x82\xd3\xe4\x93\x02@\";/v2/{name=projects/*/instances/*/tables/*}:checkConsistency:\x01*\xda\x41\x16name,consistency_token\x12\xea\x01\n\rSnapshotTable\x12..google.bigtable.admin.v2.SnapshotTableRequest\x1a\x1d.google.longrunning.Operation\"\x89\x01\x82\xd3\xe4\x93\x02\x38\"3/v2/{name=projects/*/instances/*/tables/*}:snapshot:\x01*\xda\x41$name,cluster,snapshot_id,description\xca\x41!\n\x08Snapshot\x12\x15SnapshotTableMetadata\x12\xa8\x01\n\x0bGetSnapshot\x12,.google.bigtable.admin.v2.GetSnapshotRequest\x1a\".google.bigtable.admin.v2.Snapshot\"G\x82\xd3\xe4\x93\x02:\x12\x38/v2/{name=projects/*/instances/*/clusters/*/snapshots/*}\xda\x41\x04name\x12\xbb\x01\n\rListSnapshots\x12..google.bigtable.admin.v2.ListSnapshotsRequest\x1a/.google.bigtable.admin.v2.ListSnapshotsResponse\"I\x82\xd3\xe4\x93\x02:\x12\x38/v2/{parent=projects/*/instances/*/clusters/*}/snapshots\xda\x41\x06parent\x12\xa2\x01\n\x0e\x44\x65leteSnapshot\x12/.google.bigtable.admin.v2.DeleteSnapshotRequest\x1a\x16.google.protobuf.Empty\"G\x82\xd3\xe4\x93\x02:*8/v2/{name=projects/*/instances/*/clusters/*/snapshots/*}\xda\x41\x04name\x12\xe0\x01\n\x0c\x43reateBackup\x12-.google.bigtable.admin.v2.CreateBackupRequest\x1a\x1d.google.longrunning.Operation\"\x81\x01\x82\xd3\xe4\x93\x02@\"6/v2/{parent=projects/*/instances/*/clusters/*}/backups:\x06\x62\x61\x63kup\xda\x41\x17parent,backup_id,backup\xca\x41\x1e\n\x06\x42\x61\x63kup\x12\x14\x43reateBackupMetadata\x12\xa0\x01\n\tGetBackup\x12*.google.bigtable.admin.v2.GetBackupRequest\x1a .google.bigtable.admin.v2.Backup\"E\x82\xd3\xe4\x93\x02\x38\x12\x36/v2/{name=projects/*/instances/*/clusters/*/backups/*}\xda\x41\x04name\x12\xc3\x01\n\x0cUpdateBackup\x12-.google.bigtable.admin.v2.UpdateBackupRequest\x1a .google.bigtable.admin.v2.Backup\"b\x82\xd3\xe4\x93\x02G2=/v2/{backup.name=projects/*/instances/*/clusters/*/backups/*}:\x06\x62\x61\x63kup\xda\x41\x12\x62\x61\x63kup,update_mask\x12\x9c\x01\n\x0c\x44\x65leteBackup\x12-.google.bigtable.admin.v2.DeleteBackupRequest\x1a\x16.google.protobuf.Empty\"E\x82\xd3\xe4\x93\x02\x38*6/v2/{name=projects/*/instances/*/clusters/*/backups/*}\xda\x41\x04name\x12\xb3\x01\n\x0bListBackups\x12,.google.bigtable.admin.v2.ListBackupsRequest\x1a-.google.bigtable.admin.v2.ListBackupsResponse\"G\x82\xd3\xe4\x93\x02\x38\x12\x36/v2/{parent=projects/*/instances/*/clusters/*}/backups\xda\x41\x06parent\x12\xbb\x01\n\x0cRestoreTable\x12-.google.bigtable.admin.v2.RestoreTableRequest\x1a\x1d.google.longrunning.Operation\"]\x82\xd3\xe4\x93\x02\x37\"2/v2/{parent=projects/*/instances/*}/tables:restore:\x01*\xca\x41\x1d\n\x05Table\x12\x14RestoreTableMetadata\x12\xec\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xa0\x01\x82\xd3\xe4\x93\x02\x8e\x01\";/v2/{resource=projects/*/instances/*/tables/*}:getIamPolicy:\x01*ZL\"G/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:getIamPolicy:\x01*\xda\x41\x08resource\x12\xf3\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xa7\x01\x82\xd3\xe4\x93\x02\x8e\x01\";/v2/{resource=projects/*/instances/*/tables/*}:setIamPolicy:\x01*ZL\"G/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:setIamPolicy:\x01*\xda\x41\x0fresource,policy\x12\xa4\x02\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"\xb8\x01\x82\xd3\xe4\x93\x02\x9a\x01\"A/v2/{resource=projects/*/instances/*/tables/*}:testIamPermissions:\x01*ZR\"M/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:testIamPermissions:\x01*\xda\x41\x14resource,permissions\x1a\xde\x02\xca\x41\x1c\x62igtableadmin.googleapis.com\xd2\x41\xbb\x02https://www.googleapis.com/auth/bigtable.admin,https://www.googleapis.com/auth/bigtable.admin.table,https://www.googleapis.com/auth/cloud-bigtable.admin,https://www.googleapis.com/auth/cloud-bigtable.admin.table,https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyB\xdf\x01\n\x1c\x63om.google.bigtable.admin.v2B\x17\x42igtableTableAdminProtoP\x01Z=google.golang.org/genproto/googleapis/bigtable/admin/v2;admin\xaa\x02\x1eGoogle.Cloud.Bigtable.Admin.V2\xca\x02\x1eGoogle\\Cloud\\Bigtable\\Admin\\V2\xea\x02\"Google::Cloud::Bigtable::Admin::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.bigtable.admin.v2.bigtable_table_admin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.bigtable.admin.v2B\027BigtableTableAdminProtoP\001Z=google.golang.org/genproto/googleapis/bigtable/admin/v2;admin\252\002\036Google.Cloud.Bigtable.Admin.V2\312\002\036Google\\Cloud\\Bigtable\\Admin\\V2\352\002\"Google::Cloud::Bigtable::Admin::V2'
  _RESTORETABLEREQUEST.fields_by_name['parent']._options = None
  _RESTORETABLEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Instance'
  _RESTORETABLEREQUEST.fields_by_name['table_id']._options = None
  _RESTORETABLEREQUEST.fields_by_name['table_id']._serialized_options = b'\340A\002'
  _RESTORETABLEREQUEST.fields_by_name['backup']._options = None
  _RESTORETABLEREQUEST.fields_by_name['backup']._serialized_options = b'\372A%\n#bigtableadmin.googleapis.com/Backup'
  _CREATETABLEREQUEST.fields_by_name['parent']._options = None
  _CREATETABLEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Instance'
  _CREATETABLEREQUEST.fields_by_name['table_id']._options = None
  _CREATETABLEREQUEST.fields_by_name['table_id']._serialized_options = b'\340A\002'
  _CREATETABLEREQUEST.fields_by_name['table']._options = None
  _CREATETABLEREQUEST.fields_by_name['table']._serialized_options = b'\340A\002'
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['parent']._options = None
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Instance'
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['table_id']._options = None
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['table_id']._serialized_options = b'\340A\002'
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['source_snapshot']._options = None
  _CREATETABLEFROMSNAPSHOTREQUEST.fields_by_name['source_snapshot']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Snapshot'
  _DROPROWRANGEREQUEST.fields_by_name['name']._options = None
  _DROPROWRANGEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _LISTTABLESREQUEST.fields_by_name['parent']._options = None
  _LISTTABLESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Instance'
  _GETTABLEREQUEST.fields_by_name['name']._options = None
  _GETTABLEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _UPDATETABLEREQUEST.fields_by_name['table']._options = None
  _UPDATETABLEREQUEST.fields_by_name['table']._serialized_options = b'\340A\002'
  _UPDATETABLEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATETABLEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _DELETETABLEREQUEST.fields_by_name['name']._options = None
  _DELETETABLEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _UNDELETETABLEREQUEST.fields_by_name['name']._options = None
  _UNDELETETABLEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _MODIFYCOLUMNFAMILIESREQUEST.fields_by_name['name']._options = None
  _MODIFYCOLUMNFAMILIESREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _MODIFYCOLUMNFAMILIESREQUEST.fields_by_name['modifications']._options = None
  _MODIFYCOLUMNFAMILIESREQUEST.fields_by_name['modifications']._serialized_options = b'\340A\002'
  _GENERATECONSISTENCYTOKENREQUEST.fields_by_name['name']._options = None
  _GENERATECONSISTENCYTOKENREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _CHECKCONSISTENCYREQUEST.fields_by_name['name']._options = None
  _CHECKCONSISTENCYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _CHECKCONSISTENCYREQUEST.fields_by_name['consistency_token']._options = None
  _CHECKCONSISTENCYREQUEST.fields_by_name['consistency_token']._serialized_options = b'\340A\002'
  _SNAPSHOTTABLEREQUEST.fields_by_name['name']._options = None
  _SNAPSHOTTABLEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"bigtableadmin.googleapis.com/Table'
  _SNAPSHOTTABLEREQUEST.fields_by_name['cluster']._options = None
  _SNAPSHOTTABLEREQUEST.fields_by_name['cluster']._serialized_options = b'\340A\002\372A&\n$bigtableadmin.googleapis.com/Cluster'
  _SNAPSHOTTABLEREQUEST.fields_by_name['snapshot_id']._options = None
  _SNAPSHOTTABLEREQUEST.fields_by_name['snapshot_id']._serialized_options = b'\340A\002'
  _GETSNAPSHOTREQUEST.fields_by_name['name']._options = None
  _GETSNAPSHOTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Snapshot'
  _LISTSNAPSHOTSREQUEST.fields_by_name['parent']._options = None
  _LISTSNAPSHOTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$bigtableadmin.googleapis.com/Cluster'
  _DELETESNAPSHOTREQUEST.fields_by_name['name']._options = None
  _DELETESNAPSHOTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%bigtableadmin.googleapis.com/Snapshot'
  _CREATEBACKUPREQUEST.fields_by_name['parent']._options = None
  _CREATEBACKUPREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$bigtableadmin.googleapis.com/Cluster'
  _CREATEBACKUPREQUEST.fields_by_name['backup_id']._options = None
  _CREATEBACKUPREQUEST.fields_by_name['backup_id']._serialized_options = b'\340A\002'
  _CREATEBACKUPREQUEST.fields_by_name['backup']._options = None
  _CREATEBACKUPREQUEST.fields_by_name['backup']._serialized_options = b'\340A\002'
  _UPDATEBACKUPREQUEST.fields_by_name['backup']._options = None
  _UPDATEBACKUPREQUEST.fields_by_name['backup']._serialized_options = b'\340A\002'
  _UPDATEBACKUPREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEBACKUPREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _GETBACKUPREQUEST.fields_by_name['name']._options = None
  _GETBACKUPREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#bigtableadmin.googleapis.com/Backup'
  _DELETEBACKUPREQUEST.fields_by_name['name']._options = None
  _DELETEBACKUPREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#bigtableadmin.googleapis.com/Backup'
  _LISTBACKUPSREQUEST.fields_by_name['parent']._options = None
  _LISTBACKUPSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$bigtableadmin.googleapis.com/Cluster'
  _BIGTABLETABLEADMIN._options = None
  _BIGTABLETABLEADMIN._serialized_options = b'\312A\034bigtableadmin.googleapis.com\322A\273\002https://www.googleapis.com/auth/bigtable.admin,https://www.googleapis.com/auth/bigtable.admin.table,https://www.googleapis.com/auth/cloud-bigtable.admin,https://www.googleapis.com/auth/cloud-bigtable.admin.table,https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-only'
  _BIGTABLETABLEADMIN.methods_by_name['CreateTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['CreateTable']._serialized_options = b'\202\323\344\223\002/\"*/v2/{parent=projects/*/instances/*}/tables:\001*\332A\025parent,table_id,table'
  _BIGTABLETABLEADMIN.methods_by_name['CreateTableFromSnapshot']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['CreateTableFromSnapshot']._serialized_options = b'\202\323\344\223\002B\"=/v2/{parent=projects/*/instances/*}/tables:createFromSnapshot:\001*\332A\037parent,table_id,source_snapshot\312A(\n\005Table\022\037CreateTableFromSnapshotMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['ListTables']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['ListTables']._serialized_options = b'\202\323\344\223\002,\022*/v2/{parent=projects/*/instances/*}/tables\332A\006parent'
  _BIGTABLETABLEADMIN.methods_by_name['GetTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['GetTable']._serialized_options = b'\202\323\344\223\002,\022*/v2/{name=projects/*/instances/*/tables/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['UpdateTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['UpdateTable']._serialized_options = b'\202\323\344\223\002920/v2/{table.name=projects/*/instances/*/tables/*}:\005table\332A\021table,update_mask\312A\034\n\005Table\022\023UpdateTableMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['DeleteTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['DeleteTable']._serialized_options = b'\202\323\344\223\002,**/v2/{name=projects/*/instances/*/tables/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['UndeleteTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['UndeleteTable']._serialized_options = b'\202\323\344\223\0028\"3/v2/{name=projects/*/instances/*/tables/*}:undelete:\001*\332A\004name\312A\036\n\005Table\022\025UndeleteTableMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['ModifyColumnFamilies']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['ModifyColumnFamilies']._serialized_options = b'\202\323\344\223\002D\"?/v2/{name=projects/*/instances/*/tables/*}:modifyColumnFamilies:\001*\332A\022name,modifications'
  _BIGTABLETABLEADMIN.methods_by_name['DropRowRange']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['DropRowRange']._serialized_options = b'\202\323\344\223\002<\"7/v2/{name=projects/*/instances/*/tables/*}:dropRowRange:\001*'
  _BIGTABLETABLEADMIN.methods_by_name['GenerateConsistencyToken']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['GenerateConsistencyToken']._serialized_options = b'\202\323\344\223\002H\"C/v2/{name=projects/*/instances/*/tables/*}:generateConsistencyToken:\001*\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['CheckConsistency']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['CheckConsistency']._serialized_options = b'\202\323\344\223\002@\";/v2/{name=projects/*/instances/*/tables/*}:checkConsistency:\001*\332A\026name,consistency_token'
  _BIGTABLETABLEADMIN.methods_by_name['SnapshotTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['SnapshotTable']._serialized_options = b'\202\323\344\223\0028\"3/v2/{name=projects/*/instances/*/tables/*}:snapshot:\001*\332A$name,cluster,snapshot_id,description\312A!\n\010Snapshot\022\025SnapshotTableMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['GetSnapshot']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['GetSnapshot']._serialized_options = b'\202\323\344\223\002:\0228/v2/{name=projects/*/instances/*/clusters/*/snapshots/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['ListSnapshots']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['ListSnapshots']._serialized_options = b'\202\323\344\223\002:\0228/v2/{parent=projects/*/instances/*/clusters/*}/snapshots\332A\006parent'
  _BIGTABLETABLEADMIN.methods_by_name['DeleteSnapshot']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['DeleteSnapshot']._serialized_options = b'\202\323\344\223\002:*8/v2/{name=projects/*/instances/*/clusters/*/snapshots/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['CreateBackup']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['CreateBackup']._serialized_options = b'\202\323\344\223\002@\"6/v2/{parent=projects/*/instances/*/clusters/*}/backups:\006backup\332A\027parent,backup_id,backup\312A\036\n\006Backup\022\024CreateBackupMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['GetBackup']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['GetBackup']._serialized_options = b'\202\323\344\223\0028\0226/v2/{name=projects/*/instances/*/clusters/*/backups/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['UpdateBackup']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['UpdateBackup']._serialized_options = b'\202\323\344\223\002G2=/v2/{backup.name=projects/*/instances/*/clusters/*/backups/*}:\006backup\332A\022backup,update_mask'
  _BIGTABLETABLEADMIN.methods_by_name['DeleteBackup']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['DeleteBackup']._serialized_options = b'\202\323\344\223\0028*6/v2/{name=projects/*/instances/*/clusters/*/backups/*}\332A\004name'
  _BIGTABLETABLEADMIN.methods_by_name['ListBackups']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['ListBackups']._serialized_options = b'\202\323\344\223\0028\0226/v2/{parent=projects/*/instances/*/clusters/*}/backups\332A\006parent'
  _BIGTABLETABLEADMIN.methods_by_name['RestoreTable']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['RestoreTable']._serialized_options = b'\202\323\344\223\0027\"2/v2/{parent=projects/*/instances/*}/tables:restore:\001*\312A\035\n\005Table\022\024RestoreTableMetadata'
  _BIGTABLETABLEADMIN.methods_by_name['GetIamPolicy']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002\216\001\";/v2/{resource=projects/*/instances/*/tables/*}:getIamPolicy:\001*ZL\"G/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:getIamPolicy:\001*\332A\010resource'
  _BIGTABLETABLEADMIN.methods_by_name['SetIamPolicy']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002\216\001\";/v2/{resource=projects/*/instances/*/tables/*}:setIamPolicy:\001*ZL\"G/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:setIamPolicy:\001*\332A\017resource,policy'
  _BIGTABLETABLEADMIN.methods_by_name['TestIamPermissions']._options = None
  _BIGTABLETABLEADMIN.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002\232\001\"A/v2/{resource=projects/*/instances/*/tables/*}:testIamPermissions:\001*ZR\"M/v2/{resource=projects/*/instances/*/clusters/*/backups/*}:testIamPermissions:\001*\332A\024resource,permissions'
  _RESTORETABLEREQUEST._serialized_start=499
  _RESTORETABLEREQUEST._serialized_end=676
  _RESTORETABLEMETADATA._serialized_start=679
  _RESTORETABLEMETADATA._serialized_end=959
  _OPTIMIZERESTOREDTABLEMETADATA._serialized_start=961
  _OPTIMIZERESTOREDTABLEMETADATA._serialized_end=1069
  _CREATETABLEREQUEST._serialized_start=1072
  _CREATETABLEREQUEST._serialized_end=1329
  _CREATETABLEREQUEST_SPLIT._serialized_start=1309
  _CREATETABLEREQUEST_SPLIT._serialized_end=1329
  _CREATETABLEFROMSNAPSHOTREQUEST._serialized_start=1332
  _CREATETABLEFROMSNAPSHOTREQUEST._serialized_end=1522
  _DROPROWRANGEREQUEST._serialized_start=1525
  _DROPROWRANGEREQUEST._serialized_end=1678
  _LISTTABLESREQUEST._serialized_start=1681
  _LISTTABLESREQUEST._serialized_end=1854
  _LISTTABLESRESPONSE._serialized_start=1856
  _LISTTABLESRESPONSE._serialized_end=1950
  _GETTABLEREQUEST._serialized_start=1952
  _GETTABLEREQUEST._serialized_end=2079
  _UPDATETABLEREQUEST._serialized_start=2081
  _UPDATETABLEREQUEST._serialized_end=2208
  _UPDATETABLEMETADATA._serialized_start=2211
  _UPDATETABLEMETADATA._serialized_end=2340
  _DELETETABLEREQUEST._serialized_start=2342
  _DELETETABLEREQUEST._serialized_end=2420
  _UNDELETETABLEREQUEST._serialized_start=2422
  _UNDELETETABLEREQUEST._serialized_end=2502
  _UNDELETETABLEMETADATA._serialized_start=2505
  _UNDELETETABLEMETADATA._serialized_end=2636
  _MODIFYCOLUMNFAMILIESREQUEST._serialized_start=2639
  _MODIFYCOLUMNFAMILIESREQUEST._serialized_end=2990
  _MODIFYCOLUMNFAMILIESREQUEST_MODIFICATION._serialized_start=2825
  _MODIFYCOLUMNFAMILIESREQUEST_MODIFICATION._serialized_end=2990
  _GENERATECONSISTENCYTOKENREQUEST._serialized_start=2992
  _GENERATECONSISTENCYTOKENREQUEST._serialized_end=3083
  _GENERATECONSISTENCYTOKENRESPONSE._serialized_start=3085
  _GENERATECONSISTENCYTOKENRESPONSE._serialized_end=3146
  _CHECKCONSISTENCYREQUEST._serialized_start=3148
  _CHECKCONSISTENCYREQUEST._serialized_end=3263
  _CHECKCONSISTENCYRESPONSE._serialized_start=3265
  _CHECKCONSISTENCYRESPONSE._serialized_end=3311
  _SNAPSHOTTABLEREQUEST._serialized_start=3314
  _SNAPSHOTTABLEREQUEST._serialized_end=3544
  _GETSNAPSHOTREQUEST._serialized_start=3546
  _GETSNAPSHOTREQUEST._serialized_end=3627
  _LISTSNAPSHOTSREQUEST._serialized_start=3629
  _LISTSNAPSHOTSREQUEST._serialized_end=3752
  _LISTSNAPSHOTSRESPONSE._serialized_start=3754
  _LISTSNAPSHOTSRESPONSE._serialized_end=3857
  _DELETESNAPSHOTREQUEST._serialized_start=3859
  _DELETESNAPSHOTREQUEST._serialized_end=3943
  _SNAPSHOTTABLEMETADATA._serialized_start=3946
  _SNAPSHOTTABLEMETADATA._serialized_end=4142
  _CREATETABLEFROMSNAPSHOTMETADATA._serialized_start=4145
  _CREATETABLEFROMSNAPSHOTMETADATA._serialized_end=4361
  _CREATEBACKUPREQUEST._serialized_start=4364
  _CREATEBACKUPREQUEST._serialized_end=4526
  _CREATEBACKUPMETADATA._serialized_start=4529
  _CREATEBACKUPMETADATA._serialized_end=4681
  _UPDATEBACKUPREQUEST._serialized_start=4684
  _UPDATEBACKUPREQUEST._serialized_end=4814
  _GETBACKUPREQUEST._serialized_start=4816
  _GETBACKUPREQUEST._serialized_end=4893
  _DELETEBACKUPREQUEST._serialized_start=4895
  _DELETEBACKUPREQUEST._serialized_end=4975
  _LISTBACKUPSREQUEST._serialized_start=4978
  _LISTBACKUPSREQUEST._serialized_end=5133
  _LISTBACKUPSRESPONSE._serialized_start=5135
  _LISTBACKUPSRESPONSE._serialized_end=5232
  _BIGTABLETABLEADMIN._serialized_start=5235
  _BIGTABLETABLEADMIN._serialized_end=10405
# @@protoc_insertion_point(module_scope)
