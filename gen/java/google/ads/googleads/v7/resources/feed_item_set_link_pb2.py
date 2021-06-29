# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/feed_item_set_link.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/feed_item_set_link.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\024FeedItemSetLinkProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v7/resources/feed_item_set_link.proto\x12!google.ads.googleads.v7.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xe4\x02\n\x0f\x46\x65\x65\x64ItemSetLink\x12G\n\rresource_name\x18\x01 \x01(\tB0\xe0\x41\x05\xfa\x41*\n(googleads.googleapis.com/FeedItemSetLink\x12<\n\tfeed_item\x18\x02 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/FeedItem\x12\x43\n\rfeed_item_set\x18\x03 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/FeedItemSet:\x84\x01\xea\x41\x80\x01\n(googleads.googleapis.com/FeedItemSetLink\x12Tcustomers/{customer_id}/feedItemSetLinks/{feed_id}~{feed_item_set_id}~{feed_item_id}B\x81\x02\n%com.google.ads.googleads.v7.resourcesB\x14\x46\x65\x65\x64ItemSetLinkProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FEEDITEMSETLINK = _descriptor.Descriptor(
  name='FeedItemSetLink',
  full_name='google.ads.googleads.v7.resources.FeedItemSetLink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.FeedItemSetLink.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A*\n(googleads.googleapis.com/FeedItemSetLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_item', full_name='google.ads.googleads.v7.resources.FeedItemSetLink.feed_item', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/FeedItem', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_item_set', full_name='google.ads.googleads.v7.resources.FeedItemSetLink.feed_item_set', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A&\n$googleads.googleapis.com/FeedItemSet', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\200\001\n(googleads.googleapis.com/FeedItemSetLink\022Tcustomers/{customer_id}/feedItemSetLinks/{feed_id}~{feed_item_set_id}~{feed_item_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=188,
  serialized_end=544,
)

DESCRIPTOR.message_types_by_name['FeedItemSetLink'] = _FEEDITEMSETLINK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItemSetLink = _reflection.GeneratedProtocolMessageType('FeedItemSetLink', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMSETLINK,
  '__module__' : 'google.ads.googleads.v7.resources.feed_item_set_link_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.FeedItemSetLink)
  })
_sym_db.RegisterMessage(FeedItemSetLink)


DESCRIPTOR._options = None
_FEEDITEMSETLINK.fields_by_name['resource_name']._options = None
_FEEDITEMSETLINK.fields_by_name['feed_item']._options = None
_FEEDITEMSETLINK.fields_by_name['feed_item_set']._options = None
_FEEDITEMSETLINK._options = None
# @@protoc_insertion_point(module_scope)
