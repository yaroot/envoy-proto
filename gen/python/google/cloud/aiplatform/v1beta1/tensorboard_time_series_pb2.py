# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/tensorboard_time_series.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/cloud/aiplatform/v1beta1/tensorboard_time_series.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc9\x06\n\x15TensorboardTimeSeries\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\\\n\nvalue_type\x18\x04 \x01(\x0e\x32@.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries.ValueTypeB\x06\xe0\x41\x02\xe0\x41\x05\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x0c\n\x04\x65tag\x18\x07 \x01(\t\x12\x18\n\x0bplugin_name\x18\x08 \x01(\tB\x03\xe0\x41\x05\x12\x13\n\x0bplugin_data\x18\t \x01(\x0c\x12V\n\x08metadata\x18\n \x01(\x0b\x32?.google.cloud.aiplatform.v1beta1.TensorboardTimeSeries.MetadataB\x03\xe0\x41\x03\x1a\x80\x01\n\x08Metadata\x12\x15\n\x08max_step\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03\x12\x36\n\rmax_wall_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12%\n\x18max_blob_sequence_length\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03\"R\n\tValueType\x12\x1a\n\x16VALUE_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06SCALAR\x10\x01\x12\n\n\x06TENSOR\x10\x02\x12\x11\n\rBLOB_SEQUENCE\x10\x03:\xb6\x01\xea\x41\xb2\x01\n/aiplatform.googleapis.com/TensorboardTimeSeries\x12\x7fprojects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}B\xf7\x01\n#com.google.cloud.aiplatform.v1beta1B\x1aTensorboardTimeSeriesProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\xaa\x02\x1fGoogle.Cloud.AIPlatform.V1Beta1\xca\x02\x1fGoogle\\Cloud\\AIPlatform\\V1beta1\xea\x02\"Google::Cloud::AIPlatform::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.tensorboard_time_series_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.v1beta1B\032TensorboardTimeSeriesProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1'
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_step']._options = None
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_step']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_wall_time']._options = None
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_wall_time']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_blob_sequence_length']._options = None
  _TENSORBOARDTIMESERIES_METADATA.fields_by_name['max_blob_sequence_length']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES.fields_by_name['name']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['name']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES.fields_by_name['display_name']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _TENSORBOARDTIMESERIES.fields_by_name['value_type']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['value_type']._serialized_options = b'\340A\002\340A\005'
  _TENSORBOARDTIMESERIES.fields_by_name['create_time']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES.fields_by_name['update_time']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES.fields_by_name['plugin_name']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['plugin_name']._serialized_options = b'\340A\005'
  _TENSORBOARDTIMESERIES.fields_by_name['metadata']._options = None
  _TENSORBOARDTIMESERIES.fields_by_name['metadata']._serialized_options = b'\340A\003'
  _TENSORBOARDTIMESERIES._options = None
  _TENSORBOARDTIMESERIES._serialized_options = b'\352A\262\001\n/aiplatform.googleapis.com/TensorboardTimeSeries\022\177projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}'
  _TENSORBOARDTIMESERIES._serialized_start=192
  _TENSORBOARDTIMESERIES._serialized_end=1033
  _TENSORBOARDTIMESERIES_METADATA._serialized_start=636
  _TENSORBOARDTIMESERIES_METADATA._serialized_end=764
  _TENSORBOARDTIMESERIES_VALUETYPE._serialized_start=766
  _TENSORBOARDTIMESERIES_VALUETYPE._serialized_end=848
# @@protoc_insertion_point(module_scope)
