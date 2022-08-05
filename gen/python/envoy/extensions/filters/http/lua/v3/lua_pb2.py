# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/lua/v3/lua.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.annotations import deprecation_pb2 as envoy_dot_annotations_dot_deprecation__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.envoy/extensions/filters/http/lua/v3/lua.proto\x12$envoy.extensions.filters.http.lua.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a#envoy/annotations/deprecation.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xba\x02\n\x03Lua\x12 \n\x0binline_code\x18\x01 \x01(\tB\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12P\n\x0csource_codes\x18\x02 \x03(\x0b\x32:.envoy.extensions.filters.http.lua.v3.Lua.SourceCodesEntry\x12=\n\x13\x64\x65\x66\x61ult_source_code\x18\x03 \x01(\x0b\x32 .envoy.config.core.v3.DataSource\x1aT\n\x10SourceCodesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12/\n\x05value\x18\x02 \x01(\x0b\x32 .envoy.config.core.v3.DataSource:\x02\x38\x01:*\x9a\xc5\x88\x1e%\n#envoy.config.filter.http.lua.v2.Lua\"\x8d\x01\n\x0bLuaPerRoute\x12\x1b\n\x08\x64isabled\x18\x01 \x01(\x08\x42\x07\xfa\x42\x04j\x02\x08\x01H\x00\x12\x17\n\x04name\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01H\x00\x12\x37\n\x0bsource_code\x18\x03 \x01(\x0b\x32 .envoy.config.core.v3.DataSourceH\x00\x42\x0f\n\x08override\x12\x03\xf8\x42\x01\x42\x9b\x01\n2io.envoyproxy.envoy.extensions.filters.http.lua.v3B\x08LuaProtoP\x01ZQgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/http/lua/v3;luav3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.extensions.filters.http.lua.v3.lua_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n2io.envoyproxy.envoy.extensions.filters.http.lua.v3B\010LuaProtoP\001ZQgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/http/lua/v3;luav3\272\200\310\321\006\002\020\002'
  _LUA_SOURCECODESENTRY._options = None
  _LUA_SOURCECODESENTRY._serialized_options = b'8\001'
  _LUA.fields_by_name['inline_code']._options = None
  _LUA.fields_by_name['inline_code']._serialized_options = b'\030\001\222\307\206\330\004\0033.0'
  _LUA._options = None
  _LUA._serialized_options = b'\232\305\210\036%\n#envoy.config.filter.http.lua.v2.Lua'
  _LUAPERROUTE.oneofs_by_name['override']._options = None
  _LUAPERROUTE.oneofs_by_name['override']._serialized_options = b'\370B\001'
  _LUAPERROUTE.fields_by_name['disabled']._options = None
  _LUAPERROUTE.fields_by_name['disabled']._serialized_options = b'\372B\004j\002\010\001'
  _LUAPERROUTE.fields_by_name['name']._options = None
  _LUAPERROUTE.fields_by_name['name']._serialized_options = b'\372B\004r\002\020\001'
  _LUA._serialized_start=250
  _LUA._serialized_end=564
  _LUA_SOURCECODESENTRY._serialized_start=436
  _LUA_SOURCECODESENTRY._serialized_end=520
  _LUAPERROUTE._serialized_start=567
  _LUAPERROUTE._serialized_end=708
# @@protoc_insertion_point(module_scope)
