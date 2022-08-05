# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2beta/export_config.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/retail/v2beta/export_config.proto\x12\x1agoogle.cloud.retail.v2beta\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"9\n\x12\x45xportErrorsConfig\x12\x14\n\ngcs_prefix\x18\x01 \x01(\tH\x00\x42\r\n\x0b\x64\x65stination\"r\n\x0e\x45xportMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xcb\x01\n\x16\x45xportProductsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x45\n\rerrors_config\x18\x02 \x01(\x0b\x32..google.cloud.retail.v2beta.ExportErrorsConfig\x12?\n\routput_result\x18\x03 \x01(\x0b\x32(.google.cloud.retail.v2beta.OutputResult\"\xcd\x01\n\x18\x45xportUserEventsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x45\n\rerrors_config\x18\x02 \x01(\x0b\x32..google.cloud.retail.v2beta.ExportErrorsConfig\x12?\n\routput_result\x18\x03 \x01(\x0b\x32(.google.cloud.retail.v2beta.OutputResult\"Y\n\x0cOutputResult\x12I\n\x0f\x62igquery_result\x18\x01 \x03(\x0b\x32\x30.google.cloud.retail.v2beta.BigQueryOutputResult\"<\n\x14\x42igQueryOutputResult\x12\x12\n\ndataset_id\x18\x01 \x01(\t\x12\x10\n\x08table_id\x18\x02 \x01(\tB\xda\x01\n\x1e\x63om.google.cloud.retail.v2betaB\x11\x45xportConfigProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\xa2\x02\x06RETAIL\xaa\x02\x1aGoogle.Cloud.Retail.V2Beta\xca\x02\x1aGoogle\\Cloud\\Retail\\V2beta\xea\x02\x1dGoogle::Cloud::Retail::V2betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2beta.export_config_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.retail.v2betaB\021ExportConfigProtoP\001Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::Cloud::Retail::V2beta'
  _EXPORTERRORSCONFIG._serialized_start=196
  _EXPORTERRORSCONFIG._serialized_end=253
  _EXPORTMETADATA._serialized_start=255
  _EXPORTMETADATA._serialized_end=369
  _EXPORTPRODUCTSRESPONSE._serialized_start=372
  _EXPORTPRODUCTSRESPONSE._serialized_end=575
  _EXPORTUSEREVENTSRESPONSE._serialized_start=578
  _EXPORTUSEREVENTSRESPONSE._serialized_end=783
  _OUTPUTRESULT._serialized_start=785
  _OUTPUTRESULT._serialized_end=874
  _BIGQUERYOUTPUTRESULT._serialized_start=876
  _BIGQUERYOUTPUTRESULT._serialized_end=936
# @@protoc_insertion_point(module_scope)
