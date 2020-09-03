# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.devtools.containeranalysis.v1beta1.source import source_pb2 as google_dot_devtools_dot_containeranalysis_dot_v1beta1_dot_source_dot_source__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/containeranalysis/v1beta1/provenance/provenance.proto',
  package='grafeas.v1beta1.provenance',
  syntax='proto3',
  serialized_options=b'\n\035io.grafeas.v1beta1.provenanceP\001Z^google.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/provenance;provenance\242\002\003GRA',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/devtools/containeranalysis/v1beta1/provenance/provenance.proto\x12\x1agrafeas.v1beta1.provenance\x1a=google/devtools/containeranalysis/v1beta1/source/source.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd0\x04\n\x0f\x42uildProvenance\x12\n\n\x02id\x18\x01 \x01(\t\x12\x12\n\nproject_id\x18\x02 \x01(\t\x12\x35\n\x08\x63ommands\x18\x03 \x03(\x0b\x32#.grafeas.v1beta1.provenance.Command\x12=\n\x0f\x62uilt_artifacts\x18\x04 \x03(\x0b\x32$.grafeas.v1beta1.provenance.Artifact\x12/\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12.\n\nstart_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0f\n\x07\x63reator\x18\x08 \x01(\t\x12\x10\n\x08logs_uri\x18\t \x01(\t\x12=\n\x11source_provenance\x18\n \x01(\x0b\x32\".grafeas.v1beta1.provenance.Source\x12\x12\n\ntrigger_id\x18\x0b \x01(\t\x12T\n\rbuild_options\x18\x0c \x03(\x0b\x32=.grafeas.v1beta1.provenance.BuildProvenance.BuildOptionsEntry\x12\x17\n\x0f\x62uilder_version\x18\r \x01(\t\x1a\x33\n\x11\x42uildOptionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xcd\x02\n\x06Source\x12#\n\x1b\x61rtifact_storage_source_uri\x18\x01 \x01(\t\x12G\n\x0b\x66ile_hashes\x18\x02 \x03(\x0b\x32\x32.grafeas.v1beta1.provenance.Source.FileHashesEntry\x12\x36\n\x07\x63ontext\x18\x03 \x01(\x0b\x32%.grafeas.v1beta1.source.SourceContext\x12\x42\n\x13\x61\x64\x64itional_contexts\x18\x04 \x03(\x0b\x32%.grafeas.v1beta1.source.SourceContext\x1aY\n\x0f\x46ileHashesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x35\n\x05value\x18\x02 \x01(\x0b\x32&.grafeas.v1beta1.provenance.FileHashes:\x02\x38\x01\"A\n\nFileHashes\x12\x33\n\tfile_hash\x18\x01 \x03(\x0b\x32 .grafeas.v1beta1.provenance.Hash\"\x81\x01\n\x04Hash\x12\x37\n\x04type\x18\x01 \x01(\x0e\x32).grafeas.v1beta1.provenance.Hash.HashType\x12\r\n\x05value\x18\x02 \x01(\x0c\"1\n\x08HashType\x12\x19\n\x15HASH_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06SHA256\x10\x01\"]\n\x07\x43ommand\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0b\n\x03\x65nv\x18\x02 \x03(\t\x12\x0c\n\x04\x61rgs\x18\x03 \x03(\t\x12\x0b\n\x03\x64ir\x18\x04 \x01(\t\x12\n\n\x02id\x18\x05 \x01(\t\x12\x10\n\x08wait_for\x18\x06 \x03(\t\"7\n\x08\x41rtifact\x12\x10\n\x08\x63hecksum\x18\x01 \x01(\t\x12\n\n\x02id\x18\x02 \x01(\t\x12\r\n\x05names\x18\x03 \x03(\tB\x87\x01\n\x1dio.grafeas.v1beta1.provenanceP\x01Z^google.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/provenance;provenance\xa2\x02\x03GRAb\x06proto3'
  ,
  dependencies=[google_dot_devtools_dot_containeranalysis_dot_v1beta1_dot_source_dot_source__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])



_HASH_HASHTYPE = _descriptor.EnumDescriptor(
  name='HashType',
  full_name='grafeas.v1beta1.provenance.Hash.HashType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HASH_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SHA256', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1276,
  serialized_end=1325,
)
_sym_db.RegisterEnumDescriptor(_HASH_HASHTYPE)


_BUILDPROVENANCE_BUILDOPTIONSENTRY = _descriptor.Descriptor(
  name='BuildOptionsEntry',
  full_name='grafeas.v1beta1.provenance.BuildProvenance.BuildOptionsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='grafeas.v1beta1.provenance.BuildProvenance.BuildOptionsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='grafeas.v1beta1.provenance.BuildProvenance.BuildOptionsEntry.value', index=1,
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
  serialized_start=739,
  serialized_end=790,
)

_BUILDPROVENANCE = _descriptor.Descriptor(
  name='BuildProvenance',
  full_name='grafeas.v1beta1.provenance.BuildProvenance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='grafeas.v1beta1.provenance.BuildProvenance.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project_id', full_name='grafeas.v1beta1.provenance.BuildProvenance.project_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='commands', full_name='grafeas.v1beta1.provenance.BuildProvenance.commands', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='built_artifacts', full_name='grafeas.v1beta1.provenance.BuildProvenance.built_artifacts', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='grafeas.v1beta1.provenance.BuildProvenance.create_time', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_time', full_name='grafeas.v1beta1.provenance.BuildProvenance.start_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='grafeas.v1beta1.provenance.BuildProvenance.end_time', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='creator', full_name='grafeas.v1beta1.provenance.BuildProvenance.creator', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='logs_uri', full_name='grafeas.v1beta1.provenance.BuildProvenance.logs_uri', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_provenance', full_name='grafeas.v1beta1.provenance.BuildProvenance.source_provenance', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trigger_id', full_name='grafeas.v1beta1.provenance.BuildProvenance.trigger_id', index=10,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='build_options', full_name='grafeas.v1beta1.provenance.BuildProvenance.build_options', index=11,
      number=12, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='builder_version', full_name='grafeas.v1beta1.provenance.BuildProvenance.builder_version', index=12,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_BUILDPROVENANCE_BUILDOPTIONSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=198,
  serialized_end=790,
)


_SOURCE_FILEHASHESENTRY = _descriptor.Descriptor(
  name='FileHashesEntry',
  full_name='grafeas.v1beta1.provenance.Source.FileHashesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='grafeas.v1beta1.provenance.Source.FileHashesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='grafeas.v1beta1.provenance.Source.FileHashesEntry.value', index=1,
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
  serialized_start=1037,
  serialized_end=1126,
)

_SOURCE = _descriptor.Descriptor(
  name='Source',
  full_name='grafeas.v1beta1.provenance.Source',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='artifact_storage_source_uri', full_name='grafeas.v1beta1.provenance.Source.artifact_storage_source_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='file_hashes', full_name='grafeas.v1beta1.provenance.Source.file_hashes', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='context', full_name='grafeas.v1beta1.provenance.Source.context', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='additional_contexts', full_name='grafeas.v1beta1.provenance.Source.additional_contexts', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_SOURCE_FILEHASHESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=793,
  serialized_end=1126,
)


_FILEHASHES = _descriptor.Descriptor(
  name='FileHashes',
  full_name='grafeas.v1beta1.provenance.FileHashes',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='file_hash', full_name='grafeas.v1beta1.provenance.FileHashes.file_hash', index=0,
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
  serialized_start=1128,
  serialized_end=1193,
)


_HASH = _descriptor.Descriptor(
  name='Hash',
  full_name='grafeas.v1beta1.provenance.Hash',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='grafeas.v1beta1.provenance.Hash.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='grafeas.v1beta1.provenance.Hash.value', index=1,
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
    _HASH_HASHTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1196,
  serialized_end=1325,
)


_COMMAND = _descriptor.Descriptor(
  name='Command',
  full_name='grafeas.v1beta1.provenance.Command',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='grafeas.v1beta1.provenance.Command.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='env', full_name='grafeas.v1beta1.provenance.Command.env', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='args', full_name='grafeas.v1beta1.provenance.Command.args', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dir', full_name='grafeas.v1beta1.provenance.Command.dir', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='grafeas.v1beta1.provenance.Command.id', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='wait_for', full_name='grafeas.v1beta1.provenance.Command.wait_for', index=5,
      number=6, type=9, cpp_type=9, label=3,
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
  serialized_start=1327,
  serialized_end=1420,
)


_ARTIFACT = _descriptor.Descriptor(
  name='Artifact',
  full_name='grafeas.v1beta1.provenance.Artifact',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='checksum', full_name='grafeas.v1beta1.provenance.Artifact.checksum', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='grafeas.v1beta1.provenance.Artifact.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='names', full_name='grafeas.v1beta1.provenance.Artifact.names', index=2,
      number=3, type=9, cpp_type=9, label=3,
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
  serialized_start=1422,
  serialized_end=1477,
)

_BUILDPROVENANCE_BUILDOPTIONSENTRY.containing_type = _BUILDPROVENANCE
_BUILDPROVENANCE.fields_by_name['commands'].message_type = _COMMAND
_BUILDPROVENANCE.fields_by_name['built_artifacts'].message_type = _ARTIFACT
_BUILDPROVENANCE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUILDPROVENANCE.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUILDPROVENANCE.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUILDPROVENANCE.fields_by_name['source_provenance'].message_type = _SOURCE
_BUILDPROVENANCE.fields_by_name['build_options'].message_type = _BUILDPROVENANCE_BUILDOPTIONSENTRY
_SOURCE_FILEHASHESENTRY.fields_by_name['value'].message_type = _FILEHASHES
_SOURCE_FILEHASHESENTRY.containing_type = _SOURCE
_SOURCE.fields_by_name['file_hashes'].message_type = _SOURCE_FILEHASHESENTRY
_SOURCE.fields_by_name['context'].message_type = google_dot_devtools_dot_containeranalysis_dot_v1beta1_dot_source_dot_source__pb2._SOURCECONTEXT
_SOURCE.fields_by_name['additional_contexts'].message_type = google_dot_devtools_dot_containeranalysis_dot_v1beta1_dot_source_dot_source__pb2._SOURCECONTEXT
_FILEHASHES.fields_by_name['file_hash'].message_type = _HASH
_HASH.fields_by_name['type'].enum_type = _HASH_HASHTYPE
_HASH_HASHTYPE.containing_type = _HASH
DESCRIPTOR.message_types_by_name['BuildProvenance'] = _BUILDPROVENANCE
DESCRIPTOR.message_types_by_name['Source'] = _SOURCE
DESCRIPTOR.message_types_by_name['FileHashes'] = _FILEHASHES
DESCRIPTOR.message_types_by_name['Hash'] = _HASH
DESCRIPTOR.message_types_by_name['Command'] = _COMMAND
DESCRIPTOR.message_types_by_name['Artifact'] = _ARTIFACT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BuildProvenance = _reflection.GeneratedProtocolMessageType('BuildProvenance', (_message.Message,), {

  'BuildOptionsEntry' : _reflection.GeneratedProtocolMessageType('BuildOptionsEntry', (_message.Message,), {
    'DESCRIPTOR' : _BUILDPROVENANCE_BUILDOPTIONSENTRY,
    '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
    # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.BuildProvenance.BuildOptionsEntry)
    })
  ,
  'DESCRIPTOR' : _BUILDPROVENANCE,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.BuildProvenance)
  })
_sym_db.RegisterMessage(BuildProvenance)
_sym_db.RegisterMessage(BuildProvenance.BuildOptionsEntry)

Source = _reflection.GeneratedProtocolMessageType('Source', (_message.Message,), {

  'FileHashesEntry' : _reflection.GeneratedProtocolMessageType('FileHashesEntry', (_message.Message,), {
    'DESCRIPTOR' : _SOURCE_FILEHASHESENTRY,
    '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
    # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Source.FileHashesEntry)
    })
  ,
  'DESCRIPTOR' : _SOURCE,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Source)
  })
_sym_db.RegisterMessage(Source)
_sym_db.RegisterMessage(Source.FileHashesEntry)

FileHashes = _reflection.GeneratedProtocolMessageType('FileHashes', (_message.Message,), {
  'DESCRIPTOR' : _FILEHASHES,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.FileHashes)
  })
_sym_db.RegisterMessage(FileHashes)

Hash = _reflection.GeneratedProtocolMessageType('Hash', (_message.Message,), {
  'DESCRIPTOR' : _HASH,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Hash)
  })
_sym_db.RegisterMessage(Hash)

Command = _reflection.GeneratedProtocolMessageType('Command', (_message.Message,), {
  'DESCRIPTOR' : _COMMAND,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Command)
  })
_sym_db.RegisterMessage(Command)

Artifact = _reflection.GeneratedProtocolMessageType('Artifact', (_message.Message,), {
  'DESCRIPTOR' : _ARTIFACT,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.provenance.provenance_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Artifact)
  })
_sym_db.RegisterMessage(Artifact)


DESCRIPTOR._options = None
_BUILDPROVENANCE_BUILDOPTIONSENTRY._options = None
_SOURCE_FILEHASHESENTRY._options = None
# @@protoc_insertion_point(module_scope)
