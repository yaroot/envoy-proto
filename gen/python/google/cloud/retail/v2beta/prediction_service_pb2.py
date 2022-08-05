# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2beta/prediction_service.proto
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
from google.cloud.retail.v2beta import user_event_pb2 as google_dot_cloud_dot_retail_dot_v2beta_dot_user__event__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/retail/v2beta/prediction_service.proto\x12\x1agoogle.cloud.retail.v2beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a+google/cloud/retail/v2beta/user_event.proto\x1a\x1cgoogle/protobuf/struct.proto\"\xbc\x03\n\x0ePredictRequest\x12\x16\n\tplacement\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12>\n\nuser_event\x18\x02 \x01(\x0b\x32%.google.cloud.retail.v2beta.UserEventB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x05 \x01(\t\x12\x15\n\rvalidate_only\x18\x06 \x01(\x08\x12\x46\n\x06params\x18\x07 \x03(\x0b\x32\x36.google.cloud.retail.v2beta.PredictRequest.ParamsEntry\x12\x46\n\x06labels\x18\x08 \x03(\x0b\x32\x36.google.cloud.retail.v2beta.PredictRequest.LabelsEntry\x1a\x45\n\x0bParamsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xef\x02\n\x0fPredictResponse\x12M\n\x07results\x18\x01 \x03(\x0b\x32<.google.cloud.retail.v2beta.PredictResponse.PredictionResult\x12\x19\n\x11\x61ttribution_token\x18\x02 \x01(\t\x12\x13\n\x0bmissing_ids\x18\x03 \x03(\t\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x1a\xc5\x01\n\x10PredictionResult\x12\n\n\x02id\x18\x01 \x01(\t\x12\\\n\x08metadata\x18\x02 \x03(\x0b\x32J.google.cloud.retail.v2beta.PredictResponse.PredictionResult.MetadataEntry\x1aG\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\x32\xf1\x02\n\x11PredictionService\x12\x90\x02\n\x07Predict\x12*.google.cloud.retail.v2beta.PredictRequest\x1a+.google.cloud.retail.v2beta.PredictResponse\"\xab\x01\x82\xd3\xe4\x93\x02\xa4\x01\"J/v2beta/{placement=projects/*/locations/*/catalogs/*/placements/*}:predict:\x01*ZS\"N/v2beta/{placement=projects/*/locations/*/catalogs/*/servingConfigs/*}:predict:\x01*\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xdf\x01\n\x1e\x63om.google.cloud.retail.v2betaB\x16PredictionServiceProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\xa2\x02\x06RETAIL\xaa\x02\x1aGoogle.Cloud.Retail.V2Beta\xca\x02\x1aGoogle\\Cloud\\Retail\\V2beta\xea\x02\x1dGoogle::Cloud::Retail::V2betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2beta.prediction_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.retail.v2betaB\026PredictionServiceProtoP\001Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::Cloud::Retail::V2beta'
  _PREDICTREQUEST_PARAMSENTRY._options = None
  _PREDICTREQUEST_PARAMSENTRY._serialized_options = b'8\001'
  _PREDICTREQUEST_LABELSENTRY._options = None
  _PREDICTREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _PREDICTREQUEST.fields_by_name['placement']._options = None
  _PREDICTREQUEST.fields_by_name['placement']._serialized_options = b'\340A\002'
  _PREDICTREQUEST.fields_by_name['user_event']._options = None
  _PREDICTREQUEST.fields_by_name['user_event']._serialized_options = b'\340A\002'
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._options = None
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_options = b'8\001'
  _PREDICTIONSERVICE._options = None
  _PREDICTIONSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _PREDICTIONSERVICE.methods_by_name['Predict']._options = None
  _PREDICTIONSERVICE.methods_by_name['Predict']._serialized_options = b'\202\323\344\223\002\244\001\"J/v2beta/{placement=projects/*/locations/*/catalogs/*/placements/*}:predict:\001*ZS\"N/v2beta/{placement=projects/*/locations/*/catalogs/*/servingConfigs/*}:predict:\001*'
  _PREDICTREQUEST._serialized_start=274
  _PREDICTREQUEST._serialized_end=718
  _PREDICTREQUEST_PARAMSENTRY._serialized_start=602
  _PREDICTREQUEST_PARAMSENTRY._serialized_end=671
  _PREDICTREQUEST_LABELSENTRY._serialized_start=673
  _PREDICTREQUEST_LABELSENTRY._serialized_end=718
  _PREDICTRESPONSE._serialized_start=721
  _PREDICTRESPONSE._serialized_end=1088
  _PREDICTRESPONSE_PREDICTIONRESULT._serialized_start=891
  _PREDICTRESPONSE_PREDICTIONRESULT._serialized_end=1088
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_start=1017
  _PREDICTRESPONSE_PREDICTIONRESULT_METADATAENTRY._serialized_end=1088
  _PREDICTIONSERVICE._serialized_start=1091
  _PREDICTIONSERVICE._serialized_end=1460
# @@protoc_insertion_point(module_scope)
