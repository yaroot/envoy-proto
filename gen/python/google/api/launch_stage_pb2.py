# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/launch_stage.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/launch_stage.proto',
  package='google.api',
  syntax='proto3',
  serialized_options=b'\n\016com.google.apiB\020LaunchStageProtoP\001Z-google.golang.org/genproto/googleapis/api;api\242\002\004GAPI',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1dgoogle/api/launch_stage.proto\x12\ngoogle.api*\x8c\x01\n\x0bLaunchStage\x12\x1c\n\x18LAUNCH_STAGE_UNSPECIFIED\x10\x00\x12\x11\n\rUNIMPLEMENTED\x10\x06\x12\r\n\tPRELAUNCH\x10\x07\x12\x10\n\x0c\x45\x41RLY_ACCESS\x10\x01\x12\t\n\x05\x41LPHA\x10\x02\x12\x08\n\x04\x42\x45TA\x10\x03\x12\x06\n\x02GA\x10\x04\x12\x0e\n\nDEPRECATED\x10\x05\x42Z\n\x0e\x63om.google.apiB\x10LaunchStageProtoP\x01Z-google.golang.org/genproto/googleapis/api;api\xa2\x02\x04GAPIb\x06proto3'
)

_LAUNCHSTAGE = _descriptor.EnumDescriptor(
  name='LaunchStage',
  full_name='google.api.LaunchStage',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LAUNCH_STAGE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNIMPLEMENTED', index=1, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRELAUNCH', index=2, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EARLY_ACCESS', index=3, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALPHA', index=4, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BETA', index=5, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GA', index=6, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEPRECATED', index=7, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=46,
  serialized_end=186,
)
_sym_db.RegisterEnumDescriptor(_LAUNCHSTAGE)

LaunchStage = enum_type_wrapper.EnumTypeWrapper(_LAUNCHSTAGE)
LAUNCH_STAGE_UNSPECIFIED = 0
UNIMPLEMENTED = 6
PRELAUNCH = 7
EARLY_ACCESS = 1
ALPHA = 2
BETA = 3
GA = 4
DEPRECATED = 5


DESCRIPTOR.enum_types_by_name['LaunchStage'] = _LAUNCHSTAGE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
