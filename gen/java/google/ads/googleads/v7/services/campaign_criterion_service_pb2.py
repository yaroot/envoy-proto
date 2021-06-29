# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/campaign_criterion_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v7.resources import campaign_criterion_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/campaign_criterion_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\035CampaignCriterionServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nAgoogle/ads/googleads/v7/services/campaign_criterion_service.proto\x12 google.ads.googleads.v7.services\x1a\x39google/ads/googleads/v7/enums/response_content_type.proto\x1a:google/ads/googleads/v7/resources/campaign_criterion.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"h\n\x1bGetCampaignCriterionRequest\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*googleads.googleapis.com/CampaignCriterion\"\xab\x02\n\x1dMutateCampaignCriteriaRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12U\n\noperations\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v7.services.CampaignCriterionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v7.enums.ResponseContentTypeEnum.ResponseContentType\"\xfc\x01\n\x1a\x43\x61mpaignCriterionOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x46\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x34.google.ads.googleads.v7.resources.CampaignCriterionH\x00\x12\x46\n\x06update\x18\x02 \x01(\x0b\x32\x34.google.ads.googleads.v7.resources.CampaignCriterionH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xa5\x01\n\x1eMutateCampaignCriteriaResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12P\n\x07results\x18\x02 \x03(\x0b\x32?.google.ads.googleads.v7.services.MutateCampaignCriterionResult\"\x88\x01\n\x1dMutateCampaignCriterionResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12P\n\x12\x63\x61mpaign_criterion\x18\x02 \x01(\x0b\x32\x34.google.ads.googleads.v7.resources.CampaignCriterion2\xb4\x04\n\x18\x43\x61mpaignCriterionService\x12\xd7\x01\n\x14GetCampaignCriterion\x12=.google.ads.googleads.v7.services.GetCampaignCriterionRequest\x1a\x34.google.ads.googleads.v7.resources.CampaignCriterion\"J\x82\xd3\xe4\x93\x02\x34\x12\x32/v7/{resource_name=customers/*/campaignCriteria/*}\xda\x41\rresource_name\x12\xf6\x01\n\x16MutateCampaignCriteria\x12?.google.ads.googleads.v7.services.MutateCampaignCriteriaRequest\x1a@.google.ads.googleads.v7.services.MutateCampaignCriteriaResponse\"Y\x82\xd3\xe4\x93\x02:\"5/v7/customers/{customer_id=*}/campaignCriteria:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x84\x02\n$com.google.ads.googleads.v7.servicesB\x1d\x43\x61mpaignCriterionServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCAMPAIGNCRITERIONREQUEST = _descriptor.Descriptor(
  name='GetCampaignCriterionRequest',
  full_name='google.ads.googleads.v7.services.GetCampaignCriterionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetCampaignCriterionRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*googleads.googleapis.com/CampaignCriterion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=396,
  serialized_end=500,
)


_MUTATECAMPAIGNCRITERIAREQUEST = _descriptor.Descriptor(
  name='MutateCampaignCriteriaRequest',
  full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaRequest.response_content_type', index=4,
      number=5, type=14, cpp_type=8, label=1,
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
  serialized_start=503,
  serialized_end=802,
)


_CAMPAIGNCRITERIONOPERATION = _descriptor.Descriptor(
  name='CampaignCriterionOperation',
  full_name='google.ads.googleads.v7.services.CampaignCriterionOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v7.services.CampaignCriterionOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v7.services.CampaignCriterionOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v7.services.CampaignCriterionOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v7.services.CampaignCriterionOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v7.services.CampaignCriterionOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=805,
  serialized_end=1057,
)


_MUTATECAMPAIGNCRITERIARESPONSE = _descriptor.Descriptor(
  name='MutateCampaignCriteriaResponse',
  full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v7.services.MutateCampaignCriteriaResponse.results', index=1,
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
  serialized_start=1060,
  serialized_end=1225,
)


_MUTATECAMPAIGNCRITERIONRESULT = _descriptor.Descriptor(
  name='MutateCampaignCriterionResult',
  full_name='google.ads.googleads.v7.services.MutateCampaignCriterionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.MutateCampaignCriterionResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign_criterion', full_name='google.ads.googleads.v7.services.MutateCampaignCriterionResult.campaign_criterion', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1228,
  serialized_end=1364,
)

