# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/remoteworkers/v1test2/command.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/remoteworkers/v1test2/command.proto',
  package='google.devtools.remoteworkers.v1test2',
  syntax='proto3',
  serialized_options=b'\n)com.google.devtools.remoteworkers.v1test2B\025RemoteWorkersCommandsP\001ZRgoogle.golang.org/genproto/googleapis/devtools/remoteworkers/v1test2;remoteworkers\242\002\002RW\252\002%Google.DevTools.RemoteWorkers.V1Test2',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/devtools/remoteworkers/v1test2/command.proto\x12%google.devtools.remoteworkers.v1test2\x1a\x19google/protobuf/any.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x17google/rpc/status.proto\"\xd1\x06\n\x0b\x43ommandTask\x12I\n\x06inputs\x18\x01 \x01(\x0b\x32\x39.google.devtools.remoteworkers.v1test2.CommandTask.Inputs\x12T\n\x10\x65xpected_outputs\x18\x04 \x01(\x0b\x32:.google.devtools.remoteworkers.v1test2.CommandTask.Outputs\x12M\n\x08timeouts\x18\x05 \x01(\x0b\x32;.google.devtools.remoteworkers.v1test2.CommandTask.Timeouts\x1a\xd9\x02\n\x06Inputs\x12\x11\n\targuments\x18\x01 \x03(\t\x12<\n\x05\x66iles\x18\x02 \x03(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\x12\x41\n\x0cinline_blobs\x18\x04 \x03(\x0b\x32+.google.devtools.remoteworkers.v1test2.Blob\x12l\n\x15\x65nvironment_variables\x18\x03 \x03(\x0b\x32M.google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable\x12\x19\n\x11working_directory\x18\x05 \x01(\t\x1a\x32\n\x13\x45nvironmentVariable\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\x1a\x65\n\x07Outputs\x12\r\n\x05\x66iles\x18\x01 \x03(\t\x12\x13\n\x0b\x64irectories\x18\x02 \x03(\t\x12\x1a\n\x12stdout_destination\x18\x03 \x01(\t\x12\x1a\n\x12stderr_destination\x18\x04 \x01(\t\x1a\x8e\x01\n\x08Timeouts\x12,\n\texecution\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\'\n\x04idle\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12+\n\x08shutdown\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\"c\n\x0e\x43ommandOutputs\x12\x11\n\texit_code\x18\x01 \x01(\x05\x12>\n\x07outputs\x18\x02 \x01(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\"k\n\x0f\x43ommandOverhead\x12+\n\x08\x64uration\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12+\n\x08overhead\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"\x90\x02\n\rCommandResult\x12\"\n\x06status\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12\x11\n\texit_code\x18\x02 \x01(\x05\x12>\n\x07outputs\x18\x03 \x01(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\x12/\n\x08\x64uration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x02\x18\x01\x12/\n\x08overhead\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x02\x18\x01\x12&\n\x08metadata\x18\x06 \x03(\x0b\x32\x14.google.protobuf.Any\"\x84\x01\n\x0c\x46ileMetadata\x12\x0c\n\x04path\x18\x01 \x01(\t\x12=\n\x06\x64igest\x18\x02 \x01(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\x12\x10\n\x08\x63ontents\x18\x03 \x01(\x0c\x12\x15\n\ris_executable\x18\x04 \x01(\x08\"`\n\x11\x44irectoryMetadata\x12\x0c\n\x04path\x18\x01 \x01(\t\x12=\n\x06\x64igest\x18\x02 \x01(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\"*\n\x06\x44igest\x12\x0c\n\x04hash\x18\x01 \x01(\t\x12\x12\n\nsize_bytes\x18\x02 \x01(\x03\"W\n\x04\x42lob\x12=\n\x06\x64igest\x18\x01 \x01(\x0b\x32-.google.devtools.remoteworkers.v1test2.Digest\x12\x10\n\x08\x63ontents\x18\x02 \x01(\x0c\"\x9e\x01\n\tDirectory\x12\x42\n\x05\x66iles\x18\x01 \x03(\x0b\x32\x33.google.devtools.remoteworkers.v1test2.FileMetadata\x12M\n\x0b\x64irectories\x18\x02 \x03(\x0b\x32\x38.google.devtools.remoteworkers.v1test2.DirectoryMetadataB\xc5\x01\n)com.google.devtools.remoteworkers.v1test2B\x15RemoteWorkersCommandsP\x01ZRgoogle.golang.org/genproto/googleapis/devtools/remoteworkers/v1test2;remoteworkers\xa2\x02\x02RW\xaa\x02%Google.DevTools.RemoteWorkers.V1Test2b\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_any__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_COMMANDTASK_INPUTS_ENVIRONMENTVARIABLE = _descriptor.Descriptor(
  name='EnvironmentVariable',
  full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable.value', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=730,
  serialized_end=780,
)

