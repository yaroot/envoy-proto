# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.recommendationengine.v1beta1 import recommendationengine_resources_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_recommendationengine__resources__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nRgoogle/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto\x12)google.cloud.recommendationengine.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x17google/api/client.proto\x1aNgoogle/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto\"/\n\x1cPredictionApiKeyRegistration\x12\x0f\n\x07\x61pi_key\x18\x01 \x01(\t\"\xea\x01\n)CreatePredictionApiKeyRegistrationRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.recommendationengine.googleapis.com/EventStore\x12u\n\x1fprediction_api_key_registration\x18\x02 \x01(\x0b\x32G.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationB\x03\xe0\x41\x02\"\xa3\x01\n(ListPredictionApiKeyRegistrationsRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.recommendationengine.googleapis.com/EventStore\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\xb7\x01\n)ListPredictionApiKeyRegistrationsResponse\x12q\n prediction_api_key_registrations\x18\x01 \x03(\x0b\x32G.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x83\x01\n)DeletePredictionApiKeyRegistrationRequest\x12V\n\x04name\x18\x01 \x01(\tBH\xe0\x41\x02\xfa\x41\x42\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration2\x97\x08\n\x18PredictionApiKeyRegistry\x12\xd9\x02\n\"CreatePredictionApiKeyRegistration\x12T.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest\x1aG.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration\"\x93\x01\x82\xd3\xe4\x93\x02\x64\"_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations:\x01*\xda\x41&parent,prediction_api_key_registration\x12\xc0\x02\n!ListPredictionApiKeyRegistrations\x12S.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest\x1aT.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse\"p\x82\xd3\xe4\x93\x02\x61\x12_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations\xda\x41\x06parent\x12\x82\x02\n\"DeletePredictionApiKeyRegistration\x12T.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest\x1a\x16.google.protobuf.Empty\"n\x82\xd3\xe4\x93\x02\x61*_/v1beta1/{name=projects/*/locations/*/catalogs/*/eventStores/*/predictionApiKeyRegistrations/*}\xda\x41\x04name\x1aW\xca\x41#recommendationengine.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x9f\x02\n-com.google.cloud.recommendationengine.v1beta1P\x01Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\xa2\x02\x05RECAI\xaa\x02)Google.Cloud.RecommendationEngine.V1Beta1\xca\x02)Google\\Cloud\\RecommendationEngine\\V1beta1\xea\x02,Google::Cloud::RecommendationEngine::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n-com.google.cloud.recommendationengine.v1beta1P\001Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\242\002\005RECAI\252\002)Google.Cloud.RecommendationEngine.V1Beta1\312\002)Google\\Cloud\\RecommendationEngine\\V1beta1\352\002,Google::Cloud::RecommendationEngine::V1beta1'
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['parent']._options = None
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\n.recommendationengine.googleapis.com/EventStore'
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['prediction_api_key_registration']._options = None
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['prediction_api_key_registration']._serialized_options = b'\340A\002'
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['parent']._options = None
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\n.recommendationengine.googleapis.com/EventStore'
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_size']._options = None
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_token']._options = None
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['name']._options = None
  _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372AB\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration'
  _PREDICTIONAPIKEYREGISTRY._options = None
  _PREDICTIONAPIKEYREGISTRY._serialized_options = b'\312A#recommendationengine.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['CreatePredictionApiKeyRegistration']._options = None
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['CreatePredictionApiKeyRegistration']._serialized_options = b'\202\323\344\223\002d\"_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations:\001*\332A&parent,prediction_api_key_registration'
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['ListPredictionApiKeyRegistrations']._options = None
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['ListPredictionApiKeyRegistrations']._serialized_options = b'\202\323\344\223\002a\022_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations\332A\006parent'
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['DeletePredictionApiKeyRegistration']._options = None
  _PREDICTIONAPIKEYREGISTRY.methods_by_name['DeletePredictionApiKeyRegistration']._serialized_options = b'\202\323\344\223\002a*_/v1beta1/{name=projects/*/locations/*/catalogs/*/eventStores/*/predictionApiKeyRegistrations/*}\332A\004name'
  _PREDICTIONAPIKEYREGISTRATION._serialized_start=353
  _PREDICTIONAPIKEYREGISTRATION._serialized_end=400
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST._serialized_start=403
  _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST._serialized_end=637
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST._serialized_start=640
  _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST._serialized_end=803
  _LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE._serialized_start=806
  _LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE._serialized_end=989
  _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST._serialized_start=992
  _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST._serialized_end=1123
  _PREDICTIONAPIKEYREGISTRY._serialized_start=1126
  _PREDICTIONAPIKEYREGISTRY._serialized_end=2173
# @@protoc_insertion_point(module_scope)
