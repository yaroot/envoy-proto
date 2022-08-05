# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/tensorboard_data.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.aiplatform.v1 import tensorboard_time_series_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_tensorboard__time__series__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/aiplatform/v1/tensorboard_data.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x38google/cloud/aiplatform/v1/tensorboard_time_series.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd8\x01\n\x0eTimeSeriesData\x12\'\n\x1atensorboard_time_series_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12W\n\nvalue_type\x18\x02 \x01(\x0e\x32;.google.cloud.aiplatform.v1.TensorboardTimeSeries.ValueTypeB\x06\xe0\x41\x02\xe0\x41\x05\x12\x44\n\x06values\x18\x03 \x03(\x0b\x32/.google.cloud.aiplatform.v1.TimeSeriesDataPointB\x03\xe0\x41\x02\"\x98\x02\n\x13TimeSeriesDataPoint\x12\x34\n\x06scalar\x18\x03 \x01(\x0b\x32\".google.cloud.aiplatform.v1.ScalarH\x00\x12?\n\x06tensor\x18\x04 \x01(\x0b\x32-.google.cloud.aiplatform.v1.TensorboardTensorH\x00\x12\x44\n\x05\x62lobs\x18\x05 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1.TensorboardBlobSequenceH\x00\x12-\n\twall_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04step\x18\x02 \x01(\x03\x42\x07\n\x05value\"\x17\n\x06Scalar\x12\r\n\x05value\x18\x01 \x01(\x01\"D\n\x11TensorboardTensor\x12\x12\n\x05value\x18\x01 \x01(\x0c\x42\x03\xe0\x41\x02\x12\x1b\n\x0eversion_number\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\"V\n\x17TensorboardBlobSequence\x12;\n\x06values\x18\x01 \x03(\x0b\x32+.google.cloud.aiplatform.v1.TensorboardBlob\"5\n\x0fTensorboardBlob\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04\x64\x61ta\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x01\x42\xd8\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x14TensorboardDataProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.tensorboard_data_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\024TensorboardDataProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _TIMESERIESDATA.fields_by_name['tensorboard_time_series_id']._options = None
  _TIMESERIESDATA.fields_by_name['tensorboard_time_series_id']._serialized_options = b'\340A\002'
  _TIMESERIESDATA.fields_by_name['value_type']._options = None
  _TIMESERIESDATA.fields_by_name['value_type']._serialized_options = b'\340A\002\340A\005'
  _TIMESERIESDATA.fields_by_name['values']._options = None
  _TIMESERIESDATA.fields_by_name['values']._serialized_options = b'\340A\002'
  _TENSORBOARDTENSOR.fields_by_name['value']._options = None
  _TENSORBOARDTENSOR.fields_by_name['value']._serialized_options = b'\340A\002'
  _TENSORBOARDTENSOR.fields_by_name['version_number']._options = None
  _TENSORBOARDTENSOR.fields_by_name['version_number']._serialized_options = b'\340A\001'
  _TENSORBOARDBLOB.fields_by_name['id']._options = None
  _TENSORBOARDBLOB.fields_by_name['id']._serialized_options = b'\340A\003'
  _TENSORBOARDBLOB.fields_by_name['data']._options = None
  _TENSORBOARDBLOB.fields_by_name['data']._serialized_options = b'\340A\001'
  _TIMESERIESDATA._serialized_start=206
  _TIMESERIESDATA._serialized_end=422
  _TIMESERIESDATAPOINT._serialized_start=425
  _TIMESERIESDATAPOINT._serialized_end=705
  _SCALAR._serialized_start=707
  _SCALAR._serialized_end=730
  _TENSORBOARDTENSOR._serialized_start=732
  _TENSORBOARDTENSOR._serialized_end=800
  _TENSORBOARDBLOBSEQUENCE._serialized_start=802
  _TENSORBOARDBLOBSEQUENCE._serialized_end=888
  _TENSORBOARDBLOB._serialized_start=890
  _TENSORBOARDBLOB._serialized_end=943
# @@protoc_insertion_point(module_scope)
