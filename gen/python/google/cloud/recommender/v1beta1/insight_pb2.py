# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommender/v1beta1/insight.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/recommender/v1beta1/insight.proto\x12 google.cloud.recommender.v1beta1\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xca\t\n\x07Insight\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x18\n\x10target_resources\x18\t \x03(\t\x12\x17\n\x0finsight_subtype\x18\n \x01(\t\x12(\n\x07\x63ontent\x18\x03 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x35\n\x11last_refresh_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x35\n\x12observation_period\x18\x05 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x46\n\nstate_info\x18\x06 \x01(\x0b\x32\x32.google.cloud.recommender.v1beta1.InsightStateInfo\x12\x44\n\x08\x63\x61tegory\x18\x07 \x01(\x0e\x32\x32.google.cloud.recommender.v1beta1.Insight.Category\x12\x44\n\x08severity\x18\x0f \x01(\x0e\x32\x32.google.cloud.recommender.v1beta1.Insight.Severity\x12\x0c\n\x04\x65tag\x18\x0b \x01(\t\x12\x65\n\x1a\x61ssociated_recommendations\x18\x08 \x03(\x0b\x32\x41.google.cloud.recommender.v1beta1.Insight.RecommendationReference\x1a\x31\n\x17RecommendationReference\x12\x16\n\x0erecommendation\x18\x01 \x01(\t\"`\n\x08\x43\x61tegory\x12\x18\n\x14\x43\x41TEGORY_UNSPECIFIED\x10\x00\x12\x08\n\x04\x43OST\x10\x01\x12\x0c\n\x08SECURITY\x10\x02\x12\x0f\n\x0bPERFORMANCE\x10\x03\x12\x11\n\rMANAGEABILITY\x10\x04\"Q\n\x08Severity\x12\x18\n\x14SEVERITY_UNSPECIFIED\x10\x00\x12\x07\n\x03LOW\x10\x01\x12\n\n\x06MEDIUM\x10\x02\x12\x08\n\x04HIGH\x10\x03\x12\x0c\n\x08\x43RITICAL\x10\x04:\x9f\x03\xea\x41\x9b\x03\n\"recommender.googleapis.com/Insight\x12Vprojects/{project}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\x12\x65\x62illingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\x12Tfolders/{folder}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\x12`organizations/{organization}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\"\xb9\x02\n\x10InsightStateInfo\x12G\n\x05state\x18\x01 \x01(\x0e\x32\x38.google.cloud.recommender.v1beta1.InsightStateInfo.State\x12]\n\x0estate_metadata\x18\x02 \x03(\x0b\x32\x45.google.cloud.recommender.v1beta1.InsightStateInfo.StateMetadataEntry\x1a\x34\n\x12StateMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"G\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0c\n\x08\x41\x43\x43\x45PTED\x10\x02\x12\r\n\tDISMISSED\x10\x03\x42\xf6\x03\n$com.google.cloud.recommender.v1beta1P\x01ZKgoogle.golang.org/genproto/googleapis/cloud/recommender/v1beta1;recommender\xa2\x02\x04\x43REC\xaa\x02 Google.Cloud.Recommender.V1Beta1\xea\x41\xd3\x02\n&recommender.googleapis.com/InsightType\x12\x43projects/{project}/locations/{location}/insightTypes/{insight_type}\x12RbillingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}\x12\x41\x66olders/{folder}/locations/{location}/insightTypes/{insight_type}\x12Morganizations/{organization}/locations/{location}/insightTypes/{insight_type}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.recommender.v1beta1.insight_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.recommender.v1beta1P\001ZKgoogle.golang.org/genproto/googleapis/cloud/recommender/v1beta1;recommender\242\002\004CREC\252\002 Google.Cloud.Recommender.V1Beta1\352A\323\002\n&recommender.googleapis.com/InsightType\022Cprojects/{project}/locations/{location}/insightTypes/{insight_type}\022RbillingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}\022Afolders/{folder}/locations/{location}/insightTypes/{insight_type}\022Morganizations/{organization}/locations/{location}/insightTypes/{insight_type}'
  _INSIGHT._options = None
  _INSIGHT._serialized_options = b'\352A\233\003\n\"recommender.googleapis.com/Insight\022Vprojects/{project}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\022ebillingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\022Tfolders/{folder}/locations/{location}/insightTypes/{insight_type}/insights/{insight}\022`organizations/{organization}/locations/{location}/insightTypes/{insight_type}/insights/{insight}'
  _INSIGHTSTATEINFO_STATEMETADATAENTRY._options = None
  _INSIGHTSTATEINFO_STATEMETADATAENTRY._serialized_options = b'8\001'
  _INSIGHT._serialized_start=207
  _INSIGHT._serialized_end=1433
  _INSIGHT_RECOMMENDATIONREFERENCE._serialized_start=785
  _INSIGHT_RECOMMENDATIONREFERENCE._serialized_end=834
  _INSIGHT_CATEGORY._serialized_start=836
  _INSIGHT_CATEGORY._serialized_end=932
  _INSIGHT_SEVERITY._serialized_start=934
  _INSIGHT_SEVERITY._serialized_end=1015
  _INSIGHTSTATEINFO._serialized_start=1436
  _INSIGHTSTATEINFO._serialized_end=1749
  _INSIGHTSTATEINFO_STATEMETADATAENTRY._serialized_start=1624
  _INSIGHTSTATEINFO_STATEMETADATAENTRY._serialized_end=1676
  _INSIGHTSTATEINFO_STATE._serialized_start=1678
  _INSIGHTSTATEINFO_STATE._serialized_end=1749
# @@protoc_insertion_point(module_scope)