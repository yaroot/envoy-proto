# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/campaign_asset_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.resources import campaign_asset_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__asset__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/campaign_asset_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\031CampaignAssetServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v7/services/campaign_asset_service.proto\x12 google.ads.googleads.v7.services\x1a\x36google/ads/googleads/v7/resources/campaign_asset.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"`\n\x17GetCampaignAssetRequest\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&googleads.googleapis.com/CampaignAsset\"\xba\x01\n\x1bMutateCampaignAssetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12Q\n\noperations\x18\x02 \x03(\x0b\x32\x38.google.ads.googleads.v7.services.CampaignAssetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xf0\x01\n\x16\x43\x61mpaignAssetOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x42\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x30.google.ads.googleads.v7.resources.CampaignAssetH\x00\x12\x42\n\x06update\x18\x03 \x01(\x0b\x32\x30.google.ads.googleads.v7.resources.CampaignAssetH\x00\x12\x10\n\x06remove\x18\x02 \x01(\tH\x00\x42\x0b\n\toperation\"\x9f\x01\n\x1cMutateCampaignAssetsResponse\x12\x31\n\x15partial_failure_error\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12L\n\x07results\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v7.services.MutateCampaignAssetResult\"2\n\x19MutateCampaignAssetResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\x9a\x04\n\x14\x43\x61mpaignAssetService\x12\xc9\x01\n\x10GetCampaignAsset\x12\x39.google.ads.googleads.v7.services.GetCampaignAssetRequest\x1a\x30.google.ads.googleads.v7.resources.CampaignAsset\"H\x82\xd3\xe4\x93\x02\x32\x12\x30/v7/{resource_name=customers/*/campaignAssets/*}\xda\x41\rresource_name\x12\xee\x01\n\x14MutateCampaignAssets\x12=.google.ads.googleads.v7.services.MutateCampaignAssetsRequest\x1a>.google.ads.googleads.v7.services.MutateCampaignAssetsResponse\"W\x82\xd3\xe4\x93\x02\x38\"3/v7/customers/{customer_id=*}/campaignAssets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x80\x02\n$com.google.ads.googleads.v7.servicesB\x19\x43\x61mpaignAssetServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__asset__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCAMPAIGNASSETREQUEST = _descriptor.Descriptor(
  name='GetCampaignAssetRequest',
  full_name='google.ads.googleads.v7.services.GetCampaignAssetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetCampaignAssetRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A(\n&googleads.googleapis.com/CampaignAsset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=425,
)


_MUTATECAMPAIGNASSETSREQUEST = _descriptor.Descriptor(
  name='MutateCampaignAssetsRequest',
  full_name='google.ads.googleads.v7.services.MutateCampaignAssetsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsRequest.validate_only', index=3,
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
  serialized_start=428,
  serialized_end=614,
)


_CAMPAIGNASSETOPERATION = _descriptor.Descriptor(
  name='CampaignAssetOperation',
  full_name='google.ads.googleads.v7.services.CampaignAssetOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v7.services.CampaignAssetOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v7.services.CampaignAssetOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v7.services.CampaignAssetOperation.update', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v7.services.CampaignAssetOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v7.services.CampaignAssetOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=617,
  serialized_end=857,
)


_MUTATECAMPAIGNASSETSRESPONSE = _descriptor.Descriptor(
  name='MutateCampaignAssetsResponse',
  full_name='google.ads.googleads.v7.services.MutateCampaignAssetsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsResponse.partial_failure_error', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v7.services.MutateCampaignAssetsResponse.results', index=1,
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
  serialized_start=860,
  serialized_end=1019,
)


_MUTATECAMPAIGNASSETRESULT = _descriptor.Descriptor(
  name='MutateCampaignAssetResult',
  full_name='google.ads.googleads.v7.services.MutateCampaignAssetResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.MutateCampaignAssetResult.resource_name', index=0,
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
  serialized_start=1021,
  serialized_end=1071,
)

