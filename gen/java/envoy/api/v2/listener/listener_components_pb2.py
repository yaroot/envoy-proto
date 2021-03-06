# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/api/v2/listener/listener_components.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.api.v2.auth import tls_pb2 as envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2
from envoy.api.v2.core import address_pb2 as envoy_dot_api_dot_v2_dot_core_dot_address__pb2
from envoy.api.v2.core import base_pb2 as envoy_dot_api_dot_v2_dot_core_dot_base__pb2
try:
  envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2 = envoy_dot_api_dot_v2_dot_core_dot_base__pb2.envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2
except AttributeError:
  envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2 = envoy_dot_api_dot_v2_dot_core_dot_base__pb2.envoy.api.v2.core.socket_option_pb2
from envoy.type import range_pb2 as envoy_dot_type_dot_range__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/api/v2/listener/listener_components.proto',
  package='envoy.api.v2.listener',
  syntax='proto3',
  serialized_options=b'\n#io.envoyproxy.envoy.api.v2.listenerB\027ListenerComponentsProtoP\001\252\002\027Envoy.Api.V2.ListenerNS\352\002\027Envoy.Api.V2.ListenerNS\362\230\376\217\005\032\022\030envoy.config.listener.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/envoy/api/v2/listener/listener_components.proto\x12\x15\x65nvoy.api.v2.listener\x1a\x1b\x65nvoy/api/v2/auth/tls.proto\x1a\x1f\x65nvoy/api/v2/core/address.proto\x1a\x1c\x65nvoy/api/v2/core/base.proto\x1a\x16\x65nvoy/type/range.proto\x1a\x19google/protobuf/any.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\x91\x01\n\x06\x46ilter\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12-\n\x06\x63onfig\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructB\x02\x18\x01H\x00\x12,\n\x0ctyped_config\x18\x04 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00\x42\r\n\x0b\x63onfig_typeJ\x04\x08\x03\x10\x04\"\xc5\x04\n\x10\x46ilterChainMatch\x12\x43\n\x10\x64\x65stination_port\x18\x08 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x0b\xfa\x42\x08*\x06\x18\xff\xff\x03(\x01\x12\x33\n\rprefix_ranges\x18\x03 \x03(\x0b\x32\x1c.envoy.api.v2.core.CidrRange\x12\x16\n\x0e\x61\x64\x64ress_suffix\x18\x04 \x01(\t\x12\x30\n\nsuffix_len\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12[\n\x0bsource_type\x18\x0c \x01(\x0e\x32<.envoy.api.v2.listener.FilterChainMatch.ConnectionSourceTypeB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12:\n\x14source_prefix_ranges\x18\x06 \x03(\x0b\x32\x1c.envoy.api.v2.core.CidrRange\x12&\n\x0csource_ports\x18\x07 \x03(\rB\x10\xfa\x42\r\x92\x01\n\"\x08*\x06\x18\xff\xff\x03(\x01\x12\x14\n\x0cserver_names\x18\x0b \x03(\t\x12\x1a\n\x12transport_protocol\x18\t \x01(\t\x12\x1d\n\x15\x61pplication_protocols\x18\n \x03(\t\"U\n\x14\x43onnectionSourceType\x12\x07\n\x03\x41NY\x10\x00\x12&\n\x05LOCAL\x10\x01\x1a\x1b\xf2\x98\xfe\x8f\x05\x15\n\x13SAME_IP_OR_LOOPBACK\x12\x0c\n\x08\x45XTERNAL\x10\x02J\x04\x08\x01\x10\x02\"\xf4\x02\n\x0b\x46ilterChain\x12\x43\n\x12\x66ilter_chain_match\x18\x01 \x01(\x0b\x32\'.envoy.api.v2.listener.FilterChainMatch\x12@\n\x0btls_context\x18\x02 \x01(\x0b\x32\'.envoy.api.v2.auth.DownstreamTlsContextB\x02\x18\x01\x12.\n\x07\x66ilters\x18\x03 \x03(\x0b\x32\x1d.envoy.api.v2.listener.Filter\x12\x33\n\x0fuse_proxy_proto\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12-\n\x08metadata\x18\x05 \x01(\x0b\x32\x1b.envoy.api.v2.core.Metadata\x12<\n\x10transport_socket\x18\x06 \x01(\x0b\x32\".envoy.api.v2.core.TransportSocket\x12\x0c\n\x04name\x18\x07 \x01(\t\"\xe5\x03\n!ListenerFilterChainMatchPredicate\x12U\n\x08or_match\x18\x01 \x01(\x0b\x32\x41.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSetH\x00\x12V\n\tand_match\x18\x02 \x01(\x0b\x32\x41.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSetH\x00\x12M\n\tnot_match\x18\x03 \x01(\x0b\x32\x38.envoy.api.v2.listener.ListenerFilterChainMatchPredicateH\x00\x12\x1c\n\tany_match\x18\x04 \x01(\x08\x42\x07\xfa\x42\x04j\x02\x08\x01H\x00\x12\x38\n\x16\x64\x65stination_port_range\x18\x05 \x01(\x0b\x32\x16.envoy.type.Int32RangeH\x00\x1a]\n\x08MatchSet\x12Q\n\x05rules\x18\x01 \x03(\x0b\x32\x38.envoy.api.v2.listener.ListenerFilterChainMatchPredicateB\x08\xfa\x42\x05\x92\x01\x02\x08\x02\x42\x0b\n\x04rule\x12\x03\xf8\x42\x01\"\xe6\x01\n\x0eListenerFilter\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12-\n\x06\x63onfig\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructB\x02\x18\x01H\x00\x12,\n\x0ctyped_config\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00\x12Q\n\x0f\x66ilter_disabled\x18\x04 \x01(\x0b\x32\x38.envoy.api.v2.listener.ListenerFilterChainMatchPredicateB\r\n\x0b\x63onfig_typeB\x9c\x01\n#io.envoyproxy.envoy.api.v2.listenerB\x17ListenerComponentsProtoP\x01\xaa\x02\x17\x45nvoy.Api.V2.ListenerNS\xea\x02\x17\x45nvoy.Api.V2.ListenerNS\xf2\x98\xfe\x8f\x05\x1a\x12\x18\x65nvoy.config.listener.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_core_dot_address__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_core_dot_base__pb2.DESCRIPTOR,envoy_dot_type_dot_range__pb2.DESCRIPTOR,google_dot_protobuf_dot_any__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_FILTERCHAINMATCH_CONNECTIONSOURCETYPE = _descriptor.EnumDescriptor(
  name='ConnectionSourceType',
  full_name='envoy.api.v2.listener.FilterChainMatch.ConnectionSourceType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ANY', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCAL', index=1, number=1,
      serialized_options=b'\362\230\376\217\005\025\n\023SAME_IP_OR_LOOPBACK',
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EXTERNAL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1006,
  serialized_end=1091,
)
_sym_db.RegisterEnumDescriptor(_FILTERCHAINMATCH_CONNECTIONSOURCETYPE)


