# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/gzip/v4alpha/gzip.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.extensions.filters.http.compressor.v4alpha import compressor_pb2 as envoy_dot_extensions_dot_filters_dot_http_dot_compressor_dot_v4alpha_dot_compressor__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/gzip/v4alpha/gzip.proto',
  package='envoy.extensions.filters.http.gzip.v4alpha',
  syntax='proto3',
  serialized_options=b'\n8io.envoyproxy.envoy.extensions.filters.http.gzip.v4alphaB\tGzipProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5envoy/extensions/filters/http/gzip/v4alpha/gzip.proto\x12*envoy.extensions.filters.http.gzip.v4alpha\x1a\x41\x65nvoy/extensions/filters/http/compressor/v4alpha/compressor.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xdb\x06\n\x04Gzip\x12=\n\x0cmemory_level\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\t\xfa\x42\x06*\x04\x18\t(\x01\x12k\n\x11\x63ompression_level\x18\x03 \x01(\x0e\x32\x46.envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionLevel.EnumB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12l\n\x14\x63ompression_strategy\x18\x04 \x01(\x0e\x32\x44.envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionStrategyB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12<\n\x0bwindow_bits\x18\t \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\t\xfa\x42\x06*\x04\x18\x0f(\t\x12P\n\ncompressor\x18\n \x01(\x0b\x32<.envoy.extensions.filters.http.compressor.v4alpha.Compressor\x12>\n\nchunk_size\x18\x0b \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x0c\xfa\x42\t*\x07\x18\x80\x80\x04(\x80 \x1a\x80\x01\n\x10\x43ompressionLevel\"(\n\x04\x45num\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\x08\n\x04\x42\x45ST\x10\x01\x12\t\n\x05SPEED\x10\x02:B\x9a\xc5\x88\x1e=\n;envoy.extensions.filters.http.gzip.v3.Gzip.CompressionLevel\"F\n\x13\x43ompressionStrategy\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\x0c\n\x08\x46ILTERED\x10\x01\x12\x0b\n\x07HUFFMAN\x10\x02\x12\x07\n\x03RLE\x10\x03:1\x9a\xc5\x88\x1e,\n*envoy.extensions.filters.http.gzip.v3.GzipJ\x04\x08\x02\x10\x03J\x04\x08\x06\x10\x07J\x04\x08\x07\x10\x08J\x04\x08\x08\x10\tR\x0e\x63ontent_lengthR\x0c\x63ontent_typeR\x16\x64isable_on_etag_headerR\x1dremove_accept_encoding_headerBO\n8io.envoyproxy.envoy.extensions.filters.http.gzip.v4alphaB\tGzipProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_extensions_dot_filters_dot_http_dot_compressor_dot_v4alpha_dot_compressor__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_GZIP_COMPRESSIONLEVEL_ENUM = _descriptor.EnumDescriptor(
  name='Enum',
  full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionLevel.Enum',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DEFAULT', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BEST', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SPEED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=811,
  serialized_end=851,
)
_sym_db.RegisterEnumDescriptor(_GZIP_COMPRESSIONLEVEL_ENUM)

_GZIP_COMPRESSIONSTRATEGY = _descriptor.EnumDescriptor(
  name='CompressionStrategy',
  full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionStrategy',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DEFAULT', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FILTERED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HUFFMAN', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RLE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=921,
  serialized_end=991,
)
_sym_db.RegisterEnumDescriptor(_GZIP_COMPRESSIONSTRATEGY)


_GZIP_COMPRESSIONLEVEL = _descriptor.Descriptor(
  name='CompressionLevel',
  full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionLevel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _GZIP_COMPRESSIONLEVEL_ENUM,
  ],
  serialized_options=b'\232\305\210\036=\n;envoy.extensions.filters.http.gzip.v3.Gzip.CompressionLevel',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=791,
  serialized_end=919,
)

_GZIP = _descriptor.Descriptor(
  name='Gzip',
  full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='memory_level', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.memory_level', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\030\t(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='compression_level', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.compression_level', index=1,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='compression_strategy', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.compression_strategy', index=2,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='window_bits', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.window_bits', index=3,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\030\017(\t', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='compressor', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.compressor', index=4,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='chunk_size', full_name='envoy.extensions.filters.http.gzip.v4alpha.Gzip.chunk_size', index=5,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\t*\007\030\200\200\004(\200 ', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_GZIP_COMPRESSIONLEVEL, ],
  enum_types=[
    _GZIP_COMPRESSIONSTRATEGY,
  ],
  serialized_options=b'\232\305\210\036,\n*envoy.extensions.filters.http.gzip.v3.Gzip',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=292,
  serialized_end=1151,
)

_GZIP_COMPRESSIONLEVEL.containing_type = _GZIP
_GZIP_COMPRESSIONLEVEL_ENUM.containing_type = _GZIP_COMPRESSIONLEVEL
_GZIP.fields_by_name['memory_level'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_GZIP.fields_by_name['compression_level'].enum_type = _GZIP_COMPRESSIONLEVEL_ENUM
_GZIP.fields_by_name['compression_strategy'].enum_type = _GZIP_COMPRESSIONSTRATEGY
_GZIP.fields_by_name['window_bits'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_GZIP.fields_by_name['compressor'].message_type = envoy_dot_extensions_dot_filters_dot_http_dot_compressor_dot_v4alpha_dot_compressor__pb2._COMPRESSOR
_GZIP.fields_by_name['chunk_size'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_GZIP_COMPRESSIONSTRATEGY.containing_type = _GZIP
DESCRIPTOR.message_types_by_name['Gzip'] = _GZIP
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Gzip = _reflection.GeneratedProtocolMessageType('Gzip', (_message.Message,), {

  'CompressionLevel' : _reflection.GeneratedProtocolMessageType('CompressionLevel', (_message.Message,), {
    'DESCRIPTOR' : _GZIP_COMPRESSIONLEVEL,
    '__module__' : 'envoy.extensions.filters.http.gzip.v4alpha.gzip_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.gzip.v4alpha.Gzip.CompressionLevel)
    })
  ,
  'DESCRIPTOR' : _GZIP,
  '__module__' : 'envoy.extensions.filters.http.gzip.v4alpha.gzip_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.gzip.v4alpha.Gzip)
  })
_sym_db.RegisterMessage(Gzip)
_sym_db.RegisterMessage(Gzip.CompressionLevel)


DESCRIPTOR._options = None
_GZIP_COMPRESSIONLEVEL._options = None
_GZIP.fields_by_name['memory_level']._options = None
_GZIP.fields_by_name['compression_level']._options = None
_GZIP.fields_by_name['compression_strategy']._options = None
_GZIP.fields_by_name['window_bits']._options = None
_GZIP.fields_by_name['chunk_size']._options = None
_GZIP._options = None
# @@protoc_insertion_point(module_scope)
