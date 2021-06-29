# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/lineage_subgraph.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1beta1 import artifact_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_artifact__pb2
from google.cloud.aiplatform.v1beta1 import event_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_event__pb2
from google.cloud.aiplatform.v1beta1 import execution_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_execution__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/lineage_subgraph.proto',
  package='google.cloud.aiplatform.v1beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.aiplatform.v1beta1B\024LineageSubgraphProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/cloud/aiplatform/v1beta1/lineage_subgraph.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x19google/api/resource.proto\x1a.google/cloud/aiplatform/v1beta1/artifact.proto\x1a+google/cloud/aiplatform/v1beta1/event.proto\x1a/google/cloud/aiplatform/v1beta1/execution.proto\x1a\x1cgoogle/api/annotations.proto\"\x9a\x02\n\x0fLineageSubgraph\x12\x65\n\tartifacts\x18\x01 \x03(\x0b\x32).google.cloud.aiplatform.v1beta1.ArtifactB\'\xfa\x41$\n\"aiplatform.googleapis.com/Artifact\x12h\n\nexecutions\x18\x02 \x03(\x0b\x32*.google.cloud.aiplatform.v1beta1.ExecutionB(\xfa\x41%\n#aiplatform.googleapis.com/Execution\x12\x36\n\x06\x65vents\x18\x03 \x03(\x0b\x32&.google.cloud.aiplatform.v1beta1.EventB\x88\x01\n#com.google.cloud.aiplatform.v1beta1B\x14LineageSubgraphProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_artifact__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_event__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_execution__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_LINEAGESUBGRAPH = _descriptor.Descriptor(
  name='LineageSubgraph',
  full_name='google.cloud.aiplatform.v1beta1.LineageSubgraph',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='artifacts', full_name='google.cloud.aiplatform.v1beta1.LineageSubgraph.artifacts', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A$\n\"aiplatform.googleapis.com/Artifact', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='executions', full_name='google.cloud.aiplatform.v1beta1.LineageSubgraph.executions', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A%\n#aiplatform.googleapis.com/Execution', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='events', full_name='google.cloud.aiplatform.v1beta1.LineageSubgraph.events', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=291,
  serialized_end=573,
)

_LINEAGESUBGRAPH.fields_by_name['artifacts'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_artifact__pb2._ARTIFACT
_LINEAGESUBGRAPH.fields_by_name['executions'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_execution__pb2._EXECUTION
_LINEAGESUBGRAPH.fields_by_name['events'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_event__pb2._EVENT
DESCRIPTOR.message_types_by_name['LineageSubgraph'] = _LINEAGESUBGRAPH
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LineageSubgraph = _reflection.GeneratedProtocolMessageType('LineageSubgraph', (_message.Message,), {
  'DESCRIPTOR' : _LINEAGESUBGRAPH,
  '__module__' : 'google.cloud.aiplatform.v1beta1.lineage_subgraph_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.LineageSubgraph)
  })
_sym_db.RegisterMessage(LineageSubgraph)


DESCRIPTOR._options = None
_LINEAGESUBGRAPH.fields_by_name['artifacts']._options = None
_LINEAGESUBGRAPH.fields_by_name['executions']._options = None
# @@protoc_insertion_point(module_scope)