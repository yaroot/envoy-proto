# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/core/v3/grpc_method_list.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+envoy/config/core/v3/grpc_method_list.proto\x12\x14\x65nvoy.config.core.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xec\x01\n\x0eGrpcMethodList\x12>\n\x08services\x18\x01 \x03(\x0b\x32,.envoy.config.core.v3.GrpcMethodList.Service\x1aq\n\x07Service\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x1e\n\x0cmethod_names\x18\x02 \x03(\tB\x08\xfa\x42\x05\x92\x01\x02\x08\x01:/\x9a\xc5\x88\x1e*\n(envoy.api.v2.core.GrpcMethodList.Service:\'\x9a\xc5\x88\x1e\"\n envoy.api.v2.core.GrpcMethodListB\x87\x01\n\"io.envoyproxy.envoy.config.core.v3B\x13GrpcMethodListProtoP\x01ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.config.core.v3.grpc_method_list_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"io.envoyproxy.envoy.config.core.v3B\023GrpcMethodListProtoP\001ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\272\200\310\321\006\002\020\002'
  _GRPCMETHODLIST_SERVICE.fields_by_name['name']._options = None
  _GRPCMETHODLIST_SERVICE.fields_by_name['name']._serialized_options = b'\372B\004r\002\020\001'
  _GRPCMETHODLIST_SERVICE.fields_by_name['method_names']._options = None
  _GRPCMETHODLIST_SERVICE.fields_by_name['method_names']._serialized_options = b'\372B\005\222\001\002\010\001'
  _GRPCMETHODLIST_SERVICE._options = None
  _GRPCMETHODLIST_SERVICE._serialized_options = b'\232\305\210\036*\n(envoy.api.v2.core.GrpcMethodList.Service'
  _GRPCMETHODLIST._options = None
  _GRPCMETHODLIST._serialized_options = b'\232\305\210\036\"\n envoy.api.v2.core.GrpcMethodList'
  _GRPCMETHODLIST._serialized_start=161
  _GRPCMETHODLIST._serialized_end=397
  _GRPCMETHODLIST_SERVICE._serialized_start=243
  _GRPCMETHODLIST_SERVICE._serialized_end=356
# @@protoc_insertion_point(module_scope)
