# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/common/bidding.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import target_impression_share_location_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/common/bidding.proto',
  package='google.ads.googleads.v8.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v8.commonB\014BiddingProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Common\312\002\036Google\\Ads\\GoogleAds\\V8\\Common\352\002\"Google::Ads::GoogleAds::V8::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,google/ads/googleads/v8/common/bidding.proto\x12\x1egoogle.ads.googleads.v8.common\x1a\x44google/ads/googleads/v8/enums/target_impression_share_location.proto\x1a\x1cgoogle/api/annotations.proto\"L\n\nCommission\x12#\n\x16\x63ommission_rate_micros\x18\x02 \x01(\x03H\x00\x88\x01\x01\x42\x19\n\x17_commission_rate_micros\"\r\n\x0b\x45nhancedCpc\"G\n\tManualCpc\x12!\n\x14\x65nhanced_cpc_enabled\x18\x02 \x01(\x08H\x00\x88\x01\x01\x42\x17\n\x15_enhanced_cpc_enabled\"\x0b\n\tManualCpm\"\x0b\n\tManualCpv\")\n\x13MaximizeConversions\x12\x12\n\ntarget_cpa\x18\x01 \x01(\x03\".\n\x17MaximizeConversionValue\x12\x13\n\x0btarget_roas\x18\x02 \x01(\x01\"\xbd\x01\n\tTargetCpa\x12\x1e\n\x11target_cpa_micros\x18\x04 \x01(\x03H\x00\x88\x01\x01\x12#\n\x16\x63pc_bid_ceiling_micros\x18\x05 \x01(\x03H\x01\x88\x01\x01\x12!\n\x14\x63pc_bid_floor_micros\x18\x06 \x01(\x03H\x02\x88\x01\x01\x42\x14\n\x12_target_cpa_microsB\x19\n\x17_cpc_bid_ceiling_microsB\x17\n\x15_cpc_bid_floor_micros\"\x0b\n\tTargetCpm\"\x8d\x02\n\x15TargetImpressionShare\x12p\n\x08location\x18\x01 \x01(\x0e\x32^.google.ads.googleads.v8.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation\x12%\n\x18location_fraction_micros\x18\x04 \x01(\x03H\x00\x88\x01\x01\x12#\n\x16\x63pc_bid_ceiling_micros\x18\x05 \x01(\x03H\x01\x88\x01\x01\x42\x1b\n\x19_location_fraction_microsB\x19\n\x17_cpc_bid_ceiling_micros\"\xb2\x01\n\nTargetRoas\x12\x18\n\x0btarget_roas\x18\x04 \x01(\x01H\x00\x88\x01\x01\x12#\n\x16\x63pc_bid_ceiling_micros\x18\x05 \x01(\x03H\x01\x88\x01\x01\x12!\n\x14\x63pc_bid_floor_micros\x18\x06 \x01(\x03H\x02\x88\x01\x01\x42\x0e\n\x0c_target_roasB\x19\n\x17_cpc_bid_ceiling_microsB\x17\n\x15_cpc_bid_floor_micros\"\x8b\x01\n\x0bTargetSpend\x12$\n\x13target_spend_micros\x18\x03 \x01(\x03\x42\x02\x18\x01H\x00\x88\x01\x01\x12#\n\x16\x63pc_bid_ceiling_micros\x18\x04 \x01(\x03H\x01\x88\x01\x01\x42\x16\n\x14_target_spend_microsB\x19\n\x17_cpc_bid_ceiling_micros\"\x88\x01\n\nPercentCpc\x12#\n\x16\x63pc_bid_ceiling_micros\x18\x03 \x01(\x03H\x00\x88\x01\x01\x12!\n\x14\x65nhanced_cpc_enabled\x18\x04 \x01(\x08H\x01\x88\x01\x01\x42\x19\n\x17_cpc_bid_ceiling_microsB\x17\n\x15_enhanced_cpc_enabledB\xe7\x01\n\"com.google.ads.googleads.v8.commonB\x0c\x42iddingProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V8.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V8\\Common\xea\x02\"Google::Ads::GoogleAds::V8::Commonb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_COMMISSION = _descriptor.Descriptor(
  name='Commission',
  full_name='google.ads.googleads.v8.common.Commission',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='commission_rate_micros', full_name='google.ads.googleads.v8.common.Commission.commission_rate_micros', index=0,
      number=2, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_commission_rate_micros', full_name='google.ads.googleads.v8.common.Commission._commission_rate_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=180,
  serialized_end=256,
)