_MUTATECAMPAIGNASSETSREQUEST.fields_by_name['operations'].message_type = _CAMPAIGNASSETOPERATION
_CAMPAIGNASSETOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CAMPAIGNASSETOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__asset__pb2._CAMPAIGNASSET
_CAMPAIGNASSETOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__asset__pb2._CAMPAIGNASSET
_CAMPAIGNASSETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNASSETOPERATION.fields_by_name['create'])
_CAMPAIGNASSETOPERATION.fields_by_name['create'].containing_oneof = _CAMPAIGNASSETOPERATION.oneofs_by_name['operation']
_CAMPAIGNASSETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNASSETOPERATION.fields_by_name['update'])
_CAMPAIGNASSETOPERATION.fields_by_name['update'].containing_oneof = _CAMPAIGNASSETOPERATION.oneofs_by_name['operation']
_CAMPAIGNASSETOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNASSETOPERATION.fields_by_name['remove'])
_CAMPAIGNASSETOPERATION.fields_by_name['remove'].containing_oneof = _CAMPAIGNASSETOPERATION.oneofs_by_name['operation']
_MUTATECAMPAIGNASSETSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECAMPAIGNASSETSRESPONSE.fields_by_name['results'].message_type = _MUTATECAMPAIGNASSETRESULT
DESCRIPTOR.message_types_by_name['GetCampaignAssetRequest'] = _GETCAMPAIGNASSETREQUEST
DESCRIPTOR.message_types_by_name['MutateCampaignAssetsRequest'] = _MUTATECAMPAIGNASSETSREQUEST
DESCRIPTOR.message_types_by_name['CampaignAssetOperation'] = _CAMPAIGNASSETOPERATION
DESCRIPTOR.message_types_by_name['MutateCampaignAssetsResponse'] = _MUTATECAMPAIGNASSETSRESPONSE
DESCRIPTOR.message_types_by_name['MutateCampaignAssetResult'] = _MUTATECAMPAIGNASSETRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCampaignAssetRequest = _reflection.GeneratedProtocolMessageType('GetCampaignAssetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCAMPAIGNASSETREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.campaign_asset_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetCampaignAssetRequest)
  })
_sym_db.RegisterMessage(GetCampaignAssetRequest)

MutateCampaignAssetsRequest = _reflection.GeneratedProtocolMessageType('MutateCampaignAssetsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNASSETSREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.campaign_asset_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignAssetsRequest)
  })
_sym_db.RegisterMessage(MutateCampaignAssetsRequest)

CampaignAssetOperation = _reflection.GeneratedProtocolMessageType('CampaignAssetOperation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNASSETOPERATION,
  '__module__' : 'google.ads.googleads.v7.services.campaign_asset_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.CampaignAssetOperation)
  })
_sym_db.RegisterMessage(CampaignAssetOperation)

MutateCampaignAssetsResponse = _reflection.GeneratedProtocolMessageType('MutateCampaignAssetsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNASSETSRESPONSE,
  '__module__' : 'google.ads.googleads.v7.services.campaign_asset_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignAssetsResponse)
  })
_sym_db.RegisterMessage(MutateCampaignAssetsResponse)

MutateCampaignAssetResult = _reflection.GeneratedProtocolMessageType('MutateCampaignAssetResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNASSETRESULT,
  '__module__' : 'google.ads.googleads.v7.services.campaign_asset_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignAssetResult)
  })
_sym_db.RegisterMessage(MutateCampaignAssetResult)


DESCRIPTOR._options = None
_GETCAMPAIGNASSETREQUEST.fields_by_name['resource_name']._options = None
_MUTATECAMPAIGNASSETSREQUEST.fields_by_name['customer_id']._options = None
_MUTATECAMPAIGNASSETSREQUEST.fields_by_name['operations']._options = None

_CAMPAIGNASSETSERVICE = _descriptor.ServiceDescriptor(
  name='CampaignAssetService',
  full_name='google.ads.googleads.v7.services.CampaignAssetService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1074,
  serialized_end=1612,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCampaignAsset',
    full_name='google.ads.googleads.v7.services.CampaignAssetService.GetCampaignAsset',
    index=0,
    containing_service=None,
    input_type=_GETCAMPAIGNASSETREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_campaign__asset__pb2._CAMPAIGNASSET,
    serialized_options=b'\202\323\344\223\0022\0220/v7/{resource_name=customers/*/campaignAssets/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCampaignAssets',
    full_name='google.ads.googleads.v7.services.CampaignAssetService.MutateCampaignAssets',
    index=1,
    containing_service=None,
    input_type=_MUTATECAMPAIGNASSETSREQUEST,
    output_type=_MUTATECAMPAIGNASSETSRESPONSE,
    serialized_options=b'\202\323\344\223\0028\"3/v7/customers/{customer_id=*}/campaignAssets:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CAMPAIGNASSETSERVICE)

DESCRIPTOR.services_by_name['CampaignAssetService'] = _CAMPAIGNASSETSERVICE

# @@protoc_insertion_point(module_scope)
