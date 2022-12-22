# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/security_marks.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8google/cloud/securitycenter/v1beta1/security_marks.proto\x12#google.cloud.securitycenter.v1beta1\x1a\x19google/api/resource.proto\"\xd8\x02\n\rSecurityMarks\x12\x0c\n\x04name\x18\x01 \x01(\t\x12L\n\x05marks\x18\x02 \x03(\x0b\x32=.google.cloud.securitycenter.v1beta1.SecurityMarks.MarksEntry\x1a,\n\nMarksEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\xbc\x01\xea\x41\xb8\x01\n+securitycenter.googleapis.com/SecurityMarks\x12\x39organizations/{organization}/assets/{asset}/securityMarks\x12Norganizations/{organization}/sources/{source}/findings/{finding}/securityMarksB~\n\'com.google.cloud.securitycenter.v1beta1P\x01ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenterb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.securitycenter.v1beta1.security_marks_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.cloud.securitycenter.v1beta1P\001ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenter'
  _SECURITYMARKS_MARKSENTRY._options = None
  _SECURITYMARKS_MARKSENTRY._serialized_options = b'8\001'
  _SECURITYMARKS._options = None
  _SECURITYMARKS._serialized_options = b'\352A\270\001\n+securitycenter.googleapis.com/SecurityMarks\0229organizations/{organization}/assets/{asset}/securityMarks\022Norganizations/{organization}/sources/{source}/findings/{finding}/securityMarks'
  _SECURITYMARKS._serialized_start=125
  _SECURITYMARKS._serialized_end=469
  _SECURITYMARKS_MARKSENTRY._serialized_start=234
  _SECURITYMARKS_MARKSENTRY._serialized_end=278
# @@protoc_insertion_point(module_scope)
