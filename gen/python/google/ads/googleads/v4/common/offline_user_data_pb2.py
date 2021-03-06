# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/common/offline_user_data.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/common/offline_user_data.proto',
  package='google.ads.googleads.v4.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.commonB\024OfflineUserDataProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Common\312\002\036Google\\Ads\\GoogleAds\\V4\\Common\352\002\"Google::Ads::GoogleAds::V4::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v4/common/offline_user_data.proto\x12\x1egoogle.ads.googleads.v4.common\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xc9\x02\n\x16OfflineUserAddressInfo\x12\x37\n\x11hashed_first_name\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x36\n\x10hashed_last_name\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12*\n\x04\x63ity\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12+\n\x05state\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x32\n\x0c\x63ountry_code\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x31\n\x0bpostal_code\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.StringValue\"\xd1\x02\n\x0eUserIdentifier\x12\x34\n\x0chashed_email\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValueH\x00\x12;\n\x13hashed_phone_number\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueH\x00\x12\x31\n\tmobile_id\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueH\x00\x12;\n\x13third_party_user_id\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValueH\x00\x12N\n\x0c\x61\x64\x64ress_info\x18\x05 \x01(\x0b\x32\x36.google.ads.googleads.v4.common.OfflineUserAddressInfoH\x00\x42\x0c\n\nidentifier\"\xaf\x03\n\x14TransactionAttribute\x12;\n\x15transaction_date_time\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12?\n\x19transaction_amount_micros\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x33\n\rcurrency_code\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x37\n\x11\x63onversion_action\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12.\n\x08order_id\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12G\n\x0fstore_attribute\x18\x06 \x01(\x0b\x32..google.ads.googleads.v4.common.StoreAttribute\x12\x32\n\x0c\x63ustom_value\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.StringValue\"B\n\x0eStoreAttribute\x12\x30\n\nstore_code\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\"\xa9\x01\n\x08UserData\x12H\n\x10user_identifiers\x18\x01 \x03(\x0b\x32..google.ads.googleads.v4.common.UserIdentifier\x12S\n\x15transaction_attribute\x18\x02 \x01(\x0b\x32\x34.google.ads.googleads.v4.common.TransactionAttribute\"P\n\x1d\x43ustomerMatchUserListMetadata\x12/\n\tuser_list\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\"\x9d\x02\n\x12StoreSalesMetadata\x12\x36\n\x10loyalty_fraction\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x41\n\x1btransaction_upload_fraction\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x30\n\ncustom_key\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12Z\n\x14third_party_metadata\x18\x03 \x01(\x0b\x32<.google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata\"\x8e\x03\n\x1cStoreSalesThirdPartyMetadata\x12\x41\n\x1b\x61\x64vertiser_upload_date_time\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12@\n\x1avalid_transaction_fraction\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12<\n\x16partner_match_fraction\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12=\n\x17partner_upload_fraction\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12;\n\x15\x62ridge_map_version_id\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12/\n\npartner_id\x18\x06 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\xef\x01\n\"com.google.ads.googleads.v4.commonB\x14OfflineUserDataProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Common\xea\x02\"Google::Ads::GoogleAds::V4::Commonb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_OFFLINEUSERADDRESSINFO = _descriptor.Descriptor(
  name='OfflineUserAddressInfo',
  full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='hashed_first_name', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.hashed_first_name', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hashed_last_name', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.hashed_last_name', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='city', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.city', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.state', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='country_code', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.country_code', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='postal_code', full_name='google.ads.googleads.v4.common.OfflineUserAddressInfo.postal_code', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_start=153,
  serialized_end=482,
)


_USERIDENTIFIER = _descriptor.Descriptor(
  name='UserIdentifier',
  full_name='google.ads.googleads.v4.common.UserIdentifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='hashed_email', full_name='google.ads.googleads.v4.common.UserIdentifier.hashed_email', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hashed_phone_number', full_name='google.ads.googleads.v4.common.UserIdentifier.hashed_phone_number', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mobile_id', full_name='google.ads.googleads.v4.common.UserIdentifier.mobile_id', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='third_party_user_id', full_name='google.ads.googleads.v4.common.UserIdentifier.third_party_user_id', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='address_info', full_name='google.ads.googleads.v4.common.UserIdentifier.address_info', index=4,
      number=5, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='identifier', full_name='google.ads.googleads.v4.common.UserIdentifier.identifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=485,
  serialized_end=822,
)


_TRANSACTIONATTRIBUTE = _descriptor.Descriptor(
  name='TransactionAttribute',
  full_name='google.ads.googleads.v4.common.TransactionAttribute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='transaction_date_time', full_name='google.ads.googleads.v4.common.TransactionAttribute.transaction_date_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transaction_amount_micros', full_name='google.ads.googleads.v4.common.TransactionAttribute.transaction_amount_micros', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='currency_code', full_name='google.ads.googleads.v4.common.TransactionAttribute.currency_code', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='conversion_action', full_name='google.ads.googleads.v4.common.TransactionAttribute.conversion_action', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='order_id', full_name='google.ads.googleads.v4.common.TransactionAttribute.order_id', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='store_attribute', full_name='google.ads.googleads.v4.common.TransactionAttribute.store_attribute', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='custom_value', full_name='google.ads.googleads.v4.common.TransactionAttribute.custom_value', index=6,
      number=7, type=11, cpp_type=10, label=1,
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
  serialized_start=825,
  serialized_end=1256,
)


