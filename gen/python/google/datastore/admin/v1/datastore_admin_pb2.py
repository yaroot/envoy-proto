# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/admin/v1/datastore_admin.proto
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
from google.datastore.admin.v1 import index_pb2 as google_dot_datastore_dot_admin_dot_v1_dot_index__pb2
from google.datastore.admin.v1 import migration_pb2 as google_dot_datastore_dot_admin_dot_v1_dot_migration__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/datastore/admin/v1/datastore_admin.proto\x12\x19google.datastore.admin.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a%google/datastore/admin/v1/index.proto\x1a)google/datastore/admin/v1/migration.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xf4\x03\n\x0e\x43ommonMetadata\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12@\n\x0eoperation_type\x18\x03 \x01(\x0e\x32(.google.datastore.admin.v1.OperationType\x12\x45\n\x06labels\x18\x04 \x03(\x0b\x32\x35.google.datastore.admin.v1.CommonMetadata.LabelsEntry\x12>\n\x05state\x18\x05 \x01(\x0e\x32/.google.datastore.admin.v1.CommonMetadata.State\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x8b\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x10\n\x0cINITIALIZING\x10\x01\x12\x0e\n\nPROCESSING\x10\x02\x12\x0e\n\nCANCELLING\x10\x03\x12\x0e\n\nFINALIZING\x10\x04\x12\x0e\n\nSUCCESSFUL\x10\x05\x12\n\n\x06\x46\x41ILED\x10\x06\x12\r\n\tCANCELLED\x10\x07\":\n\x08Progress\x12\x16\n\x0ework_completed\x18\x01 \x01(\x03\x12\x16\n\x0ework_estimated\x18\x02 \x01(\x03\"\x8d\x02\n\x15\x45xportEntitiesRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12L\n\x06labels\x18\x02 \x03(\x0b\x32<.google.datastore.admin.v1.ExportEntitiesRequest.LabelsEntry\x12>\n\rentity_filter\x18\x03 \x01(\x0b\x32\'.google.datastore.admin.v1.EntityFilter\x12\x1e\n\x11output_url_prefix\x18\x04 \x01(\tB\x03\xe0\x41\x02\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x85\x02\n\x15ImportEntitiesRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12L\n\x06labels\x18\x02 \x03(\x0b\x32<.google.datastore.admin.v1.ImportEntitiesRequest.LabelsEntry\x12\x16\n\tinput_url\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12>\n\rentity_filter\x18\x04 \x01(\x0b\x32\'.google.datastore.admin.v1.EntityFilter\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\",\n\x16\x45xportEntitiesResponse\x12\x12\n\noutput_url\x18\x01 \x01(\t\"\xab\x02\n\x16\x45xportEntitiesMetadata\x12\x39\n\x06\x63ommon\x18\x01 \x01(\x0b\x32).google.datastore.admin.v1.CommonMetadata\x12>\n\x11progress_entities\x18\x02 \x01(\x0b\x32#.google.datastore.admin.v1.Progress\x12;\n\x0eprogress_bytes\x18\x03 \x01(\x0b\x32#.google.datastore.admin.v1.Progress\x12>\n\rentity_filter\x18\x04 \x01(\x0b\x32\'.google.datastore.admin.v1.EntityFilter\x12\x19\n\x11output_url_prefix\x18\x05 \x01(\t\"\xa3\x02\n\x16ImportEntitiesMetadata\x12\x39\n\x06\x63ommon\x18\x01 \x01(\x0b\x32).google.datastore.admin.v1.CommonMetadata\x12>\n\x11progress_entities\x18\x02 \x01(\x0b\x32#.google.datastore.admin.v1.Progress\x12;\n\x0eprogress_bytes\x18\x03 \x01(\x0b\x32#.google.datastore.admin.v1.Progress\x12>\n\rentity_filter\x18\x04 \x01(\x0b\x32\'.google.datastore.admin.v1.EntityFilter\x12\x11\n\tinput_url\x18\x05 \x01(\t\"4\n\x0c\x45ntityFilter\x12\r\n\x05kinds\x18\x01 \x03(\t\x12\x15\n\rnamespace_ids\x18\x02 \x03(\t\"Y\n\x12\x43reateIndexRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12/\n\x05index\x18\x03 \x01(\x0b\x32 .google.datastore.admin.v1.Index\":\n\x12\x44\x65leteIndexRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12\x10\n\x08index_id\x18\x03 \x01(\t\"7\n\x0fGetIndexRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12\x10\n\x08index_id\x18\x03 \x01(\t\"_\n\x12ListIndexesRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x05 \x01(\t\"a\n\x13ListIndexesResponse\x12\x31\n\x07indexes\x18\x01 \x03(\x0b\x32 .google.datastore.admin.v1.Index\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xa5\x01\n\x16IndexOperationMetadata\x12\x39\n\x06\x63ommon\x18\x01 \x01(\x0b\x32).google.datastore.admin.v1.CommonMetadata\x12>\n\x11progress_entities\x18\x02 \x01(\x0b\x32#.google.datastore.admin.v1.Progress\x12\x10\n\x08index_id\x18\x03 \x01(\t\"\xab\x01\n#DatastoreFirestoreMigrationMetadata\x12\x42\n\x0fmigration_state\x18\x01 \x01(\x0e\x32).google.datastore.admin.v1.MigrationState\x12@\n\x0emigration_step\x18\x02 \x01(\x0e\x32(.google.datastore.admin.v1.MigrationStep*}\n\rOperationType\x12\x1e\n\x1aOPERATION_TYPE_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x45XPORT_ENTITIES\x10\x01\x12\x13\n\x0fIMPORT_ENTITIES\x10\x02\x12\x10\n\x0c\x43REATE_INDEX\x10\x03\x12\x10\n\x0c\x44\x45LETE_INDEX\x10\x04\x32\x84\n\n\x0e\x44\x61tastoreAdmin\x12\xf6\x01\n\x0e\x45xportEntities\x12\x30.google.datastore.admin.v1.ExportEntitiesRequest\x1a\x1d.google.longrunning.Operation\"\x92\x01\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:export:\x01*\xda\x41\x31project_id,labels,entity_filter,output_url_prefix\xca\x41\x30\n\x16\x45xportEntitiesResponse\x12\x16\x45xportEntitiesMetadata\x12\xed\x01\n\x0eImportEntities\x12\x30.google.datastore.admin.v1.ImportEntitiesRequest\x1a\x1d.google.longrunning.Operation\"\x89\x01\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:import:\x01*\xda\x41)project_id,labels,input_url,entity_filter\xca\x41/\n\x15google.protobuf.Empty\x12\x16ImportEntitiesMetadata\x12\xaf\x01\n\x0b\x43reateIndex\x12-.google.datastore.admin.v1.CreateIndexRequest\x1a\x1d.google.longrunning.Operation\"R\x82\xd3\xe4\x93\x02*\"!/v1/projects/{project_id}/indexes:\x05index\xca\x41\x1f\n\x05Index\x12\x16IndexOperationMetadata\x12\xb3\x01\n\x0b\x44\x65leteIndex\x12-.google.datastore.admin.v1.DeleteIndexRequest\x1a\x1d.google.longrunning.Operation\"V\x82\xd3\xe4\x93\x02.*,/v1/projects/{project_id}/indexes/{index_id}\xca\x41\x1f\n\x05Index\x12\x16IndexOperationMetadata\x12\x8e\x01\n\x08GetIndex\x12*.google.datastore.admin.v1.GetIndexRequest\x1a .google.datastore.admin.v1.Index\"4\x82\xd3\xe4\x93\x02.\x12,/v1/projects/{project_id}/indexes/{index_id}\x12\x97\x01\n\x0bListIndexes\x12-.google.datastore.admin.v1.ListIndexesRequest\x1a..google.datastore.admin.v1.ListIndexesResponse\")\x82\xd3\xe4\x93\x02#\x12!/v1/projects/{project_id}/indexes\x1av\xca\x41\x18\x64\x61tastore.googleapis.com\xd2\x41Xhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastoreB\xe0\x01\n\x1d\x63om.google.datastore.admin.v1B\x13\x44\x61tastoreAdminProtoP\x01Z>google.golang.org/genproto/googleapis/datastore/admin/v1;admin\xaa\x02\x1fGoogle.Cloud.Datastore.Admin.V1\xca\x02\x1fGoogle\\Cloud\\Datastore\\Admin\\V1\xea\x02#Google::Cloud::Datastore::Admin::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.admin.v1.datastore_admin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.datastore.admin.v1B\023DatastoreAdminProtoP\001Z>google.golang.org/genproto/googleapis/datastore/admin/v1;admin\252\002\037Google.Cloud.Datastore.Admin.V1\312\002\037Google\\Cloud\\Datastore\\Admin\\V1\352\002#Google::Cloud::Datastore::Admin::V1'
  _COMMONMETADATA_LABELSENTRY._options = None
  _COMMONMETADATA_LABELSENTRY._serialized_options = b'8\001'
  _EXPORTENTITIESREQUEST_LABELSENTRY._options = None
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _EXPORTENTITIESREQUEST.fields_by_name['project_id']._options = None
  _EXPORTENTITIESREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _EXPORTENTITIESREQUEST.fields_by_name['output_url_prefix']._options = None
  _EXPORTENTITIESREQUEST.fields_by_name['output_url_prefix']._serialized_options = b'\340A\002'
  _IMPORTENTITIESREQUEST_LABELSENTRY._options = None
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _IMPORTENTITIESREQUEST.fields_by_name['project_id']._options = None
  _IMPORTENTITIESREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _IMPORTENTITIESREQUEST.fields_by_name['input_url']._options = None
  _IMPORTENTITIESREQUEST.fields_by_name['input_url']._serialized_options = b'\340A\002'
  _DATASTOREADMIN._options = None
  _DATASTOREADMIN._serialized_options = b'\312A\030datastore.googleapis.com\322AXhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastore'
  _DATASTOREADMIN.methods_by_name['ExportEntities']._options = None
  _DATASTOREADMIN.methods_by_name['ExportEntities']._serialized_options = b'\202\323\344\223\002%\" /v1/projects/{project_id}:export:\001*\332A1project_id,labels,entity_filter,output_url_prefix\312A0\n\026ExportEntitiesResponse\022\026ExportEntitiesMetadata'
  _DATASTOREADMIN.methods_by_name['ImportEntities']._options = None
  _DATASTOREADMIN.methods_by_name['ImportEntities']._serialized_options = b'\202\323\344\223\002%\" /v1/projects/{project_id}:import:\001*\332A)project_id,labels,input_url,entity_filter\312A/\n\025google.protobuf.Empty\022\026ImportEntitiesMetadata'
  _DATASTOREADMIN.methods_by_name['CreateIndex']._options = None
  _DATASTOREADMIN.methods_by_name['CreateIndex']._serialized_options = b'\202\323\344\223\002*\"!/v1/projects/{project_id}/indexes:\005index\312A\037\n\005Index\022\026IndexOperationMetadata'
  _DATASTOREADMIN.methods_by_name['DeleteIndex']._options = None
  _DATASTOREADMIN.methods_by_name['DeleteIndex']._serialized_options = b'\202\323\344\223\002.*,/v1/projects/{project_id}/indexes/{index_id}\312A\037\n\005Index\022\026IndexOperationMetadata'
  _DATASTOREADMIN.methods_by_name['GetIndex']._options = None
  _DATASTOREADMIN.methods_by_name['GetIndex']._serialized_options = b'\202\323\344\223\002.\022,/v1/projects/{project_id}/indexes/{index_id}'
  _DATASTOREADMIN.methods_by_name['ListIndexes']._options = None
  _DATASTOREADMIN.methods_by_name['ListIndexes']._serialized_options = b'\202\323\344\223\002#\022!/v1/projects/{project_id}/indexes'
  _OPERATIONTYPE._serialized_start=2859
  _OPERATIONTYPE._serialized_end=2984
  _COMMONMETADATA._serialized_start=319
  _COMMONMETADATA._serialized_end=819
  _COMMONMETADATA_LABELSENTRY._serialized_start=632
  _COMMONMETADATA_LABELSENTRY._serialized_end=677
  _COMMONMETADATA_STATE._serialized_start=680
  _COMMONMETADATA_STATE._serialized_end=819
  _PROGRESS._serialized_start=821
  _PROGRESS._serialized_end=879
  _EXPORTENTITIESREQUEST._serialized_start=882
  _EXPORTENTITIESREQUEST._serialized_end=1151
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_start=632
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_end=677
  _IMPORTENTITIESREQUEST._serialized_start=1154
  _IMPORTENTITIESREQUEST._serialized_end=1415
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_start=632
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_end=677
  _EXPORTENTITIESRESPONSE._serialized_start=1417
  _EXPORTENTITIESRESPONSE._serialized_end=1461
  _EXPORTENTITIESMETADATA._serialized_start=1464
  _EXPORTENTITIESMETADATA._serialized_end=1763
  _IMPORTENTITIESMETADATA._serialized_start=1766
  _IMPORTENTITIESMETADATA._serialized_end=2057
  _ENTITYFILTER._serialized_start=2059
  _ENTITYFILTER._serialized_end=2111
  _CREATEINDEXREQUEST._serialized_start=2113
  _CREATEINDEXREQUEST._serialized_end=2202
  _DELETEINDEXREQUEST._serialized_start=2204
  _DELETEINDEXREQUEST._serialized_end=2262
  _GETINDEXREQUEST._serialized_start=2264
  _GETINDEXREQUEST._serialized_end=2319
  _LISTINDEXESREQUEST._serialized_start=2321
  _LISTINDEXESREQUEST._serialized_end=2416
  _LISTINDEXESRESPONSE._serialized_start=2418
  _LISTINDEXESRESPONSE._serialized_end=2515
  _INDEXOPERATIONMETADATA._serialized_start=2518
  _INDEXOPERATIONMETADATA._serialized_end=2683
  _DATASTOREFIRESTOREMIGRATIONMETADATA._serialized_start=2686
  _DATASTOREFIRESTOREMIGRATIONMETADATA._serialized_end=2857
  _DATASTOREADMIN._serialized_start=2987
  _DATASTOREADMIN._serialized_end=4271
# @@protoc_insertion_point(module_scope)
