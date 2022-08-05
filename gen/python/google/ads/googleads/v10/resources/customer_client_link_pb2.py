# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/customer_client_link.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import manager_link_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_manager__link__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/ads/googleads/v10/resources/customer_client_link.proto\x12\"google.ads.googleads.v10.resources\x1a\x38google/ads/googleads/v10/enums/manager_link_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xf5\x03\n\x12\x43ustomerClientLink\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x05\xfa\x41-\n+googleads.googleapis.com/CustomerClientLink\x12G\n\x0f\x63lient_customer\x18\x07 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CustomerH\x00\x88\x01\x01\x12!\n\x0fmanager_link_id\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12W\n\x06status\x18\x05 \x01(\x0e\x32G.google.ads.googleads.v10.enums.ManagerLinkStatusEnum.ManagerLinkStatus\x12\x13\n\x06hidden\x18\t \x01(\x08H\x02\x88\x01\x01:\x85\x01\xea\x41\x81\x01\n+googleads.googleapis.com/CustomerClientLink\x12Rcustomers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}B\x12\n\x10_client_customerB\x12\n\x10_manager_link_idB\t\n\x07_hiddenB\x89\x02\n&com.google.ads.googleads.v10.resourcesB\x17\x43ustomerClientLinkProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.customer_client_link_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\027CustomerClientLinkProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CUSTOMERCLIENTLINK.fields_by_name['resource_name']._options = None
  _CUSTOMERCLIENTLINK.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A-\n+googleads.googleapis.com/CustomerClientLink'
  _CUSTOMERCLIENTLINK.fields_by_name['client_customer']._options = None
  _CUSTOMERCLIENTLINK.fields_by_name['client_customer']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Customer'
  _CUSTOMERCLIENTLINK.fields_by_name['manager_link_id']._options = None
  _CUSTOMERCLIENTLINK.fields_by_name['manager_link_id']._serialized_options = b'\340A\003'
  _CUSTOMERCLIENTLINK._options = None
  _CUSTOMERCLIENTLINK._serialized_options = b'\352A\201\001\n+googleads.googleapis.com/CustomerClientLink\022Rcustomers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}'
  _CUSTOMERCLIENTLINK._serialized_start=220
  _CUSTOMERCLIENTLINK._serialized_end=721
# @@protoc_insertion_point(module_scope)
