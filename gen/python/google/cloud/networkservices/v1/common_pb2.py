# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networkservices/v1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/networkservices/v1/common.proto\x12\x1fgoogle.cloud.networkservices.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x80\x02\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\")\n\x13TrafficPortSelector\x12\x12\n\x05ports\x18\x01 \x03(\tB\x03\xe0\x41\x01\"\xcc\x04\n\x0f\x45ndpointMatcher\x12g\n\x16metadata_label_matcher\x18\x01 \x01(\x0b\x32\x45.google.cloud.networkservices.v1.EndpointMatcher.MetadataLabelMatcherH\x00\x1a\xbf\x03\n\x14MetadataLabelMatcher\x12\x87\x01\n\x1dmetadata_label_match_criteria\x18\x01 \x01(\x0e\x32`.google.cloud.networkservices.v1.EndpointMatcher.MetadataLabelMatcher.MetadataLabelMatchCriteria\x12m\n\x0fmetadata_labels\x18\x02 \x03(\x0b\x32T.google.cloud.networkservices.v1.EndpointMatcher.MetadataLabelMatcher.MetadataLabels\x1a\x43\n\x0eMetadataLabels\x12\x17\n\nlabel_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0blabel_value\x18\x02 \x01(\tB\x03\xe0\x41\x02\"i\n\x1aMetadataLabelMatchCriteria\x12-\n)METADATA_LABEL_MATCH_CRITERIA_UNSPECIFIED\x10\x00\x12\r\n\tMATCH_ANY\x10\x01\x12\r\n\tMATCH_ALL\x10\x02\x42\x0e\n\x0cmatcher_typeB\xed\x01\n#com.google.cloud.networkservices.v1B\x0b\x43ommonProtoP\x01ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\xaa\x02\x1fGoogle.Cloud.NetworkServices.V1\xca\x02\x1fGoogle\\Cloud\\NetworkServices\\V1\xea\x02\"Google::Cloud::NetworkServices::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networkservices.v1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.networkservices.v1B\013CommonProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\252\002\037Google.Cloud.NetworkServices.V1\312\002\037Google\\Cloud\\NetworkServices\\V1\352\002\"Google::Cloud::NetworkServices::V1'
  _OPERATIONMETADATA.fields_by_name['create_time']._options = None
  _OPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['end_time']._options = None
  _OPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['target']._options = None
  _OPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['verb']._options = None
  _OPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['status_message']._options = None
  _OPERATIONMETADATA.fields_by_name['status_message']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._options = None
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['api_version']._options = None
  _OPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _TRAFFICPORTSELECTOR.fields_by_name['ports']._options = None
  _TRAFFICPORTSELECTOR.fields_by_name['ports']._serialized_options = b'\340A\001'
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS.fields_by_name['label_name']._options = None
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS.fields_by_name['label_name']._serialized_options = b'\340A\002'
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS.fields_by_name['label_value']._options = None
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS.fields_by_name['label_value']._serialized_options = b'\340A\002'
  _OPERATIONMETADATA._serialized_start=148
  _OPERATIONMETADATA._serialized_end=404
  _TRAFFICPORTSELECTOR._serialized_start=406
  _TRAFFICPORTSELECTOR._serialized_end=447
  _ENDPOINTMATCHER._serialized_start=450
  _ENDPOINTMATCHER._serialized_end=1038
  _ENDPOINTMATCHER_METADATALABELMATCHER._serialized_start=575
  _ENDPOINTMATCHER_METADATALABELMATCHER._serialized_end=1022
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS._serialized_start=848
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELS._serialized_end=915
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELMATCHCRITERIA._serialized_start=917
  _ENDPOINTMATCHER_METADATALABELMATCHER_METADATALABELMATCHCRITERIA._serialized_end=1022
# @@protoc_insertion_point(module_scope)