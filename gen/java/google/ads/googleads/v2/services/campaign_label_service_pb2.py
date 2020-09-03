# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/services/campaign_label_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.resources import campaign_label_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/services/campaign_label_service.proto',
  package='google.ads.googleads.v2.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v2.servicesB\031CampaignLabelServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2.Services\312\002 Google\\Ads\\GoogleAds\\V2\\Services\352\002$Google::Ads::GoogleAds::V2::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v2/services/campaign_label_service.proto\x12 google.ads.googleads.v2.services\x1a\x36google/ads/googleads/v2/resources/campaign_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"`\n\x17GetCampaignLabelRequest\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&googleads.googleapis.com/CampaignLabel\"\xba\x01\n\x1bMutateCampaignLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12Q\n\noperations\x18\x02 \x03(\x0b\x32\x38.google.ads.googleads.v2.services.CampaignLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"{\n\x16\x43\x61mpaignLabelOperation\x12\x42\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x30.google.ads.googleads.v2.resources.CampaignLabelH\x00\x12\x10\n\x06remove\x18\x02 \x01(\tH\x00\x42\x0b\n\toperation\"\x9f\x01\n\x1cMutateCampaignLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12L\n\x07results\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v2.services.MutateCampaignLabelResult\"2\n\x19MutateCampaignLabelResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xf0\x03\n\x14\x43\x61mpaignLabelService\x12\xc9\x01\n\x10GetCampaignLabel\x12\x39.google.ads.googleads.v2.services.GetCampaignLabelRequest\x1a\x30.google.ads.googleads.v2.resources.CampaignLabel\"H\x82\xd3\xe4\x93\x02\x32\x12\x30/v2/{resource_name=customers/*/campaignLabels/*}\xda\x41\rresource_name\x12\xee\x01\n\x14MutateCampaignLabels\x12=.google.ads.googleads.v2.services.MutateCampaignLabelsRequest\x1a>.google.ads.googleads.v2.services.MutateCampaignLabelsResponse\"W\x82\xd3\xe4\x93\x02\x38\"3/v2/customers/{customer_id=*}/campaignLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x80\x02\n$com.google.ads.googleads.v2.servicesB\x19\x43\x61mpaignLabelServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V2.Services\xca\x02 Google\\Ads\\GoogleAds\\V2\\Services\xea\x02$Google::Ads::GoogleAds::V2::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__label__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCAMPAIGNLABELREQUEST = _descriptor.Descriptor(
  name='GetCampaignLabelRequest',
  full_name='google.ads.googleads.v2.services.GetCampaignLabelRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.services.GetCampaignLabelRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A(\n&googleads.googleapis.com/CampaignLabel', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=295,
  serialized_end=391,
)


_MUTATECAMPAIGNLABELSREQUEST = _descriptor.Descriptor(
  name='MutateCampaignLabelsRequest',
  full_name='google.ads.googleads.v2.services.MutateCampaignLabelsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsRequest.validate_only', index=3,
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
  serialized_start=394,
  serialized_end=580,
)


_CAMPAIGNLABELOPERATION = _descriptor.Descriptor(
  name='CampaignLabelOperation',
  full_name='google.ads.googleads.v2.services.CampaignLabelOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v2.services.CampaignLabelOperation.create', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v2.services.CampaignLabelOperation.remove', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
      name='operation', full_name='google.ads.googleads.v2.services.CampaignLabelOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=582,
  serialized_end=705,
)


_MUTATECAMPAIGNLABELSRESPONSE = _descriptor.Descriptor(
  name='MutateCampaignLabelsResponse',
  full_name='google.ads.googleads.v2.services.MutateCampaignLabelsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v2.services.MutateCampaignLabelsResponse.results', index=1,
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
  serialized_start=708,
  serialized_end=867,
)


_MUTATECAMPAIGNLABELRESULT = _descriptor.Descriptor(
  name='MutateCampaignLabelResult',
  full_name='google.ads.googleads.v2.services.MutateCampaignLabelResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.services.MutateCampaignLabelResult.resource_name', index=0,
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
  serialized_start=869,
  serialized_end=919,
)

