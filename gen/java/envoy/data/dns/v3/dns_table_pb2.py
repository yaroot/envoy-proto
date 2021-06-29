# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/data/dns/v3/dns_table.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.type.matcher.v3 import string_pb2 as envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from envoy.annotations import deprecation_pb2 as envoy_dot_annotations_dot_deprecation__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/data/dns/v3/dns_table.proto',
  package='envoy.data.dns.v3',
  syntax='proto3',
  serialized_options=b'\n\037io.envoyproxy.envoy.data.dns.v3B\rDnsTableProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!envoy/data/dns/v3/dns_table.proto\x12\x11\x65nvoy.data.dns.v3\x1a\"envoy/type/matcher/v3/string.proto\x1a\x1egoogle/protobuf/duration.proto\x1a#envoy/annotations/deprecation.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x93\x0b\n\x08\x44nsTable\x12%\n\x14\x65xternal_retry_count\x18\x01 \x01(\rB\x07\xfa\x42\x04*\x02\x18\x03\x12\x45\n\x0fvirtual_domains\x18\x02 \x03(\x0b\x32,.envoy.data.dns.v3.DnsTable.DnsVirtualDomain\x12I\n\x0eknown_suffixes\x18\x03 \x03(\x0b\x32$.envoy.type.matcher.v3.StringMatcherB\x0b\x18\x01\x92\xc7\x86\xd8\x04\x03\x33.0\x1a\x62\n\x0b\x41\x64\x64ressList\x12\x1f\n\x07\x61\x64\x64ress\x18\x01 \x03(\tB\x0e\xfa\x42\x0b\x92\x01\x08\x08\x01\"\x04r\x02\x10\x03:2\x9a\xc5\x88\x1e-\n+envoy.data.dns.v2alpha.DnsTable.AddressList\x1a\x64\n\x12\x44nsServiceProtocol\x12\x1a\n\x06number\x18\x01 \x01(\rB\x08\xfa\x42\x05*\x03\x10\xff\x01H\x00\x12\x1a\n\x04name\x18\x02 \x01(\tB\n\xfa\x42\x07r\x05\x10\x01\xc0\x01\x01H\x00\x42\x16\n\x0fprotocol_config\x12\x03\xf8\x42\x01\x1a\xbe\x01\n\x10\x44nsServiceTarget\x12\x1f\n\thost_name\x18\x01 \x01(\tB\n\xfa\x42\x07r\x05\x10\x01\xc0\x01\x01H\x00\x12\"\n\x0c\x63luster_name\x18\x02 \x01(\tB\n\xfa\x42\x07r\x05\x10\x01\xc0\x01\x01H\x00\x12\x1b\n\x08priority\x18\x03 \x01(\rB\t\xfa\x42\x06*\x04\x10\x80\x80\x04\x12\x19\n\x06weight\x18\x04 \x01(\rB\t\xfa\x42\x06*\x04\x10\x80\x80\x04\x12\x17\n\x04port\x18\x05 \x01(\rB\t\xfa\x42\x06*\x04\x10\x80\x80\x04\x42\x14\n\rendpoint_type\x12\x03\xf8\x42\x01\x1a\xed\x01\n\nDnsService\x12 \n\x0cservice_name\x18\x01 \x01(\tB\n\xfa\x42\x07r\x05\x10\x01\xc0\x01\x01\x12@\n\x08protocol\x18\x02 \x01(\x0b\x32..envoy.data.dns.v3.DnsTable.DnsServiceProtocol\x12\x32\n\x03ttl\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\n\xfa\x42\x07\xaa\x01\x04\x32\x02\x08\x01\x12G\n\x07targets\x18\x04 \x03(\x0b\x32,.envoy.data.dns.v3.DnsTable.DnsServiceTargetB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x1aT\n\x0e\x44nsServiceList\x12\x42\n\x08services\x18\x01 \x03(\x0b\x32&.envoy.data.dns.v3.DnsTable.DnsServiceB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x1a\xf6\x01\n\x0b\x44nsEndpoint\x12?\n\x0c\x61\x64\x64ress_list\x18\x01 \x01(\x0b\x32\'.envoy.data.dns.v3.DnsTable.AddressListH\x00\x12\x16\n\x0c\x63luster_name\x18\x02 \x01(\tH\x00\x12\x42\n\x0cservice_list\x18\x03 \x01(\x0b\x32*.envoy.data.dns.v3.DnsTable.DnsServiceListH\x00:2\x9a\xc5\x88\x1e-\n+envoy.data.dns.v2alpha.DnsTable.DnsEndpointB\x16\n\x0f\x65ndpoint_config\x12\x03\xf8\x42\x01\x1a\xdb\x01\n\x10\x44nsVirtualDomain\x12\x18\n\x04name\x18\x01 \x01(\tB\n\xfa\x42\x07r\x05\x10\x01\xc0\x01\x01\x12\x39\n\x08\x65ndpoint\x18\x02 \x01(\x0b\x32\'.envoy.data.dns.v3.DnsTable.DnsEndpoint\x12\x39\n\nanswer_ttl\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\n\xfa\x42\x07\xaa\x01\x04\x32\x02\x08\x1e:7\x9a\xc5\x88\x1e\x32\n0envoy.data.dns.v2alpha.DnsTable.DnsVirtualDomain:&\x9a\xc5\x88\x1e!\n\x1f\x65nvoy.data.dns.v2alpha.DnsTableB:\n\x1fio.envoyproxy.envoy.data.dns.v3B\rDnsTableProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,envoy_dot_annotations_dot_deprecation__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_DNSTABLE_ADDRESSLIST = _descriptor.Descriptor(
  name='AddressList',
  full_name='envoy.data.dns.v3.DnsTable.AddressList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='address', full_name='envoy.data.dns.v3.DnsTable.AddressList.address', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\013\222\001\010\010\001\"\004r\002\020\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036-\n+envoy.data.dns.v2alpha.DnsTable.AddressList',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=450,
  serialized_end=548,
)