_ENHANCEDCPC = _descriptor.Descriptor(
  name='EnhancedCpc',
  full_name='google.ads.googleads.v8.common.EnhancedCpc',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=258,
  serialized_end=271,
)


_MANUALCPC = _descriptor.Descriptor(
  name='ManualCpc',
  full_name='google.ads.googleads.v8.common.ManualCpc',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='enhanced_cpc_enabled', full_name='google.ads.googleads.v8.common.ManualCpc.enhanced_cpc_enabled', index=0,
      number=2, type=8, cpp_type=7, label=1,
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
    _descriptor.OneofDescriptor(
      name='_enhanced_cpc_enabled', full_name='google.ads.googleads.v8.common.ManualCpc._enhanced_cpc_enabled',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=273,
  serialized_end=344,
)


_MANUALCPM = _descriptor.Descriptor(
  name='ManualCpm',
  full_name='google.ads.googleads.v8.common.ManualCpm',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=346,
  serialized_end=357,
)


_MANUALCPV = _descriptor.Descriptor(
  name='ManualCpv',
  full_name='google.ads.googleads.v8.common.ManualCpv',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_end=370,
)


_MAXIMIZECONVERSIONS = _descriptor.Descriptor(
  name='MaximizeConversions',
  full_name='google.ads.googleads.v8.common.MaximizeConversions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_cpa', full_name='google.ads.googleads.v8.common.MaximizeConversions.target_cpa', index=0,
      number=1, type=3, cpp_type=2, label=1,
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
  serialized_start=372,
  serialized_end=413,
)


_MAXIMIZECONVERSIONVALUE = _descriptor.Descriptor(
  name='MaximizeConversionValue',
  full_name='google.ads.googleads.v8.common.MaximizeConversionValue',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_roas', full_name='google.ads.googleads.v8.common.MaximizeConversionValue.target_roas', index=0,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=415,
  serialized_end=461,
)


_TARGETCPA = _descriptor.Descriptor(
  name='TargetCpa',
  full_name='google.ads.googleads.v8.common.TargetCpa',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_cpa_micros', full_name='google.ads.googleads.v8.common.TargetCpa.target_cpa_micros', index=0,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetCpa.cpc_bid_ceiling_micros', index=1,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_floor_micros', full_name='google.ads.googleads.v8.common.TargetCpa.cpc_bid_floor_micros', index=2,
      number=6, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_target_cpa_micros', full_name='google.ads.googleads.v8.common.TargetCpa._target_cpa_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetCpa._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_floor_micros', full_name='google.ads.googleads.v8.common.TargetCpa._cpc_bid_floor_micros',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=464,
  serialized_end=653,
)


_TARGETCPM = _descriptor.Descriptor(
  name='TargetCpm',
  full_name='google.ads.googleads.v8.common.TargetCpm',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=655,
  serialized_end=666,
)


_TARGETIMPRESSIONSHARE = _descriptor.Descriptor(
  name='TargetImpressionShare',
  full_name='google.ads.googleads.v8.common.TargetImpressionShare',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location', full_name='google.ads.googleads.v8.common.TargetImpressionShare.location', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location_fraction_micros', full_name='google.ads.googleads.v8.common.TargetImpressionShare.location_fraction_micros', index=1,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetImpressionShare.cpc_bid_ceiling_micros', index=2,
      number=5, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_location_fraction_micros', full_name='google.ads.googleads.v8.common.TargetImpressionShare._location_fraction_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetImpressionShare._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=669,
  serialized_end=938,
)


_TARGETROAS = _descriptor.Descriptor(
  name='TargetRoas',
  full_name='google.ads.googleads.v8.common.TargetRoas',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_roas', full_name='google.ads.googleads.v8.common.TargetRoas.target_roas', index=0,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetRoas.cpc_bid_ceiling_micros', index=1,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_floor_micros', full_name='google.ads.googleads.v8.common.TargetRoas.cpc_bid_floor_micros', index=2,
      number=6, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_target_roas', full_name='google.ads.googleads.v8.common.TargetRoas._target_roas',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetRoas._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_floor_micros', full_name='google.ads.googleads.v8.common.TargetRoas._cpc_bid_floor_micros',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=941,
  serialized_end=1119,
)


_TARGETSPEND = _descriptor.Descriptor(
  name='TargetSpend',
  full_name='google.ads.googleads.v8.common.TargetSpend',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_spend_micros', full_name='google.ads.googleads.v8.common.TargetSpend.target_spend_micros', index=0,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetSpend.cpc_bid_ceiling_micros', index=1,
      number=4, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_target_spend_micros', full_name='google.ads.googleads.v8.common.TargetSpend._target_spend_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.TargetSpend._cpc_bid_ceiling_micros',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1122,
  serialized_end=1261,
)


_PERCENTCPC = _descriptor.Descriptor(
  name='PercentCpc',
  full_name='google.ads.googleads.v8.common.PercentCpc',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.PercentCpc.cpc_bid_ceiling_micros', index=0,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enhanced_cpc_enabled', full_name='google.ads.googleads.v8.common.PercentCpc.enhanced_cpc_enabled', index=1,
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
    _descriptor.OneofDescriptor(
      name='_cpc_bid_ceiling_micros', full_name='google.ads.googleads.v8.common.PercentCpc._cpc_bid_ceiling_micros',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_enhanced_cpc_enabled', full_name='google.ads.googleads.v8.common.PercentCpc._enhanced_cpc_enabled',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1264,
  serialized_end=1400,
)

_COMMISSION.oneofs_by_name['_commission_rate_micros'].fields.append(
  _COMMISSION.fields_by_name['commission_rate_micros'])
_COMMISSION.fields_by_name['commission_rate_micros'].containing_oneof = _COMMISSION.oneofs_by_name['_commission_rate_micros']
_MANUALCPC.oneofs_by_name['_enhanced_cpc_enabled'].fields.append(
  _MANUALCPC.fields_by_name['enhanced_cpc_enabled'])
_MANUALCPC.fields_by_name['enhanced_cpc_enabled'].containing_oneof = _MANUALCPC.oneofs_by_name['_enhanced_cpc_enabled']
_TARGETCPA.oneofs_by_name['_target_cpa_micros'].fields.append(
  _TARGETCPA.fields_by_name['target_cpa_micros'])
_TARGETCPA.fields_by_name['target_cpa_micros'].containing_oneof = _TARGETCPA.oneofs_by_name['_target_cpa_micros']
_TARGETCPA.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _TARGETCPA.fields_by_name['cpc_bid_ceiling_micros'])
_TARGETCPA.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _TARGETCPA.oneofs_by_name['_cpc_bid_ceiling_micros']
_TARGETCPA.oneofs_by_name['_cpc_bid_floor_micros'].fields.append(
  _TARGETCPA.fields_by_name['cpc_bid_floor_micros'])
_TARGETCPA.fields_by_name['cpc_bid_floor_micros'].containing_oneof = _TARGETCPA.oneofs_by_name['_cpc_bid_floor_micros']
_TARGETIMPRESSIONSHARE.fields_by_name['location'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_target__impression__share__location__pb2._TARGETIMPRESSIONSHARELOCATIONENUM_TARGETIMPRESSIONSHARELOCATION
_TARGETIMPRESSIONSHARE.oneofs_by_name['_location_fraction_micros'].fields.append(
  _TARGETIMPRESSIONSHARE.fields_by_name['location_fraction_micros'])
_TARGETIMPRESSIONSHARE.fields_by_name['location_fraction_micros'].containing_oneof = _TARGETIMPRESSIONSHARE.oneofs_by_name['_location_fraction_micros']
_TARGETIMPRESSIONSHARE.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _TARGETIMPRESSIONSHARE.fields_by_name['cpc_bid_ceiling_micros'])
_TARGETIMPRESSIONSHARE.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _TARGETIMPRESSIONSHARE.oneofs_by_name['_cpc_bid_ceiling_micros']
_TARGETROAS.oneofs_by_name['_target_roas'].fields.append(
  _TARGETROAS.fields_by_name['target_roas'])
_TARGETROAS.fields_by_name['target_roas'].containing_oneof = _TARGETROAS.oneofs_by_name['_target_roas']
_TARGETROAS.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _TARGETROAS.fields_by_name['cpc_bid_ceiling_micros'])
_TARGETROAS.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _TARGETROAS.oneofs_by_name['_cpc_bid_ceiling_micros']
_TARGETROAS.oneofs_by_name['_cpc_bid_floor_micros'].fields.append(
  _TARGETROAS.fields_by_name['cpc_bid_floor_micros'])
