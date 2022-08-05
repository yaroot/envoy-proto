# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2/prediction_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2 import user_event_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_user__event__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/retail/v2/prediction_service.proto\x12\x16google.cloud.retail.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\'google/cloud/retail/v2/user_event.proto\x1a\x1cgoogle/protobuf/struct.proto\"\xb4\x03\n\x0ePredictRequest\x12\x16\n\tplacement\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12:\n\nuser_event\x18\x02 \x01(\x0b\x32!.google.cloud.retail.v2.UserEventB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x16\n\npage_token\x18\x04 \x01(\tB\x02\x18\x01\x12\x0e\n\x06\x66ilter\x18\x05 \x01(\t\x12\x15\n\rvalidate_only\x18\x06 \x01(\x08\x12\x42\n\x06params\x18\x07 \x03(\x0b\x32\x32.google.cloud.retail.v2.PredictRequest.ParamsEntry\x12\x42\n\x06labels\x18\x08 \x03(\x0b\x32\x32.google.cloud.retail.v2.PredictRequest.LabelsEntry\x1a\x45\n\x0bParamsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xe7\x02\n\x0fPredictResponse\x12I\n\x07results\x18\x01 \x03(\x0b\x32\x38.google.cloud.retail.v2.PredictResponse.PredictionResult\x12\x19\n\x11\x61ttribution_token\x18\x02 \x01(\t\x12\x13\n\x0bmissing_ids\x18\x03 \x03(\t\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x1a\xc1\x01\n\x10PredictionResult\x12\n\n\x02id\x18\x01 \x01(\t\x12X\n\x08metadata\x18\x02 \x03(\x0b\x32\x46.google.cloud.retail.v2.PredictResponse.PredictionResult.MetadataEntry\x1aG\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\x32\xe1\x02\n\x11PredictionService\x12\x80\x02\n\x07Predict\x12&.google.cloud.retail.v2.PredictRequest\x1a\'.google.cloud.retail.v2.PredictResponse\"\xa3\x01\x82\xd3\xe4\x93\x02\x9c\x01\"F/v2/{placement=projects/*/locations/*/catalogs/*/placements/*}:predict:\x01*ZO\"J/v2/{placement=projects/*/locations/*/catalogs/*/servingConfigs/*}:predict:\x01*\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xcb\x01\n\x1a\x63om.google.cloud.retail.v2B\x16PredictionServiceProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\xa2\x02\x06RETAIL\xaa\x02\x16Google.Cloud.Retail.V2\xca\x02\x16Google\\Cloud\\Retail\\V2\xea\x02\x19Google::Cloud::Retail::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2.prediction_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.retail.v2B\026PredictionServiceProtoP\001Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2'
  _PREDICTREQUEST_PARAMSENTRY._options = None
  _PREDICTREQUEST_PARAMSENTRY._serialized_options = b'8\001'
  _PREDICTREQUEST_LABELSENTRY._options = None
  _PREDICTREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _PREDICTREQUEST.fields_by_name['placement']._options = None
  _PREDICTREQUEST.fields_by_name['placement']._serialized_options = b'\340A\002'
  _PREDICTREQUEST.fields_by_name['user_event']._options = None
  _PREDICTREQUEST.fields_by_name['user_event']._serialized_options = b'\340A\002'
  _PREDICTREQUEST.fields_by_name['page_token']._options = None
  _PREDICTREQUEST.fields_by_name['page_token']._serialized_options = b'\030\001'
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._options = None
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_options = b'8\001'
  _PREDICTIONSERVICE._options = None
  _PREDICTIONSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _PREDICTIONSERVICE.methods_by_name['Predict']._options = None
  _PREDICTIONSERVICE.methods_by_name['Predict']._serialized_options = b'\202\323\344\223\002\234\001\"F/v2/{placement=projects/*/locations/*/catalogs/*/placements/*}:predict:\001*ZO\"J/v2/{placement=projects/*/locations/*/catalogs/*/servingConfigs/*}:predict:\001*'
  _PREDICTREQUEST._serialized_start=262
  _PREDICTREQUEST._serialized_end=698
  _PREDICTREQUEST_PARAMSENTRY._serialized_start=582
  _PREDICTREQUEST_PARAMSENTRY._serialized_end=651
  _PREDICTREQUEST_LABELSENTRY._serialized_start=653
  _PREDICTREQUEST_LABELSENTRY._serialized_end=698
  _PREDICTRESPONSE._serialized_start=701
  _PREDICTRESPONSE._serialized_end=1060
  _PREDICTRESPONSE_PREDICTIONRESULT._serialized_start=867
  _PREDICTRESPONSE_PREDICTIONRESULT._serialized_end=1060
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_start=989
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_end=1060
  _PREDICTIONSERVICE._serialized_start=1063
  _PREDICTIONSERVICE._serialized_end=1416
# @@protoc_insertion_point(module_scope)