_DNSTABLE_DNSSERVICEPROTOCOL = _descriptor.Descriptor(
  name='DnsServiceProtocol',
  full_name='envoy.data.dns.v3.DnsTable.DnsServiceProtocol',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='number', full_name='envoy.data.dns.v3.DnsTable.DnsServiceProtocol.number', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005*\003\020\377\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.data.dns.v3.DnsTable.DnsServiceProtocol.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007r\005\020\001\300\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='protocol_config', full_name='envoy.data.dns.v3.DnsTable.DnsServiceProtocol.protocol_config',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=550,
  serialized_end=650,
)

_DNSTABLE_DNSSERVICETARGET = _descriptor.Descriptor(
  name='DnsServiceTarget',
  full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='host_name', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.host_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007r\005\020\001\300\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_name', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.cluster_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007r\005\020\001\300\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='priority', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.priority', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\020\200\200\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='weight', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.weight', index=3,
      number=4, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\020\200\200\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='port', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.port', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\020\200\200\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='endpoint_type', full_name='envoy.data.dns.v3.DnsTable.DnsServiceTarget.endpoint_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=653,
  serialized_end=843,
)

_DNSTABLE_DNSSERVICE = _descriptor.Descriptor(
  name='DnsService',
  full_name='envoy.data.dns.v3.DnsTable.DnsService',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service_name', full_name='envoy.data.dns.v3.DnsTable.DnsService.service_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007r\005\020\001\300\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='protocol', full_name='envoy.data.dns.v3.DnsTable.DnsService.protocol', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ttl', full_name='envoy.data.dns.v3.DnsTable.DnsService.ttl', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007\252\001\0042\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='targets', full_name='envoy.data.dns.v3.DnsTable.DnsService.targets', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=846,
  serialized_end=1083,
)

_DNSTABLE_DNSSERVICELIST = _descriptor.Descriptor(
  name='DnsServiceList',
  full_name='envoy.data.dns.v3.DnsTable.DnsServiceList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='services', full_name='envoy.data.dns.v3.DnsTable.DnsServiceList.services', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1085,
  serialized_end=1169,
)

_DNSTABLE_DNSENDPOINT = _descriptor.Descriptor(
  name='DnsEndpoint',
  full_name='envoy.data.dns.v3.DnsTable.DnsEndpoint',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='address_list', full_name='envoy.data.dns.v3.DnsTable.DnsEndpoint.address_list', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_name', full_name='envoy.data.dns.v3.DnsTable.DnsEndpoint.cluster_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_list', full_name='envoy.data.dns.v3.DnsTable.DnsEndpoint.service_list', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036-\n+envoy.data.dns.v2alpha.DnsTable.DnsEndpoint',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='endpoint_config', full_name='envoy.data.dns.v3.DnsTable.DnsEndpoint.endpoint_config',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=1172,
  serialized_end=1418,
)

