# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/ad_group_ad_label.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/ads/googleads/v11/resources/ad_group_ad_label.proto\x12\"google.ads.googleads.v11.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xec\x02\n\x0e\x41\x64GroupAdLabel\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x05\xfa\x41)\n\'googleads.googleapis.com/AdGroupAdLabel\x12\x44\n\x0b\x61\x64_group_ad\x18\x04 \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/AdGroupAdH\x00\x88\x01\x01\x12:\n\x05label\x18\x05 \x01(\tB&\xe0\x41\x05\xfa\x41 \n\x1egoogleads.googleapis.com/LabelH\x01\x88\x01\x01:v\xea\x41s\n\'googleads.googleapis.com/AdGroupAdLabel\x12Hcustomers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}~{label_id}B\x0e\n\x0c_ad_group_adB\x08\n\x06_labelB\x85\x02\n&com.google.ads.googleads.v11.resourcesB\x13\x41\x64GroupAdLabelProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.ad_group_ad_label_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\023AdGroupAdLabelProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _ADGROUPADLABEL.fields_by_name['resource_name']._options = None
  _ADGROUPADLABEL.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A)\n\'googleads.googleapis.com/AdGroupAdLabel'
  _ADGROUPADLABEL.fields_by_name['ad_group_ad']._options = None
  _ADGROUPADLABEL.fields_by_name['ad_group_ad']._serialized_options = b'\340A\005\372A$\n\"googleads.googleapis.com/AdGroupAd'
  _ADGROUPADLABEL.fields_by_name['label']._options = None
  _ADGROUPADLABEL.fields_by_name['label']._serialized_options = b'\340A\005\372A \n\036googleads.googleapis.com/Label'
  _ADGROUPADLABEL._options = None
  _ADGROUPADLABEL._serialized_options = b'\352As\n\'googleads.googleapis.com/AdGroupAdLabel\022Hcustomers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}~{label_id}'
  _ADGROUPADLABEL._serialized_start=159
  _ADGROUPADLABEL._serialized_end=523
# @@protoc_insertion_point(module_scope)