_STOREATTRIBUTE = _descriptor.Descriptor(
  name='StoreAttribute',
  full_name='google.ads.googleads.v4.common.StoreAttribute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='store_code', full_name='google.ads.googleads.v4.common.StoreAttribute.store_code', index=0,
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
  serialized_start=1258,
  serialized_end=1324,
)


_USERDATA = _descriptor.Descriptor(
  name='UserData',
  full_name='google.ads.googleads.v4.common.UserData',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_identifiers', full_name='google.ads.googleads.v4.common.UserData.user_identifiers', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transaction_attribute', full_name='google.ads.googleads.v4.common.UserData.transaction_attribute', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=1327,
  serialized_end=1496,
)


_CUSTOMERMATCHUSERLISTMETADATA = _descriptor.Descriptor(
  name='CustomerMatchUserListMetadata',
  full_name='google.ads.googleads.v4.common.CustomerMatchUserListMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_list', full_name='google.ads.googleads.v4.common.CustomerMatchUserListMetadata.user_list', index=0,
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
  serialized_start=1498,
  serialized_end=1578,
)


_STORESALESMETADATA = _descriptor.Descriptor(
  name='StoreSalesMetadata',
  full_name='google.ads.googleads.v4.common.StoreSalesMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='loyalty_fraction', full_name='google.ads.googleads.v4.common.StoreSalesMetadata.loyalty_fraction', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transaction_upload_fraction', full_name='google.ads.googleads.v4.common.StoreSalesMetadata.transaction_upload_fraction', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='custom_key', full_name='google.ads.googleads.v4.common.StoreSalesMetadata.custom_key', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='third_party_metadata', full_name='google.ads.googleads.v4.common.StoreSalesMetadata.third_party_metadata', index=3,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=1581,
  serialized_end=1866,
)


_STORESALESTHIRDPARTYMETADATA = _descriptor.Descriptor(
  name='StoreSalesThirdPartyMetadata',
  full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='advertiser_upload_date_time', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.advertiser_upload_date_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='valid_transaction_fraction', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.valid_transaction_fraction', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partner_match_fraction', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.partner_match_fraction', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partner_upload_fraction', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.partner_upload_fraction', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bridge_map_version_id', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.bridge_map_version_id', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partner_id', full_name='google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata.partner_id', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_start=1869,
  serialized_end=2267,
)

