# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/completion_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.talent.v4beta1 import common_pb2 as google_dot_cloud_dot_talent_dot_v4beta1_dot_common__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/talent/v4beta1/completion_service.proto',
  package='google.cloud.talent.v4beta1',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.talent.v4beta1B\026CompletionServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\242\002\003CTS',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/cloud/talent/v4beta1/completion_service.proto\x12\x1bgoogle.cloud.talent.v4beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/talent/v4beta1/common.proto\x1a\x17google/api/client.proto\"\x93\x04\n\x14\x43ompleteQueryRequest\x12\x33\n\x06parent\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\x12\x1bjobs.googleapis.com/Company\x12\x12\n\x05query\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\x0elanguage_codes\x18\x03 \x03(\t\x12\x16\n\tpage_size\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x31\n\x07\x63ompany\x18\x05 \x01(\tB \xfa\x41\x1d\n\x1bjobs.googleapis.com/Company\x12P\n\x05scope\x18\x06 \x01(\x0e\x32\x41.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope\x12N\n\x04type\x18\x07 \x01(\x0e\x32@.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType\"K\n\x0f\x43ompletionScope\x12 \n\x1c\x43OMPLETION_SCOPE_UNSPECIFIED\x10\x00\x12\n\n\x06TENANT\x10\x01\x12\n\n\x06PUBLIC\x10\x02\"`\n\x0e\x43ompletionType\x12\x1f\n\x1b\x43OMPLETION_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tJOB_TITLE\x10\x01\x12\x10\n\x0c\x43OMPANY_NAME\x10\x02\x12\x0c\n\x08\x43OMBINED\x10\x03\"\xc5\x02\n\x15\x43ompleteQueryResponse\x12_\n\x12\x63ompletion_results\x18\x01 \x03(\x0b\x32\x43.google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult\x12?\n\x08metadata\x18\x02 \x01(\x0b\x32-.google.cloud.talent.v4beta1.ResponseMetadata\x1a\x89\x01\n\x10\x43ompletionResult\x12\x12\n\nsuggestion\x18\x01 \x01(\t\x12N\n\x04type\x18\x02 \x01(\x0e\x32@.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType\x12\x11\n\timage_uri\x18\x03 \x01(\t2\xd5\x02\n\nCompletion\x12\xd8\x01\n\rCompleteQuery\x12\x31.google.cloud.talent.v4beta1.CompleteQueryRequest\x1a\x32.google.cloud.talent.v4beta1.CompleteQueryResponse\"`\x82\xd3\xe4\x93\x02Z\x12//v4beta1/{parent=projects/*/tenants/*}:completeZ\'\x12%/v4beta1/{parent=projects/*}:complete\x1al\xca\x41\x13jobs.googleapis.com\xd2\x41Shttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobsB\x84\x01\n\x1f\x63om.google.cloud.talent.v4beta1B\x16\x43ompletionServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\xa2\x02\x03\x43TSb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_talent_dot_v4beta1_dot_common__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])



_COMPLETEQUERYREQUEST_COMPLETIONSCOPE = _descriptor.EnumDescriptor(
  name='CompletionScope',
  full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='COMPLETION_SCOPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TENANT', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PUBLIC', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=601,
  serialized_end=676,
)
_sym_db.RegisterEnumDescriptor(_COMPLETEQUERYREQUEST_COMPLETIONSCOPE)

_COMPLETEQUERYREQUEST_COMPLETIONTYPE = _descriptor.EnumDescriptor(
  name='CompletionType',
  full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='COMPLETION_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOB_TITLE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPANY_NAME', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMBINED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=678,
  serialized_end=774,
)
_sym_db.RegisterEnumDescriptor(_COMPLETEQUERYREQUEST_COMPLETIONTYPE)


_COMPLETEQUERYREQUEST = _descriptor.Descriptor(
  name='CompleteQueryRequest',
  full_name='google.cloud.talent.v4beta1.CompleteQueryRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\035\022\033jobs.googleapis.com/Company', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='query', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.query', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_codes', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.page_size', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='company', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.company', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A\035\n\033jobs.googleapis.com/Company', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scope', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.scope', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.talent.v4beta1.CompleteQueryRequest.type', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _COMPLETEQUERYREQUEST_COMPLETIONSCOPE,
    _COMPLETEQUERYREQUEST_COMPLETIONTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=243,
  serialized_end=774,
)


