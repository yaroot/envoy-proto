# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/fleetengine/v1/header.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/maps/fleetengine/v1/header.proto\x12\x13maps.fleetengine.v1\x1a\x1fgoogle/api/field_behavior.proto\"\xf4\x03\n\rRequestHeader\x12\x15\n\rlanguage_code\x18\x01 \x01(\t\x12\x18\n\x0bregion_code\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0bsdk_version\x18\x03 \x01(\t\x12\x12\n\nos_version\x18\x04 \x01(\t\x12\x14\n\x0c\x64\x65vice_model\x18\x05 \x01(\t\x12<\n\x08sdk_type\x18\x06 \x01(\x0e\x32*.maps.fleetengine.v1.RequestHeader.SdkType\x12\x18\n\x10maps_sdk_version\x18\x07 \x01(\t\x12\x17\n\x0fnav_sdk_version\x18\x08 \x01(\t\x12=\n\x08platform\x18\t \x01(\x0e\x32+.maps.fleetengine.v1.RequestHeader.Platform\x12\x14\n\x0cmanufacturer\x18\n \x01(\t\x12\x19\n\x11\x61ndroid_api_level\x18\x0b \x01(\x05\"M\n\x07SdkType\x12\x18\n\x14SDK_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43ONSUMER\x10\x01\x12\n\n\x06\x44RIVER\x10\x02\x12\x0e\n\nJAVASCRIPT\x10\x03\"C\n\x08Platform\x12\x18\n\x14PLATFORM_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x41NDROID\x10\x01\x12\x07\n\x03IOS\x10\x02\x12\x07\n\x03WEB\x10\x03\x42t\n\x1agoogle.maps.fleetengine.v1B\x07HeadersP\x01ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\xa2\x02\x03\x43\x46\x45\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.maps.fleetengine.v1.header_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032google.maps.fleetengine.v1B\007HeadersP\001ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\242\002\003CFE'
  _REQUESTHEADER.fields_by_name['region_code']._options = None
  _REQUESTHEADER.fields_by_name['region_code']._serialized_options = b'\340A\002'
  _REQUESTHEADER._serialized_start=98
  _REQUESTHEADER._serialized_end=598
  _REQUESTHEADER_SDKTYPE._serialized_start=452
  _REQUESTHEADER_SDKTYPE._serialized_end=529
  _REQUESTHEADER_PLATFORM._serialized_start=531
  _REQUESTHEADER_PLATFORM._serialized_end=598
# @@protoc_insertion_point(module_scope)