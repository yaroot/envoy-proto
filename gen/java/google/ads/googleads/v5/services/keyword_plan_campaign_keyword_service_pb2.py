# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/services/keyword_plan_campaign_keyword_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v5.resources import keyword_plan_campaign_keyword_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_keyword__plan__campaign__keyword__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/services/keyword_plan_campaign_keyword_service.proto',
  package='google.ads.googleads.v5.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v5.servicesB&KeywordPlanCampaignKeywordServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V5.Services\312\002 Google\\Ads\\GoogleAds\\V5\\Services\352\002$Google::Ads::GoogleAds::V5::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nLgoogle/ads/googleads/v5/services/keyword_plan_campaign_keyword_service.proto\x12 google.ads.googleads.v5.services\x1a\x45google/ads/googleads/v5/resources/keyword_plan_campaign_keyword.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"z\n$GetKeywordPlanCampaignKeywordRequest\x12R\n\rresource_name\x18\x01 \x01(\tB;\xe0\x41\x02\xfa\x41\x35\n3googleads.googleapis.com/KeywordPlanCampaignKeyword\"\xd4\x01\n(MutateKeywordPlanCampaignKeywordsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12^\n\noperations\x18\x02 \x03(\x0b\x32\x45.google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x97\x02\n#KeywordPlanCampaignKeywordOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12O\n\x06\x63reate\x18\x01 \x01(\x0b\x32=.google.ads.googleads.v5.resources.KeywordPlanCampaignKeywordH\x00\x12O\n\x06update\x18\x02 \x01(\x0b\x32=.google.ads.googleads.v5.resources.KeywordPlanCampaignKeywordH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xb9\x01\n)MutateKeywordPlanCampaignKeywordsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Y\n\x07results\x18\x02 \x03(\x0b\x32H.google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordResult\"?\n&MutateKeywordPlanCampaignKeywordResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xe5\x04\n!KeywordPlanCampaignKeywordService\x12\xfd\x01\n\x1dGetKeywordPlanCampaignKeyword\x12\x46.google.ads.googleads.v5.services.GetKeywordPlanCampaignKeywordRequest\x1a=.google.ads.googleads.v5.resources.KeywordPlanCampaignKeyword\"U\x82\xd3\xe4\x93\x02?\x12=/v5/{resource_name=customers/*/keywordPlanCampaignKeywords/*}\xda\x41\rresource_name\x12\xa2\x02\n!MutateKeywordPlanCampaignKeywords\x12J.google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest\x1aK.google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsResponse\"d\x82\xd3\xe4\x93\x02\x45\"@/v5/customers/{customer_id=*}/keywordPlanCampaignKeywords:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x8d\x02\n$com.google.ads.googleads.v5.servicesB&KeywordPlanCampaignKeywordServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V5.Services\xca\x02 Google\\Ads\\GoogleAds\\V5\\Services\xea\x02$Google::Ads::GoogleAds::V5::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_keyword__plan__campaign__keyword__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETKEYWORDPLANCAMPAIGNKEYWORDREQUEST = _descriptor.Descriptor(
  name='GetKeywordPlanCampaignKeywordRequest',
  full_name='google.ads.googleads.v5.services.GetKeywordPlanCampaignKeywordRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.GetKeywordPlanCampaignKeywordRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A5\n3googleads.googleapis.com/KeywordPlanCampaignKeyword', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=359,
  serialized_end=481,
)


_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignKeywordsRequest',
  full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest.validate_only', index=3,
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
  serialized_start=484,
  serialized_end=696,
)


_KEYWORDPLANCAMPAIGNKEYWORDOPERATION = _descriptor.Descriptor(
  name='KeywordPlanCampaignKeywordOperation',
  full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=699,
  serialized_end=978,
)


_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignKeywordsResponse',
  full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsResponse.results', index=1,
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
  serialized_start=981,
  serialized_end=1166,
)


_MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignKeywordResult',
  full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordResult.resource_name', index=0,
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
  serialized_start=1168,
  serialized_end=1231,
)

