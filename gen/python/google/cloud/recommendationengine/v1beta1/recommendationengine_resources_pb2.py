# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nNgoogle/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto\x12)google.cloud.recommendationengine.v1beta1\x1a\x19google/api/resource.protoB\xab\x08\n-com.google.cloud.recommendationengine.v1beta1P\x01Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\xa2\x02\x05RECAI\xaa\x02)Google.Cloud.RecommendationEngine.V1Beta1\xca\x02)Google\\Cloud\\RecommendationEngine\\V1beta1\xea\x02,Google::Cloud::RecommendationEngine::V1beta1\xea\x41i\n+recommendationengine.googleapis.com/Catalog\x12:projects/{project}/locations/{location}/catalogs/{catalog}\xea\x41\x95\x01\n3recommendationengine.googleapis.com/CatalogItemPath\x12^projects/{project}/locations/{location}/catalogs/{catalog}/catalogItems/{catalog_item_path=**}\xea\x41\x86\x01\n.recommendationengine.googleapis.com/EventStore\x12Tprojects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}\xea\x41\xd9\x01\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration\x12\x94\x01projects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}/predictionApiKeyRegistrations/{prediction_api_key_registration}\xea\x41\x9c\x01\n-recommendationengine.googleapis.com/Placement\x12kprojects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}/placements/{placement}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.recommendationengine.v1beta1.recommendationengine_resources_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n-com.google.cloud.recommendationengine.v1beta1P\001Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\242\002\005RECAI\252\002)Google.Cloud.RecommendationEngine.V1Beta1\312\002)Google\\Cloud\\RecommendationEngine\\V1beta1\352\002,Google::Cloud::RecommendationEngine::V1beta1\352Ai\n+recommendationengine.googleapis.com/Catalog\022:projects/{project}/locations/{location}/catalogs/{catalog}\352A\225\001\n3recommendationengine.googleapis.com/CatalogItemPath\022^projects/{project}/locations/{location}/catalogs/{catalog}/catalogItems/{catalog_item_path=**}\352A\206\001\n.recommendationengine.googleapis.com/EventStore\022Tprojects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}\352A\331\001\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration\022\224\001projects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}/predictionApiKeyRegistrations/{prediction_api_key_registration}\352A\234\001\n-recommendationengine.googleapis.com/Placement\022kprojects/{project}/locations/{location}/catalogs/{catalog}/eventStores/{event_store}/placements/{placement}'
# @@protoc_insertion_point(module_scope)
