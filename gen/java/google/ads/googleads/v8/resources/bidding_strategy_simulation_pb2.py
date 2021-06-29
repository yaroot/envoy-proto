# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/bidding_strategy_simulation.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.common import simulation_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_simulation__pb2
from google.ads.googleads.v8.enums import simulation_modification_method_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__modification__method__pb2
from google.ads.googleads.v8.enums import simulation_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/bidding_strategy_simulation.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\036BiddingStrategySimulationProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v8/resources/bidding_strategy_simulation.proto\x12!google.ads.googleads.v8.resources\x1a/google/ads/googleads/v8/common/simulation.proto\x1a\x42google/ads/googleads/v8/enums/simulation_modification_method.proto\x1a\x33google/ads/googleads/v8/enums/simulation_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xa7\x06\n\x19\x42iddingStrategySimulation\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xe0\x41\x03\xfa\x41\x34\n2googleads.googleapis.com/BiddingStrategySimulation\x12 \n\x13\x62idding_strategy_id\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03\x12S\n\x04type\x18\x03 \x01(\x0e\x32@.google.ads.googleads.v8.enums.SimulationTypeEnum.SimulationTypeB\x03\xe0\x41\x03\x12~\n\x13modification_method\x18\x04 \x01(\x0e\x32\\.google.ads.googleads.v8.enums.SimulationModificationMethodEnum.SimulationModificationMethodB\x03\xe0\x41\x03\x12\x17\n\nstart_date\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x15\n\x08\x65nd_date\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12\x62\n\x15target_cpa_point_list\x18\x07 \x01(\x0b\x32<.google.ads.googleads.v8.common.TargetCpaSimulationPointListB\x03\xe0\x41\x03H\x00\x12\x64\n\x16target_roas_point_list\x18\x08 \x01(\x0b\x32=.google.ads.googleads.v8.common.TargetRoasSimulationPointListB\x03\xe0\x41\x03H\x00:\xb7\x01\xea\x41\xb3\x01\n2googleads.googleapis.com/BiddingStrategySimulation\x12}customers/{customer_id}/biddingStrategySimulations/{bidding_strategy_id}~{type}~{modification_method}~{start_date}~{end_date}B\x0c\n\npoint_listB\x8b\x02\n%com.google.ads.googleads.v8.resourcesB\x1e\x42iddingStrategySimulationProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_common_dot_simulation__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__modification__method__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_BIDDINGSTRATEGYSIMULATION = _descriptor.Descriptor(
  name='BiddingStrategySimulation',
  full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A4\n2googleads.googleapis.com/BiddingStrategySimulation', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bidding_strategy_id', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.bidding_strategy_id', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='modification_method', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.modification_method', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_date', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.start_date', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_date', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.end_date', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_cpa_point_list', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.target_cpa_point_list', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_roas_point_list', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.target_roas_point_list', index=7,
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
  serialized_options=b'\352A\263\001\n2googleads.googleapis.com/BiddingStrategySimulation\022}customers/{customer_id}/biddingStrategySimulations/{bidding_strategy_id}~{type}~{modification_method}~{start_date}~{end_date}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='point_list', full_name='google.ads.googleads.v8.resources.BiddingStrategySimulation.point_list',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=367,
  serialized_end=1174,
)

_BIDDINGSTRATEGYSIMULATION.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__type__pb2._SIMULATIONTYPEENUM_SIMULATIONTYPE
_BIDDINGSTRATEGYSIMULATION.fields_by_name['modification_method'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_simulation__modification__method__pb2._SIMULATIONMODIFICATIONMETHODENUM_SIMULATIONMODIFICATIONMETHOD
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_cpa_point_list'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_simulation__pb2._TARGETCPASIMULATIONPOINTLIST
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_roas_point_list'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_simulation__pb2._TARGETROASSIMULATIONPOINTLIST
_BIDDINGSTRATEGYSIMULATION.oneofs_by_name['point_list'].fields.append(
  _BIDDINGSTRATEGYSIMULATION.fields_by_name['target_cpa_point_list'])
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_cpa_point_list'].containing_oneof = _BIDDINGSTRATEGYSIMULATION.oneofs_by_name['point_list']
_BIDDINGSTRATEGYSIMULATION.oneofs_by_name['point_list'].fields.append(
  _BIDDINGSTRATEGYSIMULATION.fields_by_name['target_roas_point_list'])
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_roas_point_list'].containing_oneof = _BIDDINGSTRATEGYSIMULATION.oneofs_by_name['point_list']
DESCRIPTOR.message_types_by_name['BiddingStrategySimulation'] = _BIDDINGSTRATEGYSIMULATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BiddingStrategySimulation = _reflection.GeneratedProtocolMessageType('BiddingStrategySimulation', (_message.Message,), {
  'DESCRIPTOR' : _BIDDINGSTRATEGYSIMULATION,
  '__module__' : 'google.ads.googleads.v8.resources.bidding_strategy_simulation_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.BiddingStrategySimulation)
  })
_sym_db.RegisterMessage(BiddingStrategySimulation)


DESCRIPTOR._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['resource_name']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['bidding_strategy_id']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['type']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['modification_method']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['start_date']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['end_date']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_cpa_point_list']._options = None
_BIDDINGSTRATEGYSIMULATION.fields_by_name['target_roas_point_list']._options = None
_BIDDINGSTRATEGYSIMULATION._options = None
# @@protoc_insertion_point(module_scope)