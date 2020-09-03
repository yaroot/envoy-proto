# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/resources/geo_target_constant.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v5.enums import geo_target_constant_status_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_geo__target__constant__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/resources/geo_target_constant.proto',
  package='google.ads.googleads.v5.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v5.resourcesB\026GeoTargetConstantProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\Resources\352\002%Google::Ads::GoogleAds::V5::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v5/resources/geo_target_constant.proto\x12!google.ads.googleads.v5.resources\x1a>google/ads/googleads/v5/enums/geo_target_constant_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xdf\x04\n\x11GeoTargetConstant\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x03\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstant\x12\x14\n\x02id\x18\n \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x16\n\x04name\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1e\n\x0c\x63ountry_code\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x1d\n\x0btarget_type\x18\r \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12g\n\x06status\x18\x07 \x01(\x0e\x32R.google.ads.googleads.v5.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatusB\x03\xe0\x41\x03\x12 \n\x0e\x63\x61nonical_name\x18\x0e \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12R\n\x11parent_geo_target\x18\t \x01(\tB2\xe0\x41\x03\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x05\x88\x01\x01:Y\xea\x41V\n*googleads.googleapis.com/GeoTargetConstant\x12(geoTargetConstants/{geo_target_constant}B\x05\n\x03_idB\x07\n\x05_nameB\x0f\n\r_country_codeB\x0e\n\x0c_target_typeB\x11\n\x0f_canonical_nameB\x14\n\x12_parent_geo_targetB\x83\x02\n%com.google.ads.googleads.v5.resourcesB\x16GeoTargetConstantProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v5/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V5.Resources\xca\x02!Google\\Ads\\GoogleAds\\V5\\Resources\xea\x02%Google::Ads::GoogleAds::V5::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_geo__target__constant__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_GEOTARGETCONSTANT = _descriptor.Descriptor(
  name='GeoTargetConstant',
  full_name='google.ads.googleads.v5.resources.GeoTargetConstant',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.id', index=1,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.name', index=2,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='country_code', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.country_code', index=3,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_type', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.target_type', index=4,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.status', index=5,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='canonical_name', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.canonical_name', index=6,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parent_geo_target', full_name='google.ads.googleads.v5.resources.GeoTargetConstant.parent_geo_target', index=7,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AV\n*googleads.googleapis.com/GeoTargetConstant\022(geoTargetConstants/{geo_target_constant}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._id',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_name', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._name',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_country_code', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._country_code',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_target_type', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._target_type',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_canonical_name', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._canonical_name',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_parent_geo_target', full_name='google.ads.googleads.v5.resources.GeoTargetConstant._parent_geo_target',
      index=5, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=253,
  serialized_end=860,
)

_GEOTARGETCONSTANT.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v5_dot_enums_dot_geo__target__constant__status__pb2._GEOTARGETCONSTANTSTATUSENUM_GEOTARGETCONSTANTSTATUS
_GEOTARGETCONSTANT.oneofs_by_name['_id'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['id'])
_GEOTARGETCONSTANT.fields_by_name['id'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_id']
_GEOTARGETCONSTANT.oneofs_by_name['_name'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['name'])
_GEOTARGETCONSTANT.fields_by_name['name'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_name']
_GEOTARGETCONSTANT.oneofs_by_name['_country_code'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['country_code'])
_GEOTARGETCONSTANT.fields_by_name['country_code'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_country_code']
_GEOTARGETCONSTANT.oneofs_by_name['_target_type'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['target_type'])
_GEOTARGETCONSTANT.fields_by_name['target_type'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_target_type']
_GEOTARGETCONSTANT.oneofs_by_name['_canonical_name'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['canonical_name'])
_GEOTARGETCONSTANT.fields_by_name['canonical_name'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_canonical_name']
_GEOTARGETCONSTANT.oneofs_by_name['_parent_geo_target'].fields.append(
  _GEOTARGETCONSTANT.fields_by_name['parent_geo_target'])
_GEOTARGETCONSTANT.fields_by_name['parent_geo_target'].containing_oneof = _GEOTARGETCONSTANT.oneofs_by_name['_parent_geo_target']
DESCRIPTOR.message_types_by_name['GeoTargetConstant'] = _GEOTARGETCONSTANT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GeoTargetConstant = _reflection.GeneratedProtocolMessageType('GeoTargetConstant', (_message.Message,), {
  'DESCRIPTOR' : _GEOTARGETCONSTANT,
  '__module__' : 'google.ads.googleads.v5.resources.geo_target_constant_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.resources.GeoTargetConstant)
  })
_sym_db.RegisterMessage(GeoTargetConstant)


DESCRIPTOR._options = None
_GEOTARGETCONSTANT.fields_by_name['resource_name']._options = None
_GEOTARGETCONSTANT.fields_by_name['id']._options = None
_GEOTARGETCONSTANT.fields_by_name['name']._options = None
_GEOTARGETCONSTANT.fields_by_name['country_code']._options = None
_GEOTARGETCONSTANT.fields_by_name['target_type']._options = None
_GEOTARGETCONSTANT.fields_by_name['status']._options = None
_GEOTARGETCONSTANT.fields_by_name['canonical_name']._options = None
_GEOTARGETCONSTANT.fields_by_name['parent_geo_target']._options = None
_GEOTARGETCONSTANT._options = None
# @@protoc_insertion_point(module_scope)
