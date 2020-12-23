# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/keyword_plan_campaign_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import keyword_plan_campaign_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__campaign__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/keyword_plan_campaign_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\037KeywordPlanCampaignServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDgoogle/ads/googleads/v3/services/keyword_plan_campaign_service.proto\x12 google.ads.googleads.v3.services\x1a=google/ads/googleads/v3/resources/keyword_plan_campaign.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"l\n\x1dGetKeywordPlanCampaignRequest\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,googleads.googleapis.com/KeywordPlanCampaign\"\xc6\x01\n!MutateKeywordPlanCampaignsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12W\n\noperations\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v3.services.KeywordPlanCampaignOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xb5\x02\n\x1cKeywordPlanCampaignOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12H\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x36.google.ads.googleads.v3.resources.KeywordPlanCampaignH\x00\x12H\n\x06update\x18\x02 \x01(\x0b\x32\x36.google.ads.googleads.v3.resources.KeywordPlanCampaignH\x00\x12\x43\n\x06remove\x18\x03 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/KeywordPlanCampaignH\x00\x42\x0b\n\toperation\"\xab\x01\n\"MutateKeywordPlanCampaignsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12R\n\x07results\x18\x02 \x03(\x0b\x32\x41.google.ads.googleads.v3.services.MutateKeywordPlanCampaignResult\"8\n\x1fMutateKeywordPlanCampaignResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xd0\x04\n\x1aKeywordPlanCampaignService\x12\xe1\x01\n\x16GetKeywordPlanCampaign\x12?.google.ads.googleads.v3.services.GetKeywordPlanCampaignRequest\x1a\x36.google.ads.googleads.v3.resources.KeywordPlanCampaign\"N\x82\xd3\xe4\x93\x02\x38\x12\x36/v3/{resource_name=customers/*/keywordPlanCampaigns/*}\xda\x41\rresource_name\x12\x86\x02\n\x1aMutateKeywordPlanCampaigns\x12\x43.google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest\x1a\x44.google.ads.googleads.v3.services.MutateKeywordPlanCampaignsResponse\"]\x82\xd3\xe4\x93\x02>\"9/v3/customers/{customer_id=*}/keywordPlanCampaigns:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x86\x02\n$com.google.ads.googleads.v3.servicesB\x1fKeywordPlanCampaignServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__campaign__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETKEYWORDPLANCAMPAIGNREQUEST = _descriptor.Descriptor(
  name='GetKeywordPlanCampaignRequest',
  full_name='google.ads.googleads.v3.services.GetKeywordPlanCampaignRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetKeywordPlanCampaignRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A.\n,googleads.googleapis.com/KeywordPlanCampaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=343,
  serialized_end=451,
)


_MUTATEKEYWORDPLANCAMPAIGNSREQUEST = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignsRequest',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest.validate_only', index=3,
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
  serialized_start=454,
  serialized_end=652,
)


_KEYWORDPLANCAMPAIGNOPERATION = _descriptor.Descriptor(
  name='KeywordPlanCampaignOperation',
  full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation.remove', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A.\n,googleads.googleapis.com/KeywordPlanCampaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='operation', full_name='google.ads.googleads.v3.services.KeywordPlanCampaignOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=655,
  serialized_end=964,
)


_MUTATEKEYWORDPLANCAMPAIGNSRESPONSE = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignsResponse',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignsResponse.results', index=1,
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
  serialized_start=967,
  serialized_end=1138,
)


_MUTATEKEYWORDPLANCAMPAIGNRESULT = _descriptor.Descriptor(
  name='MutateKeywordPlanCampaignResult',
  full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateKeywordPlanCampaignResult.resource_name', index=0,
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
  serialized_start=1140,
  serialized_end=1196,
)

