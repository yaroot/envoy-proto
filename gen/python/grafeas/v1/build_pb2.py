# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/build.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from grafeas.v1 import intoto_provenance_pb2 as grafeas_dot_v1_dot_intoto__provenance__pb2
from grafeas.v1 import intoto_statement_pb2 as grafeas_dot_v1_dot_intoto__statement__pb2
from grafeas.v1 import provenance_pb2 as grafeas_dot_v1_dot_provenance__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16grafeas/v1/build.proto\x12\ngrafeas.v1\x1a\"grafeas/v1/intoto_provenance.proto\x1a!grafeas/v1/intoto_statement.proto\x1a\x1bgrafeas/v1/provenance.proto\"$\n\tBuildNote\x12\x17\n\x0f\x62uilder_version\x18\x01 \x01(\t\"\xcc\x01\n\x0f\x42uildOccurrence\x12/\n\nprovenance\x18\x01 \x01(\x0b\x32\x1b.grafeas.v1.BuildProvenance\x12\x18\n\x10provenance_bytes\x18\x02 \x01(\t\x12\x37\n\x11intoto_provenance\x18\x03 \x01(\x0b\x32\x1c.grafeas.v1.InTotoProvenance\x12\x35\n\x10intoto_statement\x18\x04 \x01(\x0b\x32\x1b.grafeas.v1.InTotoStatementBQ\n\rio.grafeas.v1P\x01Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'grafeas.v1.build_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rio.grafeas.v1P\001Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\242\002\003GRA'
  _BUILDNOTE._serialized_start=138
  _BUILDNOTE._serialized_end=174
  _BUILDOCCURRENCE._serialized_start=177
  _BUILDOCCURRENCE._serialized_end=381
# @@protoc_insertion_point(module_scope)
