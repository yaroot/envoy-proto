# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/accessible_bidding_strategy.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import bidding_strategy_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_bidding__strategy__type__pb2
from google.ads.googleads.v8.enums import target_impression_share_location_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/accessible_bidding_strategy.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\036AccessibleBiddingStrategyProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v8/resources/accessible_bidding_strategy.proto\x12!google.ads.googleads.v8.resources\x1a\x39google/ads/googleads/v8/enums/bidding_strategy_type.proto\x1a\x44google/ads/googleads/v8/enums/target_impression_share_location.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\x81\x0e\n\x19\x41\x63\x63\x65ssibleBiddingStrategy\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xe0\x41\x03\xfa\x41\x34\n2googleads.googleapis.com/AccessibleBiddingStrategy\x12\x0f\n\x02id\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03\x12\x11\n\x04name\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12]\n\x04type\x18\x04 \x01(\x0e\x32J.google.ads.googleads.v8.enums.BiddingStrategyTypeEnum.BiddingStrategyTypeB\x03\xe0\x41\x03\x12\x1e\n\x11owner_customer_id\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03\x12#\n\x16owner_descriptive_name\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12~\n\x19maximize_conversion_value\x18\x07 \x01(\x0b\x32T.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversionValueB\x03\xe0\x41\x03H\x00\x12u\n\x14maximize_conversions\x18\x08 \x01(\x0b\x32P.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversionsB\x03\xe0\x41\x03H\x00\x12\x61\n\ntarget_cpa\x18\t \x01(\x0b\x32\x46.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetCpaB\x03\xe0\x41\x03H\x00\x12z\n\x17target_impression_share\x18\n \x01(\x0b\x32R.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShareB\x03\xe0\x41\x03H\x00\x12\x63\n\x0btarget_roas\x18\x0b \x01(\x0b\x32G.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetRoasB\x03\xe0\x41\x03H\x00\x12\x65\n\x0ctarget_spend\x18\x0c \x01(\x0b\x32H.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpendB\x03\xe0\x41\x03H\x00\x1a\x33\n\x17MaximizeConversionValue\x12\x18\n\x0btarget_roas\x18\x01 \x01(\x01\x42\x03\xe0\x41\x03\x1a.\n\x13MaximizeConversions\x12\x17\n\ntarget_cpa\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03\x1a\x46\n\tTargetCpa\x12#\n\x11target_cpa_micros\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x42\x14\n\x12_target_cpa_micros\x1a\x93\x01\n\x0bTargetSpend\x12\'\n\x13target_spend_micros\x18\x01 \x01(\x03\x42\x05\x18\x01\xe0\x41\x03H\x00\x88\x01\x01\x12(\n\x16\x63pc_bid_ceiling_micros\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x42\x16\n\x14_target_spend_microsB\x19\n\x17_cpc_bid_ceiling_micros\x1a\x97\x02\n\x15TargetImpressionShare\x12u\n\x08location\x18\x01 \x01(\x0e\x32^.google.ads.googleads.v8.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocationB\x03\xe0\x41\x03\x12%\n\x18location_fraction_micros\x18\x02 \x01(\x03H\x00\x88\x01\x01\x12(\n\x16\x63pc_bid_ceiling_micros\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x42\x1b\n\x19_location_fraction_microsB\x19\n\x17_cpc_bid_ceiling_micros\x1a;\n\nTargetRoas\x12\x1d\n\x0btarget_roas\x18\x01 \x01(\x01\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x42\x0e\n\x0c_target_roas:\x82\x01\xea\x41\x7f\n2googleads.googleapis.com/AccessibleBiddingStrategy\x12Icustomers/{customer_id}/accessibleBiddingStrategies/{bidding_strategy_id}B\x08\n\x06schemeB\x8b\x02\n%com.google.ads.googleads.v8.resourcesB\x1e\x41\x63\x63\x65ssibleBiddingStrategyProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_bidding__strategy__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE = _descriptor.Descriptor(
  name='MaximizeConversionValue',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversionValue',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_roas', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversionValue.target_roas', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1312,
  serialized_end=1363,
)

_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS = _descriptor.Descriptor(
  name='MaximizeConversions',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_cpa', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversions.target_cpa', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1365,
  serialized_end=1411,
)

_ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA = _descriptor.Descriptor(
  name='TargetCpa',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetCpa',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_cpa_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetCpa.target_cpa_micros', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='_target_cpa_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetCpa._target_cpa_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1413,
  serialized_end=1483,
)

_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND = _descriptor.Descriptor(
  name='TargetSpend',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_spend_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend.target_spend_micros', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend.cpc_bid_ceiling_micros', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='_target_spend_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend._target_spend_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1486,
  serialized_end=1633,
)

_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE = _descriptor.Descriptor(
  name='TargetImpressionShare',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare.location', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location_fraction_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare.location_fraction_micros', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare.cpc_bid_ceiling_micros', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='_location_fraction_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare._location_fraction_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1636,
  serialized_end=1915,
)

_ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS = _descriptor.Descriptor(
  name='TargetRoas',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetRoas',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_roas', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetRoas.target_roas', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='_target_roas', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetRoas._target_roas',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1917,
  serialized_end=1976,
)

