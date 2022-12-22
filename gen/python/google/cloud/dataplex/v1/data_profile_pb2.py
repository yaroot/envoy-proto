# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataplex/v1/data_profile.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.dataplex.v1 import processing_pb2 as google_dot_cloud_dot_dataplex_dot_v1_dot_processing__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/dataplex/v1/data_profile.proto\x12\x18google.cloud.dataplex.v1\x1a)google/cloud/dataplex/v1/processing.proto\"\x11\n\x0f\x44\x61taProfileSpec\"\xeb\t\n\x11\x44\x61taProfileResult\x12\x11\n\trow_count\x18\x03 \x01(\x03\x12\x44\n\x07profile\x18\x04 \x01(\x0b\x32\x33.google.cloud.dataplex.v1.DataProfileResult.Profile\x12;\n\x0cscanned_data\x18\x05 \x01(\x0b\x32%.google.cloud.dataplex.v1.ScannedData\x1a\xbf\x08\n\x07Profile\x12I\n\x06\x66ields\x18\x02 \x03(\x0b\x32\x39.google.cloud.dataplex.v1.DataProfileResult.Profile.Field\x1a\xe8\x07\n\x05\x46ield\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x0c\n\x04mode\x18\x03 \x01(\t\x12V\n\x07profile\x18\x04 \x01(\x0b\x32\x45.google.cloud.dataplex.v1.DataProfileResult.Profile.Field.ProfileInfo\x1a\xdc\x06\n\x0bProfileInfo\x12\x12\n\nnull_ratio\x18\x02 \x01(\x01\x12\x16\n\x0e\x64istinct_ratio\x18\x03 \x01(\x01\x12\x65\n\x0ctop_n_values\x18\x04 \x03(\x0b\x32O.google.cloud.dataplex.v1.DataProfileResult.Profile.Field.ProfileInfo.TopNValue\x12o\n\x0estring_profile\x18\x65 \x01(\x0b\x32U.google.cloud.dataplex.v1.DataProfileResult.Profile.Field.ProfileInfo.StringFieldInfoH\x00\x12q\n\x0finteger_profile\x18\x66 \x01(\x0b\x32V.google.cloud.dataplex.v1.DataProfileResult.Profile.Field.ProfileInfo.IntegerFieldInfoH\x00\x12o\n\x0e\x64ouble_profile\x18g \x01(\x0b\x32U.google.cloud.dataplex.v1.DataProfileResult.Profile.Field.ProfileInfo.DoubleFieldInfoH\x00\x1aQ\n\x0fStringFieldInfo\x12\x12\n\nmin_length\x18\x01 \x01(\x03\x12\x12\n\nmax_length\x18\x02 \x01(\x03\x12\x16\n\x0e\x61verage_length\x18\x03 \x01(\x01\x1al\n\x10IntegerFieldInfo\x12\x0f\n\x07\x61verage\x18\x01 \x01(\x01\x12\x1a\n\x12standard_deviation\x18\x03 \x01(\x01\x12\x0b\n\x03min\x18\x04 \x01(\x03\x12\x11\n\tquartiles\x18\x06 \x03(\x03\x12\x0b\n\x03max\x18\x05 \x01(\x03\x1ak\n\x0f\x44oubleFieldInfo\x12\x0f\n\x07\x61verage\x18\x01 \x01(\x01\x12\x1a\n\x12standard_deviation\x18\x03 \x01(\x01\x12\x0b\n\x03min\x18\x04 \x01(\x01\x12\x11\n\tquartiles\x18\x06 \x03(\x01\x12\x0b\n\x03max\x18\x05 \x01(\x01\x1a)\n\tTopNValue\x12\r\n\x05value\x18\x01 \x01(\t\x12\r\n\x05\x63ount\x18\x02 \x01(\x03\x42\x0c\n\nfield_infoBt\n\x1c\x63om.google.cloud.dataplex.v1B\x10\x44\x61taProfileProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplexb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dataplex.v1.data_profile_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.dataplex.v1B\020DataProfileProtoP\001Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplex'
  _DATAPROFILESPEC._serialized_start=116
  _DATAPROFILESPEC._serialized_end=133
  _DATAPROFILERESULT._serialized_start=136
  _DATAPROFILERESULT._serialized_end=1395
  _DATAPROFILERESULT_PROFILE._serialized_start=308
  _DATAPROFILERESULT_PROFILE._serialized_end=1395
  _DATAPROFILERESULT_PROFILE_FIELD._serialized_start=395
  _DATAPROFILERESULT_PROFILE_FIELD._serialized_end=1395
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO._serialized_start=535
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO._serialized_end=1395
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_STRINGFIELDINFO._serialized_start=1038
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_STRINGFIELDINFO._serialized_end=1119
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_INTEGERFIELDINFO._serialized_start=1121
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_INTEGERFIELDINFO._serialized_end=1229
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_DOUBLEFIELDINFO._serialized_start=1231
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_DOUBLEFIELDINFO._serialized_end=1338
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_TOPNVALUE._serialized_start=1340
  _DATAPROFILERESULT_PROFILE_FIELD_PROFILEINFO_TOPNVALUE._serialized_end=1381
# @@protoc_insertion_point(module_scope)