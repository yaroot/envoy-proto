# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/resources/merchant_center_link.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v5.enums import merchant_center_link_status_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_merchant__center__link__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/resources/merchant_center_link.proto',
  package='google.ads.googleads.v5.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v5.resourcesB\027MerchantCenterLinkProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\Resources\352\002%Google::Ads::GoogleAds::V5::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/ads/googleads/v5/resources/merchant_center_link.proto\x12!google.ads.googleads.v5.resources\x1a?google/ads/googleads/v5/enums/merchant_center_link_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xa7\x03\n\x12MerchantCenterLink\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x05\xfa\x41-\n+googleads.googleapis.com/MerchantCenterLink\x12\x14\n\x02id\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12.\n\x1cmerchant_center_account_name\x18\x07 \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x64\n\x06status\x18\x05 \x01(\x0e\x32T.google.ads.googleads.v5.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus:q\xea\x41n\n+googleads.googleapis.com/MerchantCenterLink\x12?customers/{customer}/merchantCenterLinks/{merchant_center_link}B\x05\n\x03_idB\x1f\n\x1d_merchant_center_account_nameB\x84\x02\n%com.google.ads.googleads.v5.resourcesB\x17MerchantCenterLinkProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V5.Resources\xca\x02!Google\\Ads\\GoogleAds\\V5\\Resources\xea\x02%Google::Ads::GoogleAds::V5::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_merchant__center__link__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_MERCHANTCENTERLINK = _descriptor.Descriptor(
  name='MerchantCenterLink',
  full_name='google.ads.googleads.v5.resources.MerchantCenterLink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.resources.MerchantCenterLink.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A-\n+googleads.googleapis.com/MerchantCenterLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v5.resources.MerchantCenterLink.id', index=1,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='merchant_center_account_name', full_name='google.ads.googleads.v5.resources.MerchantCenterLink.merchant_center_account_name', index=2,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v5.resources.MerchantCenterLink.status', index=3,
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
  serialized_options=b'\352An\n+googleads.googleapis.com/MerchantCenterLink\022?customers/{customer}/merchantCenterLinks/{merchant_center_link}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v5.resources.MerchantCenterLink._id',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_merchant_center_account_name', full_name='google.ads.googleads.v5.resources.MerchantCenterLink._merchant_center_account_name',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=255,
  serialized_end=678,
)

_MERCHANTCENTERLINK.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_merchant__center__link__status__pb2._MERCHANTCENTERLINKSTATUSENUM_MERCHANTCENTERLINKSTATUS
_MERCHANTCENTERLINK.oneofs_by_name['_id'].fields.append(
  _MERCHANTCENTERLINK.fields_by_name['id'])
_MERCHANTCENTERLINK.fields_by_name['id'].containing_oneof = _MERCHANTCENTERLINK.oneofs_by_name['_id']
_MERCHANTCENTERLINK.oneofs_by_name['_merchant_center_account_name'].fields.append(
  _MERCHANTCENTERLINK.fields_by_name['merchant_center_account_name'])
_MERCHANTCENTERLINK.fields_by_name['merchant_center_account_name'].containing_oneof = _MERCHANTCENTERLINK.oneofs_by_name['_merchant_center_account_name']
DESCRIPTOR.message_types_by_name['MerchantCenterLink'] = _MERCHANTCENTERLINK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MerchantCenterLink = _reflection.GeneratedProtocolMessageType('MerchantCenterLink', (_message.Message,), {
  'DESCRIPTOR' : _MERCHANTCENTERLINK,
  '__module__' : 'google.ads.googleads.v5.resources.merchant_center_link_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.resources.MerchantCenterLink)
  })
_sym_db.RegisterMessage(MerchantCenterLink)


DESCRIPTOR._options = None
_MERCHANTCENTERLINK.fields_by_name['resource_name']._options = None
_MERCHANTCENTERLINK.fields_by_name['id']._options = None
_MERCHANTCENTERLINK.fields_by_name['merchant_center_account_name']._options = None
_MERCHANTCENTERLINK._options = None
# @@protoc_insertion_point(module_scope)
