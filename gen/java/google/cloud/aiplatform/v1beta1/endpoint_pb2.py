# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/endpoint.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1beta1 import encryption_spec_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_encryption__spec__pb2
from google.cloud.aiplatform.v1beta1 import explanation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_explanation__pb2
from google.cloud.aiplatform.v1beta1 import machine_resources_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_machine__resources__pb2
from google.cloud.aiplatform.v1beta1 import model_deployment_monitoring_job_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_model__deployment__monitoring__job__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/endpoint.proto',
  package='google.cloud.aiplatform.v1beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.aiplatform.v1beta1B\rEndpointProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/cloud/aiplatform/v1beta1/endpoint.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x35google/cloud/aiplatform/v1beta1/encryption_spec.proto\x1a\x31google/cloud/aiplatform/v1beta1/explanation.proto\x1a\x37google/cloud/aiplatform/v1beta1/machine_resources.proto\x1a\x45google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xc5\x05\n\x08\x45ndpoint\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12L\n\x0f\x64\x65ployed_models\x18\x04 \x03(\x0b\x32..google.cloud.aiplatform.v1beta1.DeployedModelB\x03\xe0\x41\x03\x12R\n\rtraffic_split\x18\x05 \x03(\x0b\x32;.google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry\x12\x0c\n\x04\x65tag\x18\x06 \x01(\t\x12\x45\n\x06labels\x18\x07 \x03(\x0b\x32\x35.google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry\x12\x34\n\x0b\x63reate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12H\n\x0f\x65ncryption_spec\x18\n \x01(\x0b\x32/.google.cloud.aiplatform.v1beta1.EncryptionSpec\x1a\x33\n\x11TrafficSplitEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x05:\x02\x38\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:e\xea\x41\x62\n\"aiplatform.googleapis.com/Endpoint\x12<projects/{project}/locations/{location}/endpoints/{endpoint}\"\x8a\x04\n\rDeployedModel\x12R\n\x13\x64\x65\x64icated_resources\x18\x07 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.DedicatedResourcesH\x00\x12R\n\x13\x61utomatic_resources\x18\x08 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.AutomaticResourcesH\x00\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x36\n\x05model\x18\x02 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12J\n\x10\x65xplanation_spec\x18\t \x01(\x0b\x32\x30.google.cloud.aiplatform.v1beta1.ExplanationSpec\x12\x17\n\x0fservice_account\x18\x0b \x01(\t\x12 \n\x18\x65nable_container_logging\x18\x0c \x01(\x08\x12\x1d\n\x15\x65nable_access_logging\x18\r \x01(\x08\x42\x16\n\x14prediction_resourcesB\x81\x01\n#com.google.cloud.aiplatform.v1beta1B\rEndpointProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_encryption__spec__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_explanation__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_machine__resources__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_model__deployment__monitoring__job__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ENDPOINT_TRAFFICSPLITENTRY = _descriptor.Descriptor(
  name='TrafficSplitEntry',
  full_name='google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry.value', index=1,
      number=2, type=5, cpp_type=1, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=949,
  serialized_end=1000,
)

_ENDPOINT_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry.value', index=1,
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
  serialized_start=1002,
  serialized_end=1047,
)

_ENDPOINT = _descriptor.Descriptor(
  name='Endpoint',
  full_name='google.cloud.aiplatform.v1beta1.Endpoint',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1beta1.Endpoint.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.aiplatform.v1beta1.Endpoint.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.aiplatform.v1beta1.Endpoint.description', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='deployed_models', full_name='google.cloud.aiplatform.v1beta1.Endpoint.deployed_models', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='traffic_split', full_name='google.cloud.aiplatform.v1beta1.Endpoint.traffic_split', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.aiplatform.v1beta1.Endpoint.etag', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.aiplatform.v1beta1.Endpoint.labels', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.aiplatform.v1beta1.Endpoint.create_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.aiplatform.v1beta1.Endpoint.update_time', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encryption_spec', full_name='google.cloud.aiplatform.v1beta1.Endpoint.encryption_spec', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_ENDPOINT_TRAFFICSPLITENTRY, _ENDPOINT_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352Ab\n\"aiplatform.googleapis.com/Endpoint\022<projects/{project}/locations/{location}/endpoints/{endpoint}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=441,
  serialized_end=1150,
)


