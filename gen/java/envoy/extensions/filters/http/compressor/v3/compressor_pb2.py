# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/compressor/v3/compressor.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.config.core.v3 import extension_pb2 as envoy_dot_config_dot_core_dot_v3_dot_extension__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from envoy.annotations import deprecation_pb2 as envoy_dot_annotations_dot_deprecation__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/compressor/v3/compressor.proto',
  package='envoy.extensions.filters.http.compressor.v3',
  syntax='proto3',
  serialized_options=b'\n9io.envoyproxy.envoy.extensions.filters.http.compressor.v3B\017CompressorProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<envoy/extensions/filters/http/compressor/v3/compressor.proto\x12+envoy.extensions.filters.http.compressor.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a$envoy/config/core/v3/extension.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a#envoy/annotations/deprecation.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x83\t\n\nCompressor\x12\x41\n\x0e\x63ontent_length\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12!\n\x0c\x63ontent_type\x18\x02 \x03(\tB\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12+\n\x16\x64isable_on_etag_header\x18\x03 \x01(\x08\x42\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12\x32\n\x1dremove_accept_encoding_header\x18\x04 \x01(\x08\x42\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12N\n\x0fruntime_enabled\x18\x05 \x01(\x0b\x32(.envoy.config.core.v3.RuntimeFeatureFlagB\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x12P\n\x12\x63ompressor_library\x18\x06 \x01(\x0b\x32*.envoy.config.core.v3.TypedExtensionConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12p\n\x18request_direction_config\x18\x07 \x01(\x0b\x32N.envoy.extensions.filters.http.compressor.v3.Compressor.RequestDirectionConfig\x12r\n\x19response_direction_config\x18\x08 \x01(\x0b\x32O.envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig\x1a\xa2\x01\n\x15\x43ommonDirectionConfig\x12\x39\n\x07\x65nabled\x18\x01 \x01(\x0b\x32(.envoy.config.core.v3.RuntimeFeatureFlag\x12\x38\n\x12min_content_length\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12\x14\n\x0c\x63ontent_type\x18\x03 \x03(\t\x1a~\n\x16RequestDirectionConfig\x12\x64\n\rcommon_config\x18\x01 \x01(\x0b\x32M.envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig\x1a\xc6\x01\n\x17ResponseDirectionConfig\x12\x64\n\rcommon_config\x18\x01 \x01(\x0b\x32M.envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig\x12\x1e\n\x16\x64isable_on_etag_header\x18\x02 \x01(\x08\x12%\n\x1dremove_accept_encoding_header\x18\x03 \x01(\x08:8\x9a\xc5\x88\x1e\x33\n1envoy.config.filter.http.compressor.v2.CompressorBV\n9io.envoyproxy.envoy.extensions.filters.http.compressor.v3B\x0f\x43ompressorProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v3_dot_extension__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,envoy_dot_annotations_dot_deprecation__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_COMPRESSOR_COMMONDIRECTIONCONFIG = _descriptor.Descriptor(
  name='CommonDirectionConfig',
  full_name='envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='enabled', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig.enabled', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='min_content_length', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig.min_content_length', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content_type', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig.content_type', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=947,
  serialized_end=1109,
)

_COMPRESSOR_REQUESTDIRECTIONCONFIG = _descriptor.Descriptor(
  name='RequestDirectionConfig',
  full_name='envoy.extensions.filters.http.compressor.v3.Compressor.RequestDirectionConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='common_config', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.RequestDirectionConfig.common_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1111,
  serialized_end=1237,
)

_COMPRESSOR_RESPONSEDIRECTIONCONFIG = _descriptor.Descriptor(
  name='ResponseDirectionConfig',
  full_name='envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='common_config', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig.common_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='disable_on_etag_header', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig.disable_on_etag_header', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove_accept_encoding_header', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig.remove_accept_encoding_header', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1240,
  serialized_end=1438,
)

_COMPRESSOR = _descriptor.Descriptor(
  name='Compressor',
  full_name='envoy.extensions.filters.http.compressor.v3.Compressor',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='content_length', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.content_length', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content_type', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.content_type', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='disable_on_etag_header', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.disable_on_etag_header', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove_accept_encoding_header', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.remove_accept_encoding_header', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='runtime_enabled', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.runtime_enabled', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='compressor_library', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.compressor_library', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_direction_config', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.request_direction_config', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_direction_config', full_name='envoy.extensions.filters.http.compressor.v3.Compressor.response_direction_config', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_COMPRESSOR_COMMONDIRECTIONCONFIG, _COMPRESSOR_REQUESTDIRECTIONCONFIG, _COMPRESSOR_RESPONSEDIRECTIONCONFIG, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\0363\n1envoy.config.filter.http.compressor.v2.Compressor',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=341,
  serialized_end=1496,
)

