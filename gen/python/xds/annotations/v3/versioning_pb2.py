# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xds/annotations/v3/versioning.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import descriptor_pb2 as google_dot_protobuf_dot_descriptor__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#xds/annotations/v3/versioning.proto\x12\x12xds.annotations.v3\x1a google/protobuf/descriptor.proto\"5\n\x14VersioningAnnotation\x12\x1d\n\x15previous_message_type\x18\x01 \x01(\t:`\n\nversioning\x12\x1f.google.protobuf.MessageOptions\x18\x93\xfd\x86, \x01(\x0b\x32(.xds.annotations.v3.VersioningAnnotationB+Z)github.com/cncf/xds/go/xds/annotations/v3b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'xds.annotations.v3.versioning_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:
  google_dot_protobuf_dot_descriptor__pb2.MessageOptions.RegisterExtension(versioning)

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z)github.com/cncf/xds/go/xds/annotations/v3'
  _VERSIONINGANNOTATION._serialized_start=93
  _VERSIONINGANNOTATION._serialized_end=146
# @@protoc_insertion_point(module_scope)
