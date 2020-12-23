# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/resources/campaign_bid_modifier.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_common_dot_criteria__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/resources/campaign_bid_modifier.proto',
  package='google.ads.googleads.v6.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v6.resourcesB\030CampaignBidModifierProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Resources\312\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%Google::Ads::GoogleAds::V6::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v6/resources/campaign_bid_modifier.proto\x12!google.ads.googleads.v6.resources\x1a-google/ads/googleads/v6/common/criteria.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xef\x03\n\x13\x43\x61mpaignBidModifier\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x05\xfa\x41.\n,googleads.googleapis.com/CampaignBidModifier\x12@\n\x08\x63\x61mpaign\x18\x06 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CampaignH\x01\x88\x01\x01\x12\x1e\n\x0c\x63riterion_id\x18\x07 \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x19\n\x0c\x62id_modifier\x18\x08 \x01(\x01H\x03\x88\x01\x01\x12T\n\x10interaction_type\x18\x05 \x01(\x0b\x32\x33.google.ads.googleads.v6.common.InteractionTypeInfoB\x03\xe0\x41\x05H\x00:|\xea\x41y\n,googleads.googleapis.com/CampaignBidModifier\x12Icustomers/{customer_id}/campaignBidModifiers/{campaign_id}~{criterion_id}B\x0b\n\tcriterionB\x0b\n\t_campaignB\x0f\n\r_criterion_idB\x0f\n\r_bid_modifierB\x85\x02\n%com.google.ads.googleads.v6.resourcesB\x18\x43\x61mpaignBidModifierProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V6.Resources\xca\x02!Google\\Ads\\GoogleAds\\V6\\Resources\xea\x02%Google::Ads::GoogleAds::V6::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_common_dot_criteria__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CAMPAIGNBIDMODIFIER = _descriptor.Descriptor(
  name='CampaignBidModifier',
  full_name='google.ads.googleads.v6.resources.CampaignBidModifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A.\n,googleads.googleapis.com/CampaignBidModifier', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.campaign', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A#\n!googleads.googleapis.com/Campaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='criterion_id', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.criterion_id', index=2,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bid_modifier', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.bid_modifier', index=3,
      number=8, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='interaction_type', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.interaction_type', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Ay\n,googleads.googleapis.com/CampaignBidModifier\022Icustomers/{customer_id}/campaignBidModifiers/{campaign_id}~{criterion_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='criterion', full_name='google.ads.googleads.v6.resources.CampaignBidModifier.criterion',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_campaign', full_name='google.ads.googleads.v6.resources.CampaignBidModifier._campaign',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_criterion_id', full_name='google.ads.googleads.v6.resources.CampaignBidModifier._criterion_id',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_bid_modifier', full_name='google.ads.googleads.v6.resources.CampaignBidModifier._bid_modifier',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=238,
  serialized_end=733,
)

_CAMPAIGNBIDMODIFIER.fields_by_name['interaction_type'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_common_dot_criteria__pb2._INTERACTIONTYPEINFO
_CAMPAIGNBIDMODIFIER.oneofs_by_name['criterion'].fields.append(
  _CAMPAIGNBIDMODIFIER.fields_by_name['interaction_type'])
_CAMPAIGNBIDMODIFIER.fields_by_name['interaction_type'].containing_oneof = _CAMPAIGNBIDMODIFIER.oneofs_by_name['criterion']
_CAMPAIGNBIDMODIFIER.oneofs_by_name['_campaign'].fields.append(
  _CAMPAIGNBIDMODIFIER.fields_by_name['campaign'])
_CAMPAIGNBIDMODIFIER.fields_by_name['campaign'].containing_oneof = _CAMPAIGNBIDMODIFIER.oneofs_by_name['_campaign']
_CAMPAIGNBIDMODIFIER.oneofs_by_name['_criterion_id'].fields.append(
  _CAMPAIGNBIDMODIFIER.fields_by_name['criterion_id'])
_CAMPAIGNBIDMODIFIER.fields_by_name['criterion_id'].containing_oneof = _CAMPAIGNBIDMODIFIER.oneofs_by_name['_criterion_id']
_CAMPAIGNBIDMODIFIER.oneofs_by_name['_bid_modifier'].fields.append(
  _CAMPAIGNBIDMODIFIER.fields_by_name['bid_modifier'])
_CAMPAIGNBIDMODIFIER.fields_by_name['bid_modifier'].containing_oneof = _CAMPAIGNBIDMODIFIER.oneofs_by_name['_bid_modifier']
DESCRIPTOR.message_types_by_name['CampaignBidModifier'] = _CAMPAIGNBIDMODIFIER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CampaignBidModifier = _reflection.GeneratedProtocolMessageType('CampaignBidModifier', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNBIDMODIFIER,
  '__module__' : 'google.ads.googleads.v6.resources.campaign_bid_modifier_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.resources.CampaignBidModifier)
  })
_sym_db.RegisterMessage(CampaignBidModifier)


DESCRIPTOR._options = None
_CAMPAIGNBIDMODIFIER.fields_by_name['resource_name']._options = None
_CAMPAIGNBIDMODIFIER.fields_by_name['campaign']._options = None
_CAMPAIGNBIDMODIFIER.fields_by_name['criterion_id']._options = None
_CAMPAIGNBIDMODIFIER.fields_by_name['interaction_type']._options = None
_CAMPAIGNBIDMODIFIER._options = None
# @@protoc_insertion_point(module_scope)