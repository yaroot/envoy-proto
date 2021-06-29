# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/common/criterion_category_availability.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import advertising_channel_sub_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__sub__type__pb2
from google.ads.googleads.v8.enums import advertising_channel_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__type__pb2
from google.ads.googleads.v8.enums import criterion_category_channel_availability_mode_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__channel__availability__mode__pb2
from google.ads.googleads.v8.enums import criterion_category_locale_availability_mode_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__locale__availability__mode__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/common/criterion_category_availability.proto',
  package='google.ads.googleads.v8.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v8.commonB\"CriterionCategoryAvailabilityProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Common\312\002\036Google\\Ads\\GoogleAds\\V8\\Common\352\002\"Google::Ads::GoogleAds::V8::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDgoogle/ads/googleads/v8/common/criterion_category_availability.proto\x12\x1egoogle.ads.googleads.v8.common\x1a@google/ads/googleads/v8/enums/advertising_channel_sub_type.proto\x1a<google/ads/googleads/v8/enums/advertising_channel_type.proto\x1aPgoogle/ads/googleads/v8/enums/criterion_category_channel_availability_mode.proto\x1aOgoogle/ads/googleads/v8/enums/criterion_category_locale_availability_mode.proto\x1a\x1cgoogle/api/annotations.proto\"\xcb\x01\n\x1d\x43riterionCategoryAvailability\x12U\n\x07\x63hannel\x18\x01 \x01(\x0b\x32\x44.google.ads.googleads.v8.common.CriterionCategoryChannelAvailability\x12S\n\x06locale\x18\x02 \x03(\x0b\x32\x43.google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability\"\xfe\x03\n$CriterionCategoryChannelAvailability\x12\x8f\x01\n\x11\x61vailability_mode\x18\x01 \x01(\x0e\x32t.google.ads.googleads.v8.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode\x12r\n\x18\x61\x64vertising_channel_type\x18\x02 \x01(\x0e\x32P.google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType\x12|\n\x1c\x61\x64vertising_channel_sub_type\x18\x03 \x03(\x0e\x32V.google.ads.googleads.v8.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType\x12-\n include_default_channel_sub_type\x18\x05 \x01(\x08H\x00\x88\x01\x01\x42#\n!_include_default_channel_sub_type\"\x8f\x02\n#CriterionCategoryLocaleAvailability\x12\x8d\x01\n\x11\x61vailability_mode\x18\x01 \x01(\x0e\x32r.google.ads.googleads.v8.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode\x12\x19\n\x0c\x63ountry_code\x18\x04 \x01(\tH\x00\x88\x01\x01\x12\x1a\n\rlanguage_code\x18\x05 \x01(\tH\x01\x88\x01\x01\x42\x0f\n\r_country_codeB\x10\n\x0e_language_codeB\xfd\x01\n\"com.google.ads.googleads.v8.commonB\"CriterionCategoryAvailabilityProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V8.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V8\\Common\xea\x02\"Google::Ads::GoogleAds::V8::Commonb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__sub__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__channel__availability__mode__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__locale__availability__mode__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CRITERIONCATEGORYAVAILABILITY = _descriptor.Descriptor(
  name='CriterionCategoryAvailability',
  full_name='google.ads.googleads.v8.common.CriterionCategoryAvailability',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='channel', full_name='google.ads.googleads.v8.common.CriterionCategoryAvailability.channel', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='locale', full_name='google.ads.googleads.v8.common.CriterionCategoryAvailability.locale', index=1,
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
  serialized_start=426,
  serialized_end=629,
)


_CRITERIONCATEGORYCHANNELAVAILABILITY = _descriptor.Descriptor(
  name='CriterionCategoryChannelAvailability',
  full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='availability_mode', full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability.availability_mode', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='advertising_channel_type', full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability.advertising_channel_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='advertising_channel_sub_type', full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability.advertising_channel_sub_type', index=2,
      number=3, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='include_default_channel_sub_type', full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability.include_default_channel_sub_type', index=3,
      number=5, type=8, cpp_type=7, label=1,
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
      name='_include_default_channel_sub_type', full_name='google.ads.googleads.v8.common.CriterionCategoryChannelAvailability._include_default_channel_sub_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=632,
  serialized_end=1142,
)


_CRITERIONCATEGORYLOCALEAVAILABILITY = _descriptor.Descriptor(
  name='CriterionCategoryLocaleAvailability',
  full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='availability_mode', full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability.availability_mode', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='country_code', full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability.country_code', index=1,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability.language_code', index=2,
      number=5, type=9, cpp_type=9, label=1,
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
      name='_country_code', full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability._country_code',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_language_code', full_name='google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability._language_code',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1145,
  serialized_end=1416,
)

