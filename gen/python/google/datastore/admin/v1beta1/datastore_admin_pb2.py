# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/admin/v1beta1/datastore_admin.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/datastore/admin/v1beta1/datastore_admin.proto\x12\x1egoogle.datastore.admin.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x83\x04\n\x0e\x43ommonMetadata\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x45\n\x0eoperation_type\x18\x03 \x01(\x0e\x32-.google.datastore.admin.v1beta1.OperationType\x12J\n\x06labels\x18\x04 \x03(\x0b\x32:.google.datastore.admin.v1beta1.CommonMetadata.LabelsEntry\x12\x43\n\x05state\x18\x05 \x01(\x0e\x32\x34.google.datastore.admin.v1beta1.CommonMetadata.State\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x8b\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x10\n\x0cINITIALIZING\x10\x01\x12\x0e\n\nPROCESSING\x10\x02\x12\x0e\n\nCANCELLING\x10\x03\x12\x0e\n\nFINALIZING\x10\x04\x12\x0e\n\nSUCCESSFUL\x10\x05\x12\n\n\x06\x46\x41ILED\x10\x06\x12\r\n\tCANCELLED\x10\x07\":\n\x08Progress\x12\x16\n\x0ework_completed\x18\x01 \x01(\x03\x12\x16\n\x0ework_estimated\x18\x02 \x01(\x03\"\x8d\x02\n\x15\x45xportEntitiesRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12Q\n\x06labels\x18\x02 \x03(\x0b\x32\x41.google.datastore.admin.v1beta1.ExportEntitiesRequest.LabelsEntry\x12\x43\n\rentity_filter\x18\x03 \x01(\x0b\x32,.google.datastore.admin.v1beta1.EntityFilter\x12\x19\n\x11output_url_prefix\x18\x04 \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x85\x02\n\x15ImportEntitiesRequest\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12Q\n\x06labels\x18\x02 \x03(\x0b\x32\x41.google.datastore.admin.v1beta1.ImportEntitiesRequest.LabelsEntry\x12\x11\n\tinput_url\x18\x03 \x01(\t\x12\x43\n\rentity_filter\x18\x04 \x01(\x0b\x32,.google.datastore.admin.v1beta1.EntityFilter\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\",\n\x16\x45xportEntitiesResponse\x12\x12\n\noutput_url\x18\x01 \x01(\t\"\xbf\x02\n\x16\x45xportEntitiesMetadata\x12>\n\x06\x63ommon\x18\x01 \x01(\x0b\x32..google.datastore.admin.v1beta1.CommonMetadata\x12\x43\n\x11progress_entities\x18\x02 \x01(\x0b\x32(.google.datastore.admin.v1beta1.Progress\x12@\n\x0eprogress_bytes\x18\x03 \x01(\x0b\x32(.google.datastore.admin.v1beta1.Progress\x12\x43\n\rentity_filter\x18\x04 \x01(\x0b\x32,.google.datastore.admin.v1beta1.EntityFilter\x12\x19\n\x11output_url_prefix\x18\x05 \x01(\t\"\xb7\x02\n\x16ImportEntitiesMetadata\x12>\n\x06\x63ommon\x18\x01 \x01(\x0b\x32..google.datastore.admin.v1beta1.CommonMetadata\x12\x43\n\x11progress_entities\x18\x02 \x01(\x0b\x32(.google.datastore.admin.v1beta1.Progress\x12@\n\x0eprogress_bytes\x18\x03 \x01(\x0b\x32(.google.datastore.admin.v1beta1.Progress\x12\x43\n\rentity_filter\x18\x04 \x01(\x0b\x32,.google.datastore.admin.v1beta1.EntityFilter\x12\x11\n\tinput_url\x18\x05 \x01(\t\"4\n\x0c\x45ntityFilter\x12\r\n\x05kinds\x18\x01 \x03(\t\x12\x15\n\rnamespace_ids\x18\x02 \x03(\t*Y\n\rOperationType\x12\x1e\n\x1aOPERATION_TYPE_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x45XPORT_ENTITIES\x10\x01\x12\x13\n\x0fIMPORT_ENTITIES\x10\x02\x32\xc6\x02\n\x0e\x44\x61tastoreAdmin\x12\x98\x01\n\x0e\x45xportEntities\x12\x35.google.datastore.admin.v1beta1.ExportEntitiesRequest\x1a\x1d.google.longrunning.Operation\"0\x82\xd3\xe4\x93\x02*\"%/v1beta1/projects/{project_id}:export:\x01*\x12\x98\x01\n\x0eImportEntities\x12\x35.google.datastore.admin.v1beta1.ImportEntitiesRequest\x1a\x1d.google.longrunning.Operation\"0\x82\xd3\xe4\x93\x02*\"%/v1beta1/projects/{project_id}:import:\x01*B\xd2\x01\n\"com.google.datastore.admin.v1beta1B\x13\x44\x61tastoreAdminProtoP\x01ZCgoogle.golang.org/genproto/googleapis/datastore/admin/v1beta1;admin\xaa\x02$Google.Cloud.Datastore.Admin.V1Beta1\xea\x02(Google::Cloud::Datastore::Admin::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.admin.v1beta1.datastore_admin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.datastore.admin.v1beta1B\023DatastoreAdminProtoP\001ZCgoogle.golang.org/genproto/googleapis/datastore/admin/v1beta1;admin\252\002$Google.Cloud.Datastore.Admin.V1Beta1\352\002(Google::Cloud::Datastore::Admin::V1beta1'
  _COMMONMETADATA_LABELSENTRY._options = None
  _COMMONMETADATA_LABELSENTRY._serialized_options = b'8\001'
  _EXPORTENTITIESREQUEST_LABELSENTRY._options = None
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _IMPORTENTITIESREQUEST_LABELSENTRY._options = None
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _DATASTOREADMIN.methods_by_name['ExportEntities']._options = None
  _DATASTOREADMIN.methods_by_name['ExportEntities']._serialized_options = b'\202\323\344\223\002*\"%/v1beta1/projects/{project_id}:export:\001*'
  _DATASTOREADMIN.methods_by_name['ImportEntities']._options = None
  _DATASTOREADMIN.methods_by_name['ImportEntities']._serialized_options = b'\202\323\344\223\002*\"%/v1beta1/projects/{project_id}:import:\001*'
  _OPERATIONTYPE._serialized_start=2038
  _OPERATIONTYPE._serialized_end=2127
  _COMMONMETADATA._serialized_start=189
  _COMMONMETADATA._serialized_end=704
  _COMMONMETADATA_LABELSENTRY._serialized_start=517
  _COMMONMETADATA_LABELSENTRY._serialized_end=562
  _COMMONMETADATA_STATE._serialized_start=565
  _COMMONMETADATA_STATE._serialized_end=704
  _PROGRESS._serialized_start=706
  _PROGRESS._serialized_end=764
  _EXPORTENTITIESREQUEST._serialized_start=767
  _EXPORTENTITIESREQUEST._serialized_end=1036
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_start=517
  _EXPORTENTITIESREQUEST_LABELSENTRY._serialized_end=562
  _IMPORTENTITIESREQUEST._serialized_start=1039
  _IMPORTENTITIESREQUEST._serialized_end=1300
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_start=517
  _IMPORTENTITIESREQUEST_LABELSENTRY._serialized_end=562
  _EXPORTENTITIESRESPONSE._serialized_start=1302
  _EXPORTENTITIESRESPONSE._serialized_end=1346
  _EXPORTENTITIESMETADATA._serialized_start=1349
  _EXPORTENTITIESMETADATA._serialized_end=1668
  _IMPORTENTITIESMETADATA._serialized_start=1671
  _IMPORTENTITIESMETADATA._serialized_end=1982
  _ENTITYFILTER._serialized_start=1984
  _ENTITYFILTER._serialized_end=2036
  _DATASTOREADMIN._serialized_start=2130
  _DATASTOREADMIN._serialized_end=2456
# @@protoc_insertion_point(module_scope)