_ACCESSIBLEBIDDINGSTRATEGY = _descriptor.Descriptor(
  name='AccessibleBiddingStrategy',
  full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A4\n2googleads.googleapis.com/AccessibleBiddingStrategy', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.id', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='owner_customer_id', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.owner_customer_id', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='owner_descriptive_name', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.owner_descriptive_name', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='maximize_conversion_value', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.maximize_conversion_value', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='maximize_conversions', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.maximize_conversions', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_cpa', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.target_cpa', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_impression_share', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.target_impression_share', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_roas', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.target_roas', index=10,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_spend', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.target_spend', index=11,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE, _ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS, _ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA, _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND, _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE, _ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS, ],
  enum_types=[
  ],
  serialized_options=b'\352A\177\n2googleads.googleapis.com/AccessibleBiddingStrategy\022Icustomers/{customer_id}/accessibleBiddingStrategies/{bidding_strategy_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='scheme', full_name='google.ads.googleads.v8.resources.AccessibleBiddingStrategy.scheme',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=326,
  serialized_end=2119,
)

_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.oneofs_by_name['_target_cpa_micros'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.fields_by_name['target_cpa_micros'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.fields_by_name['target_cpa_micros'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.oneofs_by_name['_target_cpa_micros']
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.oneofs_by_name['_target_spend_micros'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['target_spend_micros'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['target_spend_micros'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.oneofs_by_name['_target_spend_micros']
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['cpc_bid_ceiling_micros'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.oneofs_by_name['_cpc_bid_ceiling_micros']
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['location'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2._TARGETIMPRESSIONSHARELOCATIONENUM_TARGETIMPRESSIONSHARELOCATION
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.oneofs_by_name['_location_fraction_micros'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['location_fraction_micros'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['location_fraction_micros'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.oneofs_by_name['_location_fraction_micros']
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['cpc_bid_ceiling_micros'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.oneofs_by_name['_cpc_bid_ceiling_micros']
_ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.containing_type = _ACCESSIBLEBIDDINGSTRATEGY
_ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.oneofs_by_name['_target_roas'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.fields_by_name['target_roas'])
_ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.fields_by_name['target_roas'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.oneofs_by_name['_target_roas']
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_bidding__strategy__type__pb2._BIDDINGSTRATEGYTYPEENUM_BIDDINGSTRATEGYTYPE
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversion_value'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversions'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_cpa'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_impression_share'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_roas'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_spend'].message_type = _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversion_value'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversion_value'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversions'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversions'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_cpa'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_cpa'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_impression_share'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_impression_share'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_roas'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_roas'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
_ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme'].fields.append(
  _ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_spend'])
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_spend'].containing_oneof = _ACCESSIBLEBIDDINGSTRATEGY.oneofs_by_name['scheme']
DESCRIPTOR.message_types_by_name['AccessibleBiddingStrategy'] = _ACCESSIBLEBIDDINGSTRATEGY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AccessibleBiddingStrategy = _reflection.GeneratedProtocolMessageType('AccessibleBiddingStrategy', (_message.Message,), {

  'MaximizeConversionValue' : _reflection.GeneratedProtocolMessageType('MaximizeConversionValue', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversionValue)
    })
  ,

  'MaximizeConversions' : _reflection.GeneratedProtocolMessageType('MaximizeConversions', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.MaximizeConversions)
    })
  ,

  'TargetCpa' : _reflection.GeneratedProtocolMessageType('TargetCpa', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetCpa)
    })
  ,

  'TargetSpend' : _reflection.GeneratedProtocolMessageType('TargetSpend', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetSpend)
    })
  ,

  'TargetImpressionShare' : _reflection.GeneratedProtocolMessageType('TargetImpressionShare', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetImpressionShare)
    })
  ,

  'TargetRoas' : _reflection.GeneratedProtocolMessageType('TargetRoas', (_message.Message,), {
    'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS,
    '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy.TargetRoas)
    })
  ,
  'DESCRIPTOR' : _ACCESSIBLEBIDDINGSTRATEGY,
  '__module__' : 'google.ads.googleads.v8.resources.accessible_bidding_strategy_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AccessibleBiddingStrategy)
  })
_sym_db.RegisterMessage(AccessibleBiddingStrategy)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.MaximizeConversionValue)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.MaximizeConversions)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.TargetCpa)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.TargetSpend)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.TargetImpressionShare)
_sym_db.RegisterMessage(AccessibleBiddingStrategy.TargetRoas)


DESCRIPTOR._options = None
_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONVALUE.fields_by_name['target_roas']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_MAXIMIZECONVERSIONS.fields_by_name['target_cpa']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETCPA.fields_by_name['target_cpa_micros']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['target_spend_micros']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETSPEND.fields_by_name['cpc_bid_ceiling_micros']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['location']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETIMPRESSIONSHARE.fields_by_name['cpc_bid_ceiling_micros']._options = None
_ACCESSIBLEBIDDINGSTRATEGY_TARGETROAS.fields_by_name['target_roas']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['resource_name']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['id']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['name']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['type']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['owner_customer_id']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['owner_descriptive_name']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversion_value']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['maximize_conversions']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_cpa']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_impression_share']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_roas']._options = None
_ACCESSIBLEBIDDINGSTRATEGY.fields_by_name['target_spend']._options = None
_ACCESSIBLEBIDDINGSTRATEGY._options = None
# @@protoc_insertion_point(module_scope)