_COMMANDTASK_INPUTS = _descriptor.Descriptor(
  name='Inputs',
  full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='arguments', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.arguments', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='files', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.files', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='inline_blobs', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.inline_blobs', index=2,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='environment_variables', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.environment_variables', index=3,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='working_directory', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Inputs.working_directory', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMMANDTASK_INPUTS_ENVIRONMENTVARIABLE, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=435,
  serialized_end=780,
)

_COMMANDTASK_OUTPUTS = _descriptor.Descriptor(
  name='Outputs',
  full_name='google.devtools.remoteworkers.v1test2.CommandTask.Outputs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='files', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Outputs.files', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='directories', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Outputs.directories', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stdout_destination', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Outputs.stdout_destination', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stderr_destination', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Outputs.stderr_destination', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=782,
  serialized_end=883,
)

_COMMANDTASK_TIMEOUTS = _descriptor.Descriptor(
  name='Timeouts',
  full_name='google.devtools.remoteworkers.v1test2.CommandTask.Timeouts',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='execution', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Timeouts.execution', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='idle', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Timeouts.idle', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='shutdown', full_name='google.devtools.remoteworkers.v1test2.CommandTask.Timeouts.shutdown', index=2,
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
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=886,
  serialized_end=1028,
)

_COMMANDTASK = _descriptor.Descriptor(
  name='CommandTask',
  full_name='google.devtools.remoteworkers.v1test2.CommandTask',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='inputs', full_name='google.devtools.remoteworkers.v1test2.CommandTask.inputs', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='expected_outputs', full_name='google.devtools.remoteworkers.v1test2.CommandTask.expected_outputs', index=1,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timeouts', full_name='google.devtools.remoteworkers.v1test2.CommandTask.timeouts', index=2,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMMANDTASK_INPUTS, _COMMANDTASK_OUTPUTS, _COMMANDTASK_TIMEOUTS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=179,
  serialized_end=1028,
)


_COMMANDOUTPUTS = _descriptor.Descriptor(
  name='CommandOutputs',
  full_name='google.devtools.remoteworkers.v1test2.CommandOutputs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='exit_code', full_name='google.devtools.remoteworkers.v1test2.CommandOutputs.exit_code', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='outputs', full_name='google.devtools.remoteworkers.v1test2.CommandOutputs.outputs', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1030,
  serialized_end=1129,
)


_COMMANDOVERHEAD = _descriptor.Descriptor(
  name='CommandOverhead',
  full_name='google.devtools.remoteworkers.v1test2.CommandOverhead',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='duration', full_name='google.devtools.remoteworkers.v1test2.CommandOverhead.duration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='overhead', full_name='google.devtools.remoteworkers.v1test2.CommandOverhead.overhead', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1131,
  serialized_end=1238,
)


_COMMANDRESULT = _descriptor.Descriptor(
  name='CommandResult',
  full_name='google.devtools.remoteworkers.v1test2.CommandResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='google.devtools.remoteworkers.v1test2.CommandResult.status', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exit_code', full_name='google.devtools.remoteworkers.v1test2.CommandResult.exit_code', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='outputs', full_name='google.devtools.remoteworkers.v1test2.CommandResult.outputs', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='duration', full_name='google.devtools.remoteworkers.v1test2.CommandResult.duration', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='overhead', full_name='google.devtools.remoteworkers.v1test2.CommandResult.overhead', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.devtools.remoteworkers.v1test2.CommandResult.metadata', index=5,
      number=6, type=11, cpp_type=10, label=3,
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
  serialized_start=1241,
  serialized_end=1513,
)


