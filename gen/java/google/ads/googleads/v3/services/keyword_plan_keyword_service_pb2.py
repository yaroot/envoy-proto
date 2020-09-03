# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/keyword_plan_keyword_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import keyword_plan_keyword_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__keyword__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/keyword_plan_keyword_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\036KeywordPlanKeywordServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v3/services/keyword_plan_keyword_service.proto\x12 google.ads.googleads.v3.services\x1a<google/ads/googleads/v3/resources/keyword_plan_keyword.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"j\n\x1cGetKeywordPlanKeywordRequest\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/KeywordPlanKeyword\"\xc4\x01\n MutateKeywordPlanKeywordsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\noperations\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v3.services.KeywordPlanKeywordOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xff\x01\n\x1bKeywordPlanKeywordOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12G\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x35.google.ads.googleads.v3.resources.KeywordPlanKeywordH\x00\x12G\n\x06update\x18\x02 \x01(\x0b\x32\x35.google.ads.googleads.v3.resources.KeywordPlanKeywordH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xa9\x01\n!MutateKeywordPlanKeywordsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Q\n\x07results\x18\x02 \x03(\x0b\x32@.google.ads.googleads.v3.services.MutateKeywordPlanKeywordResult\"7\n\x1eMutateKeywordPlanKeywordResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\x9d\x04\n\x19KeywordPlanKeywordService\x12\xdd\x01\n\x15GetKeywordPlanKeyword\x12>.google.ads.googleads.v3.services.GetKeywordPlanKeywordRequest\x1a\x35.google.ads.googleads.v3.resources.KeywordPlanKeyword\"M\x82\xd3\xe4\x93\x02\x37\x12\x35/v3/{resource_name=customers/*/keywordPlanKeywords/*}\xda\x41\rresource_name\x12\x82\x02\n\x19MutateKeywordPlanKeywords\x12\x42.google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest\x1a\x43.google.ads.googleads.v3.services.MutateKeywordPlanKeywordsResponse\"\\\x82\xd3\xe4\x93\x02=\"8/v3/customers/{customer_id=*}/keywordPlanKeywords:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x85\x02\n$com.google.ads.googleads.v3.servicesB\x1eKeywordPlanKeywordServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__keyword__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETKEYWORDPLANKEYWORDREQUEST = _descriptor.Descriptor(
  name='GetKeywordPlanKeywordRequest',
  full_name='google.ads.googleads.v3.services.GetKeywordPlanKeywordRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetKeywordPlanKeywordRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A-\n+googleads.googleapis.com/KeywordPlanKeyword', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=341,
  serialized_end=447,
)


_MUTATEKEYWORDPLANKEYWORDSREQUEST = _descriptor.Descriptor(
  name='MutateKeywordPlanKeywordsRequest',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=450,
  serialized_end=646,
)


_KEYWORDPLANKEYWORDOPERATION = _descriptor.Descriptor(
  name='KeywordPlanKeywordOperation',
  full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation.remove', index=3,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v3.services.KeywordPlanKeywordOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=649,
  serialized_end=904,
)


_MUTATEKEYWORDPLANKEYWORDSRESPONSE = _descriptor.Descriptor(
  name='MutateKeywordPlanKeywordsResponse',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordsResponse.results', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=907,
  serialized_end=1076,
)


_MUTATEKEYWORDPLANKEYWORDRESULT = _descriptor.Descriptor(
  name='MutateKeywordPlanKeywordResult',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateKeywordPlanKeywordResult.resource_name', index=0,
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
  serialized_start=1078,
  serialized_end=1133,
)

