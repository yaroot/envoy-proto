# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/media_file_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import media_file_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_media__file__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/ads/googleads/v10/services/media_file_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1a\x33google/ads/googleads/v10/resources/media_file.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\x9f\x02\n\x17MutateMediaFilesRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12N\n\noperations\x18\x02 \x03(\x0b\x32\x35.google.ads.googleads.v10.services.MediaFileOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"b\n\x12MediaFileOperation\x12?\n\x06\x63reate\x18\x01 \x01(\x0b\x32-.google.ads.googleads.v10.resources.MediaFileH\x00\x42\x0b\n\toperation\"\x98\x01\n\x18MutateMediaFilesResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12I\n\x07results\x18\x02 \x03(\x0b\x32\x38.google.ads.googleads.v10.services.MutateMediaFileResult\"\x9a\x01\n\x15MutateMediaFileResult\x12>\n\rresource_name\x18\x01 \x01(\tB\'\xfa\x41$\n\"googleads.googleapis.com/MediaFile\x12\x41\n\nmedia_file\x18\x02 \x01(\x0b\x32-.google.ads.googleads.v10.resources.MediaFile2\xbd\x02\n\x10MediaFileService\x12\xe1\x01\n\x10MutateMediaFiles\x12:.google.ads.googleads.v10.services.MutateMediaFilesRequest\x1a;.google.ads.googleads.v10.services.MutateMediaFilesResponse\"T\x82\xd3\xe4\x93\x02\x35\"0/v10/customers/{customer_id=*}/mediaFiles:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x81\x02\n%com.google.ads.googleads.v10.servicesB\x15MediaFileServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.media_file_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\025MediaFileServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEMEDIAFILESREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEMEDIAFILESREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEMEDIAFILESREQUEST.fields_by_name['operations']._options = None
  _MUTATEMEDIAFILESREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _MUTATEMEDIAFILERESULT.fields_by_name['resource_name']._options = None
  _MUTATEMEDIAFILERESULT.fields_by_name['resource_name']._serialized_options = b'\372A$\n\"googleads.googleapis.com/MediaFile'
  _MEDIAFILESERVICE._options = None
  _MEDIAFILESERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _MEDIAFILESERVICE.methods_by_name['MutateMediaFiles']._options = None
  _MEDIAFILESERVICE.methods_by_name['MutateMediaFiles']._serialized_options = b'\202\323\344\223\0025\"0/v10/customers/{customer_id=*}/mediaFiles:mutate:\001*\332A\026customer_id,operations'
  _MUTATEMEDIAFILESREQUEST._serialized_start=351
  _MUTATEMEDIAFILESREQUEST._serialized_end=638
  _MEDIAFILEOPERATION._serialized_start=640
  _MEDIAFILEOPERATION._serialized_end=738
  _MUTATEMEDIAFILESRESPONSE._serialized_start=741
  _MUTATEMEDIAFILESRESPONSE._serialized_end=893
  _MUTATEMEDIAFILERESULT._serialized_start=896
  _MUTATEMEDIAFILERESULT._serialized_end=1050
  _MEDIAFILESERVICE._serialized_start=1053
  _MEDIAFILESERVICE._serialized_end=1370
# @@protoc_insertion_point(module_scope)
