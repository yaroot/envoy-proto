# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/attestation.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from grafeas.v1 import common_pb2 as grafeas_dot_v1_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cgrafeas/v1/attestation.proto\x12\ngrafeas.v1\x1a\x17grafeas/v1/common.proto\"f\n\x0f\x41ttestationNote\x12.\n\x04hint\x18\x01 \x01(\x0b\x32 .grafeas.v1.AttestationNote.Hint\x1a#\n\x04Hint\x12\x1b\n\x13human_readable_name\x18\x01 \x01(\t\"\x1a\n\x03Jwt\x12\x13\n\x0b\x63ompact_jwt\x18\x01 \x01(\t\"}\n\x15\x41ttestationOccurrence\x12\x1a\n\x12serialized_payload\x18\x01 \x01(\x0c\x12)\n\nsignatures\x18\x02 \x03(\x0b\x32\x15.grafeas.v1.Signature\x12\x1d\n\x04jwts\x18\x03 \x03(\x0b\x32\x0f.grafeas.v1.JwtBQ\n\rio.grafeas.v1P\x01Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'grafeas.v1.attestation_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rio.grafeas.v1P\001Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\242\002\003GRA'
  _ATTESTATIONNOTE._serialized_start=69
  _ATTESTATIONNOTE._serialized_end=171
  _ATTESTATIONNOTE_HINT._serialized_start=136
  _ATTESTATIONNOTE_HINT._serialized_end=171
  _JWT._serialized_start=173
  _JWT._serialized_end=199
  _ATTESTATIONOCCURRENCE._serialized_start=201
  _ATTESTATIONOCCURRENCE._serialized_end=326
# @@protoc_insertion_point(module_scope)