_MUTATEKEYWORDPLANCAMPAIGNSREQUEST.fields_by_name['operations'].message_type = _KEYWORDPLANCAMPAIGNOPERATION
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__campaign__pb2._KEYWORDPLANCAMPAIGN
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__campaign__pb2._KEYWORDPLANCAMPAIGN
_KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['create'])
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['create'].containing_oneof = _KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation']
_KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['update'])
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['update'].containing_oneof = _KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation']
_KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['remove'])
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['remove'].containing_oneof = _KEYWORDPLANCAMPAIGNOPERATION.oneofs_by_name['operation']
_MUTATEKEYWORDPLANCAMPAIGNSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEKEYWORDPLANCAMPAIGNSRESPONSE.fields_by_name['results'].message_type = _MUTATEKEYWORDPLANCAMPAIGNRESULT
DESCRIPTOR.message_types_by_name['GetKeywordPlanCampaignRequest'] = _GETKEYWORDPLANCAMPAIGNREQUEST
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignsRequest'] = _MUTATEKEYWORDPLANCAMPAIGNSREQUEST
DESCRIPTOR.message_types_by_name['KeywordPlanCampaignOperation'] = _KEYWORDPLANCAMPAIGNOPERATION
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignsResponse'] = _MUTATEKEYWORDPLANCAMPAIGNSRESPONSE
DESCRIPTOR.message_types_by_name['MutateKeywordPlanCampaignResult'] = _MUTATEKEYWORDPLANCAMPAIGNRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetKeywordPlanCampaignRequest = _reflection.GeneratedProtocolMessageType('GetKeywordPlanCampaignRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETKEYWORDPLANCAMPAIGNREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_campaign_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetKeywordPlanCampaignRequest)
  })
_sym_db.RegisterMessage(GetKeywordPlanCampaignRequest)

MutateKeywordPlanCampaignsRequest = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_campaign_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanCampaignsRequest)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignsRequest)

KeywordPlanCampaignOperation = _reflection.GeneratedProtocolMessageType('KeywordPlanCampaignOperation', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANCAMPAIGNOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_campaign_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.KeywordPlanCampaignOperation)
  })
_sym_db.RegisterMessage(KeywordPlanCampaignOperation)

MutateKeywordPlanCampaignsResponse = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_campaign_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanCampaignsResponse)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignsResponse)

MutateKeywordPlanCampaignResult = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanCampaignResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANCAMPAIGNRESULT,
  '__module__' : 'google.ads.googleads.v3.services.keyword_plan_campaign_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateKeywordPlanCampaignResult)
  })
_sym_db.RegisterMessage(MutateKeywordPlanCampaignResult)


DESCRIPTOR._options = None
_GETKEYWORDPLANCAMPAIGNREQUEST.fields_by_name['resource_name']._options = None
_MUTATEKEYWORDPLANCAMPAIGNSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEKEYWORDPLANCAMPAIGNSREQUEST.fields_by_name['operations']._options = None
_KEYWORDPLANCAMPAIGNOPERATION.fields_by_name['remove']._options = None

_KEYWORDPLANCAMPAIGNSERVICE = _descriptor.ServiceDescriptor(
  name='KeywordPlanCampaignService',
  full_name='google.ads.googleads.v3.services.KeywordPlanCampaignService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1199,
  serialized_end=1791,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetKeywordPlanCampaign',
    full_name='google.ads.googleads.v3.services.KeywordPlanCampaignService.GetKeywordPlanCampaign',
    index=0,
    containing_service=None,
    input_type=_GETKEYWORDPLANCAMPAIGNREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_keyword__plan__campaign__pb2._KEYWORDPLANCAMPAIGN,
    serialized_options=b'\202\323\344\223\0028\0226/v3/{resource_name=customers/*/keywordPlanCampaigns/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateKeywordPlanCampaigns',
    full_name='google.ads.googleads.v3.services.KeywordPlanCampaignService.MutateKeywordPlanCampaigns',
    index=1,
    containing_service=None,
    input_type=_MUTATEKEYWORDPLANCAMPAIGNSREQUEST,
    output_type=_MUTATEKEYWORDPLANCAMPAIGNSRESPONSE,
    serialized_options=b'\202\323\344\223\002>\"9/v3/customers/{customer_id=*}/keywordPlanCampaigns:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_KEYWORDPLANCAMPAIGNSERVICE)

DESCRIPTOR.services_by_name['KeywordPlanCampaignService'] = _KEYWORDPLANCAMPAIGNSERVICE

# @@protoc_insertion_point(module_scope)
