# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/label.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import text_label_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_text__label__pb2
from google.ads.googleads.v10.enums import label_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_label__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/ads/googleads/v10/resources/label.proto\x12\"google.ads.googleads.v10.resources\x1a\x30google/ads/googleads/v10/common/text_label.proto\x1a\x31google/ads/googleads/v10/enums/label_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xe1\x02\n\x05Label\x12=\n\rresource_name\x18\x01 \x01(\tB&\xe0\x41\x05\xfa\x41 \n\x1egoogleads.googleapis.com/Label\x12\x14\n\x02id\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x11\n\x04name\x18\x07 \x01(\tH\x01\x88\x01\x01\x12P\n\x06status\x18\x04 \x01(\x0e\x32;.google.ads.googleads.v10.enums.LabelStatusEnum.LabelStatusB\x03\xe0\x41\x03\x12>\n\ntext_label\x18\x05 \x01(\x0b\x32*.google.ads.googleads.v10.common.TextLabel:N\xea\x41K\n\x1egoogleads.googleapis.com/Label\x12)customers/{customer_id}/labels/{label_id}B\x05\n\x03_idB\x07\n\x05_nameB\xfc\x01\n&com.google.ads.googleads.v10.resourcesB\nLabelProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.label_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\nLabelProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _LABEL.fields_by_name['resource_name']._options = None
  _LABEL.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A \n\036googleads.googleapis.com/Label'
  _LABEL.fields_by_name['id']._options = None
  _LABEL.fields_by_name['id']._serialized_options = b'\340A\003'
  _LABEL.fields_by_name['status']._options = None
  _LABEL.fields_by_name['status']._serialized_options = b'\340A\003'
  _LABEL._options = None
  _LABEL._serialized_options = b'\352AK\n\036googleads.googleapis.com/Label\022)customers/{customer_id}/labels/{label_id}'
  _LABEL._serialized_start=248
  _LABEL._serialized_end=601
# @@protoc_insertion_point(module_scope)
