# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/query_plan.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/spanner/v1/query_plan.proto',
  package='google.spanner.v1',
  syntax='proto3',
  serialized_options=b'\n\025com.google.spanner.v1B\016QueryPlanProtoP\001Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\252\002\027Google.Cloud.Spanner.V1\312\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google::Cloud::Spanner::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"google/spanner/v1/query_plan.proto\x12\x11google.spanner.v1\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1cgoogle/api/annotations.proto\"\xf8\x04\n\x08PlanNode\x12\r\n\x05index\x18\x01 \x01(\x05\x12.\n\x04kind\x18\x02 \x01(\x0e\x32 .google.spanner.v1.PlanNode.Kind\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12:\n\x0b\x63hild_links\x18\x04 \x03(\x0b\x32%.google.spanner.v1.PlanNode.ChildLink\x12M\n\x14short_representation\x18\x05 \x01(\x0b\x32/.google.spanner.v1.PlanNode.ShortRepresentation\x12)\n\x08metadata\x18\x06 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x30\n\x0f\x65xecution_stats\x18\x07 \x01(\x0b\x32\x17.google.protobuf.Struct\x1a@\n\tChildLink\x12\x13\n\x0b\x63hild_index\x18\x01 \x01(\x05\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x10\n\x08variable\x18\x03 \x01(\t\x1a\xb2\x01\n\x13ShortRepresentation\x12\x13\n\x0b\x64\x65scription\x18\x01 \x01(\t\x12S\n\nsubqueries\x18\x02 \x03(\x0b\x32?.google.spanner.v1.PlanNode.ShortRepresentation.SubqueriesEntry\x1a\x31\n\x0fSubqueriesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x05:\x02\x38\x01\"8\n\x04Kind\x12\x14\n\x10KIND_UNSPECIFIED\x10\x00\x12\x0e\n\nRELATIONAL\x10\x01\x12\n\n\x06SCALAR\x10\x02\"<\n\tQueryPlan\x12/\n\nplan_nodes\x18\x01 \x03(\x0b\x32\x1b.google.spanner.v1.PlanNodeB\xb4\x01\n\x15\x63om.google.spanner.v1B\x0eQueryPlanProtoP\x01Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\xaa\x02\x17Google.Cloud.Spanner.V1\xca\x02\x17Google\\Cloud\\Spanner\\V1\xea\x02\x1aGoogle::Cloud::Spanner::V1b\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_PLANNODE_KIND = _descriptor.EnumDescriptor(
  name='Kind',
  full_name='google.spanner.v1.PlanNode.Kind',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='KIND_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RELATIONAL', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SCALAR', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=694,
  serialized_end=750,
)
_sym_db.RegisterEnumDescriptor(_PLANNODE_KIND)


_PLANNODE_CHILDLINK = _descriptor.Descriptor(
  name='ChildLink',
  full_name='google.spanner.v1.PlanNode.ChildLink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='child_index', full_name='google.spanner.v1.PlanNode.ChildLink.child_index', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.spanner.v1.PlanNode.ChildLink.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='variable', full_name='google.spanner.v1.PlanNode.ChildLink.variable', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=447,
  serialized_end=511,
)

_PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY = _descriptor.Descriptor(
  name='SubqueriesEntry',
  full_name='google.spanner.v1.PlanNode.ShortRepresentation.SubqueriesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.spanner.v1.PlanNode.ShortRepresentation.SubqueriesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.spanner.v1.PlanNode.ShortRepresentation.SubqueriesEntry.value', index=1,
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
  serialized_start=643,
  serialized_end=692,
)

_PLANNODE_SHORTREPRESENTATION = _descriptor.Descriptor(
  name='ShortRepresentation',
  full_name='google.spanner.v1.PlanNode.ShortRepresentation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='description', full_name='google.spanner.v1.PlanNode.ShortRepresentation.description', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subqueries', full_name='google.spanner.v1.PlanNode.ShortRepresentation.subqueries', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=514,
  serialized_end=692,
)

