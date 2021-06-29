# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkehub/v1alpha/feature.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.gkehub.v1alpha.cloudauditlogging import cloudauditlogging_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_cloudauditlogging_dot_cloudauditlogging__pb2
from google.cloud.gkehub.v1alpha.configmanagement import configmanagement_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_configmanagement_dot_configmanagement__pb2
from google.cloud.gkehub.v1alpha.metering import metering_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_metering_dot_metering__pb2
from google.cloud.gkehub.v1alpha.multiclusteringress import multiclusteringress_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_multiclusteringress_dot_multiclusteringress__pb2
from google.cloud.gkehub.v1alpha.servicemesh import servicemesh_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_servicemesh_dot_servicemesh__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/gkehub/v1alpha/feature.proto',
  package='google.cloud.gkehub.v1alpha',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.gkehub.v1alphaB\014FeatureProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/gkehub/v1alpha;gkehub\252\002\033Google.Cloud.GkeHub.V1Alpha\312\002\033Google\\Cloud\\GkeHub\\V1alpha\352\002\036Google::Cloud::GkeHub::V1alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/cloud/gkehub/v1alpha/feature.proto\x12\x1bgoogle.cloud.gkehub.v1alpha\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x45google/cloud/gkehub/v1alpha/cloudauditlogging/cloudauditlogging.proto\x1a\x43google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto\x1a\x33google/cloud/gkehub/v1alpha/metering/metering.proto\x1aIgoogle/cloud/gkehub/v1alpha/multiclusteringress/multiclusteringress.proto\x1a\x39google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xf7\x07\n\x07\x46\x65\x61ture\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12@\n\x06labels\x18\x02 \x03(\x0b\x32\x30.google.cloud.gkehub.v1alpha.Feature.LabelsEntry\x12N\n\x0eresource_state\x18\x03 \x01(\x0b\x32\x31.google.cloud.gkehub.v1alpha.FeatureResourceStateB\x03\xe0\x41\x03\x12\x41\n\x04spec\x18\x04 \x01(\x0b\x32..google.cloud.gkehub.v1alpha.CommonFeatureSpecB\x03\xe0\x41\x01\x12X\n\x10membership_specs\x18\x05 \x03(\x0b\x32\x39.google.cloud.gkehub.v1alpha.Feature.MembershipSpecsEntryB\x03\xe0\x41\x01\x12\x43\n\x05state\x18\x06 \x01(\x0b\x32/.google.cloud.gkehub.v1alpha.CommonFeatureStateB\x03\xe0\x41\x03\x12Z\n\x11membership_states\x18\x07 \x03(\x0b\x32:.google.cloud.gkehub.v1alpha.Feature.MembershipStatesEntryB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x64\x65lete_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1aj\n\x14MembershipSpecsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x41\n\x05value\x18\x02 \x01(\x0b\x32\x32.google.cloud.gkehub.v1alpha.MembershipFeatureSpec:\x02\x38\x01\x1al\n\x15MembershipStatesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x42\n\x05value\x18\x02 \x01(\x0b\x32\x33.google.cloud.gkehub.v1alpha.MembershipFeatureState:\x02\x38\x01:^\xea\x41[\n\x1dgkehub.googleapis.com/Feature\x12:projects/{project}/locations/{location}/features/{feature}\"\xcb\x01\n\x14\x46\x65\x61tureResourceState\x12\x46\n\x05state\x18\x01 \x01(\x0e\x32\x37.google.cloud.gkehub.v1alpha.FeatureResourceState.State\"k\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x45NABLING\x10\x01\x12\n\n\x06\x41\x43TIVE\x10\x02\x12\r\n\tDISABLING\x10\x03\x12\x0c\n\x08UPDATING\x10\x04\x12\x14\n\x10SERVICE_UPDATING\x10\x05\"\xd0\x01\n\x0c\x46\x65\x61tureState\x12<\n\x04\x63ode\x18\x01 \x01(\x0e\x32..google.cloud.gkehub.v1alpha.FeatureState.Code\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12/\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"<\n\x04\x43ode\x12\x14\n\x10\x43ODE_UNSPECIFIED\x10\x00\x12\x06\n\x02OK\x10\x01\x12\x0b\n\x07WARNING\x10\x02\x12\t\n\x05\x45RROR\x10\x03\"\xd9\x01\n\x11\x43ommonFeatureSpec\x12[\n\x13multiclusteringress\x18\x66 \x01(\x0b\x32<.google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpecH\x00\x12W\n\x11\x63loudauditlogging\x18l \x01(\x0b\x32:.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecH\x00\x42\x0e\n\x0c\x66\x65\x61ture_spec\"\xb2\x01\n\x12\x43ommonFeatureState\x12L\n\x0bservicemesh\x18\x64 \x01(\x0b\x32\x35.google.cloud.gkehub.servicemesh.v1alpha.FeatureStateH\x00\x12=\n\x05state\x18\x01 \x01(\x0b\x32).google.cloud.gkehub.v1alpha.FeatureStateB\x03\xe0\x41\x03\x42\x0f\n\rfeature_state\"\x81\x01\n\x15MembershipFeatureSpec\x12X\n\x10\x63onfigmanagement\x18j \x01(\x0b\x32<.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecH\x00\x42\x0e\n\x0c\x66\x65\x61ture_spec\"\xda\x02\n\x16MembershipFeatureState\x12O\n\x0bservicemesh\x18\x64 \x01(\x0b\x32\x38.google.cloud.gkehub.servicemesh.v1alpha.MembershipStateH\x00\x12I\n\x08metering\x18h \x01(\x0b\x32\x35.google.cloud.gkehub.metering.v1alpha.MembershipStateH\x00\x12Y\n\x10\x63onfigmanagement\x18j \x01(\x0b\x32=.google.cloud.gkehub.configmanagement.v1alpha.MembershipStateH\x00\x12\x38\n\x05state\x18\x01 \x01(\x0b\x32).google.cloud.gkehub.v1alpha.FeatureStateB\x0f\n\rfeature_stateB\xd1\x01\n\x1f\x63om.google.cloud.gkehub.v1alphaB\x0c\x46\x65\x61tureProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/gkehub/v1alpha;gkehub\xaa\x02\x1bGoogle.Cloud.GkeHub.V1Alpha\xca\x02\x1bGoogle\\Cloud\\GkeHub\\V1alpha\xea\x02\x1eGoogle::Cloud::GkeHub::V1alphab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_cloudauditlogging_dot_cloudauditlogging__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_configmanagement_dot_configmanagement__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_metering_dot_metering__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_multiclusteringress_dot_multiclusteringress__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_servicemesh_dot_servicemesh__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEATURERESOURCESTATE_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.gkehub.v1alpha.FeatureResourceState.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENABLING', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISABLING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPDATING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SERVICE_UPDATING', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1639,
  serialized_end=1746,
)
_sym_db.RegisterEnumDescriptor(_FEATURERESOURCESTATE_STATE)

_FEATURESTATE_CODE = _descriptor.EnumDescriptor(
  name='Code',
  full_name='google.cloud.gkehub.v1alpha.FeatureState.Code',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OK', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WARNING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ERROR', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1897,
  serialized_end=1957,
)
_sym_db.RegisterEnumDescriptor(_FEATURESTATE_CODE)


_FEATURE_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.gkehub.v1alpha.Feature.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.gkehub.v1alpha.Feature.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.gkehub.v1alpha.Feature.LabelsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1181,
  serialized_end=1226,
)

_FEATURE_MEMBERSHIPSPECSENTRY = _descriptor.Descriptor(
  name='MembershipSpecsEntry',
  full_name='google.cloud.gkehub.v1alpha.Feature.MembershipSpecsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.gkehub.v1alpha.Feature.MembershipSpecsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.gkehub.v1alpha.Feature.MembershipSpecsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1228,
  serialized_end=1334,
)

_FEATURE_MEMBERSHIPSTATESENTRY = _descriptor.Descriptor(
  name='MembershipStatesEntry',
  full_name='google.cloud.gkehub.v1alpha.Feature.MembershipStatesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.gkehub.v1alpha.Feature.MembershipStatesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.gkehub.v1alpha.Feature.MembershipStatesEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1336,
  serialized_end=1444,
)

_FEATURE = _descriptor.Descriptor(
  name='Feature',
  full_name='google.cloud.gkehub.v1alpha.Feature',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.gkehub.v1alpha.Feature.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.gkehub.v1alpha.Feature.labels', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_state', full_name='google.cloud.gkehub.v1alpha.Feature.resource_state', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='spec', full_name='google.cloud.gkehub.v1alpha.Feature.spec', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_specs', full_name='google.cloud.gkehub.v1alpha.Feature.membership_specs', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.gkehub.v1alpha.Feature.state', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_states', full_name='google.cloud.gkehub.v1alpha.Feature.membership_states', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.gkehub.v1alpha.Feature.create_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.gkehub.v1alpha.Feature.update_time', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delete_time', full_name='google.cloud.gkehub.v1alpha.Feature.delete_time', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FEATURE_LABELSENTRY, _FEATURE_MEMBERSHIPSPECSENTRY, _FEATURE_MEMBERSHIPSTATESENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352A[\n\035gkehub.googleapis.com/Feature\022:projects/{project}/locations/{location}/features/{feature}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=525,
  serialized_end=1540,
)


_FEATURERESOURCESTATE = _descriptor.Descriptor(
  name='FeatureResourceState',
  full_name='google.cloud.gkehub.v1alpha.FeatureResourceState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.gkehub.v1alpha.FeatureResourceState.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _FEATURERESOURCESTATE_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1543,
  serialized_end=1746,
)


_FEATURESTATE = _descriptor.Descriptor(
  name='FeatureState',
  full_name='google.cloud.gkehub.v1alpha.FeatureState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='google.cloud.gkehub.v1alpha.FeatureState.code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.gkehub.v1alpha.FeatureState.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.gkehub.v1alpha.FeatureState.update_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _FEATURESTATE_CODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1749,
  serialized_end=1957,
)


_COMMONFEATURESPEC = _descriptor.Descriptor(
  name='CommonFeatureSpec',
  full_name='google.cloud.gkehub.v1alpha.CommonFeatureSpec',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='multiclusteringress', full_name='google.cloud.gkehub.v1alpha.CommonFeatureSpec.multiclusteringress', index=0,
      number=102, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cloudauditlogging', full_name='google.cloud.gkehub.v1alpha.CommonFeatureSpec.cloudauditlogging', index=1,
      number=108, type=11, cpp_type=10, label=1,
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
      name='feature_spec', full_name='google.cloud.gkehub.v1alpha.CommonFeatureSpec.feature_spec',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1960,
  serialized_end=2177,
)


_COMMONFEATURESTATE = _descriptor.Descriptor(
  name='CommonFeatureState',
  full_name='google.cloud.gkehub.v1alpha.CommonFeatureState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='servicemesh', full_name='google.cloud.gkehub.v1alpha.CommonFeatureState.servicemesh', index=0,
      number=100, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.gkehub.v1alpha.CommonFeatureState.state', index=1,
      number=1, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='feature_state', full_name='google.cloud.gkehub.v1alpha.CommonFeatureState.feature_state',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=2180,
  serialized_end=2358,
)


_MEMBERSHIPFEATURESPEC = _descriptor.Descriptor(
  name='MembershipFeatureSpec',
  full_name='google.cloud.gkehub.v1alpha.MembershipFeatureSpec',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='configmanagement', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureSpec.configmanagement', index=0,
      number=106, type=11, cpp_type=10, label=1,
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
      name='feature_spec', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureSpec.feature_spec',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=2361,
  serialized_end=2490,
)


_MEMBERSHIPFEATURESTATE = _descriptor.Descriptor(
  name='MembershipFeatureState',
  full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='servicemesh', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState.servicemesh', index=0,
      number=100, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metering', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState.metering', index=1,
      number=104, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='configmanagement', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState.configmanagement', index=2,
      number=106, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState.state', index=3,
      number=1, type=11, cpp_type=10, label=1,
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
      name='feature_state', full_name='google.cloud.gkehub.v1alpha.MembershipFeatureState.feature_state',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=2493,
  serialized_end=2839,
)

_FEATURE_LABELSENTRY.containing_type = _FEATURE
_FEATURE_MEMBERSHIPSPECSENTRY.fields_by_name['value'].message_type = _MEMBERSHIPFEATURESPEC
_FEATURE_MEMBERSHIPSPECSENTRY.containing_type = _FEATURE
_FEATURE_MEMBERSHIPSTATESENTRY.fields_by_name['value'].message_type = _MEMBERSHIPFEATURESTATE
_FEATURE_MEMBERSHIPSTATESENTRY.containing_type = _FEATURE
_FEATURE.fields_by_name['labels'].message_type = _FEATURE_LABELSENTRY
_FEATURE.fields_by_name['resource_state'].message_type = _FEATURERESOURCESTATE
_FEATURE.fields_by_name['spec'].message_type = _COMMONFEATURESPEC
_FEATURE.fields_by_name['membership_specs'].message_type = _FEATURE_MEMBERSHIPSPECSENTRY
_FEATURE.fields_by_name['state'].message_type = _COMMONFEATURESTATE
_FEATURE.fields_by_name['membership_states'].message_type = _FEATURE_MEMBERSHIPSTATESENTRY
_FEATURE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_FEATURE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_FEATURE.fields_by_name['delete_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_FEATURERESOURCESTATE.fields_by_name['state'].enum_type = _FEATURERESOURCESTATE_STATE
_FEATURERESOURCESTATE_STATE.containing_type = _FEATURERESOURCESTATE
_FEATURESTATE.fields_by_name['code'].enum_type = _FEATURESTATE_CODE
_FEATURESTATE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_FEATURESTATE_CODE.containing_type = _FEATURESTATE
_COMMONFEATURESPEC.fields_by_name['multiclusteringress'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_multiclusteringress_dot_multiclusteringress__pb2._FEATURESPEC
_COMMONFEATURESPEC.fields_by_name['cloudauditlogging'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_cloudauditlogging_dot_cloudauditlogging__pb2._FEATURESPEC
_COMMONFEATURESPEC.oneofs_by_name['feature_spec'].fields.append(
  _COMMONFEATURESPEC.fields_by_name['multiclusteringress'])
_COMMONFEATURESPEC.fields_by_name['multiclusteringress'].containing_oneof = _COMMONFEATURESPEC.oneofs_by_name['feature_spec']
_COMMONFEATURESPEC.oneofs_by_name['feature_spec'].fields.append(
  _COMMONFEATURESPEC.fields_by_name['cloudauditlogging'])
_COMMONFEATURESPEC.fields_by_name['cloudauditlogging'].containing_oneof = _COMMONFEATURESPEC.oneofs_by_name['feature_spec']
_COMMONFEATURESTATE.fields_by_name['servicemesh'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_servicemesh_dot_servicemesh__pb2._FEATURESTATE
_COMMONFEATURESTATE.fields_by_name['state'].message_type = _FEATURESTATE
_COMMONFEATURESTATE.oneofs_by_name['feature_state'].fields.append(
  _COMMONFEATURESTATE.fields_by_name['servicemesh'])
_COMMONFEATURESTATE.fields_by_name['servicemesh'].containing_oneof = _COMMONFEATURESTATE.oneofs_by_name['feature_state']
_MEMBERSHIPFEATURESPEC.fields_by_name['configmanagement'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_configmanagement_dot_configmanagement__pb2._MEMBERSHIPSPEC
_MEMBERSHIPFEATURESPEC.oneofs_by_name['feature_spec'].fields.append(
  _MEMBERSHIPFEATURESPEC.fields_by_name['configmanagement'])
_MEMBERSHIPFEATURESPEC.fields_by_name['configmanagement'].containing_oneof = _MEMBERSHIPFEATURESPEC.oneofs_by_name['feature_spec']
_MEMBERSHIPFEATURESTATE.fields_by_name['servicemesh'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_servicemesh_dot_servicemesh__pb2._MEMBERSHIPSTATE
_MEMBERSHIPFEATURESTATE.fields_by_name['metering'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_metering_dot_metering__pb2._MEMBERSHIPSTATE
_MEMBERSHIPFEATURESTATE.fields_by_name['configmanagement'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_configmanagement_dot_configmanagement__pb2._MEMBERSHIPSTATE
_MEMBERSHIPFEATURESTATE.fields_by_name['state'].message_type = _FEATURESTATE
_MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state'].fields.append(
  _MEMBERSHIPFEATURESTATE.fields_by_name['servicemesh'])
_MEMBERSHIPFEATURESTATE.fields_by_name['servicemesh'].containing_oneof = _MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state']
_MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state'].fields.append(
  _MEMBERSHIPFEATURESTATE.fields_by_name['metering'])
_MEMBERSHIPFEATURESTATE.fields_by_name['metering'].containing_oneof = _MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state']
_MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state'].fields.append(
  _MEMBERSHIPFEATURESTATE.fields_by_name['configmanagement'])
_MEMBERSHIPFEATURESTATE.fields_by_name['configmanagement'].containing_oneof = _MEMBERSHIPFEATURESTATE.oneofs_by_name['feature_state']
DESCRIPTOR.message_types_by_name['Feature'] = _FEATURE
DESCRIPTOR.message_types_by_name['FeatureResourceState'] = _FEATURERESOURCESTATE
DESCRIPTOR.message_types_by_name['FeatureState'] = _FEATURESTATE
DESCRIPTOR.message_types_by_name['CommonFeatureSpec'] = _COMMONFEATURESPEC
DESCRIPTOR.message_types_by_name['CommonFeatureState'] = _COMMONFEATURESTATE
DESCRIPTOR.message_types_by_name['MembershipFeatureSpec'] = _MEMBERSHIPFEATURESPEC
DESCRIPTOR.message_types_by_name['MembershipFeatureState'] = _MEMBERSHIPFEATURESTATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Feature = _reflection.GeneratedProtocolMessageType('Feature', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _FEATURE_LABELSENTRY,
    '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.Feature.LabelsEntry)
    })
  ,

  'MembershipSpecsEntry' : _reflection.GeneratedProtocolMessageType('MembershipSpecsEntry', (_message.Message,), {
    'DESCRIPTOR' : _FEATURE_MEMBERSHIPSPECSENTRY,
    '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.Feature.MembershipSpecsEntry)
    })
  ,

  'MembershipStatesEntry' : _reflection.GeneratedProtocolMessageType('MembershipStatesEntry', (_message.Message,), {
    'DESCRIPTOR' : _FEATURE_MEMBERSHIPSTATESENTRY,
    '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.Feature.MembershipStatesEntry)
    })
  ,
  'DESCRIPTOR' : _FEATURE,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.Feature)
  })
_sym_db.RegisterMessage(Feature)
_sym_db.RegisterMessage(Feature.LabelsEntry)
_sym_db.RegisterMessage(Feature.MembershipSpecsEntry)
_sym_db.RegisterMessage(Feature.MembershipStatesEntry)

FeatureResourceState = _reflection.GeneratedProtocolMessageType('FeatureResourceState', (_message.Message,), {
  'DESCRIPTOR' : _FEATURERESOURCESTATE,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.FeatureResourceState)
  })
_sym_db.RegisterMessage(FeatureResourceState)

FeatureState = _reflection.GeneratedProtocolMessageType('FeatureState', (_message.Message,), {
  'DESCRIPTOR' : _FEATURESTATE,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.FeatureState)
  })
_sym_db.RegisterMessage(FeatureState)

CommonFeatureSpec = _reflection.GeneratedProtocolMessageType('CommonFeatureSpec', (_message.Message,), {
  'DESCRIPTOR' : _COMMONFEATURESPEC,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.CommonFeatureSpec)
  })
_sym_db.RegisterMessage(CommonFeatureSpec)

CommonFeatureState = _reflection.GeneratedProtocolMessageType('CommonFeatureState', (_message.Message,), {
  'DESCRIPTOR' : _COMMONFEATURESTATE,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.CommonFeatureState)
  })
_sym_db.RegisterMessage(CommonFeatureState)

MembershipFeatureSpec = _reflection.GeneratedProtocolMessageType('MembershipFeatureSpec', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERSHIPFEATURESPEC,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.MembershipFeatureSpec)
  })
_sym_db.RegisterMessage(MembershipFeatureSpec)

MembershipFeatureState = _reflection.GeneratedProtocolMessageType('MembershipFeatureState', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERSHIPFEATURESTATE,
  '__module__' : 'google.cloud.gkehub.v1alpha.feature_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.MembershipFeatureState)
  })
_sym_db.RegisterMessage(MembershipFeatureState)


DESCRIPTOR._options = None
_FEATURE_LABELSENTRY._options = None
_FEATURE_MEMBERSHIPSPECSENTRY._options = None
_FEATURE_MEMBERSHIPSTATESENTRY._options = None
_FEATURE.fields_by_name['name']._options = None
_FEATURE.fields_by_name['resource_state']._options = None
_FEATURE.fields_by_name['spec']._options = None
_FEATURE.fields_by_name['membership_specs']._options = None
_FEATURE.fields_by_name['state']._options = None
_FEATURE.fields_by_name['membership_states']._options = None
_FEATURE.fields_by_name['create_time']._options = None
_FEATURE.fields_by_name['update_time']._options = None
_FEATURE.fields_by_name['delete_time']._options = None
_FEATURE._options = None
_COMMONFEATURESTATE.fields_by_name['state']._options = None
# @@protoc_insertion_point(module_scope)
