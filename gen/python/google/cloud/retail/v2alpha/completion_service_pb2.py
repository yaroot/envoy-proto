# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/completion_service.proto
"""Generated protocol buffer code."""
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
from google.cloud.retail.v2alpha import common_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2
from google.cloud.retail.v2alpha import import_config_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_import__config__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/retail/v2alpha/completion_service.proto',
  package='google.cloud.retail.v2alpha',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.retail.v2alphaB\026CompletionServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/cloud/retail/v2alpha/completion_service.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/retail/v2alpha/common.proto\x1a/google/cloud/retail/v2alpha/import_config.proto\x1a#google/longrunning/operations.proto\"\xcd\x01\n\x14\x43ompleteQueryRequest\x12\x36\n\x07\x63\x61talog\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12\x12\n\x05query\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\nvisitor_id\x18\x07 \x01(\t\x12\x16\n\x0elanguage_codes\x18\x03 \x03(\t\x12\x13\n\x0b\x64\x65vice_type\x18\x04 \x01(\t\x12\x0f\n\x07\x64\x61taset\x18\x06 \x01(\t\x12\x17\n\x0fmax_suggestions\x18\x05 \x01(\x05\"\x99\x04\n\x15\x43ompleteQueryResponse\x12_\n\x12\x63ompletion_results\x18\x01 \x03(\x0b\x32\x43.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult\x12\x19\n\x11\x61ttribution_token\x18\x02 \x01(\t\x12\x64\n\x15recent_search_results\x18\x03 \x03(\x0b\x32\x45.google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult\x1a\xf0\x01\n\x10\x43ompletionResult\x12\x12\n\nsuggestion\x18\x01 \x01(\t\x12g\n\nattributes\x18\x02 \x03(\x0b\x32S.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.AttributesEntry\x1a_\n\x0f\x41ttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12;\n\x05value\x18\x02 \x01(\x0b\x32,.google.cloud.retail.v2alpha.CustomAttribute:\x02\x38\x01\x1a+\n\x12RecentSearchResult\x12\x15\n\rrecent_search\x18\x01 \x01(\t2\xd5\x04\n\x11\x43ompletionService\x12\xc2\x01\n\rCompleteQuery\x12\x31.google.cloud.retail.v2alpha.CompleteQueryRequest\x1a\x32.google.cloud.retail.v2alpha.CompleteQueryResponse\"J\x82\xd3\xe4\x93\x02\x44\x12\x42/v2alpha/{catalog=projects/*/locations/*/catalogs/*}:completeQuery\x12\xaf\x02\n\x14ImportCompletionData\x12\x38.google.cloud.retail.v2alpha.ImportCompletionDataRequest\x1a\x1d.google.longrunning.Operation\"\xbd\x01\x82\xd3\xe4\x93\x02N\"I/v2alpha/{parent=projects/*/locations/*/catalogs/*}/completionData:import:\x01*\xca\x41\x66\n8google.cloud.retail.v2alpha.ImportCompletionDataResponse\x12*google.cloud.retail.v2alpha.ImportMetadata\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xe4\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x16\x43ompletionServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2.DESCRIPTOR,google_dot_cloud_dot_retail_dot_v2alpha_dot_import__config__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,])




_COMPLETEQUERYREQUEST = _descriptor.Descriptor(
  name='CompleteQueryRequest',
  full_name='google.cloud.retail.v2alpha.CompleteQueryRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='catalog', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.catalog', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='query', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.query', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='visitor_id', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id', index=2,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_codes', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.language_codes', index=3,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='device_type', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.device_type', index=4,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dataset', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.dataset', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_suggestions', full_name='google.cloud.retail.v2alpha.CompleteQueryRequest.max_suggestions', index=6,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=329,
  serialized_end=534,
)


_COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY = _descriptor.Descriptor(
  name='AttributesEntry',
  full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.AttributesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.AttributesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.AttributesEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=934,
  serialized_end=1029,
)

_COMPLETEQUERYRESPONSE_COMPLETIONRESULT = _descriptor.Descriptor(
  name='CompletionResult',
  full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='suggestion', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attributes', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.attributes', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=789,
  serialized_end=1029,
)

_COMPLETEQUERYRESPONSE_RECENTSEARCHRESULT = _descriptor.Descriptor(
  name='RecentSearchResult',
  full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='recent_search', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult.recent_search', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=1031,
  serialized_end=1074,
)

_COMPLETEQUERYRESPONSE = _descriptor.Descriptor(
  name='CompleteQueryResponse',
  full_name='google.cloud.retail.v2alpha.CompleteQueryResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='completion_results', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.completion_results', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attribution_token', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='recent_search_results', full_name='google.cloud.retail.v2alpha.CompleteQueryResponse.recent_search_results', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMPLETEQUERYRESPONSE_COMPLETIONRESULT, _COMPLETEQUERYRESPONSE_RECENTSEARCHRESULT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=537,
  serialized_end=1074,
)

_COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY.fields_by_name['value'].message_type = google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2._CUSTOMATTRIBUTE
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY.containing_type = _COMPLETEQUERYRESPONSE_COMPLETIONRESULT
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT.fields_by_name['attributes'].message_type = _COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT.containing_type = _COMPLETEQUERYRESPONSE
_COMPLETEQUERYRESPONSE_RECENTSEARCHRESULT.containing_type = _COMPLETEQUERYRESPONSE
_COMPLETEQUERYRESPONSE.fields_by_name['completion_results'].message_type = _COMPLETEQUERYRESPONSE_COMPLETIONRESULT
_COMPLETEQUERYRESPONSE.fields_by_name['recent_search_results'].message_type = _COMPLETEQUERYRESPONSE_RECENTSEARCHRESULT
DESCRIPTOR.message_types_by_name['CompleteQueryRequest'] = _COMPLETEQUERYREQUEST
DESCRIPTOR.message_types_by_name['CompleteQueryResponse'] = _COMPLETEQUERYRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CompleteQueryRequest = _reflection.GeneratedProtocolMessageType('CompleteQueryRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPLETEQUERYREQUEST,
  '__module__' : 'google.cloud.retail.v2alpha.completion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompleteQueryRequest)
  })
_sym_db.RegisterMessage(CompleteQueryRequest)

CompleteQueryResponse = _reflection.GeneratedProtocolMessageType('CompleteQueryResponse', (_message.Message,), {

  'CompletionResult' : _reflection.GeneratedProtocolMessageType('CompletionResult', (_message.Message,), {

    'AttributesEntry' : _reflection.GeneratedProtocolMessageType('AttributesEntry', (_message.Message,), {
      'DESCRIPTOR' : _COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY,
      '__module__' : 'google.cloud.retail.v2alpha.completion_service_pb2'
      # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.AttributesEntry)
      })
    ,
    'DESCRIPTOR' : _COMPLETEQUERYRESPONSE_COMPLETIONRESULT,
    '__module__' : 'google.cloud.retail.v2alpha.completion_service_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult)
    })
  ,

  'RecentSearchResult' : _reflection.GeneratedProtocolMessageType('RecentSearchResult', (_message.Message,), {
    'DESCRIPTOR' : _COMPLETEQUERYRESPONSE_RECENTSEARCHRESULT,
    '__module__' : 'google.cloud.retail.v2alpha.completion_service_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult)
    })
  ,
  'DESCRIPTOR' : _COMPLETEQUERYRESPONSE,
  '__module__' : 'google.cloud.retail.v2alpha.completion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompleteQueryResponse)
  })
_sym_db.RegisterMessage(CompleteQueryResponse)
_sym_db.RegisterMessage(CompleteQueryResponse.CompletionResult)
_sym_db.RegisterMessage(CompleteQueryResponse.CompletionResult.AttributesEntry)
_sym_db.RegisterMessage(CompleteQueryResponse.RecentSearchResult)


DESCRIPTOR._options = None
_COMPLETEQUERYREQUEST.fields_by_name['catalog']._options = None
_COMPLETEQUERYREQUEST.fields_by_name['query']._options = None
_COMPLETEQUERYRESPONSE_COMPLETIONRESULT_ATTRIBUTESENTRY._options = None

_COMPLETIONSERVICE = _descriptor.ServiceDescriptor(
  name='CompletionService',
  full_name='google.cloud.retail.v2alpha.CompletionService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1077,
  serialized_end=1674,
  methods=[
  _descriptor.MethodDescriptor(
    name='CompleteQuery',
    full_name='google.cloud.retail.v2alpha.CompletionService.CompleteQuery',
    index=0,
    containing_service=None,
    input_type=_COMPLETEQUERYREQUEST,
    output_type=_COMPLETEQUERYRESPONSE,
    serialized_options=b'\202\323\344\223\002D\022B/v2alpha/{catalog=projects/*/locations/*/catalogs/*}:completeQuery',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ImportCompletionData',
    full_name='google.cloud.retail.v2alpha.CompletionService.ImportCompletionData',
    index=1,
    containing_service=None,
    input_type=google_dot_cloud_dot_retail_dot_v2alpha_dot_import__config__pb2._IMPORTCOMPLETIONDATAREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002N\"I/v2alpha/{parent=projects/*/locations/*/catalogs/*}/completionData:import:\001*\312Af\n8google.cloud.retail.v2alpha.ImportCompletionDataResponse\022*google.cloud.retail.v2alpha.ImportMetadata',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_COMPLETIONSERVICE)

DESCRIPTOR.services_by_name['CompletionService'] = _COMPLETIONSERVICE

# @@protoc_insertion_point(module_scope)