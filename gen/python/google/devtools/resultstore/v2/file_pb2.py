# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/file.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/devtools/resultstore/v2/file.proto\x12\x1egoogle.devtools.resultstore.v2\x1a\x1egoogle/protobuf/wrappers.proto\"\xfd\x02\n\x04\x46ile\x12\x0b\n\x03uid\x18\x01 \x01(\t\x12\x0b\n\x03uri\x18\x02 \x01(\t\x12+\n\x06length\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x14\n\x0c\x63ontent_type\x18\x04 \x01(\t\x12\x43\n\rarchive_entry\x18\x05 \x01(\x0b\x32,.google.devtools.resultstore.v2.ArchiveEntry\x12\x16\n\x0e\x63ontent_viewer\x18\x06 \x01(\t\x12\x0e\n\x06hidden\x18\x07 \x01(\x08\x12\x13\n\x0b\x64\x65scription\x18\x08 \x01(\t\x12\x0e\n\x06\x64igest\x18\t \x01(\t\x12@\n\thash_type\x18\n \x01(\x0e\x32-.google.devtools.resultstore.v2.File.HashType\"D\n\x08HashType\x12\x19\n\x15HASH_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03MD5\x10\x01\x12\x08\n\x04SHA1\x10\x02\x12\n\n\x06SHA256\x10\x03\"_\n\x0c\x41rchiveEntry\x12\x0c\n\x04path\x18\x01 \x01(\t\x12+\n\x06length\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x14\n\x0c\x63ontent_type\x18\x03 \x01(\tB|\n\"com.google.devtools.resultstore.v2B\tFileProtoP\x01ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstoreb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.resultstore.v2.file_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.devtools.resultstore.v2B\tFileProtoP\001ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstore'
  _FILE._serialized_start=110
  _FILE._serialized_end=491
  _FILE_HASHTYPE._serialized_start=423
  _FILE_HASHTYPE._serialized_end=491
  _ARCHIVEENTRY._serialized_start=493
  _ARCHIVEENTRY._serialized_end=588
# @@protoc_insertion_point(module_scope)
