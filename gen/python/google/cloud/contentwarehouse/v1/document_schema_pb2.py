# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/contentwarehouse/v1/document_schema.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/cloud/contentwarehouse/v1/document_schema.proto\x12 google.cloud.contentwarehouse.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xaa\x03\n\x0e\x44ocumentSchema\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12R\n\x14property_definitions\x18\x03 \x03(\x0b\x32\x34.google.cloud.contentwarehouse.v1.PropertyDefinition\x12\x1a\n\x12\x64ocument_is_folder\x18\x04 \x01(\x08\x12\x34\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x0b\x64\x65scription\x18\x07 \x01(\t:~\xea\x41{\n.contentwarehouse.googleapis.com/DocumentSchema\x12Iprojects/{project}/locations/{location}/documentSchemas/{document_schema}\"\xe3\x06\n\x12PropertyDefinition\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0c\x64isplay_name\x18\x0c \x01(\t\x12\x15\n\ris_repeatable\x18\x02 \x01(\x08\x12\x15\n\ris_filterable\x18\x03 \x01(\x08\x12\x15\n\ris_searchable\x18\x04 \x01(\x08\x12\x13\n\x0bis_metadata\x18\x05 \x01(\x08\x12\x13\n\x0bis_required\x18\x0e \x01(\x08\x12T\n\x14integer_type_options\x18\x07 \x01(\x0b\x32\x34.google.cloud.contentwarehouse.v1.IntegerTypeOptionsH\x00\x12P\n\x12\x66loat_type_options\x18\x08 \x01(\x0b\x32\x32.google.cloud.contentwarehouse.v1.FloatTypeOptionsH\x00\x12N\n\x11text_type_options\x18\t \x01(\x0b\x32\x31.google.cloud.contentwarehouse.v1.TextTypeOptionsH\x00\x12V\n\x15property_type_options\x18\n \x01(\x0b\x32\x35.google.cloud.contentwarehouse.v1.PropertyTypeOptionsH\x00\x12N\n\x11\x65num_type_options\x18\x0b \x01(\x0b\x32\x31.google.cloud.contentwarehouse.v1.EnumTypeOptionsH\x00\x12W\n\x16\x64\x61te_time_type_options\x18\r \x01(\x0b\x32\x35.google.cloud.contentwarehouse.v1.DateTimeTypeOptionsH\x00\x12L\n\x10map_type_options\x18\x0f \x01(\x0b\x32\x30.google.cloud.contentwarehouse.v1.MapTypeOptionsH\x00\x12X\n\x16timestamp_type_options\x18\x10 \x01(\x0b\x32\x36.google.cloud.contentwarehouse.v1.TimestampTypeOptionsH\x00\x42\x14\n\x12value_type_options\"\x14\n\x12IntegerTypeOptions\"\x12\n\x10\x46loatTypeOptions\"\x11\n\x0fTextTypeOptions\"\x15\n\x13\x44\x61teTimeTypeOptions\"\x10\n\x0eMapTypeOptions\"\x16\n\x14TimestampTypeOptions\"n\n\x13PropertyTypeOptions\x12W\n\x14property_definitions\x18\x01 \x03(\x0b\x32\x34.google.cloud.contentwarehouse.v1.PropertyDefinitionB\x03\xe0\x41\x02\"R\n\x0f\x45numTypeOptions\x12\x1c\n\x0fpossible_values\x18\x01 \x03(\tB\x03\xe0\x41\x02\x12!\n\x19validation_check_disabled\x18\x02 \x01(\x08\x42\x8f\x01\n$com.google.cloud.contentwarehouse.v1B\x13\x44ocumentSchemaProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouseb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.contentwarehouse.v1.document_schema_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.contentwarehouse.v1B\023DocumentSchemaProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouse'
  _DOCUMENTSCHEMA.fields_by_name['display_name']._options = None
  _DOCUMENTSCHEMA.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _DOCUMENTSCHEMA.fields_by_name['update_time']._options = None
  _DOCUMENTSCHEMA.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _DOCUMENTSCHEMA.fields_by_name['create_time']._options = None
  _DOCUMENTSCHEMA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _DOCUMENTSCHEMA._options = None
  _DOCUMENTSCHEMA._serialized_options = b'\352A{\n.contentwarehouse.googleapis.com/DocumentSchema\022Iprojects/{project}/locations/{location}/documentSchemas/{document_schema}'
  _PROPERTYDEFINITION.fields_by_name['name']._options = None
  _PROPERTYDEFINITION.fields_by_name['name']._serialized_options = b'\340A\002'
  _PROPERTYTYPEOPTIONS.fields_by_name['property_definitions']._options = None
  _PROPERTYTYPEOPTIONS.fields_by_name['property_definitions']._serialized_options = b'\340A\002'
  _ENUMTYPEOPTIONS.fields_by_name['possible_values']._options = None
  _ENUMTYPEOPTIONS.fields_by_name['possible_values']._serialized_options = b'\340A\002'
  _DOCUMENTSCHEMA._serialized_start=186
  _DOCUMENTSCHEMA._serialized_end=612
  _PROPERTYDEFINITION._serialized_start=615
  _PROPERTYDEFINITION._serialized_end=1482
  _INTEGERTYPEOPTIONS._serialized_start=1484
  _INTEGERTYPEOPTIONS._serialized_end=1504
  _FLOATTYPEOPTIONS._serialized_start=1506
  _FLOATTYPEOPTIONS._serialized_end=1524
  _TEXTTYPEOPTIONS._serialized_start=1526
  _TEXTTYPEOPTIONS._serialized_end=1543
  _DATETIMETYPEOPTIONS._serialized_start=1545
  _DATETIMETYPEOPTIONS._serialized_end=1566
  _MAPTYPEOPTIONS._serialized_start=1568
  _MAPTYPEOPTIONS._serialized_end=1584
  _TIMESTAMPTYPEOPTIONS._serialized_start=1586
  _TIMESTAMPTYPEOPTIONS._serialized_end=1608
  _PROPERTYTYPEOPTIONS._serialized_start=1610
  _PROPERTYTYPEOPTIONS._serialized_end=1720
  _ENUMTYPEOPTIONS._serialized_start=1722
  _ENUMTYPEOPTIONS._serialized_end=1804
# @@protoc_insertion_point(module_scope)