_TARGETROAS.fields_by_name['cpc_bid_floor_micros'].containing_oneof = _TARGETROAS.oneofs_by_name['_cpc_bid_floor_micros']
_TARGETSPEND.oneofs_by_name['_target_spend_micros'].fields.append(
  _TARGETSPEND.fields_by_name['target_spend_micros'])
_TARGETSPEND.fields_by_name['target_spend_micros'].containing_oneof = _TARGETSPEND.oneofs_by_name['_target_spend_micros']
_TARGETSPEND.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _TARGETSPEND.fields_by_name['cpc_bid_ceiling_micros'])
_TARGETSPEND.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _TARGETSPEND.oneofs_by_name['_cpc_bid_ceiling_micros']
_PERCENTCPC.oneofs_by_name['_cpc_bid_ceiling_micros'].fields.append(
  _PERCENTCPC.fields_by_name['cpc_bid_ceiling_micros'])
_PERCENTCPC.fields_by_name['cpc_bid_ceiling_micros'].containing_oneof = _PERCENTCPC.oneofs_by_name['_cpc_bid_ceiling_micros']
_PERCENTCPC.oneofs_by_name['_enhanced_cpc_enabled'].fields.append(
  _PERCENTCPC.fields_by_name['enhanced_cpc_enabled'])