_OFFLINEUSERADDRESSINFO.fields_by_name['hashed_first_name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_OFFLINEUSERADDRESSINFO.fields_by_name['hashed_last_name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_OFFLINEUSERADDRESSINFO.fields_by_name['city'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_OFFLINEUSERADDRESSINFO.fields_by_name['state'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_OFFLINEUSERADDRESSINFO.fields_by_name['country_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_OFFLINEUSERADDRESSINFO.fields_by_name['postal_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERIDENTIFIER.fields_by_name['hashed_email'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERIDENTIFIER.fields_by_name['hashed_phone_number'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERIDENTIFIER.fields_by_name['mobile_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERIDENTIFIER.fields_by_name['third_party_user_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERIDENTIFIER.fields_by_name['address_info'].message_type = _OFFLINEUSERADDRESSINFO
_USERIDENTIFIER.oneofs_by_name['identifier'].fields.append(
  _USERIDENTIFIER.fields_by_name['hashed_email'])
_USERIDENTIFIER.fields_by_name['hashed_email'].containing_oneof = _USERIDENTIFIER.oneofs_by_name['identifier']
_USERIDENTIFIER.oneofs_by_name['identifier'].fields.append(
  _USERIDENTIFIER.fields_by_name['hashed_phone_number'])
_USERIDENTIFIER.fields_by_name['hashed_phone_number'].containing_oneof = _USERIDENTIFIER.oneofs_by_name['identifier']
_USERIDENTIFIER.oneofs_by_name['identifier'].fields.append(
  _USERIDENTIFIER.fields_by_name['mobile_id'])
_USERIDENTIFIER.fields_by_name['mobile_id'].containing_oneof = _USERIDENTIFIER.oneofs_by_name['identifier']
_USERIDENTIFIER.oneofs_by_name['identifier'].fields.append(
  _USERIDENTIFIER.fields_by_name['third_party_user_id'])
_USERIDENTIFIER.fields_by_name['third_party_user_id'].containing_oneof = _USERIDENTIFIER.oneofs_by_name['identifier']
_USERIDENTIFIER.oneofs_by_name['identifier'].fields.append(
  _USERIDENTIFIER.fields_by_name['address_info'])
_USERIDENTIFIER.fields_by_name['address_info'].containing_oneof = _USERIDENTIFIER.oneofs_by_name['identifier']
_TRANSACTIONATTRIBUTE.fields_by_name['transaction_date_time'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_TRANSACTIONATTRIBUTE.fields_by_name['transaction_amount_micros'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_TRANSACTIONATTRIBUTE.fields_by_name['currency_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_TRANSACTIONATTRIBUTE.fields_by_name['conversion_action'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_TRANSACTIONATTRIBUTE.fields_by_name['order_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_TRANSACTIONATTRIBUTE.fields_by_name['store_attribute'].message_type = _STOREATTRIBUTE
_TRANSACTIONATTRIBUTE.fields_by_name['custom_value'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_STOREATTRIBUTE.fields_by_name['store_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERDATA.fields_by_name['user_identifiers'].message_type = _USERIDENTIFIER
_USERDATA.fields_by_name['transaction_attribute'].message_type = _TRANSACTIONATTRIBUTE
_CUSTOMERMATCHUSERLISTMETADATA.fields_by_name['user_list'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_STORESALESMETADATA.fields_by_name['loyalty_fraction'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_STORESALESMETADATA.fields_by_name['transaction_upload_fraction'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_STORESALESMETADATA.fields_by_name['custom_key'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_STORESALESMETADATA.fields_by_name['third_party_metadata'].message_type = _STORESALESTHIRDPARTYMETADATA
_STORESALESTHIRDPARTYMETADATA.fields_by_name['advertiser_upload_date_time'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_STORESALESTHIRDPARTYMETADATA.fields_by_name['valid_transaction_fraction'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_STORESALESTHIRDPARTYMETADATA.fields_by_name['partner_match_fraction'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_STORESALESTHIRDPARTYMETADATA.fields_by_name['partner_upload_fraction'].message_type = google_dot_protobuf_dot_wrappers__pb2._DOUBLEVALUE
_STORESALESTHIRDPARTYMETADATA.fields_by_name['bridge_map_version_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_STORESALESTHIRDPARTYMETADATA.fields_by_name['partner_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
DESCRIPTOR.message_types_by_name['OfflineUserAddressInfo'] = _OFFLINEUSERADDRESSINFO
DESCRIPTOR.message_types_by_name['UserIdentifier'] = _USERIDENTIFIER
DESCRIPTOR.message_types_by_name['TransactionAttribute'] = _TRANSACTIONATTRIBUTE
DESCRIPTOR.message_types_by_name['StoreAttribute'] = _STOREATTRIBUTE
DESCRIPTOR.message_types_by_name['UserData'] = _USERDATA
DESCRIPTOR.message_types_by_name['CustomerMatchUserListMetadata'] = _CUSTOMERMATCHUSERLISTMETADATA
DESCRIPTOR.message_types_by_name['StoreSalesMetadata'] = _STORESALESMETADATA
DESCRIPTOR.message_types_by_name['StoreSalesThirdPartyMetadata'] = _STORESALESTHIRDPARTYMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OfflineUserAddressInfo = _reflection.GeneratedProtocolMessageType('OfflineUserAddressInfo', (_message.Message,), {
  'DESCRIPTOR' : _OFFLINEUSERADDRESSINFO,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.OfflineUserAddressInfo)
  })
_sym_db.RegisterMessage(OfflineUserAddressInfo)

UserIdentifier = _reflection.GeneratedProtocolMessageType('UserIdentifier', (_message.Message,), {
  'DESCRIPTOR' : _USERIDENTIFIER,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.UserIdentifier)
  })
_sym_db.RegisterMessage(UserIdentifier)

TransactionAttribute = _reflection.GeneratedProtocolMessageType('TransactionAttribute', (_message.Message,), {
  'DESCRIPTOR' : _TRANSACTIONATTRIBUTE,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.TransactionAttribute)
  })
_sym_db.RegisterMessage(TransactionAttribute)

StoreAttribute = _reflection.GeneratedProtocolMessageType('StoreAttribute', (_message.Message,), {
  'DESCRIPTOR' : _STOREATTRIBUTE,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.StoreAttribute)
  })
_sym_db.RegisterMessage(StoreAttribute)

UserData = _reflection.GeneratedProtocolMessageType('UserData', (_message.Message,), {
  'DESCRIPTOR' : _USERDATA,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.UserData)
  })
_sym_db.RegisterMessage(UserData)

CustomerMatchUserListMetadata = _reflection.GeneratedProtocolMessageType('CustomerMatchUserListMetadata', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERMATCHUSERLISTMETADATA,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.CustomerMatchUserListMetadata)
  })
_sym_db.RegisterMessage(CustomerMatchUserListMetadata)

StoreSalesMetadata = _reflection.GeneratedProtocolMessageType('StoreSalesMetadata', (_message.Message,), {
  'DESCRIPTOR' : _STORESALESMETADATA,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.StoreSalesMetadata)
  })
_sym_db.RegisterMessage(StoreSalesMetadata)

StoreSalesThirdPartyMetadata = _reflection.GeneratedProtocolMessageType('StoreSalesThirdPartyMetadata', (_message.Message,), {
  'DESCRIPTOR' : _STORESALESTHIRDPARTYMETADATA,
  '__module__' : 'google.ads.googleads.v4.common.offline_user_data_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata)
  })
_sym_db.RegisterMessage(StoreSalesThirdPartyMetadata)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
