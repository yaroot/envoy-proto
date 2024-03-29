# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/customer_manager_link_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.resources import customer_manager_link_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_customer__manager__link__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nEgoogle/ads/googleads/v11/services/customer_manager_link_service.proto\x12!google.ads.googleads.v11.services\x1a>google/ads/googleads/v11/resources/customer_manager_link.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"\xad\x01\n MutateCustomerManagerLinkRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\noperations\x18\x02 \x03(\x0b\x32?.google.ads.googleads.v11.services.CustomerManagerLinkOperationB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\x90\x01\n\x16MoveManagerLinkRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12+\n\x1eprevious_customer_manager_link\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0bnew_manager\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xa7\x01\n\x1c\x43ustomerManagerLinkOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12I\n\x06update\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v11.resources.CustomerManagerLinkH\x00\x42\x0b\n\toperation\"x\n!MutateCustomerManagerLinkResponse\x12S\n\x07results\x18\x01 \x03(\x0b\x32\x42.google.ads.googleads.v11.services.MutateCustomerManagerLinkResult\"c\n\x17MoveManagerLinkResponse\x12H\n\rresource_name\x18\x01 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/CustomerManagerLink\"k\n\x1fMutateCustomerManagerLinkResult\x12H\n\rresource_name\x18\x01 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/CustomerManagerLink2\x81\x05\n\x1a\x43ustomerManagerLinkService\x12\x86\x02\n\x19MutateCustomerManagerLink\x12\x43.google.ads.googleads.v11.services.MutateCustomerManagerLinkRequest\x1a\x44.google.ads.googleads.v11.services.MutateCustomerManagerLinkResponse\"^\x82\xd3\xe4\x93\x02?\":/v11/customers/{customer_id=*}/customerManagerLinks:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\x92\x02\n\x0fMoveManagerLink\x12\x39.google.ads.googleads.v11.services.MoveManagerLinkRequest\x1a:.google.ads.googleads.v11.services.MoveManagerLinkResponse\"\x87\x01\x82\xd3\xe4\x93\x02H\"C/v11/customers/{customer_id=*}/customerManagerLinks:moveManagerLink:\x01*\xda\x41\x36\x63ustomer_id,previous_customer_manager_link,new_manager\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8b\x02\n%com.google.ads.googleads.v11.servicesB\x1f\x43ustomerManagerLinkServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.customer_manager_link_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\037CustomerManagerLinkServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['operations']._options = None
  _MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _MOVEMANAGERLINKREQUEST.fields_by_name['customer_id']._options = None
  _MOVEMANAGERLINKREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MOVEMANAGERLINKREQUEST.fields_by_name['previous_customer_manager_link']._options = None
  _MOVEMANAGERLINKREQUEST.fields_by_name['previous_customer_manager_link']._serialized_options = b'\340A\002'
  _MOVEMANAGERLINKREQUEST.fields_by_name['new_manager']._options = None
  _MOVEMANAGERLINKREQUEST.fields_by_name['new_manager']._serialized_options = b'\340A\002'
  _MOVEMANAGERLINKRESPONSE.fields_by_name['resource_name']._options = None
  _MOVEMANAGERLINKRESPONSE.fields_by_name['resource_name']._serialized_options = b'\372A.\n,googleads.googleapis.com/CustomerManagerLink'
  _MUTATECUSTOMERMANAGERLINKRESULT.fields_by_name['resource_name']._options = None
  _MUTATECUSTOMERMANAGERLINKRESULT.fields_by_name['resource_name']._serialized_options = b'\372A.\n,googleads.googleapis.com/CustomerManagerLink'
  _CUSTOMERMANAGERLINKSERVICE._options = None
  _CUSTOMERMANAGERLINKSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CUSTOMERMANAGERLINKSERVICE.methods_by_name['MutateCustomerManagerLink']._options = None
  _CUSTOMERMANAGERLINKSERVICE.methods_by_name['MutateCustomerManagerLink']._serialized_options = b'\202\323\344\223\002?\":/v11/customers/{customer_id=*}/customerManagerLinks:mutate:\001*\332A\026customer_id,operations'
  _CUSTOMERMANAGERLINKSERVICE.methods_by_name['MoveManagerLink']._options = None
  _CUSTOMERMANAGERLINKSERVICE.methods_by_name['MoveManagerLink']._serialized_options = b'\202\323\344\223\002H\"C/v11/customers/{customer_id=*}/customerManagerLinks:moveManagerLink:\001*\332A6customer_id,previous_customer_manager_link,new_manager'
  _MUTATECUSTOMERMANAGERLINKREQUEST._serialized_start=322
  _MUTATECUSTOMERMANAGERLINKREQUEST._serialized_end=495
  _MOVEMANAGERLINKREQUEST._serialized_start=498
  _MOVEMANAGERLINKREQUEST._serialized_end=642
  _CUSTOMERMANAGERLINKOPERATION._serialized_start=645
  _CUSTOMERMANAGERLINKOPERATION._serialized_end=812
  _MUTATECUSTOMERMANAGERLINKRESPONSE._serialized_start=814
  _MUTATECUSTOMERMANAGERLINKRESPONSE._serialized_end=934
  _MOVEMANAGERLINKRESPONSE._serialized_start=936
  _MOVEMANAGERLINKRESPONSE._serialized_end=1035
  _MUTATECUSTOMERMANAGERLINKRESULT._serialized_start=1037
  _MUTATECUSTOMERMANAGERLINKRESULT._serialized_end=1144
  _CUSTOMERMANAGERLINKSERVICE._serialized_start=1147
  _CUSTOMERMANAGERLINKSERVICE._serialized_end=1788
# @@protoc_insertion_point(module_scope)
