# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/artifact.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/aiplatform/v1/artifact.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x94\x05\n\x08\x41rtifact\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x0b\n\x03uri\x18\x06 \x01(\t\x12\x0c\n\x04\x65tag\x18\t \x01(\t\x12@\n\x06labels\x18\n \x03(\x0b\x32\x30.google.cloud.aiplatform.v1.Artifact.LabelsEntry\x12\x34\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x39\n\x05state\x18\r \x01(\x0e\x32*.google.cloud.aiplatform.v1.Artifact.State\x12\x14\n\x0cschema_title\x18\x0e \x01(\t\x12\x16\n\x0eschema_version\x18\x0f \x01(\t\x12)\n\x08metadata\x18\x10 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x13\n\x0b\x64\x65scription\x18\x11 \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"5\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x08\n\x04LIVE\x10\x02:\x86\x01\xea\x41\x82\x01\n\"aiplatform.googleapis.com/Artifact\x12\\projects/{project}/locations/{location}/metadataStores/{metadata_store}/artifacts/{artifact}B\xd1\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\rArtifactProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.artifact_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\rArtifactProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _ARTIFACT_LABELSENTRY._options = None
  _ARTIFACT_LABELSENTRY._serialized_options = b'8\001'
  _ARTIFACT.fields_by_name['name']._options = None
  _ARTIFACT.fields_by_name['name']._serialized_options = b'\340A\003'
  _ARTIFACT.fields_by_name['create_time']._options = None
  _ARTIFACT.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ARTIFACT.fields_by_name['update_time']._options = None
  _ARTIFACT.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ARTIFACT._options = None
  _ARTIFACT._serialized_options = b'\352A\202\001\n\"aiplatform.googleapis.com/Artifact\022\\projects/{project}/locations/{location}/metadataStores/{metadata_store}/artifacts/{artifact}'
  _ARTIFACT._serialized_start=197
  _ARTIFACT._serialized_end=857
  _ARTIFACT_LABELSENTRY._serialized_start=620
  _ARTIFACT_LABELSENTRY._serialized_end=665
  _ARTIFACT_STATE._serialized_start=667
  _ARTIFACT_STATE._serialized_end=720
# @@protoc_insertion_point(module_scope)