_PLANNODE = _descriptor.Descriptor(
  name='PlanNode',
  full_name='google.spanner.v1.PlanNode',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='index', full_name='google.spanner.v1.PlanNode.index', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kind', full_name='google.spanner.v1.PlanNode.kind', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.spanner.v1.PlanNode.display_name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='child_links', full_name='google.spanner.v1.PlanNode.child_links', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='short_representation', full_name='google.spanner.v1.PlanNode.short_representation', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.spanner.v1.PlanNode.metadata', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='execution_stats', full_name='google.spanner.v1.PlanNode.execution_stats', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PLANNODE_CHILDLINK, _PLANNODE_SHORTREPRESENTATION, ],
  enum_types=[
    _PLANNODE_KIND,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=750,
)


_QUERYPLAN = _descriptor.Descriptor(
  name='QueryPlan',
  full_name='google.spanner.v1.QueryPlan',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='plan_nodes', full_name='google.spanner.v1.QueryPlan.plan_nodes', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=752,
  serialized_end=812,
)

_PLANNODE_CHILDLINK.containing_type = _PLANNODE
_PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY.containing_type = _PLANNODE_SHORTREPRESENTATION
_PLANNODE_SHORTREPRESENTATION.fields_by_name['subqueries'].message_type = _PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY
_PLANNODE_SHORTREPRESENTATION.containing_type = _PLANNODE
_PLANNODE.fields_by_name['kind'].enum_type = _PLANNODE_KIND
_PLANNODE.fields_by_name['child_links'].message_type = _PLANNODE_CHILDLINK
_PLANNODE.fields_by_name['short_representation'].message_type = _PLANNODE_SHORTREPRESENTATION
_PLANNODE.fields_by_name['metadata'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_PLANNODE.fields_by_name['execution_stats'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_PLANNODE_KIND.containing_type = _PLANNODE
_QUERYPLAN.fields_by_name['plan_nodes'].message_type = _PLANNODE
DESCRIPTOR.message_types_by_name['PlanNode'] = _PLANNODE
DESCRIPTOR.message_types_by_name['QueryPlan'] = _QUERYPLAN
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PlanNode = _reflection.GeneratedProtocolMessageType('PlanNode', (_message.Message,), {

  'ChildLink' : _reflection.GeneratedProtocolMessageType('ChildLink', (_message.Message,), {
    'DESCRIPTOR' : _PLANNODE_CHILDLINK,
    '__module__' : 'google.spanner.v1.query_plan_pb2'
    # @@protoc_insertion_point(class_scope:google.spanner.v1.PlanNode.ChildLink)
    })
  ,

  'ShortRepresentation' : _reflection.GeneratedProtocolMessageType('ShortRepresentation', (_message.Message,), {

    'SubqueriesEntry' : _reflection.GeneratedProtocolMessageType('SubqueriesEntry', (_message.Message,), {
      'DESCRIPTOR' : _PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY,
      '__module__' : 'google.spanner.v1.query_plan_pb2'
      # @@protoc_insertion_point(class_scope:google.spanner.v1.PlanNode.ShortRepresentation.SubqueriesEntry)
      })
    ,
    'DESCRIPTOR' : _PLANNODE_SHORTREPRESENTATION,
    '__module__' : 'google.spanner.v1.query_plan_pb2'
    # @@protoc_insertion_point(class_scope:google.spanner.v1.PlanNode.ShortRepresentation)
    })
  ,
  'DESCRIPTOR' : _PLANNODE,
  '__module__' : 'google.spanner.v1.query_plan_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.PlanNode)
  })
_sym_db.RegisterMessage(PlanNode)
_sym_db.RegisterMessage(PlanNode.ChildLink)
_sym_db.RegisterMessage(PlanNode.ShortRepresentation)
_sym_db.RegisterMessage(PlanNode.ShortRepresentation.SubqueriesEntry)

QueryPlan = _reflection.GeneratedProtocolMessageType('QueryPlan', (_message.Message,), {
  'DESCRIPTOR' : _QUERYPLAN,
  '__module__' : 'google.spanner.v1.query_plan_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.QueryPlan)
  })
_sym_db.RegisterMessage(QueryPlan)


DESCRIPTOR._options = None
_PLANNODE_SHORTREPRESENTATION_SUBQUERIESENTRY._options = None
# @@protoc_insertion_point(module_scope)