_FILEMETADATA = _descriptor.Descriptor(
  name='FileMetadata',
  full_name='google.devtools.remoteworkers.v1test2.FileMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='path', full_name='google.devtools.remoteworkers.v1test2.FileMetadata.path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='digest', full_name='google.devtools.remoteworkers.v1test2.FileMetadata.digest', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contents', full_name='google.devtools.remoteworkers.v1test2.FileMetadata.contents', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_executable', full_name='google.devtools.remoteworkers.v1test2.FileMetadata.is_executable', index=3,
      number=4, type=8, cpp_type=7, label=1,
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
  ],
  serialized_start=1516,
  serialized_end=1648,
)


_DIRECTORYMETADATA = _descriptor.Descriptor(
  name='DirectoryMetadata',
  full_name='google.devtools.remoteworkers.v1test2.DirectoryMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='path', full_name='google.devtools.remoteworkers.v1test2.DirectoryMetadata.path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='digest', full_name='google.devtools.remoteworkers.v1test2.DirectoryMetadata.digest', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1650,
  serialized_end=1746,
)


_DIGEST = _descriptor.Descriptor(
  name='Digest',
  full_name='google.devtools.remoteworkers.v1test2.Digest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='hash', full_name='google.devtools.remoteworkers.v1test2.Digest.hash', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_bytes', full_name='google.devtools.remoteworkers.v1test2.Digest.size_bytes', index=1,
      number=2, type=3, cpp_type=2, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1748,
  serialized_end=1790,
)


_BLOB = _descriptor.Descriptor(
  name='Blob',
  full_name='google.devtools.remoteworkers.v1test2.Blob',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='digest', full_name='google.devtools.remoteworkers.v1test2.Blob.digest', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contents', full_name='google.devtools.remoteworkers.v1test2.Blob.contents', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=1792,
  serialized_end=1879,
)


_DIRECTORY = _descriptor.Descriptor(
  name='Directory',
  full_name='google.devtools.remoteworkers.v1test2.Directory',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='files', full_name='google.devtools.remoteworkers.v1test2.Directory.files', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='directories', full_name='google.devtools.remoteworkers.v1test2.Directory.directories', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_start=1882,
  serialized_end=2040,
)

