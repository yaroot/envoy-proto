# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/servicedirectory/v1/lookup_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.servicedirectory.v1 import service_pb2 as google_dot_cloud_dot_servicedirectory_dot_v1_dot_service__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/servicedirectory/v1/lookup_service.proto',
  package='google.cloud.servicedirectory.v1',
  syntax='proto3',
  serialized_options=b'\n$com.google.cloud.servicedirectory.v1B\022LookupServiceProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1;servicedirectory\370\001\001\252\002 Google.Cloud.ServiceDirectory.V1\312\002 Google\\Cloud\\ServiceDirectory\\V1\352\002#Google::Cloud::ServiceDirectory::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/cloud/servicedirectory/v1/lookup_service.proto\x12 google.cloud.servicedirectory.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a.google/cloud/servicedirectory/v1/service.proto\"\x90\x01\n\x15ResolveServiceRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'servicedirectory.googleapis.com/Service\x12\x1a\n\rmax_endpoints\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x1c\n\x0f\x65ndpoint_filter\x18\x03 \x01(\tB\x03\xe0\x41\x01\"T\n\x16ResolveServiceResponse\x12:\n\x07service\x18\x01 \x01(\x0b\x32).google.cloud.servicedirectory.v1.Service2\xb8\x02\n\rLookupService\x12\xd1\x01\n\x0eResolveService\x12\x37.google.cloud.servicedirectory.v1.ResolveServiceRequest\x1a\x38.google.cloud.servicedirectory.v1.ResolveServiceResponse\"L\x82\xd3\xe4\x93\x02\x46\"A/v1/{name=projects/*/locations/*/namespaces/*/services/*}:resolve:\x01*\x1aS\xca\x41\x1fservicedirectory.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xfd\x01\n$com.google.cloud.servicedirectory.v1B\x12LookupServiceProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1;servicedirectory\xf8\x01\x01\xaa\x02 Google.Cloud.ServiceDirectory.V1\xca\x02 Google\\Cloud\\ServiceDirectory\\V1\xea\x02#Google::Cloud::ServiceDirectory::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_servicedirectory_dot_v1_dot_service__pb2.DESCRIPTOR,])




_RESOLVESERVICEREQUEST = _descriptor.Descriptor(
  name='ResolveServiceRequest',
  full_name='google.cloud.servicedirectory.v1.ResolveServiceRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.servicedirectory.v1.ResolveServiceRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A)\n\'servicedirectory.googleapis.com/Service', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_endpoints', full_name='google.cloud.servicedirectory.v1.ResolveServiceRequest.max_endpoints', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoint_filter', full_name='google.cloud.servicedirectory.v1.ResolveServiceRequest.endpoint_filter', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=255,
  serialized_end=399,
)


_RESOLVESERVICERESPONSE = _descriptor.Descriptor(
  name='ResolveServiceResponse',
  full_name='google.cloud.servicedirectory.v1.ResolveServiceResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service', full_name='google.cloud.servicedirectory.v1.ResolveServiceResponse.service', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=401,
  serialized_end=485,
)

_RESOLVESERVICERESPONSE.fields_by_name['service'].message_type = google_dot_cloud_dot_servicedirectory_dot_v1_dot_service__pb2._SERVICE
DESCRIPTOR.message_types_by_name['ResolveServiceRequest'] = _RESOLVESERVICEREQUEST
DESCRIPTOR.message_types_by_name['ResolveServiceResponse'] = _RESOLVESERVICERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ResolveServiceRequest = _reflection.GeneratedProtocolMessageType('ResolveServiceRequest', (_message.Message,), {
  'DESCRIPTOR' : _RESOLVESERVICEREQUEST,
  '__module__' : 'google.cloud.servicedirectory.v1.lookup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.ResolveServiceRequest)
  })
_sym_db.RegisterMessage(ResolveServiceRequest)

ResolveServiceResponse = _reflection.GeneratedProtocolMessageType('ResolveServiceResponse', (_message.Message,), {
  'DESCRIPTOR' : _RESOLVESERVICERESPONSE,
  '__module__' : 'google.cloud.servicedirectory.v1.lookup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.ResolveServiceResponse)
  })
_sym_db.RegisterMessage(ResolveServiceResponse)


DESCRIPTOR._options = None
_RESOLVESERVICEREQUEST.fields_by_name['name']._options = None
_RESOLVESERVICEREQUEST.fields_by_name['max_endpoints']._options = None
_RESOLVESERVICEREQUEST.fields_by_name['endpoint_filter']._options = None

_LOOKUPSERVICE = _descriptor.ServiceDescriptor(
  name='LookupService',
  full_name='google.cloud.servicedirectory.v1.LookupService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\037servicedirectory.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=488,
  serialized_end=800,
  methods=[
  _descriptor.MethodDescriptor(
    name='ResolveService',
    full_name='google.cloud.servicedirectory.v1.LookupService.ResolveService',
    index=0,
    containing_service=None,
    input_type=_RESOLVESERVICEREQUEST,
    output_type=_RESOLVESERVICERESPONSE,
    serialized_options=b'\202\323\344\223\002F\"A/v1/{name=projects/*/locations/*/namespaces/*/services/*}:resolve:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_LOOKUPSERVICE)

DESCRIPTOR.services_by_name['LookupService'] = _LOOKUPSERVICE

# @@protoc_insertion_point(module_scope)