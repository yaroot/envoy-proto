# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/apigeeconnect/v1/connection.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/apigeeconnect/v1/connection.proto\x12\x1dgoogle.cloud.apigeeconnect.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"~\n\x16ListConnectionsRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%apigeeconnect.googleapis.com/Endpoint\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"r\n\x17ListConnectionsResponse\x12>\n\x0b\x63onnections\x18\x01 \x03(\x0b\x32).google.cloud.apigeeconnect.v1.Connection\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"m\n\nConnection\x12\x10\n\x08\x65ndpoint\x18\x01 \x01(\t\x12\x37\n\x07\x63luster\x18\x02 \x01(\x0b\x32&.google.cloud.apigeeconnect.v1.Cluster\x12\x14\n\x0cstream_count\x18\x03 \x01(\x05\"\'\n\x07\x43luster\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06region\x18\x02 \x01(\t2\xaa\x02\n\x11\x43onnectionService\x12\xc2\x01\n\x0fListConnections\x12\x35.google.cloud.apigeeconnect.v1.ListConnectionsRequest\x1a\x36.google.cloud.apigeeconnect.v1.ListConnectionsResponse\"@\x82\xd3\xe4\x93\x02\x31\x12//v1/{parent=projects/*/endpoints/*}/connections\xda\x41\x06parent\x1aP\xca\x41\x1c\x61pigeeconnect.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xb8\x02\n!com.google.cloud.apigeeconnect.v1B\x0f\x43onnectionProtoP\x01ZJgoogle.golang.org/genproto/googleapis/cloud/apigeeconnect/v1;apigeeconnect\xaa\x02\x1dGoogle.Cloud.ApigeeConnect.V1\xca\x02\x1dGoogle\\Cloud\\ApigeeConnect\\V1\xea\x02 Google::Cloud::ApigeeConnect::V1\xea\x41P\n%apigeeconnect.googleapis.com/Endpoint\x12\'projects/{project}/endpoints/{endpoint}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.apigeeconnect.v1.connection_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.apigeeconnect.v1B\017ConnectionProtoP\001ZJgoogle.golang.org/genproto/googleapis/cloud/apigeeconnect/v1;apigeeconnect\252\002\035Google.Cloud.ApigeeConnect.V1\312\002\035Google\\Cloud\\ApigeeConnect\\V1\352\002 Google::Cloud::ApigeeConnect::V1\352AP\n%apigeeconnect.googleapis.com/Endpoint\022\'projects/{project}/endpoints/{endpoint}'
  _LISTCONNECTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTCONNECTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%apigeeconnect.googleapis.com/Endpoint'
  _CONNECTIONSERVICE._options = None
  _CONNECTIONSERVICE._serialized_options = b'\312A\034apigeeconnect.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CONNECTIONSERVICE.methods_by_name['ListConnections']._options = None
  _CONNECTIONSERVICE.methods_by_name['ListConnections']._serialized_options = b'\202\323\344\223\0021\022//v1/{parent=projects/*/endpoints/*}/connections\332A\006parent'
  _LISTCONNECTIONSREQUEST._serialized_start=196
  _LISTCONNECTIONSREQUEST._serialized_end=322
  _LISTCONNECTIONSRESPONSE._serialized_start=324
  _LISTCONNECTIONSRESPONSE._serialized_end=438
  _CONNECTION._serialized_start=440
  _CONNECTION._serialized_end=549
  _CLUSTER._serialized_start=551
  _CLUSTER._serialized_end=590
  _CONNECTIONSERVICE._serialized_start=593
  _CONNECTIONSERVICE._serialized_end=891
# @@protoc_insertion_point(module_scope)