_DNSTABLE_DNSVIRTUALDOMAIN = _descriptor.Descriptor(
  name='DnsVirtualDomain',
  full_name='envoy.data.dns.v3.DnsTable.DnsVirtualDomain',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.data.dns.v3.DnsTable.DnsVirtualDomain.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007r\005\020\001\300\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoint', full_name='envoy.data.dns.v3.DnsTable.DnsVirtualDomain.endpoint', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='answer_ttl', full_name='envoy.data.dns.v3.DnsTable.DnsVirtualDomain.answer_ttl', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007\252\001\0042\002\010\036', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\0362\n0envoy.data.dns.v2alpha.DnsTable.DnsVirtualDomain',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1421,
  serialized_end=1640,
)

_DNSTABLE = _descriptor.Descriptor(
  name='DnsTable',
  full_name='envoy.data.dns.v3.DnsTable',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='external_retry_count', full_name='envoy.data.dns.v3.DnsTable.external_retry_count', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002\030\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='virtual_domains', full_name='envoy.data.dns.v3.DnsTable.virtual_domains', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='known_suffixes', full_name='envoy.data.dns.v3.DnsTable.known_suffixes', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\222\307\206\330\004\0033.0', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_DNSTABLE_ADDRESSLIST, _DNSTABLE_DNSSERVICEPROTOCOL, _DNSTABLE_DNSSERVICETARGET, _DNSTABLE_DNSSERVICE, _DNSTABLE_DNSSERVICELIST, _DNSTABLE_DNSENDPOINT, _DNSTABLE_DNSVIRTUALDOMAIN, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036!\n\037envoy.data.dns.v2alpha.DnsTable',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=253,
  serialized_end=1680,
)

_DNSTABLE_ADDRESSLIST.containing_type = _DNSTABLE
_DNSTABLE_DNSSERVICEPROTOCOL.containing_type = _DNSTABLE
_DNSTABLE_DNSSERVICEPROTOCOL.oneofs_by_name['protocol_config'].fields.append(
  _DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['number'])
_DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['number'].containing_oneof = _DNSTABLE_DNSSERVICEPROTOCOL.oneofs_by_name['protocol_config']
_DNSTABLE_DNSSERVICEPROTOCOL.oneofs_by_name['protocol_config'].fields.append(
  _DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['name'])
_DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['name'].containing_oneof = _DNSTABLE_DNSSERVICEPROTOCOL.oneofs_by_name['protocol_config']
_DNSTABLE_DNSSERVICETARGET.containing_type = _DNSTABLE
_DNSTABLE_DNSSERVICETARGET.oneofs_by_name['endpoint_type'].fields.append(
  _DNSTABLE_DNSSERVICETARGET.fields_by_name['host_name'])
_DNSTABLE_DNSSERVICETARGET.fields_by_name['host_name'].containing_oneof = _DNSTABLE_DNSSERVICETARGET.oneofs_by_name['endpoint_type']
_DNSTABLE_DNSSERVICETARGET.oneofs_by_name['endpoint_type'].fields.append(
  _DNSTABLE_DNSSERVICETARGET.fields_by_name['cluster_name'])
_DNSTABLE_DNSSERVICETARGET.fields_by_name['cluster_name'].containing_oneof = _DNSTABLE_DNSSERVICETARGET.oneofs_by_name['endpoint_type']
_DNSTABLE_DNSSERVICE.fields_by_name['protocol'].message_type = _DNSTABLE_DNSSERVICEPROTOCOL
_DNSTABLE_DNSSERVICE.fields_by_name['ttl'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSTABLE_DNSSERVICE.fields_by_name['targets'].message_type = _DNSTABLE_DNSSERVICETARGET
_DNSTABLE_DNSSERVICE.containing_type = _DNSTABLE
_DNSTABLE_DNSSERVICELIST.fields_by_name['services'].message_type = _DNSTABLE_DNSSERVICE
_DNSTABLE_DNSSERVICELIST.containing_type = _DNSTABLE
_DNSTABLE_DNSENDPOINT.fields_by_name['address_list'].message_type = _DNSTABLE_ADDRESSLIST
_DNSTABLE_DNSENDPOINT.fields_by_name['service_list'].message_type = _DNSTABLE_DNSSERVICELIST
_DNSTABLE_DNSENDPOINT.containing_type = _DNSTABLE
_DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config'].fields.append(
  _DNSTABLE_DNSENDPOINT.fields_by_name['address_list'])
_DNSTABLE_DNSENDPOINT.fields_by_name['address_list'].containing_oneof = _DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']
_DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config'].fields.append(
  _DNSTABLE_DNSENDPOINT.fields_by_name['cluster_name'])
_DNSTABLE_DNSENDPOINT.fields_by_name['cluster_name'].containing_oneof = _DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']
_DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config'].fields.append(
  _DNSTABLE_DNSENDPOINT.fields_by_name['service_list'])