_COMPRESSOR_COMMONDIRECTIONCONFIG.fields_by_name['enabled'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._RUNTIMEFEATUREFLAG
_COMPRESSOR_COMMONDIRECTIONCONFIG.fields_by_name['min_content_length'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_COMPRESSOR_COMMONDIRECTIONCONFIG.containing_type = _COMPRESSOR
_COMPRESSOR_REQUESTDIRECTIONCONFIG.fields_by_name['common_config'].message_type = _COMPRESSOR_COMMONDIRECTIONCONFIG
_COMPRESSOR_REQUESTDIRECTIONCONFIG.containing_type = _COMPRESSOR
_COMPRESSOR_RESPONSEDIRECTIONCONFIG.fields_by_name['common_config'].message_type = _COMPRESSOR_COMMONDIRECTIONCONFIG
_COMPRESSOR_RESPONSEDIRECTIONCONFIG.containing_type = _COMPRESSOR
_COMPRESSOR.fields_by_name['content_length'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_COMPRESSOR.fields_by_name['runtime_enabled'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._RUNTIMEFEATUREFLAG
_COMPRESSOR.fields_by_name['compressor_library'].message_type = envoy_dot_config_dot_core_dot_v3_dot_extension__pb2._TYPEDEXTENSIONCONFIG
_COMPRESSOR.fields_by_name['request_direction_config'].message_type = _COMPRESSOR_REQUESTDIRECTIONCONFIG
_COMPRESSOR.fields_by_name['response_direction_config'].message_type = _COMPRESSOR_RESPONSEDIRECTIONCONFIG
DESCRIPTOR.message_types_by_name['Compressor'] = _COMPRESSOR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Compressor = _reflection.GeneratedProtocolMessageType('Compressor', (_message.Message,), {

  'CommonDirectionConfig' : _reflection.GeneratedProtocolMessageType('CommonDirectionConfig', (_message.Message,), {
    'DESCRIPTOR' : _COMPRESSOR_COMMONDIRECTIONCONFIG,
    '__module__' : 'envoy.extensions.filters.http.compressor.v3.compressor_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.compressor.v3.Compressor.CommonDirectionConfig)
    })
  ,

  'RequestDirectionConfig' : _reflection.GeneratedProtocolMessageType('RequestDirectionConfig', (_message.Message,), {
    'DESCRIPTOR' : _COMPRESSOR_REQUESTDIRECTIONCONFIG,
    '__module__' : 'envoy.extensions.filters.http.compressor.v3.compressor_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.compressor.v3.Compressor.RequestDirectionConfig)
    })
  ,

  'ResponseDirectionConfig' : _reflection.GeneratedProtocolMessageType('ResponseDirectionConfig', (_message.Message,), {
    'DESCRIPTOR' : _COMPRESSOR_RESPONSEDIRECTIONCONFIG,
    '__module__' : 'envoy.extensions.filters.http.compressor.v3.compressor_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.compressor.v3.Compressor.ResponseDirectionConfig)
    })
  ,
  'DESCRIPTOR' : _COMPRESSOR,
  '__module__' : 'envoy.extensions.filters.http.compressor.v3.compressor_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.compressor.v3.Compressor)
  })
_sym_db.RegisterMessage(Compressor)
_sym_db.RegisterMessage(Compressor.CommonDirectionConfig)
_sym_db.RegisterMessage(Compressor.RequestDirectionConfig)
_sym_db.RegisterMessage(Compressor.ResponseDirectionConfig)


DESCRIPTOR._options = None
_COMPRESSOR.fields_by_name['content_length']._options = None
_COMPRESSOR.fields_by_name['content_type']._options = None
_COMPRESSOR.fields_by_name['disable_on_etag_header']._options = None
_COMPRESSOR.fields_by_name['remove_accept_encoding_header']._options = None
_COMPRESSOR.fields_by_name['runtime_enabled']._options = None
_COMPRESSOR.fields_by_name['compressor_library']._options = None
_COMPRESSOR._options = None
# @@protoc_insertion_point(module_scope)
