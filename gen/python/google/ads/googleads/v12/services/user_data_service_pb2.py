# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/services/user_data_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.common import offline_user_data_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_common_dot_offline__user__data__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/ads/googleads/v12/services/user_data_service.proto\x12!google.ads.googleads.v12.services\x1a\x37google/ads/googleads/v12/common/offline_user_data.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\"\xf9\x01\n\x15UploadUserDataRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12M\n\noperations\x18\x03 \x03(\x0b\x32\x34.google.ads.googleads.v12.services.UserDataOperationB\x03\xe0\x41\x02\x12k\n!customer_match_user_list_metadata\x18\x02 \x01(\x0b\x32>.google.ads.googleads.v12.common.CustomerMatchUserListMetadataH\x00\x42\n\n\x08metadata\"\x9a\x01\n\x11UserDataOperation\x12;\n\x06\x63reate\x18\x01 \x01(\x0b\x32).google.ads.googleads.v12.common.UserDataH\x00\x12;\n\x06remove\x18\x02 \x01(\x0b\x32).google.ads.googleads.v12.common.UserDataH\x00\x42\x0b\n\toperation\"\x92\x01\n\x16UploadUserDataResponse\x12\x1d\n\x10upload_date_time\x18\x03 \x01(\tH\x00\x88\x01\x01\x12&\n\x19received_operations_count\x18\x04 \x01(\x05H\x01\x88\x01\x01\x42\x13\n\x11_upload_date_timeB\x1c\n\x1a_received_operations_count2\x9a\x02\n\x0fUserDataService\x12\xbf\x01\n\x0eUploadUserData\x12\x38.google.ads.googleads.v12.services.UploadUserDataRequest\x1a\x39.google.ads.googleads.v12.services.UploadUserDataResponse\"8\x82\xd3\xe4\x93\x02\x32\"-/v12/customers/{customer_id=*}:uploadUserData:\x01*\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x80\x02\n%com.google.ads.googleads.v12.servicesB\x14UserDataServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V12.Services\xca\x02!Google\\Ads\\GoogleAds\\V12\\Services\xea\x02%Google::Ads::GoogleAds::V12::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.services.user_data_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v12.servicesB\024UserDataServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Services\312\002!Google\\Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads::GoogleAds::V12::Services'
  _UPLOADUSERDATAREQUEST.fields_by_name['customer_id']._options = None
  _UPLOADUSERDATAREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _UPLOADUSERDATAREQUEST.fields_by_name['operations']._options = None
  _UPLOADUSERDATAREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _USERDATASERVICE._options = None
  _USERDATASERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _USERDATASERVICE.methods_by_name['UploadUserData']._options = None
  _USERDATASERVICE.methods_by_name['UploadUserData']._serialized_options = b'\202\323\344\223\0022\"-/v12/customers/{customer_id=*}:uploadUserData:\001*'
  _UPLOADUSERDATAREQUEST._serialized_start=242
  _UPLOADUSERDATAREQUEST._serialized_end=491
  _USERDATAOPERATION._serialized_start=494
  _USERDATAOPERATION._serialized_end=648
  _UPLOADUSERDATARESPONSE._serialized_start=651
  _UPLOADUSERDATARESPONSE._serialized_end=797
  _USERDATASERVICE._serialized_start=800
  _USERDATASERVICE._serialized_end=1082
# @@protoc_insertion_point(module_scope)