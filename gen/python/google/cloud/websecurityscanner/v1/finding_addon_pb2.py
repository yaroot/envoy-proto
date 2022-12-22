# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/websecurityscanner/v1/finding_addon.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/cloud/websecurityscanner/v1/finding_addon.proto\x12\"google.cloud.websecurityscanner.v1\"*\n\x04\x46orm\x12\x12\n\naction_uri\x18\x01 \x01(\t\x12\x0e\n\x06\x66ields\x18\x02 \x03(\t\"Q\n\x0fOutdatedLibrary\x12\x14\n\x0clibrary_name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x17\n\x0flearn_more_urls\x18\x03 \x03(\t\"?\n\x11ViolatingResource\x12\x14\n\x0c\x63ontent_type\x18\x01 \x01(\t\x12\x14\n\x0cresource_url\x18\x02 \x01(\t\"/\n\x14VulnerableParameters\x12\x17\n\x0fparameter_names\x18\x01 \x03(\t\"\xe0\x01\n\x11VulnerableHeaders\x12M\n\x07headers\x18\x01 \x03(\x0b\x32<.google.cloud.websecurityscanner.v1.VulnerableHeaders.Header\x12U\n\x0fmissing_headers\x18\x02 \x03(\x0b\x32<.google.cloud.websecurityscanner.v1.VulnerableHeaders.Header\x1a%\n\x06Header\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\"\xdb\x03\n\x03Xss\x12\x14\n\x0cstack_traces\x18\x01 \x03(\t\x12\x15\n\rerror_message\x18\x02 \x01(\t\x12K\n\rattack_vector\x18\x03 \x01(\x0e\x32\x34.google.cloud.websecurityscanner.v1.Xss.AttackVector\x12\x1e\n\x16stored_xss_seeding_url\x18\x04 \x01(\t\"\xb9\x02\n\x0c\x41ttackVector\x12\x1d\n\x19\x41TTACK_VECTOR_UNSPECIFIED\x10\x00\x12\x11\n\rLOCAL_STORAGE\x10\x01\x12\x13\n\x0fSESSION_STORAGE\x10\x02\x12\x0f\n\x0bWINDOW_NAME\x10\x03\x12\x0c\n\x08REFERRER\x10\x04\x12\x0e\n\nFORM_INPUT\x10\x05\x12\n\n\x06\x43OOKIE\x10\x06\x12\x10\n\x0cPOST_MESSAGE\x10\x07\x12\x12\n\x0eGET_PARAMETERS\x10\x08\x12\x10\n\x0cURL_FRAGMENT\x10\t\x12\x10\n\x0cHTML_COMMENT\x10\n\x12\x13\n\x0fPOST_PARAMETERS\x10\x0b\x12\x0c\n\x08PROTOCOL\x10\x0c\x12\x0e\n\nSTORED_XSS\x10\r\x12\x0f\n\x0bSAME_ORIGIN\x10\x0e\x12\x19\n\x15USER_CONTROLLABLE_URL\x10\x0f\"\xa9\x01\n\x03Xxe\x12\x15\n\rpayload_value\x18\x01 \x01(\t\x12J\n\x10payload_location\x18\x02 \x01(\x0e\x32\x30.google.cloud.websecurityscanner.v1.Xxe.Location\"?\n\x08Location\x12\x18\n\x14LOCATION_UNSPECIFIED\x10\x00\x12\x19\n\x15\x43OMPLETE_REQUEST_BODY\x10\x01\x42\x85\x02\n&com.google.cloud.websecurityscanner.v1B\x11\x46indingAddonProtoP\x01ZTgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1;websecurityscanner\xaa\x02\"Google.Cloud.WebSecurityScanner.V1\xca\x02\"Google\\Cloud\\WebSecurityScanner\\V1\xea\x02%Google::Cloud::WebSecurityScanner::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.websecurityscanner.v1.finding_addon_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.cloud.websecurityscanner.v1B\021FindingAddonProtoP\001ZTgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1;websecurityscanner\252\002\"Google.Cloud.WebSecurityScanner.V1\312\002\"Google\\Cloud\\WebSecurityScanner\\V1\352\002%Google::Cloud::WebSecurityScanner::V1'
  _FORM._serialized_start=94
  _FORM._serialized_end=136
  _OUTDATEDLIBRARY._serialized_start=138
  _OUTDATEDLIBRARY._serialized_end=219
  _VIOLATINGRESOURCE._serialized_start=221
  _VIOLATINGRESOURCE._serialized_end=284
  _VULNERABLEPARAMETERS._serialized_start=286
  _VULNERABLEPARAMETERS._serialized_end=333
  _VULNERABLEHEADERS._serialized_start=336
  _VULNERABLEHEADERS._serialized_end=560
  _VULNERABLEHEADERS_HEADER._serialized_start=523
  _VULNERABLEHEADERS_HEADER._serialized_end=560
  _XSS._serialized_start=563
  _XSS._serialized_end=1038
  _XSS_ATTACKVECTOR._serialized_start=725
  _XSS_ATTACKVECTOR._serialized_end=1038
  _XXE._serialized_start=1041
  _XXE._serialized_end=1210
  _XXE_LOCATION._serialized_start=1147
  _XXE_LOCATION._serialized_end=1210
# @@protoc_insertion_point(module_scope)