_CRITERIONCATEGORYAVAILABILITY.fields_by_name['channel'].message_type = _CRITERIONCATEGORYCHANNELAVAILABILITY
_CRITERIONCATEGORYAVAILABILITY.fields_by_name['locale'].message_type = _CRITERIONCATEGORYLOCALEAVAILABILITY
_CRITERIONCATEGORYCHANNELAVAILABILITY.fields_by_name['availability_mode'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__channel__availability__mode__pb2._CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM_CRITERIONCATEGORYCHANNELAVAILABILITYMODE
_CRITERIONCATEGORYCHANNELAVAILABILITY.fields_by_name['advertising_channel_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__type__pb2._ADVERTISINGCHANNELTYPEENUM_ADVERTISINGCHANNELTYPE
_CRITERIONCATEGORYCHANNELAVAILABILITY.fields_by_name['advertising_channel_sub_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_advertising__channel__sub__type__pb2._ADVERTISINGCHANNELSUBTYPEENUM_ADVERTISINGCHANNELSUBTYPE
_CRITERIONCATEGORYCHANNELAVAILABILITY.oneofs_by_name['_include_default_channel_sub_type'].fields.append(
  _CRITERIONCATEGORYCHANNELAVAILABILITY.fields_by_name['include_default_channel_sub_type'])
_CRITERIONCATEGORYCHANNELAVAILABILITY.fields_by_name['include_default_channel_sub_type'].containing_oneof = _CRITERIONCATEGORYCHANNELAVAILABILITY.oneofs_by_name['_include_default_channel_sub_type']
_CRITERIONCATEGORYLOCALEAVAILABILITY.fields_by_name['availability_mode'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_criterion__category__locale__availability__mode__pb2._CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM_CRITERIONCATEGORYLOCALEAVAILABILITYMODE
_CRITERIONCATEGORYLOCALEAVAILABILITY.oneofs_by_name['_country_code'].fields.append(
  _CRITERIONCATEGORYLOCALEAVAILABILITY.fields_by_name['country_code'])
_CRITERIONCATEGORYLOCALEAVAILABILITY.fields_by_name['country_code'].containing_oneof = _CRITERIONCATEGORYLOCALEAVAILABILITY.oneofs_by_name['_country_code']
_CRITERIONCATEGORYLOCALEAVAILABILITY.oneofs_by_name['_language_code'].fields.append(
  _CRITERIONCATEGORYLOCALEAVAILABILITY.fields_by_name['language_code'])
_CRITERIONCATEGORYLOCALEAVAILABILITY.fields_by_name['language_code'].containing_oneof = _CRITERIONCATEGORYLOCALEAVAILABILITY.oneofs_by_name['_language_code']
DESCRIPTOR.message_types_by_name['CriterionCategoryAvailability'] = _CRITERIONCATEGORYAVAILABILITY
DESCRIPTOR.message_types_by_name['CriterionCategoryChannelAvailability'] = _CRITERIONCATEGORYCHANNELAVAILABILITY
DESCRIPTOR.message_types_by_name['CriterionCategoryLocaleAvailability'] = _CRITERIONCATEGORYLOCALEAVAILABILITY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CriterionCategoryAvailability = _reflection.GeneratedProtocolMessageType('CriterionCategoryAvailability', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONCATEGORYAVAILABILITY,
  '__module__' : 'google.ads.googleads.v8.common.criterion_category_availability_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.CriterionCategoryAvailability)
  })
_sym_db.RegisterMessage(CriterionCategoryAvailability)

CriterionCategoryChannelAvailability = _reflection.GeneratedProtocolMessageType('CriterionCategoryChannelAvailability', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONCATEGORYCHANNELAVAILABILITY,
  '__module__' : 'google.ads.googleads.v8.common.criterion_category_availability_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.CriterionCategoryChannelAvailability)
  })
_sym_db.RegisterMessage(CriterionCategoryChannelAvailability)

CriterionCategoryLocaleAvailability = _reflection.GeneratedProtocolMessageType('CriterionCategoryLocaleAvailability', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONCATEGORYLOCALEAVAILABILITY,
  '__module__' : 'google.ads.googleads.v8.common.criterion_category_availability_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.CriterionCategoryLocaleAvailability)
  })
_sym_db.RegisterMessage(CriterionCategoryLocaleAvailability)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