_DNSTABLE_DNSENDPOINT.fields_by_name['service_list'].containing_oneof = _DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']
_DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['endpoint'].message_type = _DNSTABLE_DNSENDPOINT
_DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['answer_ttl'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSTABLE_DNSVIRTUALDOMAIN.containing_type = _DNSTABLE
_DNSTABLE.fields_by_name['virtual_domains'].message_type = _DNSTABLE_DNSVIRTUALDOMAIN
_DNSTABLE.fields_by_name['known_suffixes'].message_type = envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2._STRINGMATCHER
DESCRIPTOR.message_types_by_name['DnsTable'] = _DNSTABLE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DnsTable = _reflection.GeneratedProtocolMessageType('DnsTable', (_message.Message,), {

  'AddressList' : _reflection.GeneratedProtocolMessageType('AddressList', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_ADDRESSLIST,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.AddressList)
    })
  ,

  'DnsServiceProtocol' : _reflection.GeneratedProtocolMessageType('DnsServiceProtocol', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSSERVICEPROTOCOL,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsServiceProtocol)
    })
  ,

  'DnsServiceTarget' : _reflection.GeneratedProtocolMessageType('DnsServiceTarget', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSSERVICETARGET,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsServiceTarget)
    })
  ,

  'DnsService' : _reflection.GeneratedProtocolMessageType('DnsService', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSSERVICE,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsService)
    })
  ,

  'DnsServiceList' : _reflection.GeneratedProtocolMessageType('DnsServiceList', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSSERVICELIST,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsServiceList)
    })
  ,

  'DnsEndpoint' : _reflection.GeneratedProtocolMessageType('DnsEndpoint', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSENDPOINT,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsEndpoint)
    })
  ,

  'DnsVirtualDomain' : _reflection.GeneratedProtocolMessageType('DnsVirtualDomain', (_message.Message,), {
    'DESCRIPTOR' : _DNSTABLE_DNSVIRTUALDOMAIN,
    '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
    # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable.DnsVirtualDomain)
    })
  ,
  'DESCRIPTOR' : _DNSTABLE,
  '__module__' : 'envoy.data.dns.v3.dns_table_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.dns.v3.DnsTable)
  })
_sym_db.RegisterMessage(DnsTable)
_sym_db.RegisterMessage(DnsTable.AddressList)
_sym_db.RegisterMessage(DnsTable.DnsServiceProtocol)
_sym_db.RegisterMessage(DnsTable.DnsServiceTarget)
_sym_db.RegisterMessage(DnsTable.DnsService)
_sym_db.RegisterMessage(DnsTable.DnsServiceList)
_sym_db.RegisterMessage(DnsTable.DnsEndpoint)
_sym_db.RegisterMessage(DnsTable.DnsVirtualDomain)


DESCRIPTOR._options = None
_DNSTABLE_ADDRESSLIST.fields_by_name['address']._options = None
_DNSTABLE_ADDRESSLIST._options = None
_DNSTABLE_DNSSERVICEPROTOCOL.oneofs_by_name['protocol_config']._options = None
_DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['number']._options = None
_DNSTABLE_DNSSERVICEPROTOCOL.fields_by_name['name']._options = None
_DNSTABLE_DNSSERVICETARGET.oneofs_by_name['endpoint_type']._options = None
_DNSTABLE_DNSSERVICETARGET.fields_by_name['host_name']._options = None
_DNSTABLE_DNSSERVICETARGET.fields_by_name['cluster_name']._options = None
_DNSTABLE_DNSSERVICETARGET.fields_by_name['priority']._options = None
_DNSTABLE_DNSSERVICETARGET.fields_by_name['weight']._options = None
_DNSTABLE_DNSSERVICETARGET.fields_by_name['port']._options = None
_DNSTABLE_DNSSERVICE.fields_by_name['service_name']._options = None
_DNSTABLE_DNSSERVICE.fields_by_name['ttl']._options = None
_DNSTABLE_DNSSERVICE.fields_by_name['targets']._options = None
_DNSTABLE_DNSSERVICELIST.fields_by_name['services']._options = None
_DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']._options = None
_DNSTABLE_DNSENDPOINT._options = None
_DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['name']._options = None
_DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['answer_ttl']._options = None
_DNSTABLE_DNSVIRTUALDOMAIN._options = None
_DNSTABLE.fields_by_name['external_retry_count']._options = None
_DNSTABLE.fields_by_name['known_suffixes']._options = None
_DNSTABLE._options = None
# @@protoc_insertion_point(module_scope)
