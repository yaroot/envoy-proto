# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/control.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2alpha import common_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2
from google.cloud.retail.v2alpha import search_service_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_search__service__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/retail/v2alpha/control.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/retail/v2alpha/common.proto\x1a\x30google/cloud/retail/v2alpha/search_service.proto\"\x85\x04\n\x07\x43ontrol\x12N\n\nfacet_spec\x18\x03 \x01(\x0b\x32\x34.google.cloud.retail.v2alpha.SearchRequest.FacetSpecB\x02\x18\x01H\x00\x12\x31\n\x04rule\x18\x04 \x01(\x0b\x32!.google.cloud.retail.v2alpha.RuleH\x00\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12*\n\x1d\x61ssociated_serving_config_ids\x18\x05 \x03(\tB\x03\xe0\x41\x03\x12I\n\x0esolution_types\x18\x06 \x03(\x0e\x32).google.cloud.retail.v2alpha.SolutionTypeB\x06\xe0\x41\x02\xe0\x41\x05\x12T\n\x18search_solution_use_case\x18\x07 \x03(\x0e\x32\x32.google.cloud.retail.v2alpha.SearchSolutionUseCase:q\xea\x41n\n\x1dretail.googleapis.com/Control\x12Mprojects/{project}/locations/{location}/catalogs/{catalog}/controls/{control}B\t\n\x07\x63ontrolB\xda\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x0c\x43ontrolProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2alpha.control_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.retail.v2alphaB\014ControlProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha'
  _CONTROL.fields_by_name['facet_spec']._options = None
  _CONTROL.fields_by_name['facet_spec']._serialized_options = b'\030\001'
  _CONTROL.fields_by_name['name']._options = None
  _CONTROL.fields_by_name['name']._serialized_options = b'\340A\005'
  _CONTROL.fields_by_name['display_name']._options = None
  _CONTROL.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _CONTROL.fields_by_name['associated_serving_config_ids']._options = None
  _CONTROL.fields_by_name['associated_serving_config_ids']._serialized_options = b'\340A\003'
  _CONTROL.fields_by_name['solution_types']._options = None
  _CONTROL.fields_by_name['solution_types']._serialized_options = b'\340A\002\340A\005'
  _CONTROL._options = None
  _CONTROL._serialized_options = b'\352An\n\035retail.googleapis.com/Control\022Mprojects/{project}/locations/{location}/catalogs/{catalog}/controls/{control}'
  _CONTROL._serialized_start=227
  _CONTROL._serialized_end=744
# @@protoc_insertion_point(module_scope)
