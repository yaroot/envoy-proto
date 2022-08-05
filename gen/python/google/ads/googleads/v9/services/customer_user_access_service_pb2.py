# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/customer_user_access_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import customer_user_access_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_customer__user__access__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/ads/googleads/v9/services/customer_user_access_service.proto\x12 google.ads.googleads.v9.services\x1a<google/ads/googleads/v9/resources/customer_user_access.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"j\n\x1cGetCustomerUserAccessRequest\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/CustomerUserAccess\"\x92\x01\n\x1fMutateCustomerUserAccessRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12U\n\toperation\x18\x02 \x01(\x0b\x32=.google.ads.googleads.v9.services.CustomerUserAccessOperationB\x03\xe0\x41\x02\"\xb6\x01\n\x1b\x43ustomerUserAccessOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12G\n\x06update\x18\x01 \x01(\x0b\x32\x35.google.ads.googleads.v9.resources.CustomerUserAccessH\x00\x12\x10\n\x06remove\x18\x02 \x01(\tH\x00\x42\x0b\n\toperation\"t\n MutateCustomerUserAccessResponse\x12P\n\x06result\x18\x01 \x01(\x0b\x32@.google.ads.googleads.v9.services.MutateCustomerUserAccessResult\"7\n\x1eMutateCustomerUserAccessResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xc5\x04\n\x19\x43ustomerUserAccessService\x12\xde\x01\n\x15GetCustomerUserAccess\x12>.google.ads.googleads.v9.services.GetCustomerUserAccessRequest\x1a\x35.google.ads.googleads.v9.resources.CustomerUserAccess\"N\x82\xd3\xe4\x93\x02\x38\x12\x36/v9/{resource_name=customers/*/customerUserAccesses/*}\xda\x41\rresource_name\x12\xff\x01\n\x18MutateCustomerUserAccess\x12\x41.google.ads.googleads.v9.services.MutateCustomerUserAccessRequest\x1a\x42.google.ads.googleads.v9.services.MutateCustomerUserAccessResponse\"\\\x82\xd3\xe4\x93\x02>\"9/v9/customers/{customer_id=*}/customerUserAccesses:mutate:\x01*\xda\x41\x15\x63ustomer_id,operation\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x85\x02\n$com.google.ads.googleads.v9.servicesB\x1e\x43ustomerUserAccessServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.customer_user_access_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\036CustomerUserAccessServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETCUSTOMERUSERACCESSREQUEST.fields_by_name['resource_name']._options = None
  _GETCUSTOMERUSERACCESSREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A-\n+googleads.googleapis.com/CustomerUserAccess'
  _MUTATECUSTOMERUSERACCESSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECUSTOMERUSERACCESSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECUSTOMERUSERACCESSREQUEST.fields_by_name['operation']._options = None
  _MUTATECUSTOMERUSERACCESSREQUEST.fields_by_name['operation']._serialized_options = b'\340A\002'
  _CUSTOMERUSERACCESSSERVICE._options = None
  _CUSTOMERUSERACCESSSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CUSTOMERUSERACCESSSERVICE.methods_by_name['GetCustomerUserAccess']._options = None
  _CUSTOMERUSERACCESSSERVICE.methods_by_name['GetCustomerUserAccess']._serialized_options = b'\202\323\344\223\0028\0226/v9/{resource_name=customers/*/customerUserAccesses/*}\332A\rresource_name'
  _CUSTOMERUSERACCESSSERVICE.methods_by_name['MutateCustomerUserAccess']._options = None
  _CUSTOMERUSERACCESSSERVICE.methods_by_name['MutateCustomerUserAccess']._serialized_options = b'\202\323\344\223\002>\"9/v9/customers/{customer_id=*}/customerUserAccesses:mutate:\001*\332A\025customer_id,operation'
  _GETCUSTOMERUSERACCESSREQUEST._serialized_start=316
  _GETCUSTOMERUSERACCESSREQUEST._serialized_end=422
  _MUTATECUSTOMERUSERACCESSREQUEST._serialized_start=425
  _MUTATECUSTOMERUSERACCESSREQUEST._serialized_end=571
  _CUSTOMERUSERACCESSOPERATION._serialized_start=574
  _CUSTOMERUSERACCESSOPERATION._serialized_end=756
  _MUTATECUSTOMERUSERACCESSRESPONSE._serialized_start=758
  _MUTATECUSTOMERUSERACCESSRESPONSE._serialized_end=874
  _MUTATECUSTOMERUSERACCESSRESULT._serialized_start=876
  _MUTATECUSTOMERUSERACCESSRESULT._serialized_end=931
  _CUSTOMERUSERACCESSSERVICE._serialized_start=934
  _CUSTOMERUSERACCESSSERVICE._serialized_end=1515
# @@protoc_insertion_point(module_scope)
