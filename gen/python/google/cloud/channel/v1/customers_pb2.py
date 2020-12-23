# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/channel/v1/customers.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.channel.v1 import common_pb2 as google_dot_cloud_dot_channel_dot_v1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import postal_address_pb2 as google_dot_type_dot_postal__address__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/channel/v1/customers.proto',
  package='google.cloud.channel.v1',
  syntax='proto3',
  serialized_options=b'\n\033com.google.cloud.channel.v1B\016CustomersProtoP\001Z>google.golang.org/genproto/googleapis/cloud/channel/v1;channel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'google/cloud/channel/v1/customers.proto\x12\x17google.cloud.channel.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a$google/cloud/channel/v1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a google/type/postal_address.proto\x1a\x1cgoogle/api/annotations.proto\"\xd1\x04\n\x08\x43ustomer\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10org_display_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12;\n\x12org_postal_address\x18\x03 \x01(\x0b\x32\x1a.google.type.PostalAddressB\x03\xe0\x41\x02\x12\x42\n\x14primary_contact_info\x18\x04 \x01(\x0b\x32$.google.cloud.channel.v1.ContactInfo\x12\x17\n\x0f\x61lternate_email\x18\x05 \x01(\t\x12\x13\n\x06\x64omain\x18\x06 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x1e\n\x11\x63loud_identity_id\x18\t \x01(\tB\x03\xe0\x41\x03\x12\x1a\n\rlanguage_code\x18\n \x01(\tB\x03\xe0\x41\x01\x12L\n\x13\x63loud_identity_info\x18\x0c \x01(\x0b\x32*.google.cloud.channel.v1.CloudIdentityInfoB\x03\xe0\x41\x03\x12\x1a\n\x12\x63hannel_partner_id\x18\r \x01(\t:R\xea\x41O\n$cloudchannel.googleapis.com/Customer\x12\'accounts/{account}/customers/{customer}\"\x81\x01\n\x0b\x43ontactInfo\x12\x12\n\nfirst_name\x18\x01 \x01(\t\x12\x11\n\tlast_name\x18\x02 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\r\n\x05\x65mail\x18\x05 \x01(\t\x12\x12\n\x05title\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\r\n\x05phone\x18\x07 \x01(\tBo\n\x1b\x63om.google.cloud.channel.v1B\x0e\x43ustomersProtoP\x01Z>google.golang.org/genproto/googleapis/cloud/channel/v1;channelb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_channel_dot_v1_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_type_dot_postal__address__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CUSTOMER = _descriptor.Descriptor(
  name='Customer',
  full_name='google.cloud.channel.v1.Customer',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.channel.v1.Customer.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='org_display_name', full_name='google.cloud.channel.v1.Customer.org_display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='org_postal_address', full_name='google.cloud.channel.v1.Customer.org_postal_address', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='primary_contact_info', full_name='google.cloud.channel.v1.Customer.primary_contact_info', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='alternate_email', full_name='google.cloud.channel.v1.Customer.alternate_email', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='domain', full_name='google.cloud.channel.v1.Customer.domain', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.channel.v1.Customer.create_time', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.channel.v1.Customer.update_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cloud_identity_id', full_name='google.cloud.channel.v1.Customer.cloud_identity_id', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.channel.v1.Customer.language_code', index=9,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cloud_identity_info', full_name='google.cloud.channel.v1.Customer.cloud_identity_info', index=10,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='channel_partner_id', full_name='google.cloud.channel.v1.Customer.channel_partner_id', index=11,
      number=13, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352AO\n$cloudchannel.googleapis.com/Customer\022\'accounts/{account}/customers/{customer}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=264,
  serialized_end=857,
)


_CONTACTINFO = _descriptor.Descriptor(
  name='ContactInfo',
  full_name='google.cloud.channel.v1.ContactInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='first_name', full_name='google.cloud.channel.v1.ContactInfo.first_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_name', full_name='google.cloud.channel.v1.ContactInfo.last_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.channel.v1.ContactInfo.display_name', index=2,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='email', full_name='google.cloud.channel.v1.ContactInfo.email', index=3,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='google.cloud.channel.v1.ContactInfo.title', index=4,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='phone', full_name='google.cloud.channel.v1.ContactInfo.phone', index=5,
      number=7, type=9, cpp_type=9, label=1,
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
  ],
  serialized_start=860,
  serialized_end=989,
)

_CUSTOMER.fields_by_name['org_postal_address'].message_type = google_dot_type_dot_postal__address__pb2._POSTALADDRESS
_CUSTOMER.fields_by_name['primary_contact_info'].message_type = _CONTACTINFO
_CUSTOMER.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_CUSTOMER.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_CUSTOMER.fields_by_name['cloud_identity_info'].message_type = google_dot_cloud_dot_channel_dot_v1_dot_common__pb2._CLOUDIDENTITYINFO
DESCRIPTOR.message_types_by_name['Customer'] = _CUSTOMER
DESCRIPTOR.message_types_by_name['ContactInfo'] = _CONTACTINFO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Customer = _reflection.GeneratedProtocolMessageType('Customer', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMER,
  '__module__' : 'google.cloud.channel.v1.customers_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Customer)
  })
_sym_db.RegisterMessage(Customer)

ContactInfo = _reflection.GeneratedProtocolMessageType('ContactInfo', (_message.Message,), {
  'DESCRIPTOR' : _CONTACTINFO,
  '__module__' : 'google.cloud.channel.v1.customers_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ContactInfo)
  })
_sym_db.RegisterMessage(ContactInfo)


DESCRIPTOR._options = None
_CUSTOMER.fields_by_name['name']._options = None
_CUSTOMER.fields_by_name['org_display_name']._options = None
_CUSTOMER.fields_by_name['org_postal_address']._options = None
_CUSTOMER.fields_by_name['domain']._options = None
_CUSTOMER.fields_by_name['create_time']._options = None
_CUSTOMER.fields_by_name['update_time']._options = None
_CUSTOMER.fields_by_name['cloud_identity_id']._options = None
_CUSTOMER.fields_by_name['language_code']._options = None
_CUSTOMER.fields_by_name['cloud_identity_info']._options = None
_CUSTOMER._options = None
_CONTACTINFO.fields_by_name['display_name']._options = None
_CONTACTINFO.fields_by_name['title']._options = None
# @@protoc_insertion_point(module_scope)