_MUTATECAMPAIGNLABELSREQUEST.fields_by_name['operations'].message_type = _CAMPAIGNLABELOPERATION
_CAMPAIGNLABELOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__label__pb2._CAMPAIGNLABEL
_CAMPAIGNLABELOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNLABELOPERATION.fields_by_name['create'])
_CAMPAIGNLABELOPERATION.fields_by_name['create'].containing_oneof = _CAMPAIGNLABELOPERATION.oneofs_by_name['operation']
_CAMPAIGNLABELOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNLABELOPERATION.fields_by_name['remove'])
_CAMPAIGNLABELOPERATION.fields_by_name['remove'].containing_oneof = _CAMPAIGNLABELOPERATION.oneofs_by_name['operation']
_MUTATECAMPAIGNLABELSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECAMPAIGNLABELSRESPONSE.fields_by_name['results'].message_type = _MUTATECAMPAIGNLABELRESULT
DESCRIPTOR.message_types_by_name['GetCampaignLabelRequest'] = _GETCAMPAIGNLABELREQUEST
DESCRIPTOR.message_types_by_name['MutateCampaignLabelsRequest'] = _MUTATECAMPAIGNLABELSREQUEST
DESCRIPTOR.message_types_by_name['CampaignLabelOperation'] = _CAMPAIGNLABELOPERATION
DESCRIPTOR.message_types_by_name['MutateCampaignLabelsResponse'] = _MUTATECAMPAIGNLABELSRESPONSE
DESCRIPTOR.message_types_by_name['MutateCampaignLabelResult'] = _MUTATECAMPAIGNLABELRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCampaignLabelRequest = _reflection.GeneratedProtocolMessageType('GetCampaignLabelRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCAMPAIGNLABELREQUEST,
  '__module__' : 'google.ads.googleads.v2.services.campaign_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.GetCampaignLabelRequest)
  })
_sym_db.RegisterMessage(GetCampaignLabelRequest)

MutateCampaignLabelsRequest = _reflection.GeneratedProtocolMessageType('MutateCampaignLabelsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNLABELSREQUEST,
  '__module__' : 'google.ads.googleads.v2.services.campaign_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignLabelsRequest)
  })
_sym_db.RegisterMessage(MutateCampaignLabelsRequest)

CampaignLabelOperation = _reflection.GeneratedProtocolMessageType('CampaignLabelOperation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNLABELOPERATION,
  '__module__' : 'google.ads.googleads.v2.services.campaign_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.CampaignLabelOperation)
  })
_sym_db.RegisterMessage(CampaignLabelOperation)

MutateCampaignLabelsResponse = _reflection.GeneratedProtocolMessageType('MutateCampaignLabelsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNLABELSRESPONSE,
  '__module__' : 'google.ads.googleads.v2.services.campaign_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignLabelsResponse)
  })
_sym_db.RegisterMessage(MutateCampaignLabelsResponse)

MutateCampaignLabelResult = _reflection.GeneratedProtocolMessageType('MutateCampaignLabelResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNLABELRESULT,
  '__module__' : 'google.ads.googleads.v2.services.campaign_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.MutateCampaignLabelResult)
  })
_sym_db.RegisterMessage(MutateCampaignLabelResult)


DESCRIPTOR._options = None
_GETCAMPAIGNLABELREQUEST.fields_by_name['resource_name']._options = None
_MUTATECAMPAIGNLABELSREQUEST.fields_by_name['customer_id']._options = None
_MUTATECAMPAIGNLABELSREQUEST.fields_by_name['operations']._options = None

_CAMPAIGNLABELSERVICE = _descriptor.ServiceDescriptor(
  name='CampaignLabelService',
  full_name='google.ads.googleads.v2.services.CampaignLabelService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=922,
  serialized_end=1418,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCampaignLabel',
    full_name='google.ads.googleads.v2.services.CampaignLabelService.GetCampaignLabel',
    index=0,
    containing_service=None,
    input_type=_GETCAMPAIGNLABELREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_campaign__label__pb2._CAMPAIGNLABEL,
    serialized_options=b'\202\323\344\223\0022\0220/v2/{resource_name=customers/*/campaignLabels/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCampaignLabels',
    full_name='google.ads.googleads.v2.services.CampaignLabelService.MutateCampaignLabels',
    index=1,
    containing_service=None,
    input_type=_MUTATECAMPAIGNLABELSREQUEST,
    output_type=_MUTATECAMPAIGNLABELSRESPONSE,
    serialized_options=b'\202\323\344\223\0028\"3/v2/customers/{customer_id=*}/campaignLabels:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CAMPAIGNLABELSERVICE)

DESCRIPTOR.services_by_name['CampaignLabelService'] = _CAMPAIGNLABELSERVICE

# @@protoc_insertion_point(module_scope)
