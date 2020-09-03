# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/resources/age_range_view.proto

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
  name='google/ads/googleads/v3/resources/age_range_view.proto',
  package='google.ads.googleads.v3.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v3.resourcesB\021AgeRangeViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ads::GoogleAds::V3::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v3/resources/age_range_view.proto\x12!google.ads.googleads.v3.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xb5\x01\n\x0c\x41geRangeView\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x03\xfa\x41\'\n%googleads.googleapis.com/AgeRangeView:_\xea\x41\\\n%googleads.googleapis.com/AgeRangeView\x12\x33\x63ustomers/{customer}/ageRangeViews/{age_range_view}B\xfe\x01\n%com.google.ads.googleads.v3.resourcesB\x11\x41geRangeViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V3.Resources\xca\x02!Google\\Ads\\GoogleAds\\V3\\Resources\xea\x02%Google::Ads::GoogleAds::V3::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_AGERANGEVIEW = _descriptor.Descriptor(
  name='AgeRangeView',
  full_name='google.ads.googleads.v3.resources.AgeRangeView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.resources.AgeRangeView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A\'\n%googleads.googleapis.com/AgeRangeView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\\\n%googleads.googleapis.com/AgeRangeView\0223customers/{customer}/ageRangeViews/{age_range_view}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=184,
  serialized_end=365,
)

DESCRIPTOR.message_types_by_name['AgeRangeView'] = _AGERANGEVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AgeRangeView = _reflection.GeneratedProtocolMessageType('AgeRangeView', (_message.Message,), {
  'DESCRIPTOR' : _AGERANGEVIEW,
  '__module__' : 'google.ads.googleads.v3.resources.age_range_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.AgeRangeView)
  })
_sym_db.RegisterMessage(AgeRangeView)


DESCRIPTOR._options = None
_AGERANGEVIEW.fields_by_name['resource_name']._options = None
_AGERANGEVIEW._options = None
# @@protoc_insertion_point(module_scope)
