# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/core/v3/extension.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$envoy/config/core/v3/extension.proto\x12\x14\x65nvoy.config.core.v3\x1a\x19google/protobuf/any.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"c\n\x14TypedExtensionConfig\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x34\n\x0ctyped_config\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyB\x08\xfa\x42\x05\xa2\x01\x02\x08\x01\x42\x82\x01\n\"io.envoyproxy.envoy.config.core.v3B\x0e\x45xtensionProtoP\x01ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.config.core.v3.extension_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"io.envoyproxy.envoy.config.core.v3B\016ExtensionProtoP\001ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\272\200\310\321\006\002\020\002'
  _TYPEDEXTENSIONCONFIG.fields_by_name['name']._options = None
  _TYPEDEXTENSIONCONFIG.fields_by_name['name']._serialized_options = b'\372B\004r\002\020\001'
  _TYPEDEXTENSIONCONFIG.fields_by_name['typed_config']._options = None
  _TYPEDEXTENSIONCONFIG.fields_by_name['typed_config']._serialized_options = b'\372B\005\242\001\002\010\001'
  _TYPEDEXTENSIONCONFIG._serialized_start=145
  _TYPEDEXTENSIONCONFIG._serialized_end=244
# @@protoc_insertion_point(module_scope)
