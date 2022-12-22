# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/discovery.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from grafeas.v1 import common_pb2 as grafeas_dot_v1_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1agrafeas/v1/discovery.proto\x12\ngrafeas.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x17grafeas/v1/common.proto\"<\n\rDiscoveryNote\x12+\n\ranalysis_kind\x18\x01 \x01(\x0e\x32\x14.grafeas.v1.NoteKind\"\xfc\x05\n\x13\x44iscoveryOccurrence\x12O\n\x13\x63ontinuous_analysis\x18\x01 \x01(\x0e\x32\x32.grafeas.v1.DiscoveryOccurrence.ContinuousAnalysis\x12G\n\x0f\x61nalysis_status\x18\x02 \x01(\x0e\x32..grafeas.v1.DiscoveryOccurrence.AnalysisStatus\x12M\n\x12\x61nalysis_completed\x18\x07 \x01(\x0b\x32\x31.grafeas.v1.DiscoveryOccurrence.AnalysisCompleted\x12*\n\x0e\x61nalysis_error\x18\x08 \x03(\x0b\x32\x12.google.rpc.Status\x12\x31\n\x15\x61nalysis_status_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12\x0b\n\x03\x63pe\x18\x04 \x01(\t\x12\x32\n\x0elast_scan_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x35\n\x0c\x61rchive_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x1a*\n\x11\x41nalysisCompleted\x12\x15\n\ranalysis_type\x18\x01 \x03(\t\"S\n\x12\x43ontinuousAnalysis\x12#\n\x1f\x43ONTINUOUS_ANALYSIS_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0c\n\x08INACTIVE\x10\x02\"\xa3\x01\n\x0e\x41nalysisStatus\x12\x1f\n\x1b\x41NALYSIS_STATUS_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0c\n\x08SCANNING\x10\x02\x12\x14\n\x10\x46INISHED_SUCCESS\x10\x03\x12\x0c\n\x08\x43OMPLETE\x10\x03\x12\x13\n\x0f\x46INISHED_FAILED\x10\x04\x12\x18\n\x14\x46INISHED_UNSUPPORTED\x10\x05\x1a\x02\x10\x01\x42Q\n\rio.grafeas.v1P\x01Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'grafeas.v1.discovery_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rio.grafeas.v1P\001Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\242\002\003GRA'
  _DISCOVERYOCCURRENCE_ANALYSISSTATUS._options = None
  _DISCOVERYOCCURRENCE_ANALYSISSTATUS._serialized_options = b'\020\001'
  _DISCOVERYOCCURRENCE.fields_by_name['archive_time']._options = None
  _DISCOVERYOCCURRENCE.fields_by_name['archive_time']._serialized_options = b'\340A\003'
  _DISCOVERYNOTE._serialized_start=158
  _DISCOVERYNOTE._serialized_end=218
  _DISCOVERYOCCURRENCE._serialized_start=221
  _DISCOVERYOCCURRENCE._serialized_end=985
  _DISCOVERYOCCURRENCE_ANALYSISCOMPLETED._serialized_start=692
  _DISCOVERYOCCURRENCE_ANALYSISCOMPLETED._serialized_end=734
  _DISCOVERYOCCURRENCE_CONTINUOUSANALYSIS._serialized_start=736
  _DISCOVERYOCCURRENCE_CONTINUOUSANALYSIS._serialized_end=819
  _DISCOVERYOCCURRENCE_ANALYSISSTATUS._serialized_start=822
  _DISCOVERYOCCURRENCE_ANALYSISSTATUS._serialized_end=985
# @@protoc_insertion_point(module_scope)