_COMMANDTASK_INPUTS_ENVIRONMENTVARIABLE.containing_type = _COMMANDTASK_INPUTS
_COMMANDTASK_INPUTS.fields_by_name['files'].message_type = _DIGEST
_COMMANDTASK_INPUTS.fields_by_name['inline_blobs'].message_type = _BLOB
_COMMANDTASK_INPUTS.fields_by_name['environment_variables'].message_type = _COMMANDTASK_INPUTS_ENVIRONMENTVARIABLE
_COMMANDTASK_INPUTS.containing_type = _COMMANDTASK
_COMMANDTASK_OUTPUTS.containing_type = _COMMANDTASK
_COMMANDTASK_TIMEOUTS.fields_by_name['execution'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDTASK_TIMEOUTS.fields_by_name['idle'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDTASK_TIMEOUTS.fields_by_name['shutdown'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDTASK_TIMEOUTS.containing_type = _COMMANDTASK
_COMMANDTASK.fields_by_name['inputs'].message_type = _COMMANDTASK_INPUTS
_COMMANDTASK.fields_by_name['expected_outputs'].message_type = _COMMANDTASK_OUTPUTS
_COMMANDTASK.fields_by_name['timeouts'].message_type = _COMMANDTASK_TIMEOUTS
_COMMANDOUTPUTS.fields_by_name['outputs'].message_type = _DIGEST
_COMMANDOVERHEAD.fields_by_name['duration'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDOVERHEAD.fields_by_name['overhead'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDRESULT.fields_by_name['status'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_COMMANDRESULT.fields_by_name['outputs'].message_type = _DIGEST
_COMMANDRESULT.fields_by_name['duration'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDRESULT.fields_by_name['overhead'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMANDRESULT.fields_by_name['metadata'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_FILEMETADATA.fields_by_name['digest'].message_type = _DIGEST
_DIRECTORYMETADATA.fields_by_name['digest'].message_type = _DIGEST
_BLOB.fields_by_name['digest'].message_type = _DIGEST
_DIRECTORY.fields_by_name['files'].message_type = _FILEMETADATA
_DIRECTORY.fields_by_name['directories'].message_type = _DIRECTORYMETADATA
DESCRIPTOR.message_types_by_name['CommandTask'] = _COMMANDTASK
DESCRIPTOR.message_types_by_name['CommandOutputs'] = _COMMANDOUTPUTS
DESCRIPTOR.message_types_by_name['CommandOverhead'] = _COMMANDOVERHEAD
DESCRIPTOR.message_types_by_name['CommandResult'] = _COMMANDRESULT
DESCRIPTOR.message_types_by_name['FileMetadata'] = _FILEMETADATA
DESCRIPTOR.message_types_by_name['DirectoryMetadata'] = _DIRECTORYMETADATA
DESCRIPTOR.message_types_by_name['Digest'] = _DIGEST
DESCRIPTOR.message_types_by_name['Blob'] = _BLOB
DESCRIPTOR.message_types_by_name['Directory'] = _DIRECTORY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CommandTask = _reflection.GeneratedProtocolMessageType('CommandTask', (_message.Message,), {

  'Inputs' : _reflection.GeneratedProtocolMessageType('Inputs', (_message.Message,), {

    'EnvironmentVariable' : _reflection.GeneratedProtocolMessageType('EnvironmentVariable', (_message.Message,), {
      'DESCRIPTOR' : _COMMANDTASK_INPUTS_ENVIRONMENTVARIABLE,
      '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
      # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable)
      })
    ,
    'DESCRIPTOR' : _COMMANDTASK_INPUTS,
    '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
    # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandTask.Inputs)
    })
  ,

  'Outputs' : _reflection.GeneratedProtocolMessageType('Outputs', (_message.Message,), {
    'DESCRIPTOR' : _COMMANDTASK_OUTPUTS,
    '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
    # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandTask.Outputs)
    })
  ,

  'Timeouts' : _reflection.GeneratedProtocolMessageType('Timeouts', (_message.Message,), {
    'DESCRIPTOR' : _COMMANDTASK_TIMEOUTS,
    '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
    # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandTask.Timeouts)
    })
  ,
  'DESCRIPTOR' : _COMMANDTASK,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandTask)
  })
_sym_db.RegisterMessage(CommandTask)
_sym_db.RegisterMessage(CommandTask.Inputs)
_sym_db.RegisterMessage(CommandTask.Inputs.EnvironmentVariable)
_sym_db.RegisterMessage(CommandTask.Outputs)
_sym_db.RegisterMessage(CommandTask.Timeouts)

CommandOutputs = _reflection.GeneratedProtocolMessageType('CommandOutputs', (_message.Message,), {
  'DESCRIPTOR' : _COMMANDOUTPUTS,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandOutputs)
  })
_sym_db.RegisterMessage(CommandOutputs)

CommandOverhead = _reflection.GeneratedProtocolMessageType('CommandOverhead', (_message.Message,), {
  'DESCRIPTOR' : _COMMANDOVERHEAD,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandOverhead)
  })
_sym_db.RegisterMessage(CommandOverhead)

CommandResult = _reflection.GeneratedProtocolMessageType('CommandResult', (_message.Message,), {
  'DESCRIPTOR' : _COMMANDRESULT,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.CommandResult)
  })
_sym_db.RegisterMessage(CommandResult)

FileMetadata = _reflection.GeneratedProtocolMessageType('FileMetadata', (_message.Message,), {
  'DESCRIPTOR' : _FILEMETADATA,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.FileMetadata)
  })
_sym_db.RegisterMessage(FileMetadata)

DirectoryMetadata = _reflection.GeneratedProtocolMessageType('DirectoryMetadata', (_message.Message,), {
  'DESCRIPTOR' : _DIRECTORYMETADATA,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.DirectoryMetadata)
  })
_sym_db.RegisterMessage(DirectoryMetadata)

Digest = _reflection.GeneratedProtocolMessageType('Digest', (_message.Message,), {
  'DESCRIPTOR' : _DIGEST,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.Digest)
  })
_sym_db.RegisterMessage(Digest)

Blob = _reflection.GeneratedProtocolMessageType('Blob', (_message.Message,), {
  'DESCRIPTOR' : _BLOB,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.Blob)
  })
_sym_db.RegisterMessage(Blob)

Directory = _reflection.GeneratedProtocolMessageType('Directory', (_message.Message,), {
  'DESCRIPTOR' : _DIRECTORY,
  '__module__' : 'google.devtools.remoteworkers.v1test2.command_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.remoteworkers.v1test2.Directory)
  })
_sym_db.RegisterMessage(Directory)


DESCRIPTOR._options = None
_COMMANDRESULT.fields_by_name['duration']._options = None
_COMMANDRESULT.fields_by_name['overhead']._options = None
# @@protoc_insertion_point(module_scope)
