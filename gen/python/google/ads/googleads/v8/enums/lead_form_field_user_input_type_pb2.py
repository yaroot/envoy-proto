# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/lead_form_field_user_input_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/lead_form_field_user_input_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\037LeadFormFieldUserInputTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v8/enums/lead_form_field_user_input_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\xef\n\n\x1eLeadFormFieldUserInputTypeEnum\"\xcc\n\n\x1aLeadFormFieldUserInputType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\r\n\tFULL_NAME\x10\x02\x12\t\n\x05\x45MAIL\x10\x03\x12\x10\n\x0cPHONE_NUMBER\x10\x04\x12\x0f\n\x0bPOSTAL_CODE\x10\x05\x12\x08\n\x04\x43ITY\x10\t\x12\n\n\x06REGION\x10\n\x12\x0b\n\x07\x43OUNTRY\x10\x0b\x12\x0e\n\nWORK_EMAIL\x10\x0c\x12\x10\n\x0c\x43OMPANY_NAME\x10\r\x12\x0e\n\nWORK_PHONE\x10\x0e\x12\r\n\tJOB_TITLE\x10\x0f\x12\x0e\n\nFIRST_NAME\x10\x17\x12\r\n\tLAST_NAME\x10\x18\x12\x12\n\rVEHICLE_MODEL\x10\xe9\x07\x12\x11\n\x0cVEHICLE_TYPE\x10\xea\x07\x12\x19\n\x14PREFERRED_DEALERSHIP\x10\xeb\x07\x12\x1e\n\x19VEHICLE_PURCHASE_TIMELINE\x10\xec\x07\x12\x16\n\x11VEHICLE_OWNERSHIP\x10\xed\x07\x12\x19\n\x14VEHICLE_PAYMENT_TYPE\x10\xf1\x07\x12\x16\n\x11VEHICLE_CONDITION\x10\xf2\x07\x12\x11\n\x0c\x43OMPANY_SIZE\x10\xee\x07\x12\x11\n\x0c\x41NNUAL_SALES\x10\xef\x07\x12\x16\n\x11YEARS_IN_BUSINESS\x10\xf0\x07\x12\x13\n\x0eJOB_DEPARTMENT\x10\xf3\x07\x12\r\n\x08JOB_ROLE\x10\xf4\x07\x12\x16\n\x11\x45\x44UCATION_PROGRAM\x10\xf5\x07\x12\x15\n\x10\x45\x44UCATION_COURSE\x10\xf6\x07\x12\x0c\n\x07PRODUCT\x10\xf8\x07\x12\x0c\n\x07SERVICE\x10\xf9\x07\x12\n\n\x05OFFER\x10\xfa\x07\x12\r\n\x08\x43\x41TEGORY\x10\xfb\x07\x12\x1d\n\x18PREFERRED_CONTACT_METHOD\x10\xfc\x07\x12\x17\n\x12PREFERRED_LOCATION\x10\xfd\x07\x12\x1b\n\x16PREFERRED_CONTACT_TIME\x10\xfe\x07\x12\x16\n\x11PURCHASE_TIMELINE\x10\xff\x07\x12\x18\n\x13YEARS_OF_EXPERIENCE\x10\x98\x08\x12\x11\n\x0cJOB_INDUSTRY\x10\x99\x08\x12\x17\n\x12LEVEL_OF_EDUCATION\x10\x9a\x08\x12\x12\n\rPROPERTY_TYPE\x10\x80\x08\x12\x16\n\x11REALTOR_HELP_GOAL\x10\x81\x08\x12\x17\n\x12PROPERTY_COMMUNITY\x10\x82\x08\x12\x10\n\x0bPRICE_RANGE\x10\x83\x08\x12\x17\n\x12NUMBER_OF_BEDROOMS\x10\x84\x08\x12\x17\n\x12\x46URNISHED_PROPERTY\x10\x85\x08\x12\x1a\n\x15PETS_ALLOWED_PROPERTY\x10\x86\x08\x12\x1a\n\x15NEXT_PLANNED_PURCHASE\x10\x87\x08\x12\x1a\n\x15\x45VENT_SIGNUP_INTEREST\x10\x89\x08\x12\x1e\n\x19PREFERRED_SHOPPING_PLACES\x10\x8a\x08\x12\x13\n\x0e\x46\x41VORITE_BRAND\x10\x8b\x08\x12+\n&TRANSPORTATION_COMMERCIAL_LICENSE_TYPE\x10\x8c\x08\x12\x1b\n\x16\x45VENT_BOOKING_INTEREST\x10\x8e\x08\x12\x18\n\x13\x44\x45STINATION_COUNTRY\x10\x8f\x08\x12\x15\n\x10\x44\x45STINATION_CITY\x10\x90\x08\x12\x16\n\x11\x44\x45PARTURE_COUNTRY\x10\x91\x08\x12\x13\n\x0e\x44\x45PARTURE_CITY\x10\x92\x08\x12\x13\n\x0e\x44\x45PARTURE_DATE\x10\x93\x08\x12\x10\n\x0bRETURN_DATE\x10\x94\x08\x12\x18\n\x13NUMBER_OF_TRAVELERS\x10\x95\x08\x12\x12\n\rTRAVEL_BUDGET\x10\x96\x08\x12\x19\n\x14TRAVEL_ACCOMMODATION\x10\x97\x08\x42\xf4\x01\n!com.google.ads.googleads.v8.enumsB\x1fLeadFormFieldUserInputTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_LEADFORMFIELDUSERINPUTTYPEENUM_LEADFORMFIELDUSERINPUTTYPE = _descriptor.EnumDescriptor(
  name='LeadFormFieldUserInputType',
  full_name='google.ads.googleads.v8.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType',
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
      name='FULL_NAME', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EMAIL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PHONE_NUMBER', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POSTAL_CODE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CITY', index=6, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REGION', index=7, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COUNTRY', index=8, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WORK_EMAIL', index=9, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPANY_NAME', index=10, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WORK_PHONE', index=11, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOB_TITLE', index=12, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIRST_NAME', index=13, number=23,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LAST_NAME', index=14, number=24,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_MODEL', index=15, number=1001,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_TYPE', index=16, number=1002,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREFERRED_DEALERSHIP', index=17, number=1003,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_PURCHASE_TIMELINE', index=18, number=1004,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_OWNERSHIP', index=19, number=1005,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_PAYMENT_TYPE', index=20, number=1009,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VEHICLE_CONDITION', index=21, number=1010,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPANY_SIZE', index=22, number=1006,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ANNUAL_SALES', index=23, number=1007,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YEARS_IN_BUSINESS', index=24, number=1008,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOB_DEPARTMENT', index=25, number=1011,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOB_ROLE', index=26, number=1012,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EDUCATION_PROGRAM', index=27, number=1013,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EDUCATION_COURSE', index=28, number=1014,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRODUCT', index=29, number=1016,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SERVICE', index=30, number=1017,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OFFER', index=31, number=1018,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CATEGORY', index=32, number=1019,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREFERRED_CONTACT_METHOD', index=33, number=1020,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREFERRED_LOCATION', index=34, number=1021,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREFERRED_CONTACT_TIME', index=35, number=1022,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PURCHASE_TIMELINE', index=36, number=1023,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YEARS_OF_EXPERIENCE', index=37, number=1048,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOB_INDUSTRY', index=38, number=1049,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEVEL_OF_EDUCATION', index=39, number=1050,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROPERTY_TYPE', index=40, number=1024,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REALTOR_HELP_GOAL', index=41, number=1025,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROPERTY_COMMUNITY', index=42, number=1026,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRICE_RANGE', index=43, number=1027,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NUMBER_OF_BEDROOMS', index=44, number=1028,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FURNISHED_PROPERTY', index=45, number=1029,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PETS_ALLOWED_PROPERTY', index=46, number=1030,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NEXT_PLANNED_PURCHASE', index=47, number=1031,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EVENT_SIGNUP_INTEREST', index=48, number=1033,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREFERRED_SHOPPING_PLACES', index=49, number=1034,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FAVORITE_BRAND', index=50, number=1035,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRANSPORTATION_COMMERCIAL_LICENSE_TYPE', index=51, number=1036,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EVENT_BOOKING_INTEREST', index=52, number=1038,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESTINATION_COUNTRY', index=53, number=1039,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESTINATION_CITY', index=54, number=1040,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEPARTURE_COUNTRY', index=55, number=1041,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEPARTURE_CITY', index=56, number=1042,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEPARTURE_DATE', index=57, number=1043,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RETURN_DATE', index=58, number=1044,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NUMBER_OF_TRAVELERS', index=59, number=1045,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRAVEL_BUDGET', index=60, number=1046,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRAVEL_ACCOMMODATION', index=61, number=1047,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=168,
  serialized_end=1524,
)
_sym_db.RegisterEnumDescriptor(_LEADFORMFIELDUSERINPUTTYPEENUM_LEADFORMFIELDUSERINPUTTYPE)


_LEADFORMFIELDUSERINPUTTYPEENUM = _descriptor.Descriptor(
  name='LeadFormFieldUserInputTypeEnum',
  full_name='google.ads.googleads.v8.enums.LeadFormFieldUserInputTypeEnum',
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
    _LEADFORMFIELDUSERINPUTTYPEENUM_LEADFORMFIELDUSERINPUTTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=133,
  serialized_end=1524,
)

_LEADFORMFIELDUSERINPUTTYPEENUM_LEADFORMFIELDUSERINPUTTYPE.containing_type = _LEADFORMFIELDUSERINPUTTYPEENUM
DESCRIPTOR.message_types_by_name['LeadFormFieldUserInputTypeEnum'] = _LEADFORMFIELDUSERINPUTTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LeadFormFieldUserInputTypeEnum = _reflection.GeneratedProtocolMessageType('LeadFormFieldUserInputTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _LEADFORMFIELDUSERINPUTTYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.lead_form_field_user_input_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.LeadFormFieldUserInputTypeEnum)
  })
_sym_db.RegisterMessage(LeadFormFieldUserInputTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
