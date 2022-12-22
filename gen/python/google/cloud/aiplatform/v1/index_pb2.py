# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/index.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1 import deployed_index_ref_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_deployed__index__ref__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/cloud/aiplatform/v1/index.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x33google/cloud/aiplatform/v1/deployed_index_ref.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa2\x06\n\x05Index\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12 \n\x13metadata_schema_uri\x18\x04 \x01(\tB\x03\xe0\x41\x05\x12(\n\x08metadata\x18\x06 \x01(\x0b\x32\x16.google.protobuf.Value\x12K\n\x10\x64\x65ployed_indexes\x18\x07 \x03(\x0b\x32,.google.cloud.aiplatform.v1.DeployedIndexRefB\x03\xe0\x41\x03\x12\x0c\n\x04\x65tag\x18\x08 \x01(\t\x12=\n\x06labels\x18\t \x03(\x0b\x32-.google.cloud.aiplatform.v1.Index.LabelsEntry\x12\x34\n\x0b\x63reate_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12@\n\x0bindex_stats\x18\x0e \x01(\x0b\x32&.google.cloud.aiplatform.v1.IndexStatsB\x03\xe0\x41\x03\x12U\n\x13index_update_method\x18\x10 \x01(\x0e\x32\x33.google.cloud.aiplatform.v1.Index.IndexUpdateMethodB\x03\xe0\x41\x05\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"]\n\x11IndexUpdateMethod\x12#\n\x1fINDEX_UPDATE_METHOD_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x42\x41TCH_UPDATE\x10\x01\x12\x11\n\rSTREAM_UPDATE\x10\x02:]\xea\x41Z\n\x1f\x61iplatform.googleapis.com/Index\x12\x37projects/{project}/locations/{location}/indexes/{index}\"\xdf\x02\n\x0eIndexDatapoint\x12\x19\n\x0c\x64\x61tapoint_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1b\n\x0e\x66\x65\x61ture_vector\x18\x02 \x03(\x02\x42\x03\xe0\x41\x02\x12N\n\trestricts\x18\x04 \x03(\x0b\x32\x36.google.cloud.aiplatform.v1.IndexDatapoint.RestrictionB\x03\xe0\x41\x01\x12Q\n\x0c\x63rowding_tag\x18\x05 \x01(\x0b\x32\x36.google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTagB\x03\xe0\x41\x01\x1aG\n\x0bRestriction\x12\x11\n\tnamespace\x18\x01 \x01(\t\x12\x12\n\nallow_list\x18\x02 \x03(\t\x12\x11\n\tdeny_list\x18\x03 \x03(\t\x1a)\n\x0b\x43rowdingTag\x12\x1a\n\x12\x63rowding_attribute\x18\x01 \x01(\t\"C\n\nIndexStats\x12\x1a\n\rvectors_count\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03\x12\x19\n\x0cshards_count\x18\x02 \x01(\x05\x42\x03\xe0\x41\x03\x42\xce\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\nIndexProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.index_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\nIndexProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _INDEX_LABELSENTRY._options = None
  _INDEX_LABELSENTRY._serialized_options = b'8\001'
  _INDEX.fields_by_name['name']._options = None
  _INDEX.fields_by_name['name']._serialized_options = b'\340A\003'
  _INDEX.fields_by_name['display_name']._options = None
  _INDEX.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _INDEX.fields_by_name['metadata_schema_uri']._options = None
  _INDEX.fields_by_name['metadata_schema_uri']._serialized_options = b'\340A\005'
  _INDEX.fields_by_name['deployed_indexes']._options = None
  _INDEX.fields_by_name['deployed_indexes']._serialized_options = b'\340A\003'
  _INDEX.fields_by_name['create_time']._options = None
  _INDEX.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _INDEX.fields_by_name['update_time']._options = None
  _INDEX.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _INDEX.fields_by_name['index_stats']._options = None
  _INDEX.fields_by_name['index_stats']._serialized_options = b'\340A\003'
  _INDEX.fields_by_name['index_update_method']._options = None
  _INDEX.fields_by_name['index_update_method']._serialized_options = b'\340A\005'
  _INDEX._options = None
  _INDEX._serialized_options = b'\352AZ\n\037aiplatform.googleapis.com/Index\0227projects/{project}/locations/{location}/indexes/{index}'
  _INDEXDATAPOINT.fields_by_name['datapoint_id']._options = None
  _INDEXDATAPOINT.fields_by_name['datapoint_id']._serialized_options = b'\340A\002'
  _INDEXDATAPOINT.fields_by_name['feature_vector']._options = None
  _INDEXDATAPOINT.fields_by_name['feature_vector']._serialized_options = b'\340A\002'
  _INDEXDATAPOINT.fields_by_name['restricts']._options = None
  _INDEXDATAPOINT.fields_by_name['restricts']._serialized_options = b'\340A\001'
  _INDEXDATAPOINT.fields_by_name['crowding_tag']._options = None
  _INDEXDATAPOINT.fields_by_name['crowding_tag']._serialized_options = b'\340A\001'
  _INDEXSTATS.fields_by_name['vectors_count']._options = None
  _INDEXSTATS.fields_by_name['vectors_count']._serialized_options = b'\340A\003'
  _INDEXSTATS.fields_by_name['shards_count']._options = None
  _INDEXSTATS.fields_by_name['shards_count']._serialized_options = b'\340A\003'
  _INDEX._serialized_start=247
  _INDEX._serialized_end=1049
  _INDEX_LABELSENTRY._serialized_start=814
  _INDEX_LABELSENTRY._serialized_end=859
  _INDEX_INDEXUPDATEMETHOD._serialized_start=861
  _INDEX_INDEXUPDATEMETHOD._serialized_end=954
  _INDEXDATAPOINT._serialized_start=1052
  _INDEXDATAPOINT._serialized_end=1403
  _INDEXDATAPOINT_RESTRICTION._serialized_start=1289
  _INDEXDATAPOINT_RESTRICTION._serialized_end=1360
  _INDEXDATAPOINT_CROWDINGTAG._serialized_start=1362
  _INDEXDATAPOINT_CROWDINGTAG._serialized_end=1403
  _INDEXSTATS._serialized_start=1405
  _INDEXSTATS._serialized_end=1472
# @@protoc_insertion_point(module_scope)