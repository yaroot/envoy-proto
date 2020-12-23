# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/type/type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.type import free_text_type_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_free__text__type__pb2
from google.actions.sdk.v2.interactionmodel.type import regular_expression_type_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_regular__expression__type__pb2
from google.actions.sdk.v2.interactionmodel.type import synonym_type_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_synonym__type__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/type/type.proto',
  package='google.actions.sdk.v2.interactionmodel.type',
  syntax='proto3',
  serialized_options=b'\n/com.google.actions.sdk.v2.interactionmodel.typeB\tTypeProtoP\001ZOgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/type;type',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/actions/sdk/v2/interactionmodel/type/type.proto\x12+google.actions.sdk.v2.interactionmodel.type\x1a@google/actions/sdk/v2/interactionmodel/type/free_text_type.proto\x1aIgoogle/actions/sdk/v2/interactionmodel/type/regular_expression_type.proto\x1a>google/actions/sdk/v2/interactionmodel/type/synonym_type.proto\"\xa5\x02\n\x04Type\x12K\n\x07synonym\x18\x01 \x01(\x0b\x32\x38.google.actions.sdk.v2.interactionmodel.type.SynonymTypeH\x00\x12`\n\x12regular_expression\x18\x02 \x01(\x0b\x32\x42.google.actions.sdk.v2.interactionmodel.type.RegularExpressionTypeH\x00\x12N\n\tfree_text\x18\x03 \x01(\x0b\x32\x39.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeH\x00\x12\x12\n\nexclusions\x18\x04 \x03(\tB\n\n\x08sub_typeB\x8f\x01\n/com.google.actions.sdk.v2.interactionmodel.typeB\tTypeProtoP\x01ZOgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/type;typeb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_free__text__type__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_regular__expression__type__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_synonym__type__pb2.DESCRIPTOR,])




_TYPE = _descriptor.Descriptor(
  name='Type',
  full_name='google.actions.sdk.v2.interactionmodel.type.Type',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='synonym', full_name='google.actions.sdk.v2.interactionmodel.type.Type.synonym', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='regular_expression', full_name='google.actions.sdk.v2.interactionmodel.type.Type.regular_expression', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='free_text', full_name='google.actions.sdk.v2.interactionmodel.type.Type.free_text', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exclusions', full_name='google.actions.sdk.v2.interactionmodel.type.Type.exclusions', index=3,
      number=4, type=9, cpp_type=9, label=3,
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
    _descriptor.OneofDescriptor(
      name='sub_type', full_name='google.actions.sdk.v2.interactionmodel.type.Type.sub_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=309,
  serialized_end=602,
)

_TYPE.fields_by_name['synonym'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_synonym__type__pb2._SYNONYMTYPE
_TYPE.fields_by_name['regular_expression'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_regular__expression__type__pb2._REGULAREXPRESSIONTYPE
_TYPE.fields_by_name['free_text'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_free__text__type__pb2._FREETEXTTYPE
_TYPE.oneofs_by_name['sub_type'].fields.append(
  _TYPE.fields_by_name['synonym'])
_TYPE.fields_by_name['synonym'].containing_oneof = _TYPE.oneofs_by_name['sub_type']
_TYPE.oneofs_by_name['sub_type'].fields.append(
  _TYPE.fields_by_name['regular_expression'])
_TYPE.fields_by_name['regular_expression'].containing_oneof = _TYPE.oneofs_by_name['sub_type']
_TYPE.oneofs_by_name['sub_type'].fields.append(
  _TYPE.fields_by_name['free_text'])
_TYPE.fields_by_name['free_text'].containing_oneof = _TYPE.oneofs_by_name['sub_type']
DESCRIPTOR.message_types_by_name['Type'] = _TYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Type = _reflection.GeneratedProtocolMessageType('Type', (_message.Message,), {
  'DESCRIPTOR' : _TYPE,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.type.type_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.type.Type)
  })
_sym_db.RegisterMessage(Type)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