_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['operations'].message_type = _KEYWORDPLANCAMPAIGNKEYWORDOPERATION
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_keyword__plan__campaign__keyword__pb2._KEYWORDPLANCAMPAIGNKEYWORD
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_keyword__plan__campaign__keyword__pb2._KEYWORDPLANCAMPAIGNKEYWORD
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['create'])
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['create'].containing_oneof = _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation']
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['update'])
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['update'].containing_oneof = _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation']
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['remove'])
_KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['remove'].containing_oneof = _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.oneofs_by_name['operation']
_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE.fields_by_name['results'].message_type = _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT
DESCRIPTOR.message_types_by_name['GetKeywordPlanCampaignKeywordRequest'] = _GETKEYWORDPLANCAMPAIGNKEYWORDREQUEST
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignKeywordsRequest'] = _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST
DESCRIPTOR.message_types_by_name['KeywordPlanCampaignKeywordOperation'] = _KEYWORDPLANCAMPAIGNKEYWORDOPERATION
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignKeywordsResponse'] = _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignKeywordResult'] = _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetKeywordPlanCampaignKeywordRequest = _reflection.GeneratedProtocolMessageType('GetKeywordPlanCampaignKeywordRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETKEYWORDPLANCAMPAIGNKEYWORDREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.keyword_plan_campaign_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.GetKeywordPlanCampaignKeywordRequest)
  })
_sym_db.RegisterMessage(GetKeywordPlanCampaignKeywordRequest)

MutateKeywordPlanCampaignKeywordsRequest = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignKeywordsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.keyword_plan_campaign_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsRequest)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignKeywordsRequest)

KeywordPlanCampaignKeywordOperation = _reflection.GeneratedProtocolMessageType('KeywordPlanCampaignKeywordOperation', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANCAMPAIGNKEYWORDOPERATION,
  '__module__' : 'google.ads.googleads.v5.services.keyword_plan_campaign_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.KeywordPlanCampaignKeywordOperation)
  })
_sym_db.RegisterMessage(KeywordPlanCampaignKeywordOperation)

MutateKeywordPlanCampaignKeywordsResponse = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignKeywordsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE,
  '__module__' : 'google.ads.googleads.v5.services.keyword_plan_campaign_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordsResponse)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignKeywordsResponse)

MutateKeywordPlanCampaignKeywordResult = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignKeywordResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT,
  '__module__' : 'google.ads.googleads.v5.services.keyword_plan_campaign_keyword_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateKeywordPlanCampaignKeywordResult)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignKeywordResult)


DESCRIPTOR._options = None
_GETKEYWORDPLANCAMPAIGNKEYWORDREQUEST.fields_by_name['resource_name']._options = None
_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['operations']._options = None

_KEYWORDPLANCAMPAIGNKEYWORDSERVICE = _descriptor.ServiceDescriptor(
  name='KeywordPlanCampaignKeywordService',
  full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1234,
  serialized_end=1847,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetKeywordPlanCampaignKeyword',
    full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordService.GetKeywordPlanCampaignKeyword',
    index=0,
    containing_service=None,
    input_type=_GETKEYWORDPLANCAMPAIGNKEYWORDREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_keyword__plan__campaign__keyword__pb2._KEYWORDPLANCAMPAIGNKEYWORD,
    serialized_options=b'\202\323\344\223\002?\022=/v5/{resource_name=customers/*/keywordPlanCampaignKeywords/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateKeywordPlanCampaignKeywords',
    full_name='google.ads.googleads.v5.services.KeywordPlanCampaignKeywordService.MutateKeywordPlanCampaignKeywords',
    index=1,
    containing_service=None,
    input_type=_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST,
    output_type=_MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE,
    serialized_options=b'\202\323\344\223\002E\"@/v5/customers/{customer_id=*}/keywordPlanCampaignKeywords:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_KEYWORDPLANCAMPAIGNKEYWORDSERVICE)

DESCRIPTOR.services_by_name['KeywordPlanCampaignKeywordService'] = _KEYWORDPLANCAMPAIGNKEYWORDSERVICE

# @@protoc_insertion_point(module_scope)
