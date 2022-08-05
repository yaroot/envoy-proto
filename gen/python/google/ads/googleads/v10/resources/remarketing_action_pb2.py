# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/remarketing_action.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import tag_snippet_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_tag__snippet__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/ads/googleads/v10/resources/remarketing_action.proto\x12\"google.ads.googleads.v10.resources\x1a\x31google/ads/googleads/v10/common/tag_snippet.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xd4\x02\n\x11RemarketingAction\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x05\xfa\x41,\n*googleads.googleapis.com/RemarketingAction\x12\x14\n\x02id\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x11\n\x04name\x18\x06 \x01(\tH\x01\x88\x01\x01\x12\x46\n\x0ctag_snippets\x18\x04 \x03(\x0b\x32+.google.ads.googleads.v10.common.TagSnippetB\x03\xe0\x41\x03:s\xea\x41p\n*googleads.googleapis.com/RemarketingAction\x12\x42\x63ustomers/{customer_id}/remarketingActions/{remarketing_action_id}B\x05\n\x03_idB\x07\n\x05_nameB\x88\x02\n&com.google.ads.googleads.v10.resourcesB\x16RemarketingActionProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.remarketing_action_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\026RemarketingActionProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _REMARKETINGACTION.fields_by_name['resource_name']._options = None
  _REMARKETINGACTION.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A,\n*googleads.googleapis.com/RemarketingAction'
  _REMARKETINGACTION.fields_by_name['id']._options = None
  _REMARKETINGACTION.fields_by_name['id']._serialized_options = b'\340A\003'
  _REMARKETINGACTION.fields_by_name['tag_snippets']._options = None
  _REMARKETINGACTION.fields_by_name['tag_snippets']._serialized_options = b'\340A\003'
  _REMARKETINGACTION._options = None
  _REMARKETINGACTION._serialized_options = b'\352Ap\n*googleads.googleapis.com/RemarketingAction\022Bcustomers/{customer_id}/remarketingActions/{remarketing_action_id}'
  _REMARKETINGACTION._serialized_start=211
  _REMARKETINGACTION._serialized_end=551
# @@protoc_insertion_point(module_scope)
