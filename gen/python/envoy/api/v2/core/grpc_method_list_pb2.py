# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/api/v2/core/grpc_method_list.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(envoy/api/v2/core/grpc_method_list.proto\x12\x11\x65nvoy.api.v2.core\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\x8f\x01\n\x0eGrpcMethodList\x12;\n\x08services\x18\x01 \x03(\x0b\x32).envoy.api.v2.core.GrpcMethodList.Service\x1a@\n\x07Service\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12\x1e\n\x0cmethod_names\x18\x02 \x03(\tB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x42\x96\x01\n\x1fio.envoyproxy.envoy.api.v2.coreB\x13GrpcMethodListProtoP\x01Z8github.com/envoyproxy/go-control-plane/envoy/api/v2/core\xf2\x98\xfe\x8f\x05\x16\x12\x14\x65nvoy.config.core.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.api.v2.core.grpc_method_list_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037io.envoyproxy.envoy.api.v2.coreB\023GrpcMethodListProtoP\001Z8github.com/envoyproxy/go-control-plane/envoy/api/v2/core\362\230\376\217\005\026\022\024envoy.config.core.v3\272\200\310\321\006\002\020\001'
  _GRPCMETHODLIST_SERVICE.fields_by_name['name']._options = None
  _GRPCMETHODLIST_SERVICE.fields_by_name['name']._serialized_options = b'\372B\004r\002 \001'
  _GRPCMETHODLIST_SERVICE.fields_by_name['method_names']._options = None
  _GRPCMETHODLIST_SERVICE.fields_by_name['method_names']._serialized_options = b'\372B\005\222\001\002\010\001'
  _GRPCMETHODLIST._serialized_start=152
  _GRPCMETHODLIST._serialized_end=295
  _GRPCMETHODLIST_SERVICE._serialized_start=231
  _GRPCMETHODLIST_SERVICE._serialized_end=295
# @@protoc_insertion_point(module_scope)
