# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/customer_extension_setting_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import customer_extension_setting_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_customer__extension__setting__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nJgoogle/ads/googleads/v10/services/customer_extension_setting_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1a\x43google/ads/googleads/v10/resources/customer_extension_setting.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xbd\x02\n&MutateCustomerExtensionSettingsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12]\n\noperations\x18\x02 \x03(\x0b\x32\x44.google.ads.googleads.v10.services.CustomerExtensionSettingOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"\xcb\x02\n!CustomerExtensionSettingOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12N\n\x06\x63reate\x18\x01 \x01(\x0b\x32<.google.ads.googleads.v10.resources.CustomerExtensionSettingH\x00\x12N\n\x06update\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v10.resources.CustomerExtensionSettingH\x00\x12H\n\x06remove\x18\x03 \x01(\tB6\xfa\x41\x33\n1googleads.googleapis.com/CustomerExtensionSettingH\x00\x42\x0b\n\toperation\"\xb6\x01\n\'MutateCustomerExtensionSettingsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12X\n\x07results\x18\x02 \x03(\x0b\x32G.google.ads.googleads.v10.services.MutateCustomerExtensionSettingResult\"\xd7\x01\n$MutateCustomerExtensionSettingResult\x12M\n\rresource_name\x18\x01 \x01(\tB6\xfa\x41\x33\n1googleads.googleapis.com/CustomerExtensionSetting\x12`\n\x1a\x63ustomer_extension_setting\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v10.resources.CustomerExtensionSetting2\x88\x03\n\x1f\x43ustomerExtensionSettingService\x12\x9d\x02\n\x1fMutateCustomerExtensionSettings\x12I.google.ads.googleads.v10.services.MutateCustomerExtensionSettingsRequest\x1aJ.google.ads.googleads.v10.services.MutateCustomerExtensionSettingsResponse\"c\x82\xd3\xe4\x93\x02\x44\"?/v10/customers/{customer_id=*}/customerExtensionSettings:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x90\x02\n%com.google.ads.googleads.v10.servicesB$CustomerExtensionSettingServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.customer_extension_setting_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB$CustomerExtensionSettingServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST.fields_by_name['operations']._options = None
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CUSTOMEREXTENSIONSETTINGOPERATION.fields_by_name['remove']._options = None
  _CUSTOMEREXTENSIONSETTINGOPERATION.fields_by_name['remove']._serialized_options = b'\372A3\n1googleads.googleapis.com/CustomerExtensionSetting'
  _MUTATECUSTOMEREXTENSIONSETTINGRESULT.fields_by_name['resource_name']._options = None
  _MUTATECUSTOMEREXTENSIONSETTINGRESULT.fields_by_name['resource_name']._serialized_options = b'\372A3\n1googleads.googleapis.com/CustomerExtensionSetting'
  _CUSTOMEREXTENSIONSETTINGSERVICE._options = None
  _CUSTOMEREXTENSIONSETTINGSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CUSTOMEREXTENSIONSETTINGSERVICE.methods_by_name['MutateCustomerExtensionSettings']._options = None
  _CUSTOMEREXTENSIONSETTINGSERVICE.methods_by_name['MutateCustomerExtensionSettings']._serialized_options = b'\202\323\344\223\002D\"?/v10/customers/{customer_id=*}/customerExtensionSettings:mutate:\001*\332A\026customer_id,operations'
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST._serialized_start=417
  _MUTATECUSTOMEREXTENSIONSETTINGSREQUEST._serialized_end=734
  _CUSTOMEREXTENSIONSETTINGOPERATION._serialized_start=737
  _CUSTOMEREXTENSIONSETTINGOPERATION._serialized_end=1068
  _MUTATECUSTOMEREXTENSIONSETTINGSRESPONSE._serialized_start=1071
  _MUTATECUSTOMEREXTENSIONSETTINGSRESPONSE._serialized_end=1253
  _MUTATECUSTOMEREXTENSIONSETTINGRESULT._serialized_start=1256
  _MUTATECUSTOMEREXTENSIONSETTINGRESULT._serialized_end=1471
  _CUSTOMEREXTENSIONSETTINGSERVICE._serialized_start=1474
  _CUSTOMEREXTENSIONSETTINGSERVICE._serialized_end=1866
# @@protoc_insertion_point(module_scope)