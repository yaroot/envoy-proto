# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/contentwarehouse/v1/filters.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.type import interval_pb2 as google_dot_type_dot_interval__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/contentwarehouse/v1/filters.proto\x12 google.cloud.contentwarehouse.v1\x1a\x19google/api/resource.proto\x1a\x1agoogle/type/interval.proto\"\xa5\x03\n\rDocumentQuery\x12\r\n\x05query\x18\x01 \x01(\t\x12\x13\n\x0bis_nl_query\x18\x0c \x01(\x08\x12\"\n\x16\x63ustom_property_filter\x18\x04 \x01(\tB\x02\x18\x01\x12\x42\n\x0ctime_filters\x18\x05 \x03(\x0b\x32,.google.cloud.contentwarehouse.v1.TimeFilter\x12\x1d\n\x15\x64ocument_schema_names\x18\x06 \x03(\t\x12I\n\x0fproperty_filter\x18\x07 \x03(\x0b\x32\x30.google.cloud.contentwarehouse.v1.PropertyFilter\x12J\n\x10\x66ile_type_filter\x18\x08 \x01(\x0b\x32\x30.google.cloud.contentwarehouse.v1.FileTypeFilter\x12\x1a\n\x12\x66older_name_filter\x18\t \x01(\t\x12\x15\n\rquery_context\x18\n \x03(\t\x12\x1f\n\x17\x64ocument_creator_filter\x18\x0b \x03(\t\"\xce\x01\n\nTimeFilter\x12)\n\ntime_range\x18\x01 \x01(\x0b\x32\x15.google.type.Interval\x12J\n\ntime_field\x18\x02 \x01(\x0e\x32\x36.google.cloud.contentwarehouse.v1.TimeFilter.TimeField\"I\n\tTimeField\x12\x1a\n\x16TIME_FIELD_UNSPECIFIED\x10\x00\x12\x0f\n\x0b\x43REATE_TIME\x10\x01\x12\x0f\n\x0bUPDATE_TIME\x10\x02\"v\n\x0ePropertyFilter\x12Q\n\x14\x64ocument_schema_name\x18\x01 \x01(\tB3\xfa\x41\x30\n.contentwarehouse.googleapis.com/DocumentSchema\x12\x11\n\tcondition\x18\x02 \x01(\t\"\xa8\x01\n\x0e\x46ileTypeFilter\x12L\n\tfile_type\x18\x01 \x01(\x0e\x32\x39.google.cloud.contentwarehouse.v1.FileTypeFilter.FileType\"H\n\x08\x46ileType\x12\x19\n\x15\x46ILE_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03\x41LL\x10\x01\x12\n\n\x06\x46OLDER\x10\x02\x12\x0c\n\x08\x44OCUMENT\x10\x03\x42\x88\x01\n$com.google.cloud.contentwarehouse.v1B\x0c\x46iltersProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouseb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.contentwarehouse.v1.filters_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.contentwarehouse.v1B\014FiltersProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouse'
  _DOCUMENTQUERY.fields_by_name['custom_property_filter']._options = None
  _DOCUMENTQUERY.fields_by_name['custom_property_filter']._serialized_options = b'\030\001'
  _PROPERTYFILTER.fields_by_name['document_schema_name']._options = None
  _PROPERTYFILTER.fields_by_name['document_schema_name']._serialized_options = b'\372A0\n.contentwarehouse.googleapis.com/DocumentSchema'
  _DOCUMENTQUERY._serialized_start=140
  _DOCUMENTQUERY._serialized_end=561
  _TIMEFILTER._serialized_start=564
  _TIMEFILTER._serialized_end=770
  _TIMEFILTER_TIMEFIELD._serialized_start=697
  _TIMEFILTER_TIMEFIELD._serialized_end=770
  _PROPERTYFILTER._serialized_start=772
  _PROPERTYFILTER._serialized_end=890
  _FILETYPEFILTER._serialized_start=893
  _FILETYPEFILTER._serialized_end=1061
  _FILETYPEFILTER_FILETYPE._serialized_start=989
  _FILETYPEFILTER_FILETYPE._serialized_end=1061
# @@protoc_insertion_point(module_scope)