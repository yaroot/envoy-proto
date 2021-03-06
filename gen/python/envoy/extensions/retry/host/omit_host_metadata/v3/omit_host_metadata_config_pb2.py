# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/retry/host/omit_host_metadata/v3/omit_host_metadata_config.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/retry/host/omit_host_metadata/v3/omit_host_metadata_config.proto',
  package='envoy.extensions.retry.host.omit_host_metadata.v3',
  syntax='proto3',
  serialized_options=b'\n?io.envoyproxy.envoy.extensions.retry.host.omit_host_metadata.v3B\033OmitHostMetadataConfigProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nQenvoy/extensions/retry/host/omit_host_metadata/v3/omit_host_metadata_config.proto\x12\x31\x65nvoy.extensions.retry.host.omit_host_metadata.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\x98\x01\n\x16OmitHostMetadataConfig\x12\x36\n\x0emetadata_match\x18\x01 \x01(\x0b\x32\x1e.envoy.config.core.v3.Metadata:F\x9a\xc5\x88\x1e\x41\n?envoy.config.retry.omit_host_metadata.v2.OmitHostMetadataConfigBh\n?io.envoyproxy.envoy.extensions.retry.host.omit_host_metadata.v3B\x1bOmitHostMetadataConfigProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_OMITHOSTMETADATACONFIG = _descriptor.Descriptor(
  name='OmitHostMetadataConfig',
  full_name='envoy.extensions.retry.host.omit_host_metadata.v3.OmitHostMetadataConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metadata_match', full_name='envoy.extensions.retry.host.omit_host_metadata.v3.OmitHostMetadataConfig.metadata_match', index=0,
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
  serialized_options=b'\232\305\210\036A\n?envoy.config.retry.omit_host_metadata.v2.OmitHostMetadataConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=236,
  serialized_end=388,
)

_OMITHOSTMETADATACONFIG.fields_by_name['metadata_match'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._METADATA
DESCRIPTOR.message_types_by_name['OmitHostMetadataConfig'] = _OMITHOSTMETADATACONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OmitHostMetadataConfig = _reflection.GeneratedProtocolMessageType('OmitHostMetadataConfig', (_message.Message,), {
  'DESCRIPTOR' : _OMITHOSTMETADATACONFIG,
  '__module__' : 'envoy.extensions.retry.host.omit_host_metadata.v3.omit_host_metadata_config_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.retry.host.omit_host_metadata.v3.OmitHostMetadataConfig)
  })
_sym_db.RegisterMessage(OmitHostMetadataConfig)


DESCRIPTOR._options = None
_OMITHOSTMETADATACONFIG._options = None
# @@protoc_insertion_point(module_scope)
