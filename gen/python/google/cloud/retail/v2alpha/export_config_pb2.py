# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/export_config.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/retail/v2alpha/export_config.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"9\n\x12\x45xportErrorsConfig\x12\x14\n\ngcs_prefix\x18\x01 \x01(\tH\x00\x42\r\n\x0b\x64\x65stination\"r\n\x0e\x45xportMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xcd\x01\n\x16\x45xportProductsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x46\n\rerrors_config\x18\x02 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ExportErrorsConfig\x12@\n\routput_result\x18\x03 \x01(\x0b\x32).google.cloud.retail.v2alpha.OutputResult\"\xcf\x01\n\x18\x45xportUserEventsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x46\n\rerrors_config\x18\x02 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ExportErrorsConfig\x12@\n\routput_result\x18\x03 \x01(\x0b\x32).google.cloud.retail.v2alpha.OutputResult\"\x9c\x01\n\x0cOutputResult\x12J\n\x0f\x62igquery_result\x18\x01 \x03(\x0b\x32\x31.google.cloud.retail.v2alpha.BigQueryOutputResult\x12@\n\ngcs_result\x18\x02 \x03(\x0b\x32,.google.cloud.retail.v2alpha.GcsOutputResult\"<\n\x14\x42igQueryOutputResult\x12\x12\n\ndataset_id\x18\x01 \x01(\t\x12\x10\n\x08table_id\x18\x02 \x01(\t\"%\n\x0fGcsOutputResult\x12\x12\n\noutput_uri\x18\x01 \x01(\tB\xdf\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x11\x45xportConfigProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2alpha.export_config_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.retail.v2alphaB\021ExportConfigProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha'
  _EXPORTERRORSCONFIG._serialized_start=198
  _EXPORTERRORSCONFIG._serialized_end=255
  _EXPORTMETADATA._serialized_start=257
  _EXPORTMETADATA._serialized_end=371
  _EXPORTPRODUCTSRESPONSE._serialized_start=374
  _EXPORTPRODUCTSRESPONSE._serialized_end=579
  _EXPORTUSEREVENTSRESPONSE._serialized_start=582
  _EXPORTUSEREVENTSRESPONSE._serialized_end=789
  _OUTPUTRESULT._serialized_start=792
  _OUTPUTRESULT._serialized_end=948
  _BIGQUERYOUTPUTRESULT._serialized_start=950
  _BIGQUERYOUTPUTRESULT._serialized_end=1010
  _GCSOUTPUTRESULT._serialized_start=1012
  _GCSOUTPUTRESULT._serialized_end=1049
# @@protoc_insertion_point(module_scope)
