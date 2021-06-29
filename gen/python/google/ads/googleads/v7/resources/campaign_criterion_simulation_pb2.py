# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/campaign_criterion_simulation.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.common import simulation_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_simulation__pb2
from google.ads.googleads.v7.enums import simulation_modification_method_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__modification__method__pb2
from google.ads.googleads.v7.enums import simulation_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/campaign_criterion_simulation.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB CampaignCriterionSimulationProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v7/resources/campaign_criterion_simulation.proto\x12!google.ads.googleads.v7.resources\x1a/google/ads/googleads/v7/common/simulation.proto\x1a\x42google/ads/googleads/v7/enums/simulation_modification_method.proto\x1a\x33google/ads/googleads/v7/enums/simulation_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xb9\x06\n\x1b\x43\x61mpaignCriterionSimulation\x12S\n\rresource_name\x18\x01 \x01(\tB<\xe0\x41\x03\xfa\x41\x36\n4googleads.googleapis.com/CampaignCriterionSimulation\x12\x1d\n\x0b\x63\x61mpaign_id\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1e\n\x0c\x63riterion_id\x18\n \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12S\n\x04type\x18\x04 \x01(\x0e\x32@.google.ads.googleads.v7.enums.SimulationTypeEnum.SimulationTypeB\x03\xe0\x41\x03\x12~\n\x13modification_method\x18\x05 \x01(\x0e\x32\\.google.ads.googleads.v7.enums.SimulationModificationMethodEnum.SimulationModificationMethodB\x03\xe0\x41\x03\x12\x1c\n\nstart_date\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\x1a\n\x08\x65nd_date\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12\x66\n\x17\x62id_modifier_point_list\x18\x08 \x01(\x0b\x32>.google.ads.googleads.v7.common.BidModifierSimulationPointListB\x03\xe0\x41\x03H\x00:\xc3\x01\xea\x41\xbf\x01\n4googleads.googleapis.com/CampaignCriterionSimulation\x12\x86\x01\x63ustomers/{customer_id}/campaignCriterionSimulations/{campaign_id}~{criterion_id}~{type}~{modification_method}~{start_date}~{end_date}B\x0c\n\npoint_listB\x0e\n\x0c_campaign_idB\x0f\n\r_criterion_idB\r\n\x0b_start_dateB\x0b\n\t_end_dateB\x8d\x02\n%com.google.ads.googleads.v7.resourcesB CampaignCriterionSimulationProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_common_dot_simulation__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__modification__method__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CAMPAIGNCRITERIONSIMULATION = _descriptor.Descriptor(
  name='CampaignCriterionSimulation',
  full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A6\n4googleads.googleapis.com/CampaignCriterionSimulation', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign_id', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.campaign_id', index=1,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='criterion_id', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.criterion_id', index=2,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='modification_method', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.modification_method', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_date', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.start_date', index=5,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_date', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.end_date', index=6,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bid_modifier_point_list', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.bid_modifier_point_list', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\277\001\n4googleads.googleapis.com/CampaignCriterionSimulation\022\206\001customers/{customer_id}/campaignCriterionSimulations/{campaign_id}~{criterion_id}~{type}~{modification_method}~{start_date}~{end_date}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='point_list', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation.point_list',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_campaign_id', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation._campaign_id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_criterion_id', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation._criterion_id',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_start_date', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation._start_date',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_end_date', full_name='google.ads.googleads.v7.resources.CampaignCriterionSimulation._end_date',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=369,
  serialized_end=1194,
)

_CAMPAIGNCRITERIONSIMULATION.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__type__pb2._SIMULATIONTYPEENUM_SIMULATIONTYPE
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['modification_method'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_simulation__modification__method__pb2._SIMULATIONMODIFICATIONMETHODENUM_SIMULATIONMODIFICATIONMETHOD
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['bid_modifier_point_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_simulation__pb2._BIDMODIFIERSIMULATIONPOINTLIST
_CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['point_list'].fields.append(
  _CAMPAIGNCRITERIONSIMULATION.fields_by_name['bid_modifier_point_list'])
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['bid_modifier_point_list'].containing_oneof = _CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['point_list']
_CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_campaign_id'].fields.append(
  _CAMPAIGNCRITERIONSIMULATION.fields_by_name['campaign_id'])
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['campaign_id'].containing_oneof = _CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_campaign_id']
_CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_criterion_id'].fields.append(
  _CAMPAIGNCRITERIONSIMULATION.fields_by_name['criterion_id'])
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['criterion_id'].containing_oneof = _CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_criterion_id']
_CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_start_date'].fields.append(
  _CAMPAIGNCRITERIONSIMULATION.fields_by_name['start_date'])
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['start_date'].containing_oneof = _CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_start_date']
_CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_end_date'].fields.append(
  _CAMPAIGNCRITERIONSIMULATION.fields_by_name['end_date'])
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['end_date'].containing_oneof = _CAMPAIGNCRITERIONSIMULATION.oneofs_by_name['_end_date']
DESCRIPTOR.message_types_by_name['CampaignCriterionSimulation'] = _CAMPAIGNCRITERIONSIMULATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CampaignCriterionSimulation = _reflection.GeneratedProtocolMessageType('CampaignCriterionSimulation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNCRITERIONSIMULATION,
  '__module__' : 'google.ads.googleads.v7.resources.campaign_criterion_simulation_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.CampaignCriterionSimulation)
  })
_sym_db.RegisterMessage(CampaignCriterionSimulation)


DESCRIPTOR._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['resource_name']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['campaign_id']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['criterion_id']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['type']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['modification_method']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['start_date']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['end_date']._options = None
_CAMPAIGNCRITERIONSIMULATION.fields_by_name['bid_modifier_point_list']._options = None
_CAMPAIGNCRITERIONSIMULATION._options = None
# @@protoc_insertion_point(module_scope)
