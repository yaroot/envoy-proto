# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/keyword_plan_idea_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.common import keyword_plan_common_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2
from google.ads.googleads.v8.enums import keyword_plan_keyword_annotation_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__keyword__annotation__pb2
from google.ads.googleads.v8.enums import keyword_plan_network_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__network__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/keyword_plan_idea_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB\033KeywordPlanIdeaServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@google/ads/googleads/v8/services/keyword_plan_idea_service.proto\x12 google.ads.googleads.v8.services\x1a\x38google/ads/googleads/v8/common/keyword_plan_common.proto\x1a\x43google/ads/googleads/v8/enums/keyword_plan_keyword_annotation.proto\x1a\x38google/ads/googleads/v8/enums/keyword_plan_network.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\"\xf7\x06\n\x1bGenerateKeywordIdeasRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x15\n\x08language\x18\x0e \x01(\tH\x01\x88\x01\x01\x12\x1c\n\x14geo_target_constants\x18\x0f \x03(\t\x12\x1e\n\x16include_adult_keywords\x18\n \x01(\x08\x12\x12\n\npage_token\x18\x0c \x01(\t\x12\x11\n\tpage_size\x18\r \x01(\x05\x12\x66\n\x14keyword_plan_network\x18\t \x01(\x0e\x32H.google.ads.googleads.v8.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork\x12x\n\x12keyword_annotation\x18\x11 \x03(\x0e\x32\\.google.ads.googleads.v8.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation\x12V\n\x11\x61ggregate_metrics\x18\x10 \x01(\x0b\x32;.google.ads.googleads.v8.common.KeywordPlanAggregateMetrics\x12\\\n\x1ahistorical_metrics_options\x18\x12 \x01(\x0b\x32\x38.google.ads.googleads.v8.common.HistoricalMetricsOptions\x12S\n\x14keyword_and_url_seed\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v8.services.KeywordAndUrlSeedH\x00\x12\x45\n\x0ckeyword_seed\x18\x03 \x01(\x0b\x32-.google.ads.googleads.v8.services.KeywordSeedH\x00\x12=\n\x08url_seed\x18\x05 \x01(\x0b\x32).google.ads.googleads.v8.services.UrlSeedH\x00\x12?\n\tsite_seed\x18\x0b \x01(\x0b\x32*.google.ads.googleads.v8.services.SiteSeedH\x00\x42\x06\n\x04seedB\x0b\n\t_language\"?\n\x11KeywordAndUrlSeed\x12\x10\n\x03url\x18\x03 \x01(\tH\x00\x88\x01\x01\x12\x10\n\x08keywords\x18\x04 \x03(\tB\x06\n\x04_url\"\x1f\n\x0bKeywordSeed\x12\x10\n\x08keywords\x18\x02 \x03(\t\"&\n\x08SiteSeed\x12\x11\n\x04site\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x07\n\x05_site\"#\n\x07UrlSeed\x12\x10\n\x03url\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x06\n\x04_url\"\xfd\x01\n\x1bGenerateKeywordIdeaResponse\x12L\n\x07results\x18\x01 \x03(\x0b\x32;.google.ads.googleads.v8.services.GenerateKeywordIdeaResult\x12\x63\n\x18\x61ggregate_metric_results\x18\x04 \x01(\x0b\x32\x41.google.ads.googleads.v8.common.KeywordPlanAggregateMetricResults\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x12\n\ntotal_size\x18\x03 \x01(\x03\"\xe4\x01\n\x19GenerateKeywordIdeaResult\x12\x11\n\x04text\x18\x05 \x01(\tH\x00\x88\x01\x01\x12Z\n\x14keyword_idea_metrics\x18\x03 \x01(\x0b\x32<.google.ads.googleads.v8.common.KeywordPlanHistoricalMetrics\x12O\n\x13keyword_annotations\x18\x06 \x01(\x0b\x32\x32.google.ads.googleads.v8.common.KeywordAnnotationsB\x07\n\x05_text2\xb5\x02\n\x16KeywordPlanIdeaService\x12\xd3\x01\n\x14GenerateKeywordIdeas\x12=.google.ads.googleads.v8.services.GenerateKeywordIdeasRequest\x1a=.google.ads.googleads.v8.services.GenerateKeywordIdeaResponse\"=\x82\xd3\xe4\x93\x02\x37\"2/v8/customers/{customer_id=*}:generateKeywordIdeas:\x01*\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x82\x02\n$com.google.ads.googleads.v8.servicesB\x1bKeywordPlanIdeaServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__keyword__annotation__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__network__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])




