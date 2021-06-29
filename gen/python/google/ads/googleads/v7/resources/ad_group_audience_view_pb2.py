# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/ad_group_audience_view.proto
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
  name='google/ads/googleads/v7/resources/ad_group_audience_view.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\030AdGroupAudienceViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v7/resources/ad_group_audience_view.proto\x12!google.ads.googleads.v7.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xe0\x01\n\x13\x41\x64GroupAudienceView\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x03\xfa\x41.\n,googleads.googleapis.com/AdGroupAudienceView:|\xea\x41y\n,googleads.googleapis.com/AdGroupAudienceView\x12Icustomers/{customer_id}/adGroupAudienceViews/{ad_group_id}~{criterion_id}B\x85\x02\n%com.google.ads.googleads.v7.resourcesB\x18\x41\x64GroupAudienceViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ADGROUPAUDIENCEVIEW = _descriptor.Descriptor(
  name='AdGroupAudienceView',
  full_name='google.ads.googleads.v7.resources.AdGroupAudienceView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.AdGroupAudienceView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A.\n,googleads.googleapis.com/AdGroupAudienceView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Ay\n,googleads.googleapis.com/AdGroupAudienceView\022Icustomers/{customer_id}/adGroupAudienceViews/{ad_group_id}~{criterion_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=192,
  serialized_end=416,
)

DESCRIPTOR.message_types_by_name['AdGroupAudienceView'] = _ADGROUPAUDIENCEVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAudienceView = _reflection.GeneratedProtocolMessageType('AdGroupAudienceView', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPAUDIENCEVIEW,
  '__module__' : 'google.ads.googleads.v7.resources.ad_group_audience_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.AdGroupAudienceView)
  })
_sym_db.RegisterMessage(AdGroupAudienceView)


DESCRIPTOR._options = None
_ADGROUPAUDIENCEVIEW.fields_by_name['resource_name']._options = None
_ADGROUPAUDIENCEVIEW._options = None
# @@protoc_insertion_point(module_scope)