_PERCENTCPC.fields_by_name['enhanced_cpc_enabled'].containing_oneof = _PERCENTCPC.oneofs_by_name['_enhanced_cpc_enabled']
DESCRIPTOR.message_types_by_name['Commission'] = _COMMISSION
DESCRIPTOR.message_types_by_name['EnhancedCpc'] = _ENHANCEDCPC
DESCRIPTOR.message_types_by_name['ManualCpc'] = _MANUALCPC
DESCRIPTOR.message_types_by_name['ManualCpm'] = _MANUALCPM
DESCRIPTOR.message_types_by_name['ManualCpv'] = _MANUALCPV
DESCRIPTOR.message_types_by_name['MaximizeConversions'] = _MAXIMIZECONVERSIONS
DESCRIPTOR.message_types_by_name['MaximizeConversionValue'] = _MAXIMIZECONVERSIONVALUE
DESCRIPTOR.message_types_by_name['TargetCpa'] = _TARGETCPA
DESCRIPTOR.message_types_by_name['TargetCpm'] = _TARGETCPM
DESCRIPTOR.message_types_by_name['TargetImpressionShare'] = _TARGETIMPRESSIONSHARE
DESCRIPTOR.message_types_by_name['TargetRoas'] = _TARGETROAS
DESCRIPTOR.message_types_by_name['TargetSpend'] = _TARGETSPEND
DESCRIPTOR.message_types_by_name['PercentCpc'] = _PERCENTCPC
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Commission = _reflection.GeneratedProtocolMessageType('Commission', (_message.Message,), {
  'DESCRIPTOR' : _COMMISSION,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.Commission)
  })
