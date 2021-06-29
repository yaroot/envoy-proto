# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/customer_manager_link.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.enums import manager_link_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_manager__link__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/customer_manager_link.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\030CustomerManagerLinkProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v7/resources/customer_manager_link.proto\x12!google.ads.googleads.v7.resources\x1a\x37google/ads/googleads/v7/enums/manager_link_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xdb\x03\n\x13\x43ustomerManagerLink\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x05\xfa\x41.\n,googleads.googleapis.com/CustomerManagerLink\x12H\n\x10manager_customer\x18\x06 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CustomerH\x00\x88\x01\x01\x12!\n\x0fmanager_link_id\x18\x07 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12V\n\x06status\x18\x05 \x01(\x0e\x32\x46.google.ads.googleads.v7.enums.ManagerLinkStatusEnum.ManagerLinkStatus:\x88\x01\xea\x41\x84\x01\n,googleads.googleapis.com/CustomerManagerLink\x12Tcustomers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}B\x13\n\x11_manager_customerB\x12\n\x10_manager_link_idB\x85\x02\n%com.google.ads.googleads.v7.resourcesB\x18\x43ustomerManagerLinkProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_manager__link__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CUSTOMERMANAGERLINK = _descriptor.Descriptor(
  name='CustomerManagerLink',
  full_name='google.ads.googleads.v7.resources.CustomerManagerLink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.CustomerManagerLink.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A.\n,googleads.googleapis.com/CustomerManagerLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='manager_customer', full_name='google.ads.googleads.v7.resources.CustomerManagerLink.manager_customer', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A#\n!googleads.googleapis.com/Customer', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='manager_link_id', full_name='google.ads.googleads.v7.resources.CustomerManagerLink.manager_link_id', index=2,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v7.resources.CustomerManagerLink.status', index=3,
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
  serialized_options=b'\352A\204\001\n,googleads.googleapis.com/CustomerManagerLink\022Tcustomers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_manager_customer', full_name='google.ads.googleads.v7.resources.CustomerManagerLink._manager_customer',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_manager_link_id', full_name='google.ads.googleads.v7.resources.CustomerManagerLink._manager_link_id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=248,
  serialized_end=723,
)

_CUSTOMERMANAGERLINK.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_manager__link__status__pb2._MANAGERLINKSTATUSENUM_MANAGERLINKSTATUS
_CUSTOMERMANAGERLINK.oneofs_by_name['_manager_customer'].fields.append(
  _CUSTOMERMANAGERLINK.fields_by_name['manager_customer'])
_CUSTOMERMANAGERLINK.fields_by_name['manager_customer'].containing_oneof = _CUSTOMERMANAGERLINK.oneofs_by_name['_manager_customer']
_CUSTOMERMANAGERLINK.oneofs_by_name['_manager_link_id'].fields.append(
  _CUSTOMERMANAGERLINK.fields_by_name['manager_link_id'])
_CUSTOMERMANAGERLINK.fields_by_name['manager_link_id'].containing_oneof = _CUSTOMERMANAGERLINK.oneofs_by_name['_manager_link_id']
DESCRIPTOR.message_types_by_name['CustomerManagerLink'] = _CUSTOMERMANAGERLINK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomerManagerLink = _reflection.GeneratedProtocolMessageType('CustomerManagerLink', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERMANAGERLINK,
  '__module__' : 'google.ads.googleads.v7.resources.customer_manager_link_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.CustomerManagerLink)
  })
_sym_db.RegisterMessage(CustomerManagerLink)


DESCRIPTOR._options = None
_CUSTOMERMANAGERLINK.fields_by_name['resource_name']._options = None
_CUSTOMERMANAGERLINK.fields_by_name['manager_customer']._options = None
_CUSTOMERMANAGERLINK.fields_by_name['manager_link_id']._options = None
_CUSTOMERMANAGERLINK._options = None
# @@protoc_insertion_point(module_scope)
