# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/feed.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.enums import affiliate_location_feed_relationship_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_affiliate__location__feed__relationship__type__pb2
from google.ads.googleads.v4.enums import feed_attribute_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__attribute__type__pb2
from google.ads.googleads.v4.enums import feed_origin_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__origin__pb2
from google.ads.googleads.v4.enums import feed_status_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/feed.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\tFeedProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,google/ads/googleads/v4/resources/feed.proto\x12!google.ads.googleads.v4.resources\x1aMgoogle/ads/googleads/v4/enums/affiliate_location_feed_relationship_type.proto\x1a\x37google/ads/googleads/v4/enums/feed_attribute_type.proto\x1a/google/ads/googleads/v4/enums/feed_origin.proto\x1a/google/ads/googleads/v4/enums/feed_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xc1\x0c\n\x04\x46\x65\x65\x64\x12<\n\rresource_name\x18\x01 \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/Feed\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12/\n\x04name\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12\x44\n\nattributes\x18\x04 \x03(\x0b\x32\x30.google.ads.googleads.v4.resources.FeedAttribute\x12W\n\x14\x61ttribute_operations\x18\t \x03(\x0b\x32\x39.google.ads.googleads.v4.resources.FeedAttributeOperation\x12M\n\x06origin\x18\x05 \x01(\x0e\x32\x38.google.ads.googleads.v4.enums.FeedOriginEnum.FeedOriginB\x03\xe0\x41\x05\x12M\n\x06status\x18\x08 \x01(\x0e\x32\x38.google.ads.googleads.v4.enums.FeedStatusEnum.FeedStatusB\x03\xe0\x41\x03\x12\x63\n\x19places_location_feed_data\x18\x06 \x01(\x0b\x32>.google.ads.googleads.v4.resources.Feed.PlacesLocationFeedDataH\x00\x12i\n\x1c\x61\x66\x66iliate_location_feed_data\x18\x07 \x01(\x0b\x32\x41.google.ads.googleads.v4.resources.Feed.AffiliateLocationFeedDataH\x00\x1a\xce\x04\n\x16PlacesLocationFeedData\x12\x61\n\noauth_info\x18\x01 \x01(\x0b\x32H.google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfoB\x03\xe0\x41\x05\x12\x33\n\remail_address\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x39\n\x13\x62usiness_account_id\x18\n \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12:\n\x14\x62usiness_name_filter\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x36\n\x10\x63\x61tegory_filters\x18\x05 \x03(\x0b\x32\x1c.google.protobuf.StringValue\x12\x33\n\rlabel_filters\x18\x06 \x03(\x0b\x32\x1c.google.protobuf.StringValue\x1a\xb7\x01\n\tOAuthInfo\x12\x31\n\x0bhttp_method\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x36\n\x10http_request_url\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12?\n\x19http_authorization_header\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x1a\xd7\x01\n\x19\x41\x66\x66iliateLocationFeedData\x12.\n\tchain_ids\x18\x01 \x03(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x89\x01\n\x11relationship_type\x18\x02 \x01(\x0e\x32n.google.ads.googleads.v4.enums.AffiliateLocationFeedRelationshipTypeEnum.AffiliateLocationFeedRelationshipType:E\xea\x41\x42\n\x1dgoogleads.googleapis.com/Feed\x12!customers/{customer}/feeds/{feed}B\x1d\n\x1bsystem_feed_generation_data\"\xee\x01\n\rFeedAttribute\x12\'\n\x02id\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12*\n\x04name\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12T\n\x04type\x18\x03 \x01(\x0e\x32\x46.google.ads.googleads.v4.enums.FeedAttributeTypeEnum.FeedAttributeType\x12\x32\n\x0eis_part_of_key\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\"\xec\x01\n\x16\x46\x65\x65\x64\x41ttributeOperation\x12Y\n\x08operator\x18\x01 \x01(\x0e\x32\x42.google.ads.googleads.v4.resources.FeedAttributeOperation.OperatorB\x03\xe0\x41\x03\x12\x44\n\x05value\x18\x02 \x01(\x0b\x32\x30.google.ads.googleads.v4.resources.FeedAttributeB\x03\xe0\x41\x03\"1\n\x08Operator\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x07\n\x03\x41\x44\x44\x10\x02\x42\xf6\x01\n%com.google.ads.googleads.v4.resourcesB\tFeedProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_affiliate__location__feed__relationship__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__attribute__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__origin__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEEDATTRIBUTEOPERATION_OPERATOR = _descriptor.EnumDescriptor(
  name='Operator',
  full_name='google.ads.googleads.v4.resources.FeedAttributeOperation.Operator',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2472,
  serialized_end=2521,
)
_sym_db.RegisterEnumDescriptor(_FEEDATTRIBUTEOPERATION_OPERATOR)


_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO = _descriptor.Descriptor(
  name='OAuthInfo',
  full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='http_method', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfo.http_method', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='http_request_url', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfo.http_request_url', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='http_authorization_header', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfo.http_authorization_header', index=2,
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
  serialized_start=1538,
  serialized_end=1721,
)

_FEED_PLACESLOCATIONFEEDDATA = _descriptor.Descriptor(
  name='PlacesLocationFeedData',
  full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='oauth_info', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.oauth_info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.email_address', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='business_account_id', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.business_account_id', index=2,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='business_name_filter', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.business_name_filter', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='category_filters', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.category_filters', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='label_filters', full_name='google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.label_filters', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1131,
  serialized_end=1721,
)

_FEED_AFFILIATELOCATIONFEEDDATA = _descriptor.Descriptor(
  name='AffiliateLocationFeedData',
  full_name='google.ads.googleads.v4.resources.Feed.AffiliateLocationFeedData',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='chain_ids', full_name='google.ads.googleads.v4.resources.Feed.AffiliateLocationFeedData.chain_ids', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='relationship_type', full_name='google.ads.googleads.v4.resources.Feed.AffiliateLocationFeedData.relationship_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
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
  serialized_start=1724,
  serialized_end=1939,
)

_FEED = _descriptor.Descriptor(
  name='Feed',
  full_name='google.ads.googleads.v4.resources.Feed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.Feed.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.Feed.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v4.resources.Feed.name', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attributes', full_name='google.ads.googleads.v4.resources.Feed.attributes', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attribute_operations', full_name='google.ads.googleads.v4.resources.Feed.attribute_operations', index=4,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='origin', full_name='google.ads.googleads.v4.resources.Feed.origin', index=5,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v4.resources.Feed.status', index=6,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='places_location_feed_data', full_name='google.ads.googleads.v4.resources.Feed.places_location_feed_data', index=7,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='affiliate_location_feed_data', full_name='google.ads.googleads.v4.resources.Feed.affiliate_location_feed_data', index=8,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FEED_PLACESLOCATIONFEEDDATA, _FEED_AFFILIATELOCATIONFEEDDATA, ],
  enum_types=[
  ],
  serialized_options=b'\352AB\n\035googleads.googleapis.com/Feed\022!customers/{customer}/feeds/{feed}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='system_feed_generation_data', full_name='google.ads.googleads.v4.resources.Feed.system_feed_generation_data',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=440,
  serialized_end=2041,
)


_FEEDATTRIBUTE = _descriptor.Descriptor(
  name='FeedAttribute',
  full_name='google.ads.googleads.v4.resources.FeedAttribute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.FeedAttribute.id', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v4.resources.FeedAttribute.name', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v4.resources.FeedAttribute.type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_part_of_key', full_name='google.ads.googleads.v4.resources.FeedAttribute.is_part_of_key', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=2044,
  serialized_end=2282,
)


_FEEDATTRIBUTEOPERATION = _descriptor.Descriptor(
  name='FeedAttributeOperation',
  full_name='google.ads.googleads.v4.resources.FeedAttributeOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operator', full_name='google.ads.googleads.v4.resources.FeedAttributeOperation.operator', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.ads.googleads.v4.resources.FeedAttributeOperation.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _FEEDATTRIBUTEOPERATION_OPERATOR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2285,
  serialized_end=2521,
)

_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO.fields_by_name['http_method'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO.fields_by_name['http_request_url'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO.fields_by_name['http_authorization_header'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO.containing_type = _FEED_PLACESLOCATIONFEEDDATA
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['oauth_info'].message_type = _FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['email_address'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['business_account_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['business_name_filter'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['category_filters'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['label_filters'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED_PLACESLOCATIONFEEDDATA.containing_type = _FEED
_FEED_AFFILIATELOCATIONFEEDDATA.fields_by_name['chain_ids'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_FEED_AFFILIATELOCATIONFEEDDATA.fields_by_name['relationship_type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_affiliate__location__feed__relationship__type__pb2._AFFILIATELOCATIONFEEDRELATIONSHIPTYPEENUM_AFFILIATELOCATIONFEEDRELATIONSHIPTYPE
_FEED_AFFILIATELOCATIONFEEDDATA.containing_type = _FEED
_FEED.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_FEED.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEED.fields_by_name['attributes'].message_type = _FEEDATTRIBUTE
_FEED.fields_by_name['attribute_operations'].message_type = _FEEDATTRIBUTEOPERATION
_FEED.fields_by_name['origin'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__origin__pb2._FEEDORIGINENUM_FEEDORIGIN
_FEED.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__status__pb2._FEEDSTATUSENUM_FEEDSTATUS
_FEED.fields_by_name['places_location_feed_data'].message_type = _FEED_PLACESLOCATIONFEEDDATA
_FEED.fields_by_name['affiliate_location_feed_data'].message_type = _FEED_AFFILIATELOCATIONFEEDDATA
_FEED.oneofs_by_name['system_feed_generation_data'].fields.append(
  _FEED.fields_by_name['places_location_feed_data'])
_FEED.fields_by_name['places_location_feed_data'].containing_oneof = _FEED.oneofs_by_name['system_feed_generation_data']
_FEED.oneofs_by_name['system_feed_generation_data'].fields.append(
  _FEED.fields_by_name['affiliate_location_feed_data'])
_FEED.fields_by_name['affiliate_location_feed_data'].containing_oneof = _FEED.oneofs_by_name['system_feed_generation_data']
_FEEDATTRIBUTE.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_FEEDATTRIBUTE.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_FEEDATTRIBUTE.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_feed__attribute__type__pb2._FEEDATTRIBUTETYPEENUM_FEEDATTRIBUTETYPE
_FEEDATTRIBUTE.fields_by_name['is_part_of_key'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_FEEDATTRIBUTEOPERATION.fields_by_name['operator'].enum_type = _FEEDATTRIBUTEOPERATION_OPERATOR
_FEEDATTRIBUTEOPERATION.fields_by_name['value'].message_type = _FEEDATTRIBUTE
_FEEDATTRIBUTEOPERATION_OPERATOR.containing_type = _FEEDATTRIBUTEOPERATION
DESCRIPTOR.message_types_by_name['Feed'] = _FEED
DESCRIPTOR.message_types_by_name['FeedAttribute'] = _FEEDATTRIBUTE
DESCRIPTOR.message_types_by_name['FeedAttributeOperation'] = _FEEDATTRIBUTEOPERATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Feed = _reflection.GeneratedProtocolMessageType('Feed', (_message.Message,), {

  'PlacesLocationFeedData' : _reflection.GeneratedProtocolMessageType('PlacesLocationFeedData', (_message.Message,), {

    'OAuthInfo' : _reflection.GeneratedProtocolMessageType('OAuthInfo', (_message.Message,), {
      'DESCRIPTOR' : _FEED_PLACESLOCATIONFEEDDATA_OAUTHINFO,
      '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
      # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData.OAuthInfo)
      })
    ,
    'DESCRIPTOR' : _FEED_PLACESLOCATIONFEEDDATA,
    '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.Feed.PlacesLocationFeedData)
    })
  ,

  'AffiliateLocationFeedData' : _reflection.GeneratedProtocolMessageType('AffiliateLocationFeedData', (_message.Message,), {
    'DESCRIPTOR' : _FEED_AFFILIATELOCATIONFEEDDATA,
    '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.Feed.AffiliateLocationFeedData)
    })
  ,
  'DESCRIPTOR' : _FEED,
  '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.Feed)
  })
_sym_db.RegisterMessage(Feed)
_sym_db.RegisterMessage(Feed.PlacesLocationFeedData)
_sym_db.RegisterMessage(Feed.PlacesLocationFeedData.OAuthInfo)
_sym_db.RegisterMessage(Feed.AffiliateLocationFeedData)

FeedAttribute = _reflection.GeneratedProtocolMessageType('FeedAttribute', (_message.Message,), {
  'DESCRIPTOR' : _FEEDATTRIBUTE,
  '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.FeedAttribute)
  })
_sym_db.RegisterMessage(FeedAttribute)

FeedAttributeOperation = _reflection.GeneratedProtocolMessageType('FeedAttributeOperation', (_message.Message,), {
  'DESCRIPTOR' : _FEEDATTRIBUTEOPERATION,
  '__module__' : 'google.ads.googleads.v4.resources.feed_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.FeedAttributeOperation)
  })
_sym_db.RegisterMessage(FeedAttributeOperation)


DESCRIPTOR._options = None
_FEED_PLACESLOCATIONFEEDDATA.fields_by_name['oauth_info']._options = None
_FEED.fields_by_name['resource_name']._options = None
_FEED.fields_by_name['id']._options = None
_FEED.fields_by_name['name']._options = None
_FEED.fields_by_name['origin']._options = None
_FEED.fields_by_name['status']._options = None
_FEED._options = None
_FEEDATTRIBUTEOPERATION.fields_by_name['operator']._options = None
_FEEDATTRIBUTEOPERATION.fields_by_name['value']._options = None
# @@protoc_insertion_point(module_scope)