_DEPLOYEDMODEL = _descriptor.Descriptor(
  name='DeployedModel',
  full_name='google.cloud.aiplatform.v1beta1.DeployedModel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dedicated_resources', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.dedicated_resources', index=0,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='automatic_resources', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.automatic_resources', index=1,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.id', index=2,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.model', index=3,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.display_name', index=4,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.create_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='explanation_spec', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.explanation_spec', index=6,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_account', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.service_account', index=7,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_container_logging', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.enable_container_logging', index=8,
      number=12, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_access_logging', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.enable_access_logging', index=9,
      number=13, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
      name='prediction_resources', full_name='google.cloud.aiplatform.v1beta1.DeployedModel.prediction_resources',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1153,
  serialized_end=1675,
)

_ENDPOINT_TRAFFICSPLITENTRY.containing_type = _ENDPOINT
_ENDPOINT_LABELSENTRY.containing_type = _ENDPOINT
_ENDPOINT.fields_by_name['deployed_models'].message_type = _DEPLOYEDMODEL
_ENDPOINT.fields_by_name['traffic_split'].message_type = _ENDPOINT_TRAFFICSPLITENTRY
_ENDPOINT.fields_by_name['labels'].message_type = _ENDPOINT_LABELSENTRY
_ENDPOINT.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENDPOINT.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENDPOINT.fields_by_name['encryption_spec'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_encryption__spec__pb2._ENCRYPTIONSPEC
_DEPLOYEDMODEL.fields_by_name['dedicated_resources'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_machine__resources__pb2._DEDICATEDRESOURCES
_DEPLOYEDMODEL.fields_by_name['automatic_resources'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_machine__resources__pb2._AUTOMATICRESOURCES
_DEPLOYEDMODEL.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DEPLOYEDMODEL.fields_by_name['explanation_spec'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_explanation__pb2._EXPLANATIONSPEC
_DEPLOYEDMODEL.oneofs_by_name['prediction_resources'].fields.append(
  _DEPLOYEDMODEL.fields_by_name['dedicated_resources'])
_DEPLOYEDMODEL.fields_by_name['dedicated_resources'].containing_oneof = _DEPLOYEDMODEL.oneofs_by_name['prediction_resources']
_DEPLOYEDMODEL.oneofs_by_name['prediction_resources'].fields.append(
  _DEPLOYEDMODEL.fields_by_name['automatic_resources'])
_DEPLOYEDMODEL.fields_by_name['automatic_resources'].containing_oneof = _DEPLOYEDMODEL.oneofs_by_name['prediction_resources']
DESCRIPTOR.message_types_by_name['Endpoint'] = _ENDPOINT
DESCRIPTOR.message_types_by_name['DeployedModel'] = _DEPLOYEDMODEL
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Endpoint = _reflection.GeneratedProtocolMessageType('Endpoint', (_message.Message,), {

  'TrafficSplitEntry' : _reflection.GeneratedProtocolMessageType('TrafficSplitEntry', (_message.Message,), {
    'DESCRIPTOR' : _ENDPOINT_TRAFFICSPLITENTRY,
    '__module__' : 'google.cloud.aiplatform.v1beta1.endpoint_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry)
    })
  ,

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _ENDPOINT_LABELSENTRY,
    '__module__' : 'google.cloud.aiplatform.v1beta1.endpoint_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _ENDPOINT,
  '__module__' : 'google.cloud.aiplatform.v1beta1.endpoint_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Endpoint)
  })
_sym_db.RegisterMessage(Endpoint)
_sym_db.RegisterMessage(Endpoint.TrafficSplitEntry)
_sym_db.RegisterMessage(Endpoint.LabelsEntry)

DeployedModel = _reflection.GeneratedProtocolMessageType('DeployedModel', (_message.Message,), {
  'DESCRIPTOR' : _DEPLOYEDMODEL,
  '__module__' : 'google.cloud.aiplatform.v1beta1.endpoint_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DeployedModel)
  })
_sym_db.RegisterMessage(DeployedModel)


DESCRIPTOR._options = None
_ENDPOINT_TRAFFICSPLITENTRY._options = None
_ENDPOINT_LABELSENTRY._options = None
_ENDPOINT.fields_by_name['name']._options = None
_ENDPOINT.fields_by_name['display_name']._options = None
_ENDPOINT.fields_by_name['deployed_models']._options = None
_ENDPOINT.fields_by_name['create_time']._options = None
_ENDPOINT.fields_by_name['update_time']._options = None
_ENDPOINT._options = None
_DEPLOYEDMODEL.fields_by_name['id']._options = None
_DEPLOYEDMODEL.fields_by_name['model']._options = None
_DEPLOYEDMODEL.fields_by_name['create_time']._options = None
# @@protoc_insertion_point(module_scope)
