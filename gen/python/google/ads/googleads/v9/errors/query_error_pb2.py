# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/errors/query_error.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/ads/googleads/v9/errors/query_error.proto\x12\x1egoogle.ads.googleads.v9.errors\x1a\x1cgoogle/api/annotations.proto\"\x93\x0e\n\x0eQueryErrorEnum\"\x80\x0e\n\nQueryError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0f\n\x0bQUERY_ERROR\x10\x32\x12\x15\n\x11\x42\x41\x44_ENUM_CONSTANT\x10\x12\x12\x17\n\x13\x42\x41\x44_ESCAPE_SEQUENCE\x10\x07\x12\x12\n\x0e\x42\x41\x44_FIELD_NAME\x10\x0c\x12\x13\n\x0f\x42\x41\x44_LIMIT_VALUE\x10\x0f\x12\x0e\n\nBAD_NUMBER\x10\x05\x12\x10\n\x0c\x42\x41\x44_OPERATOR\x10\x03\x12\x16\n\x12\x42\x41\x44_PARAMETER_NAME\x10=\x12\x17\n\x13\x42\x41\x44_PARAMETER_VALUE\x10>\x12$\n BAD_RESOURCE_TYPE_IN_FROM_CLAUSE\x10-\x12\x0e\n\nBAD_SYMBOL\x10\x02\x12\r\n\tBAD_VALUE\x10\x04\x12\x17\n\x13\x44\x41TE_RANGE_TOO_WIDE\x10$\x12\x19\n\x15\x44\x41TE_RANGE_TOO_NARROW\x10<\x12\x10\n\x0c\x45XPECTED_AND\x10\x1e\x12\x0f\n\x0b\x45XPECTED_BY\x10\x0e\x12-\n)EXPECTED_DIMENSION_FIELD_IN_SELECT_CLAUSE\x10%\x12\"\n\x1e\x45XPECTED_FILTERS_ON_DATE_RANGE\x10\x37\x12\x11\n\rEXPECTED_FROM\x10,\x12\x11\n\rEXPECTED_LIST\x10)\x12.\n*EXPECTED_REFERENCED_FIELD_IN_SELECT_CLAUSE\x10\x10\x12\x13\n\x0f\x45XPECTED_SELECT\x10\r\x12\x19\n\x15\x45XPECTED_SINGLE_VALUE\x10*\x12(\n$EXPECTED_VALUE_WITH_BETWEEN_OPERATOR\x10\x1d\x12\x17\n\x13INVALID_DATE_FORMAT\x10&\x12\x1e\n\x1aMISALIGNED_DATE_FOR_FILTER\x10@\x12\x18\n\x14INVALID_STRING_VALUE\x10\x39\x12\'\n#INVALID_VALUE_WITH_BETWEEN_OPERATOR\x10\x1a\x12&\n\"INVALID_VALUE_WITH_DURING_OPERATOR\x10\x16\x12$\n INVALID_VALUE_WITH_LIKE_OPERATOR\x10\x38\x12\x1b\n\x17OPERATOR_FIELD_MISMATCH\x10#\x12&\n\"PROHIBITED_EMPTY_LIST_IN_CONDITION\x10\x1c\x12\x1c\n\x18PROHIBITED_ENUM_CONSTANT\x10\x36\x12\x31\n-PROHIBITED_FIELD_COMBINATION_IN_SELECT_CLAUSE\x10\x1f\x12\'\n#PROHIBITED_FIELD_IN_ORDER_BY_CLAUSE\x10(\x12%\n!PROHIBITED_FIELD_IN_SELECT_CLAUSE\x10\x17\x12$\n PROHIBITED_FIELD_IN_WHERE_CLAUSE\x10\x18\x12+\n\'PROHIBITED_RESOURCE_TYPE_IN_FROM_CLAUSE\x10+\x12-\n)PROHIBITED_RESOURCE_TYPE_IN_SELECT_CLAUSE\x10\x30\x12,\n(PROHIBITED_RESOURCE_TYPE_IN_WHERE_CLAUSE\x10:\x12/\n+PROHIBITED_METRIC_IN_SELECT_OR_WHERE_CLAUSE\x10\x31\x12\x30\n,PROHIBITED_SEGMENT_IN_SELECT_OR_WHERE_CLAUSE\x10\x33\x12<\n8PROHIBITED_SEGMENT_WITH_METRIC_IN_SELECT_OR_WHERE_CLAUSE\x10\x35\x12\x17\n\x13LIMIT_VALUE_TOO_LOW\x10\x19\x12 \n\x1cPROHIBITED_NEWLINE_IN_STRING\x10\x08\x12(\n$PROHIBITED_VALUE_COMBINATION_IN_LIST\x10\n\x12\x36\n2PROHIBITED_VALUE_COMBINATION_WITH_BETWEEN_OPERATOR\x10\x15\x12\x19\n\x15STRING_NOT_TERMINATED\x10\x06\x12\x15\n\x11TOO_MANY_SEGMENTS\x10\"\x12\x1b\n\x17UNEXPECTED_END_OF_QUERY\x10\t\x12\x1a\n\x16UNEXPECTED_FROM_CLAUSE\x10/\x12\x16\n\x12UNRECOGNIZED_FIELD\x10 \x12\x14\n\x10UNEXPECTED_INPUT\x10\x0b\x12!\n\x1dREQUESTED_METRICS_FOR_MANAGER\x10;\x12\x1e\n\x1a\x46ILTER_HAS_TOO_MANY_VALUES\x10?B\xea\x01\n\"com.google.ads.googleads.v9.errorsB\x0fQueryErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v9/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V9.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V9\\Errors\xea\x02\"Google::Ads::GoogleAds::V9::Errorsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.errors.query_error_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.ads.googleads.v9.errorsB\017QueryErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v9/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V9.Errors\312\002\036Google\\Ads\\GoogleAds\\V9\\Errors\352\002\"Google::Ads::GoogleAds::V9::Errors'
  _QUERYERRORENUM._serialized_start=115
  _QUERYERRORENUM._serialized_end=1926
  _QUERYERRORENUM_QUERYERROR._serialized_start=134
  _QUERYERRORENUM_QUERYERROR._serialized_end=1926
# @@protoc_insertion_point(module_scope)
