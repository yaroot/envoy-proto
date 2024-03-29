# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/event_service.proto
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
from google.cloud.talent.v4 import event_pb2 as google_dot_cloud_dot_talent_dot_v4_dot_event__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/talent/v4/event_service.proto\x12\x16google.cloud.talent.v4\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\"google/cloud/talent/v4/event.proto\"\x8e\x01\n\x18\x43reateClientEventRequest\x12\x32\n\x06parent\x18\x01 \x01(\tB\"\xe0\x41\x02\xfa\x41\x1c\n\x1ajobs.googleapis.com/Tenant\x12>\n\x0c\x63lient_event\x18\x02 \x01(\x0b\x32#.google.cloud.talent.v4.ClientEventB\x03\xe0\x41\x02\x32\xc5\x02\n\x0c\x45ventService\x12\xc6\x01\n\x11\x43reateClientEvent\x12\x30.google.cloud.talent.v4.CreateClientEventRequest\x1a#.google.cloud.talent.v4.ClientEvent\"Z\x82\xd3\xe4\x93\x02>\"./v4/{parent=projects/*/tenants/*}/clientEvents:\x0c\x63lient_event\xda\x41\x13parent,client_event\x1al\xca\x41\x13jobs.googleapis.com\xd2\x41Shttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobsBu\n\x1a\x63om.google.cloud.talent.v4B\x11\x45ventServiceProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4.event_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.talent.v4B\021EventServiceProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS'
  _CREATECLIENTEVENTREQUEST.fields_by_name['parent']._options = None
  _CREATECLIENTEVENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\034\n\032jobs.googleapis.com/Tenant'
  _CREATECLIENTEVENTREQUEST.fields_by_name['client_event']._options = None
  _CREATECLIENTEVENTREQUEST.fields_by_name['client_event']._serialized_options = b'\340A\002'
  _EVENTSERVICE._options = None
  _EVENTSERVICE._serialized_options = b'\312A\023jobs.googleapis.com\322AShttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobs'
  _EVENTSERVICE.methods_by_name['CreateClientEvent']._options = None
  _EVENTSERVICE.methods_by_name['CreateClientEvent']._serialized_options = b'\202\323\344\223\002>\"./v4/{parent=projects/*/tenants/*}/clientEvents:\014client_event\332A\023parent,client_event'
  _CREATECLIENTEVENTREQUEST._serialized_start=222
  _CREATECLIENTEVENTREQUEST._serialized_end=364
  _EVENTSERVICE._serialized_start=367
  _EVENTSERVICE._serialized_end=692
# @@protoc_insertion_point(module_scope)
