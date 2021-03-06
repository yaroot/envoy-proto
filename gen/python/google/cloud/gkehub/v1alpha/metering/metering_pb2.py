# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkehub/v1alpha/metering/metering.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/gkehub/v1alpha/metering/metering.proto',
  package='google.cloud.gkehub.metering.v1alpha',
  syntax='proto3',
  serialized_options=b'\n(com.google.cloud.gkehub.metering.v1alphaB\rMeteringProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/gkehub/metering/v1alpha;metering\252\002$Google.Cloud.GkeHub.Metering.V1Alpha\312\002$Google\\Cloud\\GkeHub\\Metering\\V1alpha\352\002(Google::Cloud::GkeHub::Metering::V1alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/cloud/gkehub/v1alpha/metering/metering.proto\x12$google.cloud.gkehub.metering.v1alpha\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\x81\x01\n\x0fMembershipState\x12\x39\n\x15last_measurement_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x33\n+precise_last_measured_cluster_vcpu_capacity\x18\x03 \x01(\x02\x42\x82\x02\n(com.google.cloud.gkehub.metering.v1alphaB\rMeteringProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/gkehub/metering/v1alpha;metering\xaa\x02$Google.Cloud.GkeHub.Metering.V1Alpha\xca\x02$Google\\Cloud\\GkeHub\\Metering\\V1alpha\xea\x02(Google::Cloud::GkeHub::Metering::V1alphab\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_MEMBERSHIPSTATE = _descriptor.Descriptor(
  name='MembershipState',
  full_name='google.cloud.gkehub.metering.v1alpha.MembershipState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='last_measurement_time', full_name='google.cloud.gkehub.metering.v1alpha.MembershipState.last_measurement_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='precise_last_measured_cluster_vcpu_capacity', full_name='google.cloud.gkehub.metering.v1alpha.MembershipState.precise_last_measured_cluster_vcpu_capacity', index=1,
      number=3, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=157,
  serialized_end=286,
)

_MEMBERSHIPSTATE.fields_by_name['last_measurement_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['MembershipState'] = _MEMBERSHIPSTATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MembershipState = _reflection.GeneratedProtocolMessageType('MembershipState', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERSHIPSTATE,
  '__module__' : 'google.cloud.gkehub.v1alpha.metering.metering_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.metering.v1alpha.MembershipState)
  })
_sym_db.RegisterMessage(MembershipState)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
