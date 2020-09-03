# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/resources/search_term_view.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.enums import search_term_targeting_status_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_enums_dot_search__term__targeting__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/resources/search_term_view.proto',
  package='google.ads.googleads.v3.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v3.resourcesB\023SearchTermViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ads::GoogleAds::V3::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/ads/googleads/v3/resources/search_term_view.proto\x12!google.ads.googleads.v3.resources\x1a@google/ads/googleads/v3/enums/search_term_targeting_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xbe\x03\n\x0eSearchTermView\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x03\xfa\x41)\n\'googleads.googleapis.com/SearchTermView\x12\x36\n\x0bsearch_term\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12X\n\x08\x61\x64_group\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB(\xe0\x41\x03\xfa\x41\"\n googleads.googleapis.com/AdGroup\x12k\n\x06status\x18\x04 \x01(\x0e\x32V.google.ads.googleads.v3.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatusB\x03\xe0\x41\x03:e\xea\x41\x62\n\'googleads.googleapis.com/SearchTermView\x12\x37\x63ustomers/{customer}/searchTermViews/{search_term_view}B\x80\x02\n%com.google.ads.googleads.v3.resourcesB\x13SearchTermViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V3.Resources\xca\x02!Google\\Ads\\GoogleAds\\V3\\Resources\xea\x02%Google::Ads::GoogleAds::V3::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_enums_dot_search__term__targeting__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_SEARCHTERMVIEW = _descriptor.Descriptor(
  name='SearchTermView',
  full_name='google.ads.googleads.v3.resources.SearchTermView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.resources.SearchTermView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A)\n\'googleads.googleapis.com/SearchTermView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search_term', full_name='google.ads.googleads.v3.resources.SearchTermView.search_term', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group', full_name='google.ads.googleads.v3.resources.SearchTermView.ad_group', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A\"\n googleads.googleapis.com/AdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v3.resources.SearchTermView.status', index=3,
      number=4, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\352Ab\n\'googleads.googleapis.com/SearchTermView\0227customers/{customer}/searchTermViews/{search_term_view}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=284,
  serialized_end=730,
)

_SEARCHTERMVIEW.fields_by_name['search_term'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SEARCHTERMVIEW.fields_by_name['ad_group'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SEARCHTERMVIEW.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v3_dot_enums_dot_search__term__targeting__status__pb2._SEARCHTERMTARGETINGSTATUSENUM_SEARCHTERMTARGETINGSTATUS
DESCRIPTOR.message_types_by_name['SearchTermView'] = _SEARCHTERMVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SearchTermView = _reflection.GeneratedProtocolMessageType('SearchTermView', (_message.Message,), {
  'DESCRIPTOR' : _SEARCHTERMVIEW,
  '__module__' : 'google.ads.googleads.v3.resources.search_term_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.SearchTermView)
  })
_sym_db.RegisterMessage(SearchTermView)


DESCRIPTOR._options = None
_SEARCHTERMVIEW.fields_by_name['resource_name']._options = None
_SEARCHTERMVIEW.fields_by_name['search_term']._options = None
_SEARCHTERMVIEW.fields_by_name['ad_group']._options = None
_SEARCHTERMVIEW.fields_by_name['status']._options = None
_SEARCHTERMVIEW._options = None
# @@protoc_insertion_point(module_scope)
