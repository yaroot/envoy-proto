# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/finding.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.securitycenter.v1beta1 import security_marks_pb2 as google_dot_cloud_dot_securitycenter_dot_v1beta1_dot_security__marks__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/securitycenter/v1beta1/finding.proto\x12#google.cloud.securitycenter.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x38google/cloud/securitycenter/v1beta1/security_marks.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb8\x05\n\x07\x46inding\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x06parent\x18\x02 \x01(\tB\x03\xe0\x41\x05\x12\x15\n\rresource_name\x18\x03 \x01(\t\x12\x41\n\x05state\x18\x04 \x01(\x0e\x32\x32.google.cloud.securitycenter.v1beta1.Finding.State\x12\x10\n\x08\x63\x61tegory\x18\x05 \x01(\t\x12\x14\n\x0c\x65xternal_uri\x18\x06 \x01(\t\x12]\n\x11source_properties\x18\x07 \x03(\x0b\x32\x42.google.cloud.securitycenter.v1beta1.Finding.SourcePropertiesEntry\x12O\n\x0esecurity_marks\x18\x08 \x01(\x0b\x32\x32.google.cloud.securitycenter.v1beta1.SecurityMarksB\x03\xe0\x41\x03\x12.\n\nevent_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x63reate_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1aO\n\x15SourcePropertiesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\"8\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0c\n\x08INACTIVE\x10\x02:l\xea\x41i\n%securitycenter.googleapis.com/Finding\x12@organizations/{organization}/sources/{source}/findings/{finding}B~\n\'com.google.cloud.securitycenter.v1beta1P\x01ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenterb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.securitycenter.v1beta1.finding_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.cloud.securitycenter.v1beta1P\001ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenter'
  _FINDING_SOURCEPROPERTIESENTRY._options = None
  _FINDING_SOURCEPROPERTIESENTRY._serialized_options = b'8\001'
  _FINDING.fields_by_name['parent']._options = None
  _FINDING.fields_by_name['parent']._serialized_options = b'\340A\005'
  _FINDING.fields_by_name['security_marks']._options = None
  _FINDING.fields_by_name['security_marks']._serialized_options = b'\340A\003'
  _FINDING._options = None
  _FINDING._serialized_options = b'\352Ai\n%securitycenter.googleapis.com/Finding\022@organizations/{organization}/sources/{source}/findings/{finding}'
  _FINDING._serialized_start=272
  _FINDING._serialized_end=968
  _FINDING_SOURCEPROPERTIESENTRY._serialized_start=721
  _FINDING_SOURCEPROPERTIESENTRY._serialized_end=800
  _FINDING_STATE._serialized_start=802
  _FINDING_STATE._serialized_end=858
# @@protoc_insertion_point(module_scope)
