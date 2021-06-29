# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/feed_placeholder_view.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.enums import placeholder_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_placeholder__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/feed_placeholder_view.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\030FeedPlaceholderViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v7/resources/feed_placeholder_view.proto\x12!google.ads.googleads.v7.resources\x1a\x34google/ads/googleads/v7/enums/placeholder_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xb9\x02\n\x13\x46\x65\x65\x64PlaceholderView\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x03\xfa\x41.\n,googleads.googleapis.com/FeedPlaceholderView\x12\x61\n\x10placeholder_type\x18\x02 \x01(\x0e\x32\x42.google.ads.googleads.v7.enums.PlaceholderTypeEnum.PlaceholderTypeB\x03\xe0\x41\x03:r\xea\x41o\n,googleads.googleapis.com/FeedPlaceholderView\x12?customers/{customer_id}/feedPlaceholderViews/{placeholder_type}B\x85\x02\n%com.google.ads.googleads.v7.resourcesB\x18\x46\x65\x65\x64PlaceholderViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_placeholder__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FEEDPLACEHOLDERVIEW = _descriptor.Descriptor(
  name='FeedPlaceholderView',
  full_name='google.ads.googleads.v7.resources.FeedPlaceholderView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.FeedPlaceholderView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A.\n,googleads.googleapis.com/FeedPlaceholderView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='placeholder_type', full_name='google.ads.googleads.v7.resources.FeedPlaceholderView.placeholder_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\352Ao\n,googleads.googleapis.com/FeedPlaceholderView\022?customers/{customer_id}/feedPlaceholderViews/{placeholder_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=245,
  serialized_end=558,
)

_FEEDPLACEHOLDERVIEW.fields_by_name['placeholder_type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_placeholder__type__pb2._PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE
DESCRIPTOR.message_types_by_name['FeedPlaceholderView'] = _FEEDPLACEHOLDERVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedPlaceholderView = _reflection.GeneratedProtocolMessageType('FeedPlaceholderView', (_message.Message,), {
  'DESCRIPTOR' : _FEEDPLACEHOLDERVIEW,
  '__module__' : 'google.ads.googleads.v7.resources.feed_placeholder_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.FeedPlaceholderView)
  })
_sym_db.RegisterMessage(FeedPlaceholderView)


DESCRIPTOR._options = None
_FEEDPLACEHOLDERVIEW.fields_by_name['resource_name']._options = None
_FEEDPLACEHOLDERVIEW.fields_by_name['placeholder_type']._options = None
_FEEDPLACEHOLDERVIEW._options = None
# @@protoc_insertion_point(module_scope)