_MUTATECAMPAIGNCRITERIAREQUEST.fields_by_name['operations'].message_type = _CAMPAIGNCRITERIONOPERATION
_MUTATECAMPAIGNCRITERIAREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_CAMPAIGNCRITERIONOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CAMPAIGNCRITERIONOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2._CAMPAIGNCRITERION
_CAMPAIGNCRITERIONOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2._CAMPAIGNCRITERION
_CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNCRITERIONOPERATION.fields_by_name['create'])
_CAMPAIGNCRITERIONOPERATION.fields_by_name['create'].containing_oneof = _CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation']
_CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNCRITERIONOPERATION.fields_by_name['update'])
_CAMPAIGNCRITERIONOPERATION.fields_by_name['update'].containing_oneof = _CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation']
_CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNCRITERIONOPERATION.fields_by_name['remove'])
_CAMPAIGNCRITERIONOPERATION.fields_by_name['remove'].containing_oneof = _CAMPAIGNCRITERIONOPERATION.oneofs_by_name['operation']
_MUTATECAMPAIGNCRITERIARESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECAMPAIGNCRITERIARESPONSE.fields_by_name['results'].message_type = _MUTATECAMPAIGNCRITERIONRESULT
_MUTATECAMPAIGNCRITERIONRESULT.fields_by_name['campaign_criterion'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2._CAMPAIGNCRITERION
DESCRIPTOR.message_types_by_name['GetCampaignCriterionRequest'] = _GETCAMPAIGNCRITERIONREQUEST
DESCRIPTOR.message_types_by_name['MutateCampaignCriteriaRequest'] = _MUTATECAMPAIGNCRITERIAREQUEST
DESCRIPTOR.message_types_by_name['CampaignCriterionOperation'] = _CAMPAIGNCRITERIONOPERATION
DESCRIPTOR.message_types_by_name['MutateCampaignCriteriaResponse'] = _MUTATECAMPAIGNCRITERIARESPONSE
DESCRIPTOR.message_types_by_name['MutateCampaignCriterionResult'] = _MUTATECAMPAIGNCRITERIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCampaignCriterionRequest = _reflection.GeneratedProtocolMessageType('GetCampaignCriterionRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCAMPAIGNCRITERIONREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.campaign_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetCampaignCriterionRequest)
  })
_sym_db.RegisterMessage(GetCampaignCriterionRequest)

MutateCampaignCriteriaRequest = _reflection.GeneratedProtocolMessageType('MutateCampaignCriteriaRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNCRITERIAREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.campaign_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignCriteriaRequest)
  })
_sym_db.RegisterMessage(MutateCampaignCriteriaRequest)

CampaignCriterionOperation = _reflection.GeneratedProtocolMessageType('CampaignCriterionOperation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNCRITERIONOPERATION,
  '__module__' : 'google.ads.googleads.v7.services.campaign_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.CampaignCriterionOperation)
  })
_sym_db.RegisterMessage(CampaignCriterionOperation)

MutateCampaignCriteriaResponse = _reflection.GeneratedProtocolMessageType('MutateCampaignCriteriaResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNCRITERIARESPONSE,
  '__module__' : 'google.ads.googleads.v7.services.campaign_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignCriteriaResponse)
  })
_sym_db.RegisterMessage(MutateCampaignCriteriaResponse)

MutateCampaignCriterionResult = _reflection.GeneratedProtocolMessageType('MutateCampaignCriterionResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNCRITERIONRESULT,
  '__module__' : 'google.ads.googleads.v7.services.campaign_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignCriterionResult)
  })
_sym_db.RegisterMessage(MutateCampaignCriterionResult)


DESCRIPTOR._options = None
_GETCAMPAIGNCRITERIONREQUEST.fields_by_name['resource_name']._options = None
_MUTATECAMPAIGNCRITERIAREQUEST.fields_by_name['customer_id']._options = None
_MUTATECAMPAIGNCRITERIAREQUEST.fields_by_name['operations']._options = None

_CAMPAIGNCRITERIONSERVICE = _descriptor.ServiceDescriptor(
  name='CampaignCriterionService',
  full_name='google.ads.googleads.v7.services.CampaignCriterionService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1367,
  serialized_end=1931,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCampaignCriterion',
    full_name='google.ads.googleads.v7.services.CampaignCriterionService.GetCampaignCriterion',
    index=0,
    containing_service=None,
    input_type=_GETCAMPAIGNCRITERIONREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__criterion__pb2._CAMPAIGNCRITERION,
    serialized_options=b'\202\323\344\223\0024\0222/v7/{resource_name=customers/*/campaignCriteria/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCampaignCriteria',
    full_name='google.ads.googleads.v7.services.CampaignCriterionService.MutateCampaignCriteria',
    index=1,
    containing_service=None,
    input_type=_MUTATECAMPAIGNCRITERIAREQUEST,
    output_type=_MUTATECAMPAIGNCRITERIARESPONSE,
    serialized_options=b'\202\323\344\223\002:\"5/v7/customers/{customer_id=*}/campaignCriteria:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CAMPAIGNCRITERIONSERVICE)

DESCRIPTOR.services_by_name['CampaignCriterionService'] = _CAMPAIGNCRITERIONSERVICE

# @@protoc_insertion_point(module_scope)
