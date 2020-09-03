# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/criterion_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/criterion_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\023CriterionErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v4/errors/criterion_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\x92\"\n\x12\x43riterionErrorEnum\"\xfb!\n\x0e\x43riterionError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1a\n\x16\x43ONCRETE_TYPE_REQUIRED\x10\x02\x12\x1d\n\x19INVALID_EXCLUDED_CATEGORY\x10\x03\x12\x18\n\x14INVALID_KEYWORD_TEXT\x10\x04\x12\x19\n\x15KEYWORD_TEXT_TOO_LONG\x10\x05\x12\x1e\n\x1aKEYWORD_HAS_TOO_MANY_WORDS\x10\x06\x12\x1d\n\x19KEYWORD_HAS_INVALID_CHARS\x10\x07\x12\x19\n\x15INVALID_PLACEMENT_URL\x10\x08\x12\x15\n\x11INVALID_USER_LIST\x10\t\x12\x19\n\x15INVALID_USER_INTEREST\x10\n\x12$\n INVALID_FORMAT_FOR_PLACEMENT_URL\x10\x0b\x12\x1d\n\x19PLACEMENT_URL_IS_TOO_LONG\x10\x0c\x12\"\n\x1ePLACEMENT_URL_HAS_ILLEGAL_CHAR\x10\r\x12,\n(PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE\x10\x0e\x12\x39\n5PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION\x10\x0f\x12\x16\n\x12INVALID_TOPIC_PATH\x10\x10\x12\x1e\n\x1aINVALID_YOUTUBE_CHANNEL_ID\x10\x11\x12\x1c\n\x18INVALID_YOUTUBE_VIDEO_ID\x10\x12\x12\'\n#YOUTUBE_VERTICAL_CHANNEL_DEPRECATED\x10\x13\x12*\n&YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED\x10\x14\x12\x1b\n\x17YOUTUBE_URL_UNSUPPORTED\x10\x15\x12 \n\x1c\x43\x41NNOT_EXCLUDE_CRITERIA_TYPE\x10\x16\x12\x1c\n\x18\x43\x41NNOT_ADD_CRITERIA_TYPE\x10\x17\x12$\n CANNOT_EXCLUDE_SIMILAR_USER_LIST\x10\x1a\x12\x1f\n\x1b\x43\x41NNOT_ADD_CLOSED_USER_LIST\x10\x1b\x12:\n6CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS\x10\x1c\x12\x35\n1CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS\x10\x1d\x12\x37\n3CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS\x10\x1e\x12\x31\n-CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS\x10\x1f\x12\x39\n5CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS\x10 \x12\x37\n3CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE\x10!\x12\x1b\n\x17INVALID_CUSTOM_AFFINITY\x10`\x12\x19\n\x15INVALID_CUSTOM_INTENT\x10\x61\x12\x16\n\x12INVALID_IP_ADDRESS\x10\"\x12\x15\n\x11INVALID_IP_FORMAT\x10#\x12\x16\n\x12INVALID_MOBILE_APP\x10$\x12\x1f\n\x1bINVALID_MOBILE_APP_CATEGORY\x10%\x12\x18\n\x14INVALID_CRITERION_ID\x10&\x12\x1b\n\x17\x43\x41NNOT_TARGET_CRITERION\x10\'\x12$\n CANNOT_TARGET_OBSOLETE_CRITERION\x10(\x12\"\n\x1e\x43RITERION_ID_AND_TYPE_MISMATCH\x10)\x12\x1c\n\x18INVALID_PROXIMITY_RADIUS\x10*\x12\"\n\x1eINVALID_PROXIMITY_RADIUS_UNITS\x10+\x12 \n\x1cINVALID_STREETADDRESS_LENGTH\x10,\x12\x1b\n\x17INVALID_CITYNAME_LENGTH\x10-\x12\x1d\n\x19INVALID_REGIONCODE_LENGTH\x10.\x12\x1d\n\x19INVALID_REGIONNAME_LENGTH\x10/\x12\x1d\n\x19INVALID_POSTALCODE_LENGTH\x10\x30\x12\x18\n\x14INVALID_COUNTRY_CODE\x10\x31\x12\x14\n\x10INVALID_LATITUDE\x10\x32\x12\x15\n\x11INVALID_LONGITUDE\x10\x33\x12\x36\n2PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL\x10\x34\x12\x1d\n\x19INVALID_PROXIMITY_ADDRESS\x10\x35\x12\x1c\n\x18INVALID_USER_DOMAIN_NAME\x10\x36\x12 \n\x1c\x43RITERION_PARAMETER_TOO_LONG\x10\x37\x12&\n\"AD_SCHEDULE_TIME_INTERVALS_OVERLAP\x10\x38\x12\x32\n.AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS\x10\x39\x12%\n!AD_SCHEDULE_INVALID_TIME_INTERVAL\x10:\x12\x30\n,AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT\x10;\x12/\n+AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS\x10<\x12$\n CANNOT_BID_MODIFY_CRITERION_TYPE\x10=\x12\x32\n.CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT\x10>\x12(\n$CANNOT_BID_MODIFY_NEGATIVE_CRITERION\x10?\x12\x1f\n\x1b\x42ID_MODIFIER_ALREADY_EXISTS\x10@\x12\x17\n\x13\x46\x45\x45\x44_ID_NOT_ALLOWED\x10\x41\x12(\n$ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE\x10\x42\x12.\n*CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY\x10\x43\x12\x1c\n\x18\x43\x41NNOT_EXCLUDE_CRITERION\x10\x44\x12\x1b\n\x17\x43\x41NNOT_REMOVE_CRITERION\x10\x45\x12$\n INVALID_PRODUCT_BIDDING_CATEGORY\x10L\x12\x1c\n\x18MISSING_SHOPPING_SETTING\x10M\x12\x1d\n\x19INVALID_MATCHING_FUNCTION\x10N\x12\x1f\n\x1bLOCATION_FILTER_NOT_ALLOWED\x10O\x12$\n INVALID_FEED_FOR_LOCATION_FILTER\x10\x62\x12\x1b\n\x17LOCATION_FILTER_INVALID\x10P\x12\x32\n.CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP\x10Q\x12\x39\n5HOTEL_LENGTH_OF_STAY_OVERLAPS_WITH_EXISTING_CRITERION\x10R\x12\x41\n=HOTEL_ADVANCE_BOOKING_WINDOW_OVERLAPS_WITH_EXISTING_CRITERION\x10S\x12.\n*FIELD_INCOMPATIBLE_WITH_NEGATIVE_TARGETING\x10T\x12\x1d\n\x19INVALID_WEBPAGE_CONDITION\x10U\x12!\n\x1dINVALID_WEBPAGE_CONDITION_URL\x10V\x12)\n%WEBPAGE_CONDITION_URL_CANNOT_BE_EMPTY\x10W\x12.\n*WEBPAGE_CONDITION_URL_UNSUPPORTED_PROTOCOL\x10X\x12.\n*WEBPAGE_CONDITION_URL_CANNOT_BE_IP_ADDRESS\x10Y\x12\x45\nAWEBPAGE_CONDITION_URL_DOMAIN_NOT_CONSISTENT_WITH_CAMPAIGN_SETTING\x10Z\x12\x31\n-WEBPAGE_CONDITION_URL_CANNOT_BE_PUBLIC_SUFFIX\x10[\x12/\n+WEBPAGE_CONDITION_URL_INVALID_PUBLIC_SUFFIX\x10\\\x12\x39\n5WEBPAGE_CONDITION_URL_VALUE_TRACK_VALUE_NOT_SUPPORTED\x10]\x12<\n8WEBPAGE_CRITERION_URL_EQUALS_CAN_HAVE_ONLY_ONE_CONDITION\x10^\x12\x37\n3WEBPAGE_CRITERION_NOT_SUPPORTED_ON_NON_DSA_AD_GROUP\x10_\x12\x37\n3CANNOT_TARGET_USER_LIST_FOR_SMART_DISPLAY_CAMPAIGNS\x10\x63\x12*\n&LISTING_SCOPE_TOO_MANY_DIMENSION_TYPES\x10\x64\x12\'\n#LISTING_SCOPE_TOO_MANY_IN_OPERATORS\x10\x65\x12+\n\'LISTING_SCOPE_IN_OPERATOR_NOT_SUPPORTED\x10\x66\x12$\n DUPLICATE_LISTING_DIMENSION_TYPE\x10g\x12%\n!DUPLICATE_LISTING_DIMENSION_VALUE\x10h\x12\x30\n,CANNOT_SET_BIDS_ON_LISTING_GROUP_SUBDIVISION\x10i\x12#\n\x1fINVALID_LISTING_GROUP_HIERARCHY\x10j\x12+\n\'LISTING_GROUP_UNIT_CANNOT_HAVE_CHILDREN\x10k\x12\x32\n.LISTING_GROUP_SUBDIVISION_REQUIRES_OTHERS_CASE\x10l\x12:\n6LISTING_GROUP_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS\x10m\x12 \n\x1cLISTING_GROUP_ALREADY_EXISTS\x10n\x12 \n\x1cLISTING_GROUP_DOES_NOT_EXIST\x10o\x12#\n\x1fLISTING_GROUP_CANNOT_BE_REMOVED\x10p\x12\x1e\n\x1aINVALID_LISTING_GROUP_TYPE\x10q\x12*\n&LISTING_GROUP_ADD_MAY_ONLY_USE_TEMP_ID\x10r\x12\x1a\n\x16LISTING_SCOPE_TOO_LONG\x10s\x12%\n!LISTING_SCOPE_TOO_MANY_DIMENSIONS\x10t\x12\x1a\n\x16LISTING_GROUP_TOO_LONG\x10u\x12\x1f\n\x1bLISTING_GROUP_TREE_TOO_DEEP\x10v\x12\x1d\n\x19INVALID_LISTING_DIMENSION\x10w\x12\"\n\x1eINVALID_LISTING_DIMENSION_TYPE\x10xB\xee\x01\n\"com.google.ads.googleads.v4.errorsB\x13\x43riterionErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CRITERIONERRORENUM_CRITERIONERROR = _descriptor.EnumDescriptor(
  name='CriterionError',
  full_name='google.ads.googleads.v4.errors.CriterionErrorEnum.CriterionError',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CONCRETE_TYPE_REQUIRED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_EXCLUDED_CATEGORY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_KEYWORD_TEXT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_TEXT_TOO_LONG', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_HAS_TOO_MANY_WORDS', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_HAS_INVALID_CHARS', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PLACEMENT_URL', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_USER_LIST', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_USER_INTEREST', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FORMAT_FOR_PLACEMENT_URL', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLACEMENT_URL_IS_TOO_LONG', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLACEMENT_URL_HAS_ILLEGAL_CHAR', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TOPIC_PATH', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_YOUTUBE_CHANNEL_ID', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_YOUTUBE_VIDEO_ID', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YOUTUBE_VERTICAL_CHANNEL_DEPRECATED', index=19, number=19,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED', index=20, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YOUTUBE_URL_UNSUPPORTED', index=21, number=21,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_EXCLUDE_CRITERIA_TYPE', index=22, number=22,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_CRITERIA_TYPE', index=23, number=23,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_EXCLUDE_SIMILAR_USER_LIST', index=24, number=26,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_CLOSED_USER_LIST', index=25, number=27,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS', index=26, number=28,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS', index=27, number=29,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS', index=28, number=30,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS', index=29, number=31,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS', index=30, number=32,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE', index=31, number=33,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CUSTOM_AFFINITY', index=32, number=96,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CUSTOM_INTENT', index=33, number=97,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_IP_ADDRESS', index=34, number=34,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_IP_FORMAT', index=35, number=35,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_MOBILE_APP', index=36, number=36,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_MOBILE_APP_CATEGORY', index=37, number=37,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CRITERION_ID', index=38, number=38,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_TARGET_CRITERION', index=39, number=39,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_TARGET_OBSOLETE_CRITERION', index=40, number=40,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CRITERION_ID_AND_TYPE_MISMATCH', index=41, number=41,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROXIMITY_RADIUS', index=42, number=42,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROXIMITY_RADIUS_UNITS', index=43, number=43,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STREETADDRESS_LENGTH', index=44, number=44,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CITYNAME_LENGTH', index=45, number=45,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_REGIONCODE_LENGTH', index=46, number=46,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_REGIONNAME_LENGTH', index=47, number=47,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_POSTALCODE_LENGTH', index=48, number=48,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_COUNTRY_CODE', index=49, number=49,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LATITUDE', index=50, number=50,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LONGITUDE', index=51, number=51,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL', index=52, number=52,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROXIMITY_ADDRESS', index=53, number=53,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_USER_DOMAIN_NAME', index=54, number=54,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CRITERION_PARAMETER_TOO_LONG', index=55, number=55,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_SCHEDULE_TIME_INTERVALS_OVERLAP', index=56, number=56,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS', index=57, number=57,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_SCHEDULE_INVALID_TIME_INTERVAL', index=58, number=58,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT', index=59, number=59,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS', index=60, number=60,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_BID_MODIFY_CRITERION_TYPE', index=61, number=61,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT', index=62, number=62,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_BID_MODIFY_NEGATIVE_CRITERION', index=63, number=63,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_MODIFIER_ALREADY_EXISTS', index=64, number=64,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED_ID_NOT_ALLOWED', index=65, number=65,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE', index=66, number=66,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY', index=67, number=67,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_EXCLUDE_CRITERION', index=68, number=68,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_REMOVE_CRITERION', index=69, number=69,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PRODUCT_BIDDING_CATEGORY', index=70, number=76,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_SHOPPING_SETTING', index=71, number=77,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_MATCHING_FUNCTION', index=72, number=78,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCATION_FILTER_NOT_ALLOWED', index=73, number=79,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FEED_FOR_LOCATION_FILTER', index=74, number=98,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCATION_FILTER_INVALID', index=75, number=80,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP', index=76, number=81,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOTEL_LENGTH_OF_STAY_OVERLAPS_WITH_EXISTING_CRITERION', index=77, number=82,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOTEL_ADVANCE_BOOKING_WINDOW_OVERLAPS_WITH_EXISTING_CRITERION', index=78, number=83,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIELD_INCOMPATIBLE_WITH_NEGATIVE_TARGETING', index=79, number=84,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_WEBPAGE_CONDITION', index=80, number=85,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_WEBPAGE_CONDITION_URL', index=81, number=86,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_CANNOT_BE_EMPTY', index=82, number=87,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_UNSUPPORTED_PROTOCOL', index=83, number=88,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_CANNOT_BE_IP_ADDRESS', index=84, number=89,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_DOMAIN_NOT_CONSISTENT_WITH_CAMPAIGN_SETTING', index=85, number=90,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_CANNOT_BE_PUBLIC_SUFFIX', index=86, number=91,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_INVALID_PUBLIC_SUFFIX', index=87, number=92,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CONDITION_URL_VALUE_TRACK_VALUE_NOT_SUPPORTED', index=88, number=93,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CRITERION_URL_EQUALS_CAN_HAVE_ONLY_ONE_CONDITION', index=89, number=94,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_CRITERION_NOT_SUPPORTED_ON_NON_DSA_AD_GROUP', index=90, number=95,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_TARGET_USER_LIST_FOR_SMART_DISPLAY_CAMPAIGNS', index=91, number=99,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_SCOPE_TOO_MANY_DIMENSION_TYPES', index=92, number=100,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_SCOPE_TOO_MANY_IN_OPERATORS', index=93, number=101,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_SCOPE_IN_OPERATOR_NOT_SUPPORTED', index=94, number=102,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_LISTING_DIMENSION_TYPE', index=95, number=103,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_LISTING_DIMENSION_VALUE', index=96, number=104,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SET_BIDS_ON_LISTING_GROUP_SUBDIVISION', index=97, number=105,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LISTING_GROUP_HIERARCHY', index=98, number=106,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_UNIT_CANNOT_HAVE_CHILDREN', index=99, number=107,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_SUBDIVISION_REQUIRES_OTHERS_CASE', index=100, number=108,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS', index=101, number=109,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_ALREADY_EXISTS', index=102, number=110,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_DOES_NOT_EXIST', index=103, number=111,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_CANNOT_BE_REMOVED', index=104, number=112,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LISTING_GROUP_TYPE', index=105, number=113,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_ADD_MAY_ONLY_USE_TEMP_ID', index=106, number=114,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_SCOPE_TOO_LONG', index=107, number=115,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_SCOPE_TOO_MANY_DIMENSIONS', index=108, number=116,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_TOO_LONG', index=109, number=117,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LISTING_GROUP_TREE_TOO_DEEP', index=110, number=118,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LISTING_DIMENSION', index=111, number=119,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LISTING_DIMENSION_TYPE', index=112, number=120,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=142,
  serialized_end=4489,
)
_sym_db.RegisterEnumDescriptor(_CRITERIONERRORENUM_CRITERIONERROR)


_CRITERIONERRORENUM = _descriptor.Descriptor(
  name='CriterionErrorEnum',
  full_name='google.ads.googleads.v4.errors.CriterionErrorEnum',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CRITERIONERRORENUM_CRITERIONERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=4489,
)

_CRITERIONERRORENUM_CRITERIONERROR.containing_type = _CRITERIONERRORENUM
DESCRIPTOR.message_types_by_name['CriterionErrorEnum'] = _CRITERIONERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CriterionErrorEnum = _reflection.GeneratedProtocolMessageType('CriterionErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.criterion_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.CriterionErrorEnum)
  })
_sym_db.RegisterMessage(CriterionErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