_FILTER = _descriptor.Descriptor(
  name='Filter',
  full_name='envoy.api.v2.listener.Filter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.api.v2.listener.Filter.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.api.v2.listener.Filter.config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='typed_config', full_name='envoy.api.v2.listener.Filter.typed_config', index=2,
      number=4, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='config_type', full_name='envoy.api.v2.listener.Filter.config_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=368,
  serialized_end=513,
)


_FILTERCHAINMATCH = _descriptor.Descriptor(
  name='FilterChainMatch',
  full_name='envoy.api.v2.listener.FilterChainMatch',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='destination_port', full_name='envoy.api.v2.listener.FilterChainMatch.destination_port', index=0,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\010*\006\030\377\377\003(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='prefix_ranges', full_name='envoy.api.v2.listener.FilterChainMatch.prefix_ranges', index=1,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='address_suffix', full_name='envoy.api.v2.listener.FilterChainMatch.address_suffix', index=2,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='suffix_len', full_name='envoy.api.v2.listener.FilterChainMatch.suffix_len', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_type', full_name='envoy.api.v2.listener.FilterChainMatch.source_type', index=4,
      number=12, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_prefix_ranges', full_name='envoy.api.v2.listener.FilterChainMatch.source_prefix_ranges', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_ports', full_name='envoy.api.v2.listener.FilterChainMatch.source_ports', index=6,
      number=7, type=13, cpp_type=3, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\r\222\001\n\"\010*\006\030\377\377\003(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='server_names', full_name='envoy.api.v2.listener.FilterChainMatch.server_names', index=7,
      number=11, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport_protocol', full_name='envoy.api.v2.listener.FilterChainMatch.transport_protocol', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='application_protocols', full_name='envoy.api.v2.listener.FilterChainMatch.application_protocols', index=9,
      number=10, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _FILTERCHAINMATCH_CONNECTIONSOURCETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=516,
  serialized_end=1097,
)


_FILTERCHAIN = _descriptor.Descriptor(
  name='FilterChain',
  full_name='envoy.api.v2.listener.FilterChain',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='filter_chain_match', full_name='envoy.api.v2.listener.FilterChain.filter_chain_match', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tls_context', full_name='envoy.api.v2.listener.FilterChain.tls_context', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filters', full_name='envoy.api.v2.listener.FilterChain.filters', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='use_proxy_proto', full_name='envoy.api.v2.listener.FilterChain.use_proxy_proto', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='envoy.api.v2.listener.FilterChain.metadata', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport_socket', full_name='envoy.api.v2.listener.FilterChain.transport_socket', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.api.v2.listener.FilterChain.name', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=1100,
  serialized_end=1472,
)


_LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET = _descriptor.Descriptor(
  name='MatchSet',
  full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='rules', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet.rules', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1854,
  serialized_end=1947,
)

_LISTENERFILTERCHAINMATCHPREDICATE = _descriptor.Descriptor(
  name='ListenerFilterChainMatchPredicate',
  full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='or_match', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.or_match', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='and_match', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.and_match', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='not_match', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.not_match', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='any_match', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.any_match', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004j\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='destination_port_range', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.destination_port_range', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='rule', full_name='envoy.api.v2.listener.ListenerFilterChainMatchPredicate.rule',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=1475,
  serialized_end=1960,
)


_LISTENERFILTER = _descriptor.Descriptor(
  name='ListenerFilter',
  full_name='envoy.api.v2.listener.ListenerFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.api.v2.listener.ListenerFilter.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.api.v2.listener.ListenerFilter.config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='typed_config', full_name='envoy.api.v2.listener.ListenerFilter.typed_config', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter_disabled', full_name='envoy.api.v2.listener.ListenerFilter.filter_disabled', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='config_type', full_name='envoy.api.v2.listener.ListenerFilter.config_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1963,
  serialized_end=2193,
)

_FILTER.fields_by_name['config'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_FILTER.fields_by_name['typed_config'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_FILTER.oneofs_by_name['config_type'].fields.append(
  _FILTER.fields_by_name['config'])
_FILTER.fields_by_name['config'].containing_oneof = _FILTER.oneofs_by_name['config_type']
_FILTER.oneofs_by_name['config_type'].fields.append(
  _FILTER.fields_by_name['typed_config'])
_FILTER.fields_by_name['typed_config'].containing_oneof = _FILTER.oneofs_by_name['config_type']
_FILTERCHAINMATCH.fields_by_name['destination_port'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_FILTERCHAINMATCH.fields_by_name['prefix_ranges'].message_type = envoy_dot_api_dot_v2_dot_core_dot_address__pb2._CIDRRANGE
_FILTERCHAINMATCH.fields_by_name['suffix_len'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_FILTERCHAINMATCH.fields_by_name['source_type'].enum_type = _FILTERCHAINMATCH_CONNECTIONSOURCETYPE
_FILTERCHAINMATCH.fields_by_name['source_prefix_ranges'].message_type = envoy_dot_api_dot_v2_dot_core_dot_address__pb2._CIDRRANGE
_FILTERCHAINMATCH_CONNECTIONSOURCETYPE.containing_type = _FILTERCHAINMATCH
_FILTERCHAIN.fields_by_name['filter_chain_match'].message_type = _FILTERCHAINMATCH
_FILTERCHAIN.fields_by_name['tls_context'].message_type = envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2._DOWNSTREAMTLSCONTEXT
_FILTERCHAIN.fields_by_name['filters'].message_type = _FILTER
_FILTERCHAIN.fields_by_name['use_proxy_proto'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_FILTERCHAIN.fields_by_name['metadata'].message_type = envoy_dot_api_dot_v2_dot_core_dot_base__pb2._METADATA
_FILTERCHAIN.fields_by_name['transport_socket'].message_type = envoy_dot_api_dot_v2_dot_core_dot_base__pb2._TRANSPORTSOCKET
_LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET.fields_by_name['rules'].message_type = _LISTENERFILTERCHAINMATCHPREDICATE
_LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET.containing_type = _LISTENERFILTERCHAINMATCHPREDICATE
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['or_match'].message_type = _LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['and_match'].message_type = _LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['not_match'].message_type = _LISTENERFILTERCHAINMATCHPREDICATE
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['destination_port_range'].message_type = envoy_dot_type_dot_range__pb2._INT32RANGE
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule'].fields.append(
  _LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['or_match'])
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['or_match'].containing_oneof = _LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule'].fields.append(
  _LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['and_match'])
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['and_match'].containing_oneof = _LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule'].fields.append(
  _LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['not_match'])
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['not_match'].containing_oneof = _LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule'].fields.append(
  _LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['any_match'])
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['any_match'].containing_oneof = _LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule'].fields.append(
  _LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['destination_port_range'])
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['destination_port_range'].containing_oneof = _LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']
_LISTENERFILTER.fields_by_name['config'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_LISTENERFILTER.fields_by_name['typed_config'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_LISTENERFILTER.fields_by_name['filter_disabled'].message_type = _LISTENERFILTERCHAINMATCHPREDICATE
_LISTENERFILTER.oneofs_by_name['config_type'].fields.append(
  _LISTENERFILTER.fields_by_name['config'])
_LISTENERFILTER.fields_by_name['config'].containing_oneof = _LISTENERFILTER.oneofs_by_name['config_type']
_LISTENERFILTER.oneofs_by_name['config_type'].fields.append(
  _LISTENERFILTER.fields_by_name['typed_config'])
_LISTENERFILTER.fields_by_name['typed_config'].containing_oneof = _LISTENERFILTER.oneofs_by_name['config_type']
DESCRIPTOR.message_types_by_name['Filter'] = _FILTER
DESCRIPTOR.message_types_by_name['FilterChainMatch'] = _FILTERCHAINMATCH
DESCRIPTOR.message_types_by_name['FilterChain'] = _FILTERCHAIN
DESCRIPTOR.message_types_by_name['ListenerFilterChainMatchPredicate'] = _LISTENERFILTERCHAINMATCHPREDICATE
DESCRIPTOR.message_types_by_name['ListenerFilter'] = _LISTENERFILTER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Filter = _reflection.GeneratedProtocolMessageType('Filter', (_message.Message,), {
  'DESCRIPTOR' : _FILTER,
  '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.Filter)
  })
_sym_db.RegisterMessage(Filter)

FilterChainMatch = _reflection.GeneratedProtocolMessageType('FilterChainMatch', (_message.Message,), {
  'DESCRIPTOR' : _FILTERCHAINMATCH,
  '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.FilterChainMatch)
  })
_sym_db.RegisterMessage(FilterChainMatch)

FilterChain = _reflection.GeneratedProtocolMessageType('FilterChain', (_message.Message,), {
  'DESCRIPTOR' : _FILTERCHAIN,
  '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.FilterChain)
  })
_sym_db.RegisterMessage(FilterChain)

ListenerFilterChainMatchPredicate = _reflection.GeneratedProtocolMessageType('ListenerFilterChainMatchPredicate', (_message.Message,), {

  'MatchSet' : _reflection.GeneratedProtocolMessageType('MatchSet', (_message.Message,), {
    'DESCRIPTOR' : _LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET,
    '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
    # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet)
    })
  ,
  'DESCRIPTOR' : _LISTENERFILTERCHAINMATCHPREDICATE,
  '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.ListenerFilterChainMatchPredicate)
  })
_sym_db.RegisterMessage(ListenerFilterChainMatchPredicate)
_sym_db.RegisterMessage(ListenerFilterChainMatchPredicate.MatchSet)

ListenerFilter = _reflection.GeneratedProtocolMessageType('ListenerFilter', (_message.Message,), {
  'DESCRIPTOR' : _LISTENERFILTER,
  '__module__' : 'envoy.api.v2.listener.listener_components_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.listener.ListenerFilter)
  })
_sym_db.RegisterMessage(ListenerFilter)


DESCRIPTOR._options = None
_FILTER.fields_by_name['name']._options = None
_FILTER.fields_by_name['config']._options = None
_FILTERCHAINMATCH_CONNECTIONSOURCETYPE.values_by_name["LOCAL"]._options = None
_FILTERCHAINMATCH.fields_by_name['destination_port']._options = None
_FILTERCHAINMATCH.fields_by_name['source_type']._options = None
_FILTERCHAINMATCH.fields_by_name['source_ports']._options = None
_FILTERCHAIN.fields_by_name['tls_context']._options = None
_LISTENERFILTERCHAINMATCHPREDICATE_MATCHSET.fields_by_name['rules']._options = None
_LISTENERFILTERCHAINMATCHPREDICATE.oneofs_by_name['rule']._options = None
_LISTENERFILTERCHAINMATCHPREDICATE.fields_by_name['any_match']._options = None
_LISTENERFILTER.fields_by_name['name']._options = None
_LISTENERFILTER.fields_by_name['config']._options = None
# @@protoc_insertion_point(module_scope)