_GENERATEKEYWORDIDEASREQUEST = _descriptor.Descriptor(
  name='GenerateKeywordIdeasRequest',
  full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.language', index=1,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_target_constants', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.geo_target_constants', index=2,
      number=15, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='include_adult_keywords', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.include_adult_keywords', index=3,
      number=10, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.page_token', index=4,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.page_size', index=5,
      number=13, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan_network', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.keyword_plan_network', index=6,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_annotation', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.keyword_annotation', index=7,
      number=17, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='aggregate_metrics', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.aggregate_metrics', index=8,
      number=16, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='historical_metrics_options', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.historical_metrics_options', index=9,
      number=18, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_and_url_seed', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.keyword_and_url_seed', index=10,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_seed', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.keyword_seed', index=11,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='url_seed', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.url_seed', index=12,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='site_seed', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.site_seed', index=13,
      number=11, type=11, cpp_type=10, label=1,
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
      name='seed', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest.seed',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_language', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeasRequest._language',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=343,
  serialized_end=1230,
)


_KEYWORDANDURLSEED = _descriptor.Descriptor(
  name='KeywordAndUrlSeed',
  full_name='google.ads.googleads.v8.services.KeywordAndUrlSeed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.ads.googleads.v8.services.KeywordAndUrlSeed.url', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keywords', full_name='google.ads.googleads.v8.services.KeywordAndUrlSeed.keywords', index=1,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
      name='_url', full_name='google.ads.googleads.v8.services.KeywordAndUrlSeed._url',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1232,
  serialized_end=1295,
)


_KEYWORDSEED = _descriptor.Descriptor(
  name='KeywordSeed',
  full_name='google.ads.googleads.v8.services.KeywordSeed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='keywords', full_name='google.ads.googleads.v8.services.KeywordSeed.keywords', index=0,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=1297,
  serialized_end=1328,
)


_SITESEED = _descriptor.Descriptor(
  name='SiteSeed',
  full_name='google.ads.googleads.v8.services.SiteSeed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='site', full_name='google.ads.googleads.v8.services.SiteSeed.site', index=0,
      number=2, type=9, cpp_type=9, label=1,
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
      name='_site', full_name='google.ads.googleads.v8.services.SiteSeed._site',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1330,
  serialized_end=1368,
)


_URLSEED = _descriptor.Descriptor(
  name='UrlSeed',
  full_name='google.ads.googleads.v8.services.UrlSeed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.ads.googleads.v8.services.UrlSeed.url', index=0,
      number=2, type=9, cpp_type=9, label=1,
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
      name='_url', full_name='google.ads.googleads.v8.services.UrlSeed._url',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1370,
  serialized_end=1405,
)


_GENERATEKEYWORDIDEARESPONSE = _descriptor.Descriptor(
  name='GenerateKeywordIdeaResponse',
  full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResponse.results', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='aggregate_metric_results', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResponse.aggregate_metric_results', index=1,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResponse.next_page_token', index=2,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_size', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResponse.total_size', index=3,
      number=3, type=3, cpp_type=2, label=1,
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
  serialized_start=1408,
  serialized_end=1661,
)


_GENERATEKEYWORDIDEARESULT = _descriptor.Descriptor(
  name='GenerateKeywordIdeaResult',
  full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResult.text', index=0,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_idea_metrics', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResult.keyword_idea_metrics', index=1,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_annotations', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResult.keyword_annotations', index=2,
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
    _descriptor.OneofDescriptor(
      name='_text', full_name='google.ads.googleads.v8.services.GenerateKeywordIdeaResult._text',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1664,
  serialized_end=1892,
)

_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_plan_network'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__network__pb2._KEYWORDPLANNETWORKENUM_KEYWORDPLANNETWORK
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_annotation'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_keyword__plan__keyword__annotation__pb2._KEYWORDPLANKEYWORDANNOTATIONENUM_KEYWORDPLANKEYWORDANNOTATION
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['aggregate_metrics'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2._KEYWORDPLANAGGREGATEMETRICS
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['historical_metrics_options'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2._HISTORICALMETRICSOPTIONS
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_and_url_seed'].message_type = _KEYWORDANDURLSEED
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_seed'].message_type = _KEYWORDSEED
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['url_seed'].message_type = _URLSEED
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['site_seed'].message_type = _SITESEED
_GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed'].fields.append(
  _GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_and_url_seed'])
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_and_url_seed'].containing_oneof = _GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed']
_GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed'].fields.append(
  _GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_seed'])
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['keyword_seed'].containing_oneof = _GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed']
_GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed'].fields.append(
  _GENERATEKEYWORDIDEASREQUEST.fields_by_name['url_seed'])
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['url_seed'].containing_oneof = _GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed']
_GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed'].fields.append(
  _GENERATEKEYWORDIDEASREQUEST.fields_by_name['site_seed'])
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['site_seed'].containing_oneof = _GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['seed']
_GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['_language'].fields.append(
  _GENERATEKEYWORDIDEASREQUEST.fields_by_name['language'])
_GENERATEKEYWORDIDEASREQUEST.fields_by_name['language'].containing_oneof = _GENERATEKEYWORDIDEASREQUEST.oneofs_by_name['_language']
_KEYWORDANDURLSEED.oneofs_by_name['_url'].fields.append(
  _KEYWORDANDURLSEED.fields_by_name['url'])
_KEYWORDANDURLSEED.fields_by_name['url'].containing_oneof = _KEYWORDANDURLSEED.oneofs_by_name['_url']
_SITESEED.oneofs_by_name['_site'].fields.append(
  _SITESEED.fields_by_name['site'])
