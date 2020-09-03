# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/common/real_time_bidding_setting.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/common/real_time_bidding_setting.proto',
  package='google.ads.googleads.v4.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.commonB\033RealTimeBiddingSettingProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Common\312\002\036Google\\Ads\\GoogleAds\\V4\\Common\352\002\"Google::Ads::GoogleAds::V4::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v4/common/real_time_bidding_setting.proto\x12\x1egoogle.ads.googleads.v4.common\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"D\n\x16RealTimeBiddingSetting\x12*\n\x06opt_in\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\xf6\x01\n\"com.google.ads.googleads.v4.commonB\x1bRealTimeBiddingSettingProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Common\xea\x02\"Google::Ads::GoogleAds::V4::Commonb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_REALTIMEBIDDINGSETTING = _descriptor.Descriptor(
  name='RealTimeBiddingSetting',
  full_name='google.ads.googleads.v4.common.RealTimeBiddingSetting',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='opt_in', full_name='google.ads.googleads.v4.common.RealTimeBiddingSetting.opt_in', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=160,
  serialized_end=228,
)

_REALTIMEBIDDINGSETTING.fields_by_name['opt_in'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
DESCRIPTOR.message_types_by_name['RealTimeBiddingSetting'] = _REALTIMEBIDDINGSETTING
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RealTimeBiddingSetting = _reflection.GeneratedProtocolMessageType('RealTimeBiddingSetting', (_message.Message,), {
  'DESCRIPTOR' : _REALTIMEBIDDINGSETTING,
  '__module__' : 'google.ads.googleads.v4.common.real_time_bidding_setting_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.RealTimeBiddingSetting)
  })
_sym_db.RegisterMessage(RealTimeBiddingSetting)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
