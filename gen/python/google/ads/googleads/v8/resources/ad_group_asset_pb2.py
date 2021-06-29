# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/ad_group_asset.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import asset_field_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2
from google.ads.googleads.v8.enums import asset_link_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__link__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/ad_group_asset.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\021AdGroupAssetProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v8/resources/ad_group_asset.proto\x12!google.ads.googleads.v8.resources\x1a\x34google/ads/googleads/v8/enums/asset_field_type.proto\x1a\x35google/ads/googleads/v8/enums/asset_link_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xf8\x03\n\x0c\x41\x64GroupAsset\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/AdGroupAsset\x12=\n\x08\x61\x64_group\x18\x02 \x01(\tB+\xe0\x41\x02\xe0\x41\x05\xfa\x41\"\n googleads.googleapis.com/AdGroup\x12\x38\n\x05\x61sset\x18\x03 \x01(\tB)\xe0\x41\x02\xe0\x41\x05\xfa\x41 \n\x1egoogleads.googleapis.com/Asset\x12\\\n\nfield_type\x18\x04 \x01(\x0e\x32@.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldTypeB\x06\xe0\x41\x02\xe0\x41\x05\x12R\n\x06status\x18\x05 \x01(\x0e\x32\x42.google.ads.googleads.v8.enums.AssetLinkStatusEnum.AssetLinkStatus:w\xea\x41t\n%googleads.googleapis.com/AdGroupAsset\x12Kcustomers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}B\xfe\x01\n%com.google.ads.googleads.v8.resourcesB\x11\x41\x64GroupAssetProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__link__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ADGROUPASSET = _descriptor.Descriptor(
  name='AdGroupAsset',
  full_name='google.ads.googleads.v8.resources.AdGroupAsset',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.AdGroupAsset.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\'\n%googleads.googleapis.com/AdGroupAsset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group', full_name='google.ads.googleads.v8.resources.AdGroupAsset.ad_group', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\340A\005\372A\"\n googleads.googleapis.com/AdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='asset', full_name='google.ads.googleads.v8.resources.AdGroupAsset.asset', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\340A\005\372A \n\036googleads.googleapis.com/Asset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='field_type', full_name='google.ads.googleads.v8.resources.AdGroupAsset.field_type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v8.resources.AdGroupAsset.status', index=4,
      number=5, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\352At\n%googleads.googleapis.com/AdGroupAsset\022Kcustomers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=293,
  serialized_end=797,
)

_ADGROUPASSET.fields_by_name['field_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2._ASSETFIELDTYPEENUM_ASSETFIELDTYPE
_ADGROUPASSET.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__link__status__pb2._ASSETLINKSTATUSENUM_ASSETLINKSTATUS
DESCRIPTOR.message_types_by_name['AdGroupAsset'] = _ADGROUPASSET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAsset = _reflection.GeneratedProtocolMessageType('AdGroupAsset', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPASSET,
  '__module__' : 'google.ads.googleads.v8.resources.ad_group_asset_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AdGroupAsset)
  })
_sym_db.RegisterMessage(AdGroupAsset)


DESCRIPTOR._options = None
_ADGROUPASSET.fields_by_name['resource_name']._options = None
_ADGROUPASSET.fields_by_name['ad_group']._options = None
_ADGROUPASSET.fields_by_name['asset']._options = None
_ADGROUPASSET.fields_by_name['field_type']._options = None
_ADGROUPASSET._options = None
# @@protoc_insertion_point(module_scope)