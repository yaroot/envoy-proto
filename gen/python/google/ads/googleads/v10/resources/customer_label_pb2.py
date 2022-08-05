# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/customer_label.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/ads/googleads/v10/resources/customer_label.proto\x12\"google.ads.googleads.v10.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xcb\x02\n\rCustomerLabel\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x05\xfa\x41(\n&googleads.googleapis.com/CustomerLabel\x12@\n\x08\x63ustomer\x18\x04 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CustomerH\x00\x88\x01\x01\x12:\n\x05label\x18\x05 \x01(\tB&\xe0\x41\x03\xfa\x41 \n\x1egoogleads.googleapis.com/LabelH\x01\x88\x01\x01:^\xea\x41[\n&googleads.googleapis.com/CustomerLabel\x12\x31\x63ustomers/{customer_id}/customerLabels/{label_id}B\x0b\n\t_customerB\x08\n\x06_labelB\x84\x02\n&com.google.ads.googleads.v10.resourcesB\x12\x43ustomerLabelProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.customer_label_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\022CustomerLabelProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CUSTOMERLABEL.fields_by_name['resource_name']._options = None
  _CUSTOMERLABEL.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A(\n&googleads.googleapis.com/CustomerLabel'
  _CUSTOMERLABEL.fields_by_name['customer']._options = None
  _CUSTOMERLABEL.fields_by_name['customer']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Customer'
  _CUSTOMERLABEL.fields_by_name['label']._options = None
  _CUSTOMERLABEL.fields_by_name['label']._serialized_options = b'\340A\003\372A \n\036googleads.googleapis.com/Label'
  _CUSTOMERLABEL._options = None
  _CUSTOMERLABEL._serialized_options = b'\352A[\n&googleads.googleapis.com/CustomerLabel\0221customers/{customer_id}/customerLabels/{label_id}'
  _CUSTOMERLABEL._serialized_start=156
  _CUSTOMERLABEL._serialized_end=487
# @@protoc_insertion_point(module_scope)