_sym_db.RegisterMessage(Commission)

EnhancedCpc = _reflection.GeneratedProtocolMessageType('EnhancedCpc', (_message.Message,), {
  'DESCRIPTOR' : _ENHANCEDCPC,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.EnhancedCpc)
  })
_sym_db.RegisterMessage(EnhancedCpc)

ManualCpc = _reflection.GeneratedProtocolMessageType('ManualCpc', (_message.Message,), {
  'DESCRIPTOR' : _MANUALCPC,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.ManualCpc)
  })
_sym_db.RegisterMessage(ManualCpc)

ManualCpm = _reflection.GeneratedProtocolMessageType('ManualCpm', (_message.Message,), {
  'DESCRIPTOR' : _MANUALCPM,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.ManualCpm)
  })
_sym_db.RegisterMessage(ManualCpm)

ManualCpv = _reflection.GeneratedProtocolMessageType('ManualCpv', (_message.Message,), {
  'DESCRIPTOR' : _MANUALCPV,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.ManualCpv)
  })
_sym_db.RegisterMessage(ManualCpv)

MaximizeConversions = _reflection.GeneratedProtocolMessageType('MaximizeConversions', (_message.Message,), {
  'DESCRIPTOR' : _MAXIMIZECONVERSIONS,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.MaximizeConversions)
  })
_sym_db.RegisterMessage(MaximizeConversions)

MaximizeConversionValue = _reflection.GeneratedProtocolMessageType('MaximizeConversionValue', (_message.Message,), {
  'DESCRIPTOR' : _MAXIMIZECONVERSIONVALUE,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.MaximizeConversionValue)
  })
_sym_db.RegisterMessage(MaximizeConversionValue)

TargetCpa = _reflection.GeneratedProtocolMessageType('TargetCpa', (_message.Message,), {
  'DESCRIPTOR' : _TARGETCPA,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetCpa)
  })
_sym_db.RegisterMessage(TargetCpa)

TargetCpm = _reflection.GeneratedProtocolMessageType('TargetCpm', (_message.Message,), {
  'DESCRIPTOR' : _TARGETCPM,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetCpm)
  })
_sym_db.RegisterMessage(TargetCpm)

TargetImpressionShare = _reflection.GeneratedProtocolMessageType('TargetImpressionShare', (_message.Message,), {
  'DESCRIPTOR' : _TARGETIMPRESSIONSHARE,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetImpressionShare)
  })
_sym_db.RegisterMessage(TargetImpressionShare)

TargetRoas = _reflection.GeneratedProtocolMessageType('TargetRoas', (_message.Message,), {
  'DESCRIPTOR' : _TARGETROAS,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetRoas)
  })
_sym_db.RegisterMessage(TargetRoas)

TargetSpend = _reflection.GeneratedProtocolMessageType('TargetSpend', (_message.Message,), {
  'DESCRIPTOR' : _TARGETSPEND,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetSpend)
  })
_sym_db.RegisterMessage(TargetSpend)

PercentCpc = _reflection.GeneratedProtocolMessageType('PercentCpc', (_message.Message,), {
  'DESCRIPTOR' : _PERCENTCPC,
  '__module__' : 'google.ads.googleads.v8.common.bidding_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.PercentCpc)
  })
_sym_db.RegisterMessage(PercentCpc)


DESCRIPTOR._options = None
_TARGETSPEND.fields_by_name['target_spend_micros']._options = None
# @@protoc_insertion_point(module_scope)