_SITESEED.fields_by_name['site'].containing_oneof = _SITESEED.oneofs_by_name['_site']
_URLSEED.oneofs_by_name['_url'].fields.append(
  _URLSEED.fields_by_name['url'])
_URLSEED.fields_by_name['url'].containing_oneof = _URLSEED.oneofs_by_name['_url']
_GENERATEKEYWORDIDEARESPONSE.fields_by_name['results'].message_type = _GENERATEKEYWORDIDEARESULT
_GENERATEKEYWORDIDEARESPONSE.fields_by_name['aggregate_metric_results'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2._KEYWORDPLANAGGREGATEMETRICRESULTS
_GENERATEKEYWORDIDEARESULT.fields_by_name['keyword_idea_metrics'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2._KEYWORDPLANHISTORICALMETRICS
_GENERATEKEYWORDIDEARESULT.fields_by_name['keyword_annotations'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_keyword__plan__common__pb2._KEYWORDANNOTATIONS
_GENERATEKEYWORDIDEARESULT.oneofs_by_name['_text'].fields.append(
  _GENERATEKEYWORDIDEARESULT.fields_by_name['text'])
_GENERATEKEYWORDIDEARESULT.fields_by_name['text'].containing_oneof = _GENERATEKEYWORDIDEARESULT.oneofs_by_name['_text']
DESCRIPTOR.message_types_by_name['GenerateKeywordIdeasRequest'] = _GENERATEKEYWORDIDEASREQUEST
DESCRIPTOR.message_types_by_name['KeywordAndUrlSeed'] = _KEYWORDANDURLSEED
DESCRIPTOR.message_types_by_name['KeywordSeed'] = _KEYWORDSEED
DESCRIPTOR.message_types_by_name['SiteSeed'] = _SITESEED
DESCRIPTOR.message_types_by_name['UrlSeed'] = _URLSEED
DESCRIPTOR.message_types_by_name['GenerateKeywordIdeaResponse'] = _GENERATEKEYWORDIDEARESPONSE
DESCRIPTOR.message_types_by_name['GenerateKeywordIdeaResult'] = _GENERATEKEYWORDIDEARESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GenerateKeywordIdeasRequest = _reflection.GeneratedProtocolMessageType('GenerateKeywordIdeasRequest', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEKEYWORDIDEASREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GenerateKeywordIdeasRequest)
  })
_sym_db.RegisterMessage(GenerateKeywordIdeasRequest)

KeywordAndUrlSeed = _reflection.GeneratedProtocolMessageType('KeywordAndUrlSeed', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDANDURLSEED,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.KeywordAndUrlSeed)
  })
_sym_db.RegisterMessage(KeywordAndUrlSeed)

KeywordSeed = _reflection.GeneratedProtocolMessageType('KeywordSeed', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDSEED,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.KeywordSeed)
  })
_sym_db.RegisterMessage(KeywordSeed)

SiteSeed = _reflection.GeneratedProtocolMessageType('SiteSeed', (_message.Message,), {
  'DESCRIPTOR' : _SITESEED,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.SiteSeed)
  })
_sym_db.RegisterMessage(SiteSeed)

UrlSeed = _reflection.GeneratedProtocolMessageType('UrlSeed', (_message.Message,), {
  'DESCRIPTOR' : _URLSEED,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.UrlSeed)
  })
_sym_db.RegisterMessage(UrlSeed)

GenerateKeywordIdeaResponse = _reflection.GeneratedProtocolMessageType('GenerateKeywordIdeaResponse', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEKEYWORDIDEARESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GenerateKeywordIdeaResponse)
  })
_sym_db.RegisterMessage(GenerateKeywordIdeaResponse)

GenerateKeywordIdeaResult = _reflection.GeneratedProtocolMessageType('GenerateKeywordIdeaResult', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEKEYWORDIDEARESULT,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_idea_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GenerateKeywordIdeaResult)
  })
_sym_db.RegisterMessage(GenerateKeywordIdeaResult)


DESCRIPTOR._options = None

_KEYWORDPLANIDEASERVICE = _descriptor.ServiceDescriptor(
  name='KeywordPlanIdeaService',
  full_name='google.ads.googleads.v8.services.KeywordPlanIdeaService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1895,
  serialized_end=2204,
  methods=[
  _descriptor.MethodDescriptor(
    name='GenerateKeywordIdeas',
    full_name='google.ads.googleads.v8.services.KeywordPlanIdeaService.GenerateKeywordIdeas',
    index=0,
    containing_service=None,
    input_type=_GENERATEKEYWORDIDEASREQUEST,
    output_type=_GENERATEKEYWORDIDEARESPONSE,
    serialized_options=b'\202\323\344\223\0027\"2/v8/customers/{customer_id=*}:generateKeywordIdeas:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_KEYWORDPLANIDEASERVICE)

DESCRIPTOR.services_by_name['KeywordPlanIdeaService'] = _KEYWORDPLANIDEASERVICE

# @@protoc_insertion_point(module_scope)
