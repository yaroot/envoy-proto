# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/migration/v2alpha/migration_service.proto
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
from google.cloud.bigquery.migration.v2alpha import migration_entities_pb2 as google_dot_cloud_dot_bigquery_dot_migration_dot_v2alpha_dot_migration__entities__pb2
from google.cloud.bigquery.migration.v2alpha import migration_error_details_pb2 as google_dot_cloud_dot_bigquery_dot_migration_dot_v2alpha_dot_migration__error__details__pb2
from google.cloud.bigquery.migration.v2alpha import migration_metrics_pb2 as google_dot_cloud_dot_bigquery_dot_migration_dot_v2alpha_dot_migration__metrics__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/bigquery/migration/v2alpha/migration_service.proto\x12\'google.cloud.bigquery.migration.v2alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a@google/cloud/bigquery/migration/v2alpha/migration_entities.proto\x1a\x45google/cloud/bigquery/migration/v2alpha/migration_error_details.proto\x1a?google/cloud/bigquery/migration/v2alpha/migration_metrics.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xb8\x01\n\x1e\x43reateMigrationWorkflowRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12[\n\x12migration_workflow\x18\x02 \x01(\x0b\x32:.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowB\x03\xe0\x41\x02\"\x96\x01\n\x1bGetMigrationWorkflowRequest\x12H\n\x04name\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2bigquerymigration.googleapis.com/MigrationWorkflow\x12-\n\tread_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xb0\x01\n\x1dListMigrationWorkflowsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12-\n\tread_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"\x92\x01\n\x1eListMigrationWorkflowsResponse\x12W\n\x13migration_workflows\x18\x01 \x03(\x0b\x32:.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"j\n\x1e\x44\x65leteMigrationWorkflowRequest\x12H\n\x04name\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2bigquerymigration.googleapis.com/MigrationWorkflow\"i\n\x1dStartMigrationWorkflowRequest\x12H\n\x04name\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2bigquerymigration.googleapis.com/MigrationWorkflow\"\x99\x01\n\x1aGetMigrationSubtaskRequest\x12G\n\x04name\x18\x01 \x01(\tB9\xe0\x41\x02\xfa\x41\x33\n1bigquerymigration.googleapis.com/MigrationSubtask\x12\x32\n\tread_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"\xe4\x01\n\x1cListMigrationSubtasksRequest\x12J\n\x06parent\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2bigquerymigration.googleapis.com/MigrationWorkflow\x12\x32\n\tread_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x16\n\tpage_size\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06\x66ilter\x18\x05 \x01(\tB\x03\xe0\x41\x01\"\x8f\x01\n\x1dListMigrationSubtasksResponse\x12U\n\x12migration_subtasks\x18\x01 \x03(\x0b\x32\x39.google.cloud.bigquery.migration.v2alpha.MigrationSubtask\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xaa\r\n\x10MigrationService\x12\x8a\x02\n\x17\x43reateMigrationWorkflow\x12G.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest\x1a:.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow\"j\x82\xd3\xe4\x93\x02H\"2/v2alpha/{parent=projects/*/locations/*}/workflows:\x12migration_workflow\xda\x41\x19parent,migration_workflow\x12\xdb\x01\n\x14GetMigrationWorkflow\x12\x44.google.cloud.bigquery.migration.v2alpha.GetMigrationWorkflowRequest\x1a:.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v2alpha/{name=projects/*/locations/*/workflows/*}\xda\x41\x04name\x12\xee\x01\n\x16ListMigrationWorkflows\x12\x46.google.cloud.bigquery.migration.v2alpha.ListMigrationWorkflowsRequest\x1aG.google.cloud.bigquery.migration.v2alpha.ListMigrationWorkflowsResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v2alpha/{parent=projects/*/locations/*}/workflows\xda\x41\x06parent\x12\xbd\x01\n\x17\x44\x65leteMigrationWorkflow\x12G.google.cloud.bigquery.migration.v2alpha.DeleteMigrationWorkflowRequest\x1a\x16.google.protobuf.Empty\"A\x82\xd3\xe4\x93\x02\x34*2/v2alpha/{name=projects/*/locations/*/workflows/*}\xda\x41\x04name\x12\xc4\x01\n\x16StartMigrationWorkflow\x12\x46.google.cloud.bigquery.migration.v2alpha.StartMigrationWorkflowRequest\x1a\x16.google.protobuf.Empty\"J\x82\xd3\xe4\x93\x02=\"8/v2alpha/{name=projects/*/locations/*/workflows/*}:start:\x01*\xda\x41\x04name\x12\xe3\x01\n\x13GetMigrationSubtask\x12\x43.google.cloud.bigquery.migration.v2alpha.GetMigrationSubtaskRequest\x1a\x39.google.cloud.bigquery.migration.v2alpha.MigrationSubtask\"L\x82\xd3\xe4\x93\x02?\x12=/v2alpha/{name=projects/*/locations/*/workflows/*/subtasks/*}\xda\x41\x04name\x12\xf6\x01\n\x15ListMigrationSubtasks\x12\x45.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksRequest\x1a\x46.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse\"N\x82\xd3\xe4\x93\x02?\x12=/v2alpha/{parent=projects/*/locations/*/workflows/*}/subtasks\xda\x41\x06parent\x1aT\xca\x41 bigquerymigration.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xec\x01\n+com.google.cloud.bigquery.migration.v2alphaB\x15MigrationServiceProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2alpha;migration\xaa\x02\'Google.Cloud.BigQuery.Migration.V2Alpha\xca\x02\'Google\\Cloud\\BigQuery\\Migration\\V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.migration.v2alpha.migration_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.cloud.bigquery.migration.v2alphaB\025MigrationServiceProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2alpha;migration\252\002\'Google.Cloud.BigQuery.Migration.V2Alpha\312\002\'Google\\Cloud\\BigQuery\\Migration\\V2alpha'
  _CREATEMIGRATIONWORKFLOWREQUEST.fields_by_name['parent']._options = None
  _CREATEMIGRATIONWORKFLOWREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEMIGRATIONWORKFLOWREQUEST.fields_by_name['migration_workflow']._options = None
  _CREATEMIGRATIONWORKFLOWREQUEST.fields_by_name['migration_workflow']._serialized_options = b'\340A\002'
  _GETMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._options = None
  _GETMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A4\n2bigquerymigration.googleapis.com/MigrationWorkflow'
  _LISTMIGRATIONWORKFLOWSREQUEST.fields_by_name['parent']._options = None
  _LISTMIGRATIONWORKFLOWSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _DELETEMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._options = None
  _DELETEMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A4\n2bigquerymigration.googleapis.com/MigrationWorkflow'
  _STARTMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._options = None
  _STARTMIGRATIONWORKFLOWREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A4\n2bigquerymigration.googleapis.com/MigrationWorkflow'
  _GETMIGRATIONSUBTASKREQUEST.fields_by_name['name']._options = None
  _GETMIGRATIONSUBTASKREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A3\n1bigquerymigration.googleapis.com/MigrationSubtask'
  _GETMIGRATIONSUBTASKREQUEST.fields_by_name['read_mask']._options = None
  _GETMIGRATIONSUBTASKREQUEST.fields_by_name['read_mask']._serialized_options = b'\340A\001'
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['parent']._options = None
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A4\n2bigquerymigration.googleapis.com/MigrationWorkflow'
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['read_mask']._options = None
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['read_mask']._serialized_options = b'\340A\001'
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['page_size']._options = None
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['page_token']._options = None
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['filter']._options = None
  _LISTMIGRATIONSUBTASKSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\001'
  _MIGRATIONSERVICE._options = None
  _MIGRATIONSERVICE._serialized_options = b'\312A bigquerymigration.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _MIGRATIONSERVICE.methods_by_name['CreateMigrationWorkflow']._options = None
  _MIGRATIONSERVICE.methods_by_name['CreateMigrationWorkflow']._serialized_options = b'\202\323\344\223\002H\"2/v2alpha/{parent=projects/*/locations/*}/workflows:\022migration_workflow\332A\031parent,migration_workflow'
  _MIGRATIONSERVICE.methods_by_name['GetMigrationWorkflow']._options = None
  _MIGRATIONSERVICE.methods_by_name['GetMigrationWorkflow']._serialized_options = b'\202\323\344\223\0024\0222/v2alpha/{name=projects/*/locations/*/workflows/*}\332A\004name'
  _MIGRATIONSERVICE.methods_by_name['ListMigrationWorkflows']._options = None
  _MIGRATIONSERVICE.methods_by_name['ListMigrationWorkflows']._serialized_options = b'\202\323\344\223\0024\0222/v2alpha/{parent=projects/*/locations/*}/workflows\332A\006parent'
  _MIGRATIONSERVICE.methods_by_name['DeleteMigrationWorkflow']._options = None
  _MIGRATIONSERVICE.methods_by_name['DeleteMigrationWorkflow']._serialized_options = b'\202\323\344\223\0024*2/v2alpha/{name=projects/*/locations/*/workflows/*}\332A\004name'
  _MIGRATIONSERVICE.methods_by_name['StartMigrationWorkflow']._options = None
  _MIGRATIONSERVICE.methods_by_name['StartMigrationWorkflow']._serialized_options = b'\202\323\344\223\002=\"8/v2alpha/{name=projects/*/locations/*/workflows/*}:start:\001*\332A\004name'
  _MIGRATIONSERVICE.methods_by_name['GetMigrationSubtask']._options = None
  _MIGRATIONSERVICE.methods_by_name['GetMigrationSubtask']._serialized_options = b'\202\323\344\223\002?\022=/v2alpha/{name=projects/*/locations/*/workflows/*/subtasks/*}\332A\004name'
  _MIGRATIONSERVICE.methods_by_name['ListMigrationSubtasks']._options = None
  _MIGRATIONSERVICE.methods_by_name['ListMigrationSubtasks']._serialized_options = b'\202\323\344\223\002?\022=/v2alpha/{parent=projects/*/locations/*/workflows/*}/subtasks\332A\006parent'
  _CREATEMIGRATIONWORKFLOWREQUEST._serialized_start=489
  _CREATEMIGRATIONWORKFLOWREQUEST._serialized_end=673
  _GETMIGRATIONWORKFLOWREQUEST._serialized_start=676
  _GETMIGRATIONWORKFLOWREQUEST._serialized_end=826
  _LISTMIGRATIONWORKFLOWSREQUEST._serialized_start=829
  _LISTMIGRATIONWORKFLOWSREQUEST._serialized_end=1005
  _LISTMIGRATIONWORKFLOWSRESPONSE._serialized_start=1008
  _LISTMIGRATIONWORKFLOWSRESPONSE._serialized_end=1154
  _DELETEMIGRATIONWORKFLOWREQUEST._serialized_start=1156
  _DELETEMIGRATIONWORKFLOWREQUEST._serialized_end=1262
  _STARTMIGRATIONWORKFLOWREQUEST._serialized_start=1264
  _STARTMIGRATIONWORKFLOWREQUEST._serialized_end=1369
  _GETMIGRATIONSUBTASKREQUEST._serialized_start=1372
  _GETMIGRATIONSUBTASKREQUEST._serialized_end=1525
  _LISTMIGRATIONSUBTASKSREQUEST._serialized_start=1528
  _LISTMIGRATIONSUBTASKSREQUEST._serialized_end=1756
  _LISTMIGRATIONSUBTASKSRESPONSE._serialized_start=1759
  _LISTMIGRATIONSUBTASKSRESPONSE._serialized_end=1902
  _MIGRATIONSERVICE._serialized_start=1905
  _MIGRATIONSERVICE._serialized_end=3611
# @@protoc_insertion_point(module_scope)