_COMPLETEQUERYRESPONSE_COMPLETIONRESULT = _descriptor.Descriptor(
  name='CompletionResult',
  full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='suggestion', full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult.suggestion', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult.type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image_uri', full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult.image_uri', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=965,
  serialized_end=1102,
)

_COMPLETEQUERYRESPONSE = _descriptor.Descriptor(
  name='CompleteQueryResponse',
  full_name='google.cloud.talent.v4beta1.CompleteQueryResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='completion_results', full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.completion_results', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.cloud.talent.v4beta1.CompleteQueryResponse.metadata', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMPLETEQUERYRESPONSE_COMPLETIONRESULT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=777,
  serialized_end=1102,
)

_COMPLETEQUERYREQUEST.fields_by_name['scope'].enum_type = _COMPLETEQUERYREQUEST_COMPLETIONSCOPE
_COMPLETEQUERYREQUEST.fields_by_name['type'].enum_type = _COMPLETEQUERYREQUEST_COMPLETIONTYPE
_COMPLETEQUERYREQUEST_COMPLETIONSCOPE.containing_type = _COMPLETEQUERYREQUEST
_COMPLETEQUERYREQUEST_COMPLETIONTYPE.containing_type = _COMPLETEQUERYREQUEST
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT.fields_by_name['type'].enum_type = _COMPLETEQUERYREQUEST_COMPLETIONTYPE
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT.containing_type = _COMPLETEQUERYRESPONSE
_COMPLETEQUERYRESPONSE.fields_by_name['completion_results'].message_type = _COMPLETEQUERYRESPONSE_COMPLETIONRESULT
_COMPLETEQUERYRESPONSE.fields_by_name['metadata'].message_type = google_dot_cloud_dot_talent_dot_v4beta1_dot_common__pb2._RESPONSEMETADATA
DESCRIPTOR.message_types_by_name['CompleteQueryRequest'] = _COMPLETEQUERYREQUEST
DESCRIPTOR.message_types_by_name['CompleteQueryResponse'] = _COMPLETEQUERYRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CompleteQueryRequest = _reflection.GeneratedProtocolMessageType('CompleteQueryRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPLETEQUERYREQUEST,
  '__module__' : 'google.cloud.talent.v4beta1.completion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CompleteQueryRequest)
  })
_sym_db.RegisterMessage(CompleteQueryRequest)

CompleteQueryResponse = _reflection.GeneratedProtocolMessageType('CompleteQueryResponse', (_message.Message,), {

  'CompletionResult' : _reflection.GeneratedProtocolMessageType('CompletionResult', (_message.Message,), {
    'DESCRIPTOR' : _COMPLETEQUERYRESPONSE_COMPLETIONRESULT,
    '__module__' : 'google.cloud.talent.v4beta1.completion_service_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CompleteQueryResponse.CompletionResult)
    })
  ,
  'DESCRIPTOR' : _COMPLETEQUERYRESPONSE,
  '__module__' : 'google.cloud.talent.v4beta1.completion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CompleteQueryResponse)
  })
_sym_db.RegisterMessage(CompleteQueryResponse)
_sym_db.RegisterMessage(CompleteQueryResponse.CompletionResult)


DESCRIPTOR._options = None
_COMPLETEQUERYREQUEST.fields_by_name['parent']._options = None
_COMPLETEQUERYREQUEST.fields_by_name['query']._options = None
_COMPLETEQUERYREQUEST.fields_by_name['page_size']._options = None
_COMPLETEQUERYREQUEST.fields_by_name['company']._options = None

_COMPLETION = _descriptor.ServiceDescriptor(
  name='Completion',
  full_name='google.cloud.talent.v4beta1.Completion',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\023jobs.googleapis.com\322AShttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobs',
  create_key=_descriptor._internal_create_key,
  serialized_start=1105,
  serialized_end=1446,
  methods=[
  _descriptor.MethodDescriptor(
    name='CompleteQuery',
    full_name='google.cloud.talent.v4beta1.Completion.CompleteQuery',
    index=0,
    containing_service=None,
    input_type=_COMPLETEQUERYREQUEST,
    output_type=_COMPLETEQUERYRESPONSE,
    serialized_options=b'\202\323\344\223\002Z\022//v4beta1/{parent=projects/*/tenants/*}:completeZ\'\022%/v4beta1/{parent=projects/*}:complete',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_COMPLETION)

DESCRIPTOR.services_by_name['Completion'] = _COMPLETION

# @@protoc_insertion_point(module_scope)
