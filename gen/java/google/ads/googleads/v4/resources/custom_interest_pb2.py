# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/custom_interest.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.enums import custom_interest_member_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__member__type__pb2
from google.ads.googleads.v4.enums import custom_interest_status_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__status__pb2
from google.ads.googleads.v4.enums import custom_interest_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/custom_interest.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\023CustomInterestProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v4/resources/custom_interest.proto\x12!google.ads.googleads.v4.resources\x1a?google/ads/googleads/v4/enums/custom_interest_member_type.proto\x1a:google/ads/googleads/v4/enums/custom_interest_status.proto\x1a\x38google/ads/googleads/v4/enums/custom_interest_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xcb\x04\n\x0e\x43ustomInterest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x05\xfa\x41)\n\'googleads.googleapis.com/CustomInterest\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12\\\n\x06status\x18\x03 \x01(\x0e\x32L.google.ads.googleads.v4.enums.CustomInterestStatusEnum.CustomInterestStatus\x12*\n\x04name\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12V\n\x04type\x18\x05 \x01(\x0e\x32H.google.ads.googleads.v4.enums.CustomInterestTypeEnum.CustomInterestType\x12\x31\n\x0b\x64\x65scription\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12H\n\x07members\x18\x07 \x03(\x0b\x32\x37.google.ads.googleads.v4.resources.CustomInterestMember:d\xea\x41\x61\n\'googleads.googleapis.com/CustomInterest\x12\x36\x63ustomers/{customer}/customInterests/{custom_interest}\"\xb2\x01\n\x14\x43ustomInterestMember\x12i\n\x0bmember_type\x18\x01 \x01(\x0e\x32T.google.ads.googleads.v4.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType\x12/\n\tparameter\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x80\x02\n%com.google.ads.googleads.v4.resourcesB\x13\x43ustomInterestProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__member__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CUSTOMINTEREST = _descriptor.Descriptor(
  name='CustomInterest',
  full_name='google.ads.googleads.v4.resources.CustomInterest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.CustomInterest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A)\n\'googleads.googleapis.com/CustomInterest', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.CustomInterest.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v4.resources.CustomInterest.status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v4.resources.CustomInterest.name', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v4.resources.CustomInterest.type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.ads.googleads.v4.resources.CustomInterest.description', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='members', full_name='google.ads.googleads.v4.resources.CustomInterest.members', index=6,
      number=7, type=11, cpp_type=10, label=3,
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
  serialized_options=b'\352Aa\n\'googleads.googleapis.com/CustomInterest\0226customers/{customer}/customInterests/{custom_interest}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=400,
  serialized_end=987,
)


_CUSTOMINTERESTMEMBER = _descriptor.Descriptor(
  name='CustomInterestMember',
  full_name='google.ads.googleads.v4.resources.CustomInterestMember',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='member_type', full_name='google.ads.googleads.v4.resources.CustomInterestMember.member_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parameter', full_name='google.ads.googleads.v4.resources.CustomInterestMember.parameter', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  ],
  serialized_start=990,
  serialized_end=1168,
)

_CUSTOMINTEREST.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_CUSTOMINTEREST.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__status__pb2._CUSTOMINTERESTSTATUSENUM_CUSTOMINTERESTSTATUS
_CUSTOMINTEREST.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CUSTOMINTEREST.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__type__pb2._CUSTOMINTERESTTYPEENUM_CUSTOMINTERESTTYPE
_CUSTOMINTEREST.fields_by_name['description'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CUSTOMINTEREST.fields_by_name['members'].message_type = _CUSTOMINTERESTMEMBER
_CUSTOMINTERESTMEMBER.fields_by_name['member_type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_custom__interest__member__type__pb2._CUSTOMINTERESTMEMBERTYPEENUM_CUSTOMINTERESTMEMBERTYPE
_CUSTOMINTERESTMEMBER.fields_by_name['parameter'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
DESCRIPTOR.message_types_by_name['CustomInterest'] = _CUSTOMINTEREST
DESCRIPTOR.message_types_by_name['CustomInterestMember'] = _CUSTOMINTERESTMEMBER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomInterest = _reflection.GeneratedProtocolMessageType('CustomInterest', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMINTEREST,
  '__module__' : 'google.ads.googleads.v4.resources.custom_interest_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.CustomInterest)
  })
_sym_db.RegisterMessage(CustomInterest)

CustomInterestMember = _reflection.GeneratedProtocolMessageType('CustomInterestMember', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMINTERESTMEMBER,
  '__module__' : 'google.ads.googleads.v4.resources.custom_interest_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.CustomInterestMember)
  })
_sym_db.RegisterMessage(CustomInterestMember)


DESCRIPTOR._options = None
_CUSTOMINTEREST.fields_by_name['resource_name']._options = None
_CUSTOMINTEREST.fields_by_name['id']._options = None
_CUSTOMINTEREST._options = None
# @@protoc_insertion_point(module_scope)
