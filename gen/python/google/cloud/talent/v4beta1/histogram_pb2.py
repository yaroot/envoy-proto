# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/histogram.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/talent/v4beta1/histogram.proto\x12\x1bgoogle.cloud.talent.v4beta1\")\n\x0eHistogramQuery\x12\x17\n\x0fhistogram_query\x18\x01 \x01(\t\"\xb6\x01\n\x14HistogramQueryResult\x12\x17\n\x0fhistogram_query\x18\x01 \x01(\t\x12S\n\thistogram\x18\x02 \x03(\x0b\x32@.google.cloud.talent.v4beta1.HistogramQueryResult.HistogramEntry\x1a\x30\n\x0eHistogramEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x03:\x02\x38\x01\x42|\n\x1f\x63om.google.cloud.talent.v4beta1B\x0eHistogramProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4beta1.histogram_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.talent.v4beta1B\016HistogramProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\242\002\003CTS'
  _HISTOGRAMQUERYRESULT_HISTOGRAMENTRY._options = None
  _HISTOGRAMQUERYRESULT_HISTOGRAMENTRY._serialized_options = b'8\001'
  _HISTOGRAMQUERY._serialized_start=76
  _HISTOGRAMQUERY._serialized_end=117
  _HISTOGRAMQUERYRESULT._serialized_start=120
  _HISTOGRAMQUERYRESULT._serialized_end=302
  _HISTOGRAMQUERYRESULT_HISTOGRAMENTRY._serialized_start=254
  _HISTOGRAMQUERYRESULT_HISTOGRAMENTRY._serialized_end=302
# @@protoc_insertion_point(module_scope)
