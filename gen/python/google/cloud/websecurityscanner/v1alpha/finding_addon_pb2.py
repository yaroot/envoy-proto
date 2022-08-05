# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/cloud/websecurityscanner/v1alpha/finding_addon.proto\x12\'google.cloud.websecurityscanner.v1alpha\"Q\n\x0fOutdatedLibrary\x12\x14\n\x0clibrary_name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x17\n\x0flearn_more_urls\x18\x03 \x03(\t\"?\n\x11ViolatingResource\x12\x14\n\x0c\x63ontent_type\x18\x01 \x01(\t\x12\x14\n\x0cresource_url\x18\x02 \x01(\t\"/\n\x14VulnerableParameters\x12\x17\n\x0fparameter_names\x18\x01 \x03(\t\"\xea\x01\n\x11VulnerableHeaders\x12R\n\x07headers\x18\x01 \x03(\x0b\x32\x41.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header\x12Z\n\x0fmissing_headers\x18\x02 \x03(\x0b\x32\x41.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header\x1a%\n\x06Header\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\"2\n\x03Xss\x12\x14\n\x0cstack_traces\x18\x01 \x03(\t\x12\x15\n\rerror_message\x18\x02 \x01(\tB\x9d\x01\n+com.google.cloud.websecurityscanner.v1alphaB\x11\x46indingAddonProtoP\x01ZYgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1alpha;websecurityscannerb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.websecurityscanner.v1alpha.finding_addon_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.cloud.websecurityscanner.v1alphaB\021FindingAddonProtoP\001ZYgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1alpha;websecurityscanner'
  _OUTDATEDLIBRARY._serialized_start=104
  _OUTDATEDLIBRARY._serialized_end=185
  _VIOLATINGRESOURCE._serialized_start=187
  _VIOLATINGRESOURCE._serialized_end=250
  _VULNERABLEPARAMETERS._serialized_start=252
  _VULNERABLEPARAMETERS._serialized_end=299
  _VULNERABLEHEADERS._serialized_start=302
  _VULNERABLEHEADERS._serialized_end=536
  _VULNERABLEHEADERS_HEADER._serialized_start=499
  _VULNERABLEHEADERS_HEADER._serialized_end=536
  _XSS._serialized_start=538
  _XSS._serialized_end=588
# @@protoc_insertion_point(module_scope)
