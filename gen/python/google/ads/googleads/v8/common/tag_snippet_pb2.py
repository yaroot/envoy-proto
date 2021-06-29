# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/common/tag_snippet.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import tracking_code_page_format_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__page__format__pb2
from google.ads.googleads.v8.enums import tracking_code_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__type__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/common/tag_snippet.proto',
  package='google.ads.googleads.v8.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v8.commonB\017TagSnippetProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Common\312\002\036Google\\Ads\\GoogleAds\\V8\\Common\352\002\"Google::Ads::GoogleAds::V8::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/ads/googleads/v8/common/tag_snippet.proto\x12\x1egoogle.ads.googleads.v8.common\x1a=google/ads/googleads/v8/enums/tracking_code_page_format.proto\x1a\x36google/ads/googleads/v8/enums/tracking_code_type.proto\x1a\x1cgoogle/api/annotations.proto\"\xa7\x02\n\nTagSnippet\x12R\n\x04type\x18\x01 \x01(\x0e\x32\x44.google.ads.googleads.v8.enums.TrackingCodeTypeEnum.TrackingCodeType\x12\x65\n\x0bpage_format\x18\x02 \x01(\x0e\x32P.google.ads.googleads.v8.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat\x12\x1c\n\x0fglobal_site_tag\x18\x05 \x01(\tH\x00\x88\x01\x01\x12\x1a\n\revent_snippet\x18\x06 \x01(\tH\x01\x88\x01\x01\x42\x12\n\x10_global_site_tagB\x10\n\x0e_event_snippetB\xea\x01\n\"com.google.ads.googleads.v8.commonB\x0fTagSnippetProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V8.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V8\\Common\xea\x02\"Google::Ads::GoogleAds::V8::Commonb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__page__format__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__type__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TAGSNIPPET = _descriptor.Descriptor(
  name='TagSnippet',
  full_name='google.ads.googleads.v8.common.TagSnippet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v8.common.TagSnippet.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_format', full_name='google.ads.googleads.v8.common.TagSnippet.page_format', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='global_site_tag', full_name='google.ads.googleads.v8.common.TagSnippet.global_site_tag', index=2,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event_snippet', full_name='google.ads.googleads.v8.common.TagSnippet.event_snippet', index=3,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
      name='_global_site_tag', full_name='google.ads.googleads.v8.common.TagSnippet._global_site_tag',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_event_snippet', full_name='google.ads.googleads.v8.common.TagSnippet._event_snippet',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=234,
  serialized_end=529,
)

_TAGSNIPPET.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__type__pb2._TRACKINGCODETYPEENUM_TRACKINGCODETYPE
_TAGSNIPPET.fields_by_name['page_format'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_tracking__code__page__format__pb2._TRACKINGCODEPAGEFORMATENUM_TRACKINGCODEPAGEFORMAT
_TAGSNIPPET.oneofs_by_name['_global_site_tag'].fields.append(
  _TAGSNIPPET.fields_by_name['global_site_tag'])
_TAGSNIPPET.fields_by_name['global_site_tag'].containing_oneof = _TAGSNIPPET.oneofs_by_name['_global_site_tag']
_TAGSNIPPET.oneofs_by_name['_event_snippet'].fields.append(
  _TAGSNIPPET.fields_by_name['event_snippet'])
_TAGSNIPPET.fields_by_name['event_snippet'].containing_oneof = _TAGSNIPPET.oneofs_by_name['_event_snippet']
DESCRIPTOR.message_types_by_name['TagSnippet'] = _TAGSNIPPET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TagSnippet = _reflection.GeneratedProtocolMessageType('TagSnippet', (_message.Message,), {
  'DESCRIPTOR' : _TAGSNIPPET,
  '__module__' : 'google.ads.googleads.v8.common.tag_snippet_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TagSnippet)
  })
_sym_db.RegisterMessage(TagSnippet)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)