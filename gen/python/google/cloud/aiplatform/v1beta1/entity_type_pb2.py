# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/entity_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1beta1 import feature_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_feature__pb2
from google.cloud.aiplatform.v1beta1 import featurestore_monitoring_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_featurestore__monitoring__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/entity_type.proto',
  package='google.cloud.aiplatform.v1beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.aiplatform.v1beta1B\017EntityTypeProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/cloud/aiplatform/v1beta1/entity_type.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a-google/cloud/aiplatform/v1beta1/feature.proto\x1a=google/cloud/aiplatform/v1beta1/featurestore_monitoring.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xa1\x04\n\nEntityType\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12L\n\x06labels\x18\x06 \x03(\x0b\x32\x37.google.cloud.aiplatform.v1beta1.EntityType.LabelsEntryB\x03\xe0\x41\x01\x12\x11\n\x04\x65tag\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12]\n\x11monitoring_config\x18\x08 \x01(\x0b\x32=.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfigB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x8a\x01\xea\x41\x86\x01\n$aiplatform.googleapis.com/EntityType\x12^projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}B\x83\x01\n#com.google.cloud.aiplatform.v1beta1B\x0f\x45ntityTypeProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_feature__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_featurestore__monitoring__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ENTITYTYPE_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.aiplatform.v1beta1.EntityType.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.aiplatform.v1beta1.EntityType.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.aiplatform.v1beta1.EntityType.LabelsEntry.value', index=1,
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
  serialized_start=679,
  serialized_end=724,
)

_ENTITYTYPE = _descriptor.Descriptor(
  name='EntityType',
  full_name='google.cloud.aiplatform.v1beta1.EntityType',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1beta1.EntityType.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.aiplatform.v1beta1.EntityType.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.aiplatform.v1beta1.EntityType.create_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.aiplatform.v1beta1.EntityType.update_time', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.aiplatform.v1beta1.EntityType.labels', index=4,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.aiplatform.v1beta1.EntityType.etag', index=5,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='monitoring_config', full_name='google.cloud.aiplatform.v1beta1.EntityType.monitoring_config', index=6,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_ENTITYTYPE_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352A\206\001\n$aiplatform.googleapis.com/EntityType\022^projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=320,
  serialized_end=865,
)

_ENTITYTYPE_LABELSENTRY.containing_type = _ENTITYTYPE
_ENTITYTYPE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENTITYTYPE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENTITYTYPE.fields_by_name['labels'].message_type = _ENTITYTYPE_LABELSENTRY
_ENTITYTYPE.fields_by_name['monitoring_config'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_featurestore__monitoring__pb2._FEATURESTOREMONITORINGCONFIG
DESCRIPTOR.message_types_by_name['EntityType'] = _ENTITYTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

EntityType = _reflection.GeneratedProtocolMessageType('EntityType', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _ENTITYTYPE_LABELSENTRY,
    '__module__' : 'google.cloud.aiplatform.v1beta1.entity_type_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.EntityType.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _ENTITYTYPE,
  '__module__' : 'google.cloud.aiplatform.v1beta1.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.EntityType)
  })
_sym_db.RegisterMessage(EntityType)
_sym_db.RegisterMessage(EntityType.LabelsEntry)


DESCRIPTOR._options = None
_ENTITYTYPE_LABELSENTRY._options = None
_ENTITYTYPE.fields_by_name['name']._options = None
_ENTITYTYPE.fields_by_name['description']._options = None
_ENTITYTYPE.fields_by_name['create_time']._options = None
_ENTITYTYPE.fields_by_name['update_time']._options = None
_ENTITYTYPE.fields_by_name['labels']._options = None
_ENTITYTYPE.fields_by_name['etag']._options = None
_ENTITYTYPE.fields_by_name['monitoring_config']._options = None
_ENTITYTYPE._options = None
# @@protoc_insertion_point(module_scope)
