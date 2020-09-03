# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/billing_setup.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.enums import billing_setup_status_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_billing__setup__status__pb2
from google.ads.googleads.v4.enums import time_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_time__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/billing_setup.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\021BillingSetupProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v4/resources/billing_setup.proto\x12!google.ads.googleads.v4.resources\x1a\x38google/ads/googleads/v4/enums/billing_setup_status.proto\x1a-google/ads/googleads/v4/enums/time_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xb8\t\n\x0c\x42illingSetup\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/BillingSetup\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12]\n\x06status\x18\x03 \x01(\x0e\x32H.google.ads.googleads.v4.enums.BillingSetupStatusEnum.BillingSetupStatusB\x03\xe0\x41\x03\x12h\n\x10payments_account\x18\x0b \x01(\x0b\x32\x1c.google.protobuf.StringValueB0\xe0\x41\x05\xfa\x41*\n(googleads.googleapis.com/PaymentsAccount\x12g\n\x15payments_account_info\x18\x0c \x01(\x0b\x32\x43.google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfoB\x03\xe0\x41\x05\x12<\n\x0fstart_date_time\x18\t \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05H\x00\x12T\n\x0fstart_time_type\x18\n \x01(\x0e\x32\x34.google.ads.googleads.v4.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x05H\x00\x12:\n\rend_date_time\x18\r \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03H\x01\x12R\n\rend_time_type\x18\x0e \x01(\x0e\x32\x34.google.ads.googleads.v4.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x01\x1a\xe3\x02\n\x13PaymentsAccountInfo\x12>\n\x13payments_account_id\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12@\n\x15payments_account_name\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12>\n\x13payments_profile_id\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12@\n\x15payments_profile_name\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12H\n\x1dsecondary_payments_profile_id\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03:^\xea\x41[\n%googleads.googleapis.com/BillingSetup\x12\x32\x63ustomers/{customer}/billingSetups/{billing_setup}B\x0c\n\nstart_timeB\n\n\x08\x65nd_timeB\xfe\x01\n%com.google.ads.googleads.v4.resourcesB\x11\x42illingSetupProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_billing__setup__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_time__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_BILLINGSETUP_PAYMENTSACCOUNTINFO = _descriptor.Descriptor(
  name='PaymentsAccountInfo',
  full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='payments_account_id', full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo.payments_account_id', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payments_account_name', full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo.payments_account_name', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payments_profile_id', full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo.payments_profile_id', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payments_profile_name', full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo.payments_profile_name', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='secondary_payments_profile_id', full_name='google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo.secondary_payments_profile_id', index=4,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1051,
  serialized_end=1406,
)

_BILLINGSETUP = _descriptor.Descriptor(
  name='BillingSetup',
  full_name='google.ads.googleads.v4.resources.BillingSetup',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.BillingSetup.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\'\n%googleads.googleapis.com/BillingSetup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.BillingSetup.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v4.resources.BillingSetup.status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payments_account', full_name='google.ads.googleads.v4.resources.BillingSetup.payments_account', index=3,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A*\n(googleads.googleapis.com/PaymentsAccount', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payments_account_info', full_name='google.ads.googleads.v4.resources.BillingSetup.payments_account_info', index=4,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_date_time', full_name='google.ads.googleads.v4.resources.BillingSetup.start_date_time', index=5,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_time_type', full_name='google.ads.googleads.v4.resources.BillingSetup.start_time_type', index=6,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_date_time', full_name='google.ads.googleads.v4.resources.BillingSetup.end_date_time', index=7,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time_type', full_name='google.ads.googleads.v4.resources.BillingSetup.end_time_type', index=8,
      number=14, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_BILLINGSETUP_PAYMENTSACCOUNTINFO, ],
  enum_types=[
  ],
  serialized_options=b'\352A[\n%googleads.googleapis.com/BillingSetup\0222customers/{customer}/billingSetups/{billing_setup}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='start_time', full_name='google.ads.googleads.v4.resources.BillingSetup.start_time',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='end_time', full_name='google.ads.googleads.v4.resources.BillingSetup.end_time',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=320,
  serialized_end=1528,
)

_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['secondary_payments_profile_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP_PAYMENTSACCOUNTINFO.containing_type = _BILLINGSETUP
_BILLINGSETUP.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_BILLINGSETUP.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_billing__setup__status__pb2._BILLINGSETUPSTATUSENUM_BILLINGSETUPSTATUS
_BILLINGSETUP.fields_by_name['payments_account'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP.fields_by_name['payments_account_info'].message_type = _BILLINGSETUP_PAYMENTSACCOUNTINFO
_BILLINGSETUP.fields_by_name['start_date_time'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP.fields_by_name['start_time_type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_time__type__pb2._TIMETYPEENUM_TIMETYPE
_BILLINGSETUP.fields_by_name['end_date_time'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_BILLINGSETUP.fields_by_name['end_time_type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_time__type__pb2._TIMETYPEENUM_TIMETYPE
_BILLINGSETUP.oneofs_by_name['start_time'].fields.append(
  _BILLINGSETUP.fields_by_name['start_date_time'])
_BILLINGSETUP.fields_by_name['start_date_time'].containing_oneof = _BILLINGSETUP.oneofs_by_name['start_time']
_BILLINGSETUP.oneofs_by_name['start_time'].fields.append(
  _BILLINGSETUP.fields_by_name['start_time_type'])
_BILLINGSETUP.fields_by_name['start_time_type'].containing_oneof = _BILLINGSETUP.oneofs_by_name['start_time']
_BILLINGSETUP.oneofs_by_name['end_time'].fields.append(
  _BILLINGSETUP.fields_by_name['end_date_time'])
_BILLINGSETUP.fields_by_name['end_date_time'].containing_oneof = _BILLINGSETUP.oneofs_by_name['end_time']
_BILLINGSETUP.oneofs_by_name['end_time'].fields.append(
  _BILLINGSETUP.fields_by_name['end_time_type'])
_BILLINGSETUP.fields_by_name['end_time_type'].containing_oneof = _BILLINGSETUP.oneofs_by_name['end_time']
DESCRIPTOR.message_types_by_name['BillingSetup'] = _BILLINGSETUP
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BillingSetup = _reflection.GeneratedProtocolMessageType('BillingSetup', (_message.Message,), {

  'PaymentsAccountInfo' : _reflection.GeneratedProtocolMessageType('PaymentsAccountInfo', (_message.Message,), {
    'DESCRIPTOR' : _BILLINGSETUP_PAYMENTSACCOUNTINFO,
    '__module__' : 'google.ads.googleads.v4.resources.billing_setup_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.BillingSetup.PaymentsAccountInfo)
    })
  ,
  'DESCRIPTOR' : _BILLINGSETUP,
  '__module__' : 'google.ads.googleads.v4.resources.billing_setup_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.BillingSetup)
  })
_sym_db.RegisterMessage(BillingSetup)
_sym_db.RegisterMessage(BillingSetup.PaymentsAccountInfo)


DESCRIPTOR._options = None
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_id']._options = None
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_name']._options = None
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_id']._options = None
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_name']._options = None
_BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['secondary_payments_profile_id']._options = None
_BILLINGSETUP.fields_by_name['resource_name']._options = None
_BILLINGSETUP.fields_by_name['id']._options = None
_BILLINGSETUP.fields_by_name['status']._options = None
_BILLINGSETUP.fields_by_name['payments_account']._options = None
_BILLINGSETUP.fields_by_name['payments_account_info']._options = None
_BILLINGSETUP.fields_by_name['start_date_time']._options = None
_BILLINGSETUP.fields_by_name['start_time_type']._options = None
_BILLINGSETUP.fields_by_name['end_date_time']._options = None
_BILLINGSETUP.fields_by_name['end_time_type']._options = None
_BILLINGSETUP._options = None
# @@protoc_insertion_point(module_scope)
