# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/kubernetes/security/containersecurity_logging/logging.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nHgoogle/cloud/kubernetes/security/containersecurity_logging/logging.proto\x12\x33\x63loud.kubernetes.security.containersecurity_logging\x1a\x1fgoogle/protobuf/timestamp.proto\"\x89\x03\n\rVulnerability\x12\x14\n\x0cpackage_name\x18\x01 \x01(\t\x12 \n\x18\x61\x66\x66\x65\x63ted_package_version\x18\x02 \x01(\t\x12\x0e\n\x06\x63ve_id\x18\x03 \x01(\t\x12\x0f\n\x07\x63pe_uri\x18\x04 \x01(\t\x12O\n\x08severity\x18\x05 \x01(\x0e\x32=.cloud.kubernetes.security.containersecurity_logging.Severity\x12\x12\n\ncvss_score\x18\x06 \x01(\x02\x12\x13\n\x0b\x63vss_vector\x18\x07 \x01(\t\x12\x15\n\rfixed_cpe_uri\x18\x08 \x01(\t\x12\x14\n\x0cpackage_type\x18\t \x01(\t\x12\x15\n\rfixed_package\x18\n \x01(\t\x12\x1d\n\x15\x66ixed_package_version\x18\x0b \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x0c \x01(\t\x12\x14\n\x0crelated_urls\x18\r \x03(\t\x12\x17\n\x0f\x61\x66\x66\x65\x63ted_images\x18\x0e \x03(\t\"\xf9\x03\n\x07\x46inding\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12N\n\x04type\x18\x02 \x01(\x0e\x32@.cloud.kubernetes.security.containersecurity_logging.FindingType\x12Q\n\x05state\x18\x03 \x01(\x0e\x32\x42.cloud.kubernetes.security.containersecurity_logging.Finding.State\x12\x0f\n\x07\x66inding\x18\x04 \x01(\t\x12O\n\x08severity\x18\x05 \x01(\x0e\x32=.cloud.kubernetes.security.containersecurity_logging.Severity\x12.\n\nevent_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12[\n\rvulnerability\x18\x07 \x01(\x0b\x32\x42.cloud.kubernetes.security.containersecurity_logging.VulnerabilityH\x00\":\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0e\n\nREMEDIATED\x10\x02\x42\t\n\x07\x64\x65tails*g\n\x0b\x46indingType\x12\x1c\n\x18\x46INDING_TYPE_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x46INDING_TYPE_MISCONFIG\x10\x01\x12\x1e\n\x1a\x46INDING_TYPE_VULNERABILITY\x10\x02*u\n\x08Severity\x12\x18\n\x14SEVERITY_UNSPECIFIED\x10\x00\x12\x15\n\x11SEVERITY_CRITICAL\x10\x01\x12\x11\n\rSEVERITY_HIGH\x10\x02\x12\x13\n\x0fSEVERITY_MEDIUM\x10\x03\x12\x10\n\x0cSEVERITY_LOW\x10\x04\x42\x92\x03\n>com.google.cloud.kubernetes.security.containersecurity.loggingB\x1d\x43ontainerSecurityLoggingProtoP\x01Zsgoogle.golang.org/genproto/googleapis/cloud/kubernetes/security/containersecurity_logging;containersecurity_logging\xaa\x02:Google.Cloud.Kubernetes.Security.ContainerSecurity.Logging\xca\x02:Google\\Cloud\\Kubernetes\\Security\\ContainerSecurity\\Logging\xea\x02?Google::Cloud::Kubernetes::Security::ContainerSecurity::Loggingb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.kubernetes.security.containersecurity_logging.logging_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n>com.google.cloud.kubernetes.security.containersecurity.loggingB\035ContainerSecurityLoggingProtoP\001Zsgoogle.golang.org/genproto/googleapis/cloud/kubernetes/security/containersecurity_logging;containersecurity_logging\252\002:Google.Cloud.Kubernetes.Security.ContainerSecurity.Logging\312\002:Google\\Cloud\\Kubernetes\\Security\\ContainerSecurity\\Logging\352\002?Google::Cloud::Kubernetes::Security::ContainerSecurity::Logging'
  _FINDINGTYPE._serialized_start=1066
  _FINDINGTYPE._serialized_end=1169
  _SEVERITY._serialized_start=1171
  _SEVERITY._serialized_end=1288
  _VULNERABILITY._serialized_start=163
  _VULNERABILITY._serialized_end=556
  _FINDING._serialized_start=559
  _FINDING._serialized_end=1064
  _FINDING_STATE._serialized_start=995
  _FINDING_STATE._serialized_end=1053
# @@protoc_insertion_point(module_scope)