# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/settings/v1beta1/detector.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.securitycenter.settings.v1beta1 import billing_settings_pb2 as google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_billing__settings__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/securitycenter/settings/v1beta1/detector.proto',
  package='google.cloud.securitycenter.settings.v1beta1',
  syntax='proto3',
  serialized_options=b'\n0com.google.cloud.securitycenter.settings.v1beta1B\016DetectorsProtoP\001ZTgoogle.golang.org/genproto/googleapis/cloud/securitycenter/settings/v1beta1;settings\370\001\001\252\002,Google.Cloud.SecurityCenter.Settings.V1Beta1\312\002,Google\\Cloud\\SecurityCenter\\Settings\\V1beta1\352\0020Google::Cloud::SecurityCenter::Settings::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/cloud/securitycenter/settings/v1beta1/detector.proto\x12,google.cloud.securitycenter.settings.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x43google/cloud/securitycenter/settings/v1beta1/billing_settings.proto\x1a\x1cgoogle/api/annotations.proto\"\xad\x01\n\x08\x44\x65tector\x12\x15\n\x08\x64\x65tector\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tcomponent\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12T\n\x0c\x62illing_tier\x18\x03 \x01(\x0e\x32\x39.google.cloud.securitycenter.settings.v1beta1.BillingTierB\x03\xe0\x41\x03\x12\x1c\n\x0f\x64\x65tector_labels\x18\x04 \x03(\tB\x03\xe0\x41\x03\x42\xae\x02\n0com.google.cloud.securitycenter.settings.v1beta1B\x0e\x44\x65tectorsProtoP\x01ZTgoogle.golang.org/genproto/googleapis/cloud/securitycenter/settings/v1beta1;settings\xf8\x01\x01\xaa\x02,Google.Cloud.SecurityCenter.Settings.V1Beta1\xca\x02,Google\\Cloud\\SecurityCenter\\Settings\\V1beta1\xea\x02\x30Google::Cloud::SecurityCenter::Settings::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_billing__settings__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DETECTOR = _descriptor.Descriptor(
  name='Detector',
  full_name='google.cloud.securitycenter.settings.v1beta1.Detector',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='detector', full_name='google.cloud.securitycenter.settings.v1beta1.Detector.detector', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='component', full_name='google.cloud.securitycenter.settings.v1beta1.Detector.component', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='billing_tier', full_name='google.cloud.securitycenter.settings.v1beta1.Detector.billing_tier', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='detector_labels', full_name='google.cloud.securitycenter.settings.v1beta1.Detector.detector_labels', index=3,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=242,
  serialized_end=415,
)

_DETECTOR.fields_by_name['billing_tier'].enum_type = google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_billing__settings__pb2._BILLINGTIER
DESCRIPTOR.message_types_by_name['Detector'] = _DETECTOR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Detector = _reflection.GeneratedProtocolMessageType('Detector', (_message.Message,), {
  'DESCRIPTOR' : _DETECTOR,
  '__module__' : 'google.cloud.securitycenter.settings.v1beta1.detector_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.Detector)
  })
_sym_db.RegisterMessage(Detector)


DESCRIPTOR._options = None
_DETECTOR.fields_by_name['detector']._options = None
_DETECTOR.fields_by_name['component']._options = None
_DETECTOR.fields_by_name['billing_tier']._options = None
_DETECTOR.fields_by_name['detector_labels']._options = None
# @@protoc_insertion_point(module_scope)