_MUTATEKEYWORDPLANKEYWORDSREQUEST.fields_by_name['operations'].message_type = _KEYWORDPLANKEYWORDOPERATION
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__keyword__pb2._KEYWORDPLANKEYWORD
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__keyword__pb2._KEYWORDPLANKEYWORD
_KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANKEYWORDOPERATION.fields_by_name['create'])
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['create'].containing_oneof = _KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation']
_KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANKEYWORDOPERATION.fields_by_name['update'])
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['update'].containing_oneof = _KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation']
_KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANKEYWORDOPERATION.fields_by_name['remove'])
_KEYWORDPLANKEYWORDOPERATION.fields_by_name['remove'].containing_oneof = _KEYWORDPLANKEYWORDOPERATION.oneofs_by_name['operation']
_MUTATEKEYWORDPLANKEYWORDSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEKEYWORDPLANKEYWORDSRESPONSE.fields_by_name['results'].message_type = _MUTATEKEYWORDPLANKEYWORDRESULT
DESCRIPTOR.message_types_by_name['GetKeywordPlanKeywordRequest'] = _GETKEYWORDPLANKEYWORDREQUEST
DESCRIPTOR.message_types_by_name['MutateKeywordPlanKeywordsRequest'] = _MUTATEKEYWORDPLANKEYWORDSREQUEST
DESCRIPTOR.message_types_by_name['KeywordPlanKeywordOperation'] = _KEYWORDPLANKEYWORDOPERATION
DESCRIPTOR.message_types_by_name['MutateKeywordPlanKeywordsResponse'] = _MUTATEKEYWORDPLANKEYWORDSRESPONSE
DESCRIPTOR.message_types_by_name['MutateKeywordPlanKeywordResult'] = _MUTATEKEYWORDPLANKEYWORDRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetKeywordPlanKeywordRequest = _reflection.GeneratedProtocolMessageType('GetKeywordPlanKeywordRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETKEYWORDPLANKEYWORDREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetKeywordPlanKeywordRequest)
  })
_sym_db.RegisterMessage(GetKeywordPlanKeywordRequest)

MutateKeywordPlanKeywordsRequest = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanKeywordsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANKEYWORDSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanKeywordsRequest)
  })
_sym_db.RegisterMessage(MutateKeywordPlanKeywordsRequest)

KeywordPlanKeywordOperation = _reflection.GeneratedProtocolMessageType('KeywordPlanKeywordOperation', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANKEYWORDOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.KeywordPlanKeywordOperation)
  })
_sym_db.RegisterMessage(KeywordPlanKeywordOperation)

MutateKeywordPlanKeywordsResponse = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanKeywordsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANKEYWORDSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanKeywordsResponse)
  })
_sym_db.RegisterMessage(MutateKeywordPlanKeywordsResponse)

MutateKeywordPlanKeywordResult = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanKeywordResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANKEYWORDRESULT,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanKeywordResult)
  })
_sym_db.RegisterMessage(MutateKeywordPlanKeywordResult)


DESCRIPTOR._options = None
_GETKEYWORDPLANKEYWORDREQUEST.fields_by_name['resource_name']._options = None
_MUTATEKEYWORDPLANKEYWORDSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEKEYWORDPLANKEYWORDSREQUEST.fields_by_name['operations']._options = None

_KEYWORDPLANKEYWORDSERVICE = _descriptor.ServiceDescriptor(
  name='KeywordPlanKeywordService',
  full_name='google.ads.googleads.v3.services.KeywordPlanKeywordService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1136,
  serialized_end=1677,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetKeywordPlanKeyword',
    full_name='google.ads.googleads.v3.services.KeywordPlanKeywordService.GetKeywordPlanKeyword',
    index=0,
    containing_service=None,
    input_type=_GETKEYWORDPLANKEYWORDREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__keyword__pb2._KEYWORDPLANKEYWORD,
    serialized_options=b'\202\323\344\223\0027\0225/v3/{resource_name=customers/*/keywordPlanKeywords/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateKeywordPlanKeywords',
    full_name='google.ads.googleads.v3.services.KeywordPlanKeywordService.MutateKeywordPlanKeywords',
    index=1,
    containing_service=None,
    input_type=_MUTATEKEYWORDPLANKEYWORDSREQUEST,
    output_type=_MUTATEKEYWORDPLANKEYWORDSRESPONSE,
    serialized_options=b'\202\323\344\223\002=\"8/v3/customers/{customer_id=*}/keywordPlanKeywords:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_KEYWORDPLANKEYWORDSERVICE)

DESCRIPTOR.services_by_name['KeywordPlanKeywordService'] = _KEYWORDPLANKEYWORDSERVICE

# @@protoc_insertion_point(module_scope)
