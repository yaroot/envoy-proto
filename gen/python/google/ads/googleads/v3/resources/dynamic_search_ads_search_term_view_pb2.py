# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/resources/dynamic_search_ads_search_term_view.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/resources/dynamic_search_ads_search_term_view.proto',
  package='google.ads.googleads.v3.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v3.resourcesB#DynamicSearchAdsSearchTermViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ads::GoogleAds::V3::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nKgoogle/ads/googleads/v3/resources/dynamic_search_ads_search_term_view.proto\x12!google.ads.googleads.v3.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xa8\x05\n\x1e\x44ynamicSearchAdsSearchTermView\x12V\n\rresource_name\x18\x01 \x01(\tB?\xe0\x41\x03\xfa\x41\x39\n7googleads.googleapis.com/DynamicSearchAdsSearchTermView\x12\x36\n\x0bsearch_term\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12\x33\n\x08headline\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12\x37\n\x0clanding_page\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12\x33\n\x08page_url\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12=\n\x14has_negative_keyword\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x03\x12=\n\x14has_matching_keyword\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x03\x12\x39\n\x10has_negative_url\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x03:\x99\x01\xea\x41\x95\x01\n7googleads.googleapis.com/DynamicSearchAdsSearchTermView\x12Zcustomers/{customer}/dynamicSearchAdsSearchTermViews/{dynamic_search_ads_search_term_view}B\x90\x02\n%com.google.ads.googleads.v3.resourcesB#DynamicSearchAdsSearchTermViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V3.Resources\xca\x02!Google\\Ads\\GoogleAds\\V3\\Resources\xea\x02%Google::Ads::GoogleAds::V3::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DYNAMICSEARCHADSSEARCHTERMVIEW = _descriptor.Descriptor(
  name='DynamicSearchAdsSearchTermView',
  full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A9\n7googleads.googleapis.com/DynamicSearchAdsSearchTermView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search_term', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.search_term', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='headline', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.headline', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='landing_page', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.landing_page', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_url', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.page_url', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_negative_keyword', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.has_negative_keyword', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_matching_keyword', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.has_matching_keyword', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_negative_url', full_name='google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView.has_negative_url', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\225\001\n7googleads.googleapis.com/DynamicSearchAdsSearchTermView\022Zcustomers/{customer}/dynamicSearchAdsSearchTermViews/{dynamic_search_ads_search_term_view}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=237,
  serialized_end=917,
)

_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['search_term'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['headline'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['landing_page'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['page_url'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_negative_keyword'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_matching_keyword'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_negative_url'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
DESCRIPTOR.message_types_by_name['DynamicSearchAdsSearchTermView'] = _DYNAMICSEARCHADSSEARCHTERMVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DynamicSearchAdsSearchTermView = _reflection.GeneratedProtocolMessageType('DynamicSearchAdsSearchTermView', (_message.Message,), {
  'DESCRIPTOR' : _DYNAMICSEARCHADSSEARCHTERMVIEW,
  '__module__' : 'google.ads.googleads.v3.resources.dynamic_search_ads_search_term_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.DynamicSearchAdsSearchTermView)
  })
_sym_db.RegisterMessage(DynamicSearchAdsSearchTermView)


DESCRIPTOR._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['resource_name']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['search_term']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['headline']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['landing_page']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['page_url']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_negative_keyword']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_matching_keyword']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW.fields_by_name['has_negative_url']._options = None
_DYNAMICSEARCHADSSEARCHTERMVIEW._options = None
# @@protoc_insertion_point(module_scope)
