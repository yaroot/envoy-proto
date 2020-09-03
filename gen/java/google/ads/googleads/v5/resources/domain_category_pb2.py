# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/resources/domain_category.proto

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
  name='google/ads/googleads/v5/resources/domain_category.proto',
  package='google.ads.googleads.v5.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v5.resourcesB\023DomainCategoryProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\Resources\352\002%Google::Ads::GoogleAds::V5::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v5/resources/domain_category.proto\x12!google.ads.googleads.v5.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xfb\x04\n\x0e\x44omainCategory\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x03\xfa\x41)\n\'googleads.googleapis.com/DomainCategory\x12@\n\x08\x63\x61mpaign\x18\n \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CampaignH\x00\x88\x01\x01\x12\x1a\n\x08\x63\x61tegory\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1f\n\rlanguage_code\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x18\n\x06\x64omain\x18\r \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12#\n\x11\x63overage_fraction\x18\x0e \x01(\x01\x42\x03\xe0\x41\x03H\x04\x88\x01\x01\x12\x1f\n\rcategory_rank\x18\x0f \x01(\x03\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12\x1e\n\x0chas_children\x18\x10 \x01(\x08\x42\x03\xe0\x41\x03H\x06\x88\x01\x01\x12,\n\x1arecommended_cpc_bid_micros\x18\x11 \x01(\x03\x42\x03\xe0\x41\x03H\x07\x88\x01\x01:e\xea\x41\x62\n\'googleads.googleapis.com/DomainCategory\x12\x37\x63ustomers/{customer}/domainCategories/{domain_category}B\x0b\n\t_campaignB\x0b\n\t_categoryB\x10\n\x0e_language_codeB\t\n\x07_domainB\x14\n\x12_coverage_fractionB\x10\n\x0e_category_rankB\x0f\n\r_has_childrenB\x1d\n\x1b_recommended_cpc_bid_microsB\x80\x02\n%com.google.ads.googleads.v5.resourcesB\x13\x44omainCategoryProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V5.Resources\xca\x02!Google\\Ads\\GoogleAds\\V5\\Resources\xea\x02%Google::Ads::GoogleAds::V5::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DOMAINCATEGORY = _descriptor.Descriptor(
  name='DomainCategory',
  full_name='google.ads.googleads.v5.resources.DomainCategory',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.resources.DomainCategory.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A)\n\'googleads.googleapis.com/DomainCategory', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign', full_name='google.ads.googleads.v5.resources.DomainCategory.campaign', index=1,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A#\n!googleads.googleapis.com/Campaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='category', full_name='google.ads.googleads.v5.resources.DomainCategory.category', index=2,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.ads.googleads.v5.resources.DomainCategory.language_code', index=3,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='domain', full_name='google.ads.googleads.v5.resources.DomainCategory.domain', index=4,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='coverage_fraction', full_name='google.ads.googleads.v5.resources.DomainCategory.coverage_fraction', index=5,
      number=14, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='category_rank', full_name='google.ads.googleads.v5.resources.DomainCategory.category_rank', index=6,
      number=15, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_children', full_name='google.ads.googleads.v5.resources.DomainCategory.has_children', index=7,
      number=16, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='recommended_cpc_bid_micros', full_name='google.ads.googleads.v5.resources.DomainCategory.recommended_cpc_bid_micros', index=8,
      number=17, type=3, cpp_type=2, label=1,
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
  serialized_options=b'\352Ab\n\'googleads.googleapis.com/DomainCategory\0227customers/{customer}/domainCategories/{domain_category}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_campaign', full_name='google.ads.googleads.v5.resources.DomainCategory._campaign',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_category', full_name='google.ads.googleads.v5.resources.DomainCategory._category',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_language_code', full_name='google.ads.googleads.v5.resources.DomainCategory._language_code',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_domain', full_name='google.ads.googleads.v5.resources.DomainCategory._domain',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_coverage_fraction', full_name='google.ads.googleads.v5.resources.DomainCategory._coverage_fraction',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_category_rank', full_name='google.ads.googleads.v5.resources.DomainCategory._category_rank',
      index=5, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_has_children', full_name='google.ads.googleads.v5.resources.DomainCategory._has_children',
      index=6, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_recommended_cpc_bid_micros', full_name='google.ads.googleads.v5.resources.DomainCategory._recommended_cpc_bid_micros',
      index=7, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=185,
  serialized_end=820,
)

_DOMAINCATEGORY.oneofs_by_name['_campaign'].fields.append(
  _DOMAINCATEGORY.fields_by_name['campaign'])
_DOMAINCATEGORY.fields_by_name['campaign'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_campaign']
_DOMAINCATEGORY.oneofs_by_name['_category'].fields.append(
  _DOMAINCATEGORY.fields_by_name['category'])
_DOMAINCATEGORY.fields_by_name['category'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_category']
_DOMAINCATEGORY.oneofs_by_name['_language_code'].fields.append(
  _DOMAINCATEGORY.fields_by_name['language_code'])
_DOMAINCATEGORY.fields_by_name['language_code'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_language_code']
_DOMAINCATEGORY.oneofs_by_name['_domain'].fields.append(
  _DOMAINCATEGORY.fields_by_name['domain'])
_DOMAINCATEGORY.fields_by_name['domain'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_domain']
_DOMAINCATEGORY.oneofs_by_name['_coverage_fraction'].fields.append(
  _DOMAINCATEGORY.fields_by_name['coverage_fraction'])
_DOMAINCATEGORY.fields_by_name['coverage_fraction'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_coverage_fraction']
_DOMAINCATEGORY.oneofs_by_name['_category_rank'].fields.append(
  _DOMAINCATEGORY.fields_by_name['category_rank'])
_DOMAINCATEGORY.fields_by_name['category_rank'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_category_rank']
_DOMAINCATEGORY.oneofs_by_name['_has_children'].fields.append(
  _DOMAINCATEGORY.fields_by_name['has_children'])
_DOMAINCATEGORY.fields_by_name['has_children'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_has_children']
_DOMAINCATEGORY.oneofs_by_name['_recommended_cpc_bid_micros'].fields.append(
  _DOMAINCATEGORY.fields_by_name['recommended_cpc_bid_micros'])
_DOMAINCATEGORY.fields_by_name['recommended_cpc_bid_micros'].containing_oneof = _DOMAINCATEGORY.oneofs_by_name['_recommended_cpc_bid_micros']
DESCRIPTOR.message_types_by_name['DomainCategory'] = _DOMAINCATEGORY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DomainCategory = _reflection.GeneratedProtocolMessageType('DomainCategory', (_message.Message,), {
  'DESCRIPTOR' : _DOMAINCATEGORY,
  '__module__' : 'google.ads.googleads.v5.resources.domain_category_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.resources.DomainCategory)
  })
_sym_db.RegisterMessage(DomainCategory)


DESCRIPTOR._options = None
_DOMAINCATEGORY.fields_by_name['resource_name']._options = None
_DOMAINCATEGORY.fields_by_name['campaign']._options = None
_DOMAINCATEGORY.fields_by_name['category']._options = None
_DOMAINCATEGORY.fields_by_name['language_code']._options = None
_DOMAINCATEGORY.fields_by_name['domain']._options = None
_DOMAINCATEGORY.fields_by_name['coverage_fraction']._options = None
_DOMAINCATEGORY.fields_by_name['category_rank']._options = None
_DOMAINCATEGORY.fields_by_name['has_children']._options = None
_DOMAINCATEGORY.fields_by_name['recommended_cpc_bid_micros']._options = None
_DOMAINCATEGORY._options = None
# @@protoc_insertion_point(module_scope)
