# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/type.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cgoogle/spanner/v1/type.proto\x12\x11google.spanner.v1\x1a\x1fgoogle/api/field_behavior.proto\"\xdf\x01\n\x04Type\x12.\n\x04\x63ode\x18\x01 \x01(\x0e\x32\x1b.google.spanner.v1.TypeCodeB\x03\xe0\x41\x02\x12\x33\n\x12\x61rray_element_type\x18\x02 \x01(\x0b\x32\x17.google.spanner.v1.Type\x12\x32\n\x0bstruct_type\x18\x03 \x01(\x0b\x32\x1d.google.spanner.v1.StructType\x12>\n\x0ftype_annotation\x18\x04 \x01(\x0e\x32%.google.spanner.v1.TypeAnnotationCode\"\x7f\n\nStructType\x12\x33\n\x06\x66ields\x18\x01 \x03(\x0b\x32#.google.spanner.v1.StructType.Field\x1a<\n\x05\x46ield\x12\x0c\n\x04name\x18\x01 \x01(\t\x12%\n\x04type\x18\x02 \x01(\x0b\x32\x17.google.spanner.v1.Type*\xa5\x01\n\x08TypeCode\x12\x19\n\x15TYPE_CODE_UNSPECIFIED\x10\x00\x12\x08\n\x04\x42OOL\x10\x01\x12\t\n\x05INT64\x10\x02\x12\x0b\n\x07\x46LOAT64\x10\x03\x12\r\n\tTIMESTAMP\x10\x04\x12\x08\n\x04\x44\x41TE\x10\x05\x12\n\n\x06STRING\x10\x06\x12\t\n\x05\x42YTES\x10\x07\x12\t\n\x05\x41RRAY\x10\x08\x12\n\n\x06STRUCT\x10\t\x12\x0b\n\x07NUMERIC\x10\n\x12\x08\n\x04JSON\x10\x0b*J\n\x12TypeAnnotationCode\x12$\n TYPE_ANNOTATION_CODE_UNSPECIFIED\x10\x00\x12\x0e\n\nPG_NUMERIC\x10\x02\x42\xaf\x01\n\x15\x63om.google.spanner.v1B\tTypeProtoP\x01Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\xaa\x02\x17Google.Cloud.Spanner.V1\xca\x02\x17Google\\Cloud\\Spanner\\V1\xea\x02\x1aGoogle::Cloud::Spanner::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.spanner.v1.type_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.google.spanner.v1B\tTypeProtoP\001Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\252\002\027Google.Cloud.Spanner.V1\312\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google::Cloud::Spanner::V1'
  _TYPE.fields_by_name['code']._options = None
  _TYPE.fields_by_name['code']._serialized_options = b'\340A\002'
  _TYPECODE._serialized_start=440
  _TYPECODE._serialized_end=605
  _TYPEANNOTATIONCODE._serialized_start=607
  _TYPEANNOTATIONCODE._serialized_end=681
  _TYPE._serialized_start=85
  _TYPE._serialized_end=308
  _STRUCTTYPE._serialized_start=310
  _STRUCTTYPE._serialized_end=437
  _STRUCTTYPE_FIELD._serialized_start=377
  _STRUCTTYPE_FIELD._serialized_end=437
# @@protoc_insertion_point(module_scope)
