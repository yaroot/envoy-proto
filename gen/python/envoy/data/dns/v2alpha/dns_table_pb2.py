# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/data/dns/v2alpha/dns_table.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.type.matcher import string_pb2 as envoy_dot_type_dot_matcher_dot_string__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&envoy/data/dns/v2alpha/dns_table.proto\x12\x16\x65nvoy.data.dns.v2alpha\x1a\x1f\x65nvoy/type/matcher/string.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xfe\x03\n\x08\x44nsTable\x12\x1c\n\x14\x65xternal_retry_count\x18\x01 \x01(\r\x12T\n\x0fvirtual_domains\x18\x02 \x03(\x0b\x32\x31.envoy.data.dns.v2alpha.DnsTable.DnsVirtualDomainB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x12\x39\n\x0eknown_suffixes\x18\x03 \x03(\x0b\x32!.envoy.type.matcher.StringMatcher\x1a.\n\x0b\x41\x64\x64ressList\x12\x1f\n\x07\x61\x64\x64ress\x18\x01 \x03(\tB\x0e\xfa\x42\x0b\x92\x01\x08\x08\x01\"\x04r\x02\x10\x03\x1ak\n\x0b\x44nsEndpoint\x12\x44\n\x0c\x61\x64\x64ress_list\x18\x01 \x01(\x0b\x32,.envoy.data.dns.v2alpha.DnsTable.AddressListH\x00\x42\x16\n\x0f\x65ndpoint_config\x12\x03\xf8\x42\x01\x1a\xa5\x01\n\x10\x44nsVirtualDomain\x12\x18\n\x04name\x18\x01 \x01(\tB\n\xfa\x42\x07r\x05\x10\x02\xc0\x01\x01\x12>\n\x08\x65ndpoint\x18\x02 \x01(\x0b\x32,.envoy.data.dns.v2alpha.DnsTable.DnsEndpoint\x12\x37\n\nanswer_ttl\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x42\x86\x01\n$io.envoyproxy.envoy.data.dns.v2alphaB\rDnsTableProtoP\x01Z=github.com/envoyproxy/go-control-plane/envoy/data/dns/v2alpha\xba\x80\xc8\xd1\x06\x02\x08\x01\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.data.dns.v2alpha.dns_table_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$io.envoyproxy.envoy.data.dns.v2alphaB\rDnsTableProtoP\001Z=github.com/envoyproxy/go-control-plane/envoy/data/dns/v2alpha\272\200\310\321\006\002\010\001\272\200\310\321\006\002\020\001'
  _DNSTABLE_ADDRESSLIST.fields_by_name['address']._options = None
  _DNSTABLE_ADDRESSLIST.fields_by_name['address']._serialized_options = b'\372B\013\222\001\010\010\001\"\004r\002\020\003'
  _DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']._options = None
  _DNSTABLE_DNSENDPOINT.oneofs_by_name['endpoint_config']._serialized_options = b'\370B\001'
  _DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['name']._options = None
  _DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['name']._serialized_options = b'\372B\007r\005\020\002\300\001\001'
  _DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['answer_ttl']._options = None
  _DNSTABLE_DNSVIRTUALDOMAIN.fields_by_name['answer_ttl']._serialized_options = b'\372B\005\252\001\002*\000'
  _DNSTABLE.fields_by_name['virtual_domains']._options = None
  _DNSTABLE.fields_by_name['virtual_domains']._serialized_options = b'\372B\005\222\001\002\010\001'
  _DNSTABLE._serialized_start=188
  _DNSTABLE._serialized_end=698
  _DNSTABLE_ADDRESSLIST._serialized_start=375
  _DNSTABLE_ADDRESSLIST._serialized_end=421
  _DNSTABLE_DNSENDPOINT._serialized_start=423
  _DNSTABLE_DNSENDPOINT._serialized_end=530
  _DNSTABLE_DNSVIRTUALDOMAIN._serialized_start=533
  _DNSTABLE_DNSVIRTUALDOMAIN._serialized_end=698
# @@protoc_insertion_point(module_scope)