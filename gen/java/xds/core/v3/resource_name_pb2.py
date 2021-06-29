# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xds/core/v3/resource_name.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from xds.core.v3 import context_params_pb2 as xds_dot_core_dot_v3_dot_context__params__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='xds/core/v3/resource_name.proto',
  package='xds.core.v3',
  syntax='proto3',
  serialized_options=b'\n\033com.github.udpa.xds.core.v3B\021ResourceNameProtoP\001\272\200\310\321\006\002\010\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1fxds/core/v3/resource_name.proto\x12\x0bxds.core.v3\x1a\x1dudpa/annotations/status.proto\x1a xds/core/v3/context_params.proto\x1a\x17validate/validate.proto\"z\n\x0cResourceName\x12\n\n\x02id\x18\x01 \x01(\t\x12\x11\n\tauthority\x18\x02 \x01(\t\x12\x1e\n\rresource_type\x18\x03 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12+\n\x07\x63ontext\x18\x04 \x01(\x0b\x32\x1a.xds.core.v3.ContextParamsB:\n\x1b\x63om.github.udpa.xds.core.v3B\x11ResourceNameProtoP\x01\xba\x80\xc8\xd1\x06\x02\x08\x01\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,xds_dot_core_dot_v3_dot_context__params__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_RESOURCENAME = _descriptor.Descriptor(
  name='ResourceName',
  full_name='xds.core.v3.ResourceName',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='xds.core.v3.ResourceName.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='authority', full_name='xds.core.v3.ResourceName.authority', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_type', full_name='xds.core.v3.ResourceName.resource_type', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='context', full_name='xds.core.v3.ResourceName.context', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  ],
  serialized_start=138,
  serialized_end=260,
)

_RESOURCENAME.fields_by_name['context'].message_type = xds_dot_core_dot_v3_dot_context__params__pb2._CONTEXTPARAMS
DESCRIPTOR.message_types_by_name['ResourceName'] = _RESOURCENAME
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ResourceName = _reflection.GeneratedProtocolMessageType('ResourceName', (_message.Message,), {
  'DESCRIPTOR' : _RESOURCENAME,
  '__module__' : 'xds.core.v3.resource_name_pb2'
  # @@protoc_insertion_point(class_scope:xds.core.v3.ResourceName)
  })
_sym_db.RegisterMessage(ResourceName)


DESCRIPTOR._options = None
_RESOURCENAME.fields_by_name['resource_type']._options = None
# @@protoc_insertion_point(module_scope)