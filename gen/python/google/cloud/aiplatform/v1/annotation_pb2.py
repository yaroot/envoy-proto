# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/annotation.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1 import user_action_reference_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_user__action__reference__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/aiplatform/v1/annotation.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x36google/cloud/aiplatform/v1/user_action_reference.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xce\x04\n\nAnnotation\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1f\n\x12payload_schema_uri\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12,\n\x07payload\x18\x03 \x01(\x0b\x32\x16.google.protobuf.ValueB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x11\n\x04\x65tag\x18\x08 \x01(\tB\x03\xe0\x41\x01\x12O\n\x11\x61nnotation_source\x18\x05 \x01(\x0b\x32/.google.cloud.aiplatform.v1.UserActionReferenceB\x03\xe0\x41\x03\x12G\n\x06labels\x18\x06 \x03(\x0b\x32\x32.google.cloud.aiplatform.v1.Annotation.LabelsEntryB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x95\x01\xea\x41\x91\x01\n$aiplatform.googleapis.com/Annotation\x12iprojects/{project}/locations/{location}/datasets/{dataset}/dataItems/{data_item}/annotations/{annotation}B\xd3\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x0f\x41nnotationProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.annotation_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\017AnnotationProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _ANNOTATION_LABELSENTRY._options = None
  _ANNOTATION_LABELSENTRY._serialized_options = b'8\001'
  _ANNOTATION.fields_by_name['name']._options = None
  _ANNOTATION.fields_by_name['name']._serialized_options = b'\340A\003'
  _ANNOTATION.fields_by_name['payload_schema_uri']._options = None
  _ANNOTATION.fields_by_name['payload_schema_uri']._serialized_options = b'\340A\002'
  _ANNOTATION.fields_by_name['payload']._options = None
  _ANNOTATION.fields_by_name['payload']._serialized_options = b'\340A\002'
  _ANNOTATION.fields_by_name['create_time']._options = None
  _ANNOTATION.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ANNOTATION.fields_by_name['update_time']._options = None
  _ANNOTATION.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ANNOTATION.fields_by_name['etag']._options = None
  _ANNOTATION.fields_by_name['etag']._serialized_options = b'\340A\001'
  _ANNOTATION.fields_by_name['annotation_source']._options = None
  _ANNOTATION.fields_by_name['annotation_source']._serialized_options = b'\340A\003'
  _ANNOTATION.fields_by_name['labels']._options = None
  _ANNOTATION.fields_by_name['labels']._serialized_options = b'\340A\001'
  _ANNOTATION._options = None
  _ANNOTATION._serialized_options = b'\352A\221\001\n$aiplatform.googleapis.com/Annotation\022iprojects/{project}/locations/{location}/datasets/{dataset}/dataItems/{data_item}/annotations/{annotation}'
  _ANNOTATION._serialized_start=255
  _ANNOTATION._serialized_end=845
  _ANNOTATION_LABELSENTRY._serialized_start=648
  _ANNOTATION_LABELSENTRY._serialized_end=693
# @@protoc_insertion_point(module_scope)
