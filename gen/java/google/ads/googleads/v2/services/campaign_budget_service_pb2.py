# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/services/campaign_budget_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.resources import campaign_budget_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__budget__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/services/campaign_budget_service.proto',
  package='google.ads.googleads.v2.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v2.servicesB\032CampaignBudgetServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2.Services\312\002 Google\\Ads\\GoogleAds\\V2\\Services\352\002$Google::Ads::GoogleAds::V2::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v2/services/campaign_budget_service.proto\x12 google.ads.googleads.v2.services\x1a\x37google/ads/googleads/v2/resources/campaign_budget.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"b\n\x18GetCampaignBudgetRequest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/CampaignBudget\"\xbc\x01\n\x1cMutateCampaignBudgetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12R\n\noperations\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v2.services.CampaignBudgetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xf3\x01\n\x17\x43\x61mpaignBudgetOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x43\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x31.google.ads.googleads.v2.resources.CampaignBudgetH\x00\x12\x43\n\x06update\x18\x02 \x01(\x0b\x32\x31.google.ads.googleads.v2.resources.CampaignBudgetH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xa1\x01\n\x1dMutateCampaignBudgetsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12M\n\x07results\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v2.services.MutateCampaignBudgetResult\"3\n\x1aMutateCampaignBudgetResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xf9\x03\n\x15\x43\x61mpaignBudgetService\x12\xcd\x01\n\x11GetCampaignBudget\x12:.google.ads.googleads.v2.services.GetCampaignBudgetRequest\x1a\x31.google.ads.googleads.v2.resources.CampaignBudget\"I\x82\xd3\xe4\x93\x02\x33\x12\x31/v2/{resource_name=customers/*/campaignBudgets/*}\xda\x41\rresource_name\x12\xf2\x01\n\x15MutateCampaignBudgets\x12>.google.ads.googleads.v2.services.MutateCampaignBudgetsRequest\x1a?.google.ads.googleads.v2.services.MutateCampaignBudgetsResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v2/customers/{customer_id=*}/campaignBudgets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x81\x02\n$com.google.ads.googleads.v2.servicesB\x1a\x43\x61mpaignBudgetServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V2.Services\xca\x02 Google\\Ads\\GoogleAds\\V2\\Services\xea\x02$Google::Ads::GoogleAds::V2::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__budget__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCAMPAIGNBUDGETREQUEST = _descriptor.Descriptor(
  name='GetCampaignBudgetRequest',
  full_name='google.ads.googleads.v2.services.GetCampaignBudgetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.services.GetCampaignBudgetRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A)\n\'googleads.googleapis.com/CampaignBudget', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=331,
  serialized_end=429,
)


_MUTATECAMPAIGNBUDGETSREQUEST = _descriptor.Descriptor(
  name='MutateCampaignBudgetsRequest',
  full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsRequest.validate_only', index=3,
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
  serialized_start=432,
  serialized_end=620,
)


_CAMPAIGNBUDGETOPERATION = _descriptor.Descriptor(
  name='CampaignBudgetOperation',
  full_name='google.ads.googleads.v2.services.CampaignBudgetOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v2.services.CampaignBudgetOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v2.services.CampaignBudgetOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v2.services.CampaignBudgetOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v2.services.CampaignBudgetOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v2.services.CampaignBudgetOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=623,
  serialized_end=866,
)


_MUTATECAMPAIGNBUDGETSRESPONSE = _descriptor.Descriptor(
  name='MutateCampaignBudgetsResponse',
  full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetsResponse.results', index=1,
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
  serialized_start=869,
  serialized_end=1030,
)


_MUTATECAMPAIGNBUDGETRESULT = _descriptor.Descriptor(
  name='MutateCampaignBudgetResult',
  full_name='google.ads.googleads.v2.services.MutateCampaignBudgetResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.services.MutateCampaignBudgetResult.resource_name', index=0,
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
  serialized_start=1032,
  serialized_end=1083,
)

_MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['operations'].message_type = _CAMPAIGNBUDGETOPERATION
_CAMPAIGNBUDGETOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CAMPAIGNBUDGETOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__budget__pb2._CAMPAIGNBUDGET
_CAMPAIGNBUDGETOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__budget__pb2._CAMPAIGNBUDGET
_CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNBUDGETOPERATION.fields_by_name['create'])
_CAMPAIGNBUDGETOPERATION.fields_by_name['create'].containing_oneof = _CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation']
_CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNBUDGETOPERATION.fields_by_name['update'])
_CAMPAIGNBUDGETOPERATION.fields_by_name['update'].containing_oneof = _CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation']
_CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNBUDGETOPERATION.fields_by_name['remove'])
_CAMPAIGNBUDGETOPERATION.fields_by_name['remove'].containing_oneof = _CAMPAIGNBUDGETOPERATION.oneofs_by_name['operation']
_MUTATECAMPAIGNBUDGETSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECAMPAIGNBUDGETSRESPONSE.fields_by_name['results'].message_type = _MUTATECAMPAIGNBUDGETRESULT
DESCRIPTOR.message_types_by_name['GetCampaignBudgetRequest'] = _GETCAMPAIGNBUDGETREQUEST
DESCRIPTOR.message_types_by_name['MutateCampaignBudgetsRequest'] = _MUTATECAMPAIGNBUDGETSREQUEST
DESCRIPTOR.message_types_by_name['CampaignBudgetOperation'] = _CAMPAIGNBUDGETOPERATION
DESCRIPTOR.message_types_by_name['MutateCampaignBudgetsResponse'] = _MUTATECAMPAIGNBUDGETSRESPONSE
DESCRIPTOR.message_types_by_name['MutateCampaignBudgetResult'] = _MUTATECAMPAIGNBUDGETRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCampaignBudgetRequest = _reflection.GeneratedProtocolMessageType('GetCampaignBudgetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCAMPAIGNBUDGETREQUEST,
  '__module__' : 'google.ads.googleads.v2.services.campaign_budget_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.GetCampaignBudgetRequest)
  })
_sym_db.RegisterMessage(GetCampaignBudgetRequest)

MutateCampaignBudgetsRequest = _reflection.GeneratedProtocolMessageType('MutateCampaignBudgetsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNBUDGETSREQUEST,
  '__module__' : 'google.ads.googleads.v2.services.campaign_budget_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignBudgetsRequest)
  })
_sym_db.RegisterMessage(MutateCampaignBudgetsRequest)

CampaignBudgetOperation = _reflection.GeneratedProtocolMessageType('CampaignBudgetOperation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNBUDGETOPERATION,
  '__module__' : 'google.ads.googleads.v2.services.campaign_budget_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.CampaignBudgetOperation)
  })
_sym_db.RegisterMessage(CampaignBudgetOperation)

MutateCampaignBudgetsResponse = _reflection.GeneratedProtocolMessageType('MutateCampaignBudgetsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNBUDGETSRESPONSE,
  '__module__' : 'google.ads.googleads.v2.services.campaign_budget_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignBudgetsResponse)
  })
_sym_db.RegisterMessage(MutateCampaignBudgetsResponse)

MutateCampaignBudgetResult = _reflection.GeneratedProtocolMessageType('MutateCampaignBudgetResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNBUDGETRESULT,
  '__module__' : 'google.ads.googleads.v2.services.campaign_budget_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignBudgetResult)
  })
_sym_db.RegisterMessage(MutateCampaignBudgetResult)


DESCRIPTOR._options = None
_GETCAMPAIGNBUDGETREQUEST.fields_by_name['resource_name']._options = None
_MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['customer_id']._options = None
_MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['operations']._options = None

_CAMPAIGNBUDGETSERVICE = _descriptor.ServiceDescriptor(
  name='CampaignBudgetService',
  full_name='google.ads.googleads.v2.services.CampaignBudgetService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1086,
  serialized_end=1591,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCampaignBudget',
    full_name='google.ads.googleads.v2.services.CampaignBudgetService.GetCampaignBudget',
    index=0,
    containing_service=None,
    input_type=_GETCAMPAIGNBUDGETREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__budget__pb2._CAMPAIGNBUDGET,
    serialized_options=b'\202\323\344\223\0023\0221/v2/{resource_name=customers/*/campaignBudgets/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCampaignBudgets',
    full_name='google.ads.googleads.v2.services.CampaignBudgetService.MutateCampaignBudgets',
    index=1,
    containing_service=None,
    input_type=_MUTATECAMPAIGNBUDGETSREQUEST,
    output_type=_MUTATECAMPAIGNBUDGETSRESPONSE,
    serialized_options=b'\202\323\344\223\0029\"4/v2/customers/{customer_id=*}/campaignBudgets:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CAMPAIGNBUDGETSERVICE)

DESCRIPTOR.services_by_name['CampaignBudgetService'] = _CAMPAIGNBUDGETSERVICE

# @@protoc_insertion_point(module_scope)
