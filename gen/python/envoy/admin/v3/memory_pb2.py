# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/admin/v3/memory.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x65nvoy/admin/v3/memory.proto\x12\x0e\x65nvoy.admin.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\xbd\x01\n\x06Memory\x12\x11\n\tallocated\x18\x01 \x01(\x04\x12\x11\n\theap_size\x18\x02 \x01(\x04\x12\x19\n\x11pageheap_unmapped\x18\x03 \x01(\x04\x12\x15\n\rpageheap_free\x18\x04 \x01(\x04\x12\x1a\n\x12total_thread_cache\x18\x05 \x01(\x04\x12\x1c\n\x14total_physical_bytes\x18\x06 \x01(\x04:!\x9a\xc5\x88\x1e\x1c\n\x1a\x65nvoy.admin.v2alpha.MemoryBt\n\x1cio.envoyproxy.envoy.admin.v3B\x0bMemoryProtoP\x01Z=github.com/envoyproxy/go-control-plane/envoy/admin/v3;adminv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.admin.v3.memory_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034io.envoyproxy.envoy.admin.v3B\013MemoryProtoP\001Z=github.com/envoyproxy/go-control-plane/envoy/admin/v3;adminv3\272\200\310\321\006\002\020\002'
  _MEMORY._options = None
  _MEMORY._serialized_options = b'\232\305\210\036\034\n\032envoy.admin.v2alpha.Memory'
  _MEMORY._serialized_start=114
  _MEMORY._serialized_end=303
# @@protoc_insertion_point(module_scope)
