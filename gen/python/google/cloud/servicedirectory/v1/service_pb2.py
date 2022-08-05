# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/servicedirectory/v1/service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.servicedirectory.v1 import endpoint_pb2 as google_dot_cloud_dot_servicedirectory_dot_v1_dot_endpoint__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/servicedirectory/v1/service.proto\x12 google.cloud.servicedirectory.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a/google/cloud/servicedirectory/v1/endpoint.proto\"\xeb\x02\n\x07Service\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12T\n\x0b\x61nnotations\x18\x04 \x03(\x0b\x32:.google.cloud.servicedirectory.v1.Service.AnnotationsEntryB\x03\xe0\x41\x01\x12\x42\n\tendpoints\x18\x03 \x03(\x0b\x32*.google.cloud.servicedirectory.v1.EndpointB\x03\xe0\x41\x03\x1a\x32\n\x10\x41nnotationsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x7f\xea\x41|\n\'servicedirectory.googleapis.com/Service\x12Qprojects/{project}/locations/{location}/namespaces/{namespace}/services/{service}B\xf7\x01\n$com.google.cloud.servicedirectory.v1B\x0cServiceProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1;servicedirectory\xf8\x01\x01\xaa\x02 Google.Cloud.ServiceDirectory.V1\xca\x02 Google\\Cloud\\ServiceDirectory\\V1\xea\x02#Google::Cloud::ServiceDirectory::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.servicedirectory.v1.service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.servicedirectory.v1B\014ServiceProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1;servicedirectory\370\001\001\252\002 Google.Cloud.ServiceDirectory.V1\312\002 Google\\Cloud\\ServiceDirectory\\V1\352\002#Google::Cloud::ServiceDirectory::V1'
  _SERVICE_ANNOTATIONSENTRY._options = None
  _SERVICE_ANNOTATIONSENTRY._serialized_options = b'8\001'
  _SERVICE.fields_by_name['name']._options = None
  _SERVICE.fields_by_name['name']._serialized_options = b'\340A\005'
  _SERVICE.fields_by_name['annotations']._options = None
  _SERVICE.fields_by_name['annotations']._serialized_options = b'\340A\001'
  _SERVICE.fields_by_name['endpoints']._options = None
  _SERVICE.fields_by_name['endpoints']._serialized_options = b'\340A\003'
  _SERVICE._options = None
  _SERVICE._serialized_options = b'\352A|\n\'servicedirectory.googleapis.com/Service\022Qprojects/{project}/locations/{location}/namespaces/{namespace}/services/{service}'
  _SERVICE._serialized_start=194
  _SERVICE._serialized_end=557
  _SERVICE_ANNOTATIONSENTRY._serialized_start=378
  _SERVICE_ANNOTATIONSENTRY._serialized_end=428
# @@protoc_insertion_point(module_scope)
