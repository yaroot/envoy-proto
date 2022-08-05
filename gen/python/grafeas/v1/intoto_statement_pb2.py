# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/intoto_statement.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from grafeas.v1 import intoto_provenance_pb2 as grafeas_dot_v1_dot_intoto__provenance__pb2
from grafeas.v1 import slsa_provenance_pb2 as grafeas_dot_v1_dot_slsa__provenance__pb2
from grafeas.v1 import slsa_provenance_zero_two_pb2 as grafeas_dot_v1_dot_slsa__provenance__zero__two__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!grafeas/v1/intoto_statement.proto\x12\ngrafeas.v1\x1a\"grafeas/v1/intoto_provenance.proto\x1a grafeas/v1/slsa_provenance.proto\x1a)grafeas/v1/slsa_provenance_zero_two.proto\"\xa3\x02\n\x0fInTotoStatement\x12\x13\n\x04type\x18\x01 \x01(\tR\x05_type\x12$\n\x07subject\x18\x02 \x03(\x0b\x32\x13.grafeas.v1.Subject\x12\x16\n\x0epredicate_type\x18\x03 \x01(\t\x12\x32\n\nprovenance\x18\x04 \x01(\x0b\x32\x1c.grafeas.v1.InTotoProvenanceH\x00\x12\x35\n\x0fslsa_provenance\x18\x05 \x01(\x0b\x32\x1a.grafeas.v1.SlsaProvenanceH\x00\x12\x45\n\x18slsa_provenance_zero_two\x18\x06 \x01(\x0b\x32!.grafeas.v1.SlsaProvenanceZeroTwoH\x00\x42\x0b\n\tpredicate\"w\n\x07Subject\x12\x0c\n\x04name\x18\x01 \x01(\t\x12/\n\x06\x64igest\x18\x02 \x03(\x0b\x32\x1f.grafeas.v1.Subject.DigestEntry\x1a-\n\x0b\x44igestEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42g\n\rio.grafeas.v1B\x14InTotoStatementProtoP\x01Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'grafeas.v1.intoto_statement_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rio.grafeas.v1B\024InTotoStatementProtoP\001Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\242\002\003GRA'
  _SUBJECT_DIGESTENTRY._options = None
  _SUBJECT_DIGESTENTRY._serialized_options = b'8\001'
  _INTOTOSTATEMENT._serialized_start=163
  _INTOTOSTATEMENT._serialized_end=454
  _SUBJECT._serialized_start=456
  _SUBJECT._serialized_end=575
  _SUBJECT_DIGESTENTRY._serialized_start=530
  _SUBJECT_DIGESTENTRY._serialized_end=575
# @@protoc_insertion_point(module_scope)
