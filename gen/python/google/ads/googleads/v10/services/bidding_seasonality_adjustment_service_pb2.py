# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/bidding_seasonality_adjustment_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import bidding_seasonality_adjustment_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_bidding__seasonality__adjustment__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nNgoogle/ads/googleads/v10/services/bidding_seasonality_adjustment_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1aGgoogle/ads/googleads/v10/resources/bidding_seasonality_adjustment.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xc5\x02\n*MutateBiddingSeasonalityAdjustmentsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x61\n\noperations\x18\x02 \x03(\x0b\x32H.google.ads.googleads.v10.services.BiddingSeasonalityAdjustmentOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"\xdb\x02\n%BiddingSeasonalityAdjustmentOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12R\n\x06\x63reate\x18\x01 \x01(\x0b\x32@.google.ads.googleads.v10.resources.BiddingSeasonalityAdjustmentH\x00\x12R\n\x06update\x18\x02 \x01(\x0b\x32@.google.ads.googleads.v10.resources.BiddingSeasonalityAdjustmentH\x00\x12L\n\x06remove\x18\x03 \x01(\tB:\xfa\x41\x37\n5googleads.googleapis.com/BiddingSeasonalityAdjustmentH\x00\x42\x0b\n\toperation\"\xbf\x01\n+MutateBiddingSeasonalityAdjustmentsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12]\n\x07results\x18\x02 \x03(\x0b\x32L.google.ads.googleads.v10.services.MutateBiddingSeasonalityAdjustmentsResult\"\xe8\x01\n)MutateBiddingSeasonalityAdjustmentsResult\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xfa\x41\x37\n5googleads.googleapis.com/BiddingSeasonalityAdjustment\x12h\n\x1e\x62idding_seasonality_adjustment\x18\x02 \x01(\x0b\x32@.google.ads.googleads.v10.resources.BiddingSeasonalityAdjustment2\x9c\x03\n#BiddingSeasonalityAdjustmentService\x12\xad\x02\n#MutateBiddingSeasonalityAdjustments\x12M.google.ads.googleads.v10.services.MutateBiddingSeasonalityAdjustmentsRequest\x1aN.google.ads.googleads.v10.services.MutateBiddingSeasonalityAdjustmentsResponse\"g\x82\xd3\xe4\x93\x02H\"C/v10/customers/{customer_id=*}/biddingSeasonalityAdjustments:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x94\x02\n%com.google.ads.googleads.v10.servicesB(BiddingSeasonalityAdjustmentServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.bidding_seasonality_adjustment_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB(BiddingSeasonalityAdjustmentServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST.fields_by_name['operations']._options = None
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _BIDDINGSEASONALITYADJUSTMENTOPERATION.fields_by_name['remove']._options = None
  _BIDDINGSEASONALITYADJUSTMENTOPERATION.fields_by_name['remove']._serialized_options = b'\372A7\n5googleads.googleapis.com/BiddingSeasonalityAdjustment'
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESULT.fields_by_name['resource_name']._options = None
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESULT.fields_by_name['resource_name']._serialized_options = b'\372A7\n5googleads.googleapis.com/BiddingSeasonalityAdjustment'
  _BIDDINGSEASONALITYADJUSTMENTSERVICE._options = None
  _BIDDINGSEASONALITYADJUSTMENTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _BIDDINGSEASONALITYADJUSTMENTSERVICE.methods_by_name['MutateBiddingSeasonalityAdjustments']._options = None
  _BIDDINGSEASONALITYADJUSTMENTSERVICE.methods_by_name['MutateBiddingSeasonalityAdjustments']._serialized_options = b'\202\323\344\223\002H\"C/v10/customers/{customer_id=*}/biddingSeasonalityAdjustments:mutate:\001*\332A\026customer_id,operations'
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST._serialized_start=425
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSREQUEST._serialized_end=750
  _BIDDINGSEASONALITYADJUSTMENTOPERATION._serialized_start=753
  _BIDDINGSEASONALITYADJUSTMENTOPERATION._serialized_end=1100
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESPONSE._serialized_start=1103
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESPONSE._serialized_end=1294
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESULT._serialized_start=1297
  _MUTATEBIDDINGSEASONALITYADJUSTMENTSRESULT._serialized_end=1529
  _BIDDINGSEASONALITYADJUSTMENTSERVICE._serialized_start=1532
  _BIDDINGSEASONALITYADJUSTMENTSERVICE._serialized_end=1944
# @@protoc_insertion_point(